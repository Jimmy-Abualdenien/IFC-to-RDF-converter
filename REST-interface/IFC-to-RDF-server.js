var express = require("express");
var rimraf = require('rimraf');
var nodefs = require('node-fs');
var spawn = require('child_process').spawn;
var util = require('util');
var fs = require('fs');
eval(fs.readFileSync('settings.js', encoding="ascii"));

var PATH_PREFIX = "IFC-repo";

function configureServer(base_path){
	
	//setup REST server
	//=================
	var allowCrossDomain = function(req, res, next) {
		res.header('Access-Control-Allow-Origin', '*');
		res.header('Access-Control-Allow-Methods', 'GET,PUT,POST,DELETE');
		res.header('Access-Control-Allow-Headers', 'Content-Type');
		next();
	}
	
	var app = express.createServer();
	app.configure(function(){
		app.use(express.methodOverride());
		app.use(express.bodyParser());
		app.use(allowCrossDomain);
	});
	app.set('view engine', 'ejs');
	app.set('view options', {
		layout: false
	});
	app.use(express.static('public'));
	
	//get IFC object or directory
	var re = RegExp('/' + PATH_PREFIX + '/(.+/)*(.*)');
	app.get(re, function(req, res) {
		var path = req.params[0]==null ? '' : unescape(req.params[0].replace(/\+/g, " "));
		var item = unescape(req.params[1].replace(/\+/g, " ")).replace(/\s+/g, '');
		var extension = null;
		if(item.length > 4 && validExtension(item.substr(-4))){
			extension = item.substr(-4);
			item = item.substr(0, item.length-4);
		}
		var fspath = UrlToFsPath(path + item);
		try {
			var stats = fs.lstatSync(fspath);
			if (stats.isDirectory()) {
				if(isIFCResource(fspath, item)){ // we have an IFC resource
					var file = fspath + '/' + item;
					var orig_ext = extension;
					console.log('file : ' + file);
					console.log('extension : ' + extension);
					if(extension != null){
						file = file + extension;
					} else  {
						if(req.accepts('application/ttl')){
							file = file + '.ttl';
							extension = '.ttl';
						} else if (req.accepts('application/rdf+xml')) {
							file = file + '.rdf';
							extension = '.rdf';
						} else {
							file = file + '.ifc';
							extension = '.ifc';
						}
					}
					if(!fs.existsSync(file)){
						notfound(req, res);
					} else {
						res.setHeader('Content-Type', getMimeType(extension));
						res.setHeader('Content-Disposition', 'attachment; filename='+item+extension);
						if(orig_ext == null){
							res.setHeader('Content-Location', req.url + extension);
						}
						var filestream = fs.createReadStream(file);
						filestream.on('data', function(chunk) {
							res.write(chunk);
						});
						filestream.on('end', function() {
							res.end();
						});
					}
				} else if (item == '' && containsOnlyDirs(fspath)) { // we have a directory
					var files = fs.readdirSync(fspath);
					var i, j = 0, k = 0;
					var resources = new Array();
					var dirs = new Array();
					for(i = 0; i < files.length; i++){
						if(isIFCResource(fspath + files[i], files[i])){
							var ttl = fs.existsSync(fspath + files[i] + '/' + files[i] + '.ttl');
							var rdf = fs.existsSync(fspath + files[i] + '/' + files[i] + '.rdf');
							resources[j++] = {url: escape(files[i]), name: files[i], ttl: ttl, rdf: rdf};
						} else {
							dirs[k++] = {url: escape(files[i]+'/'), name: files[i]};
						}						
					}
					res.render('dir', {path: ('/'+PATH_PREFIX+'/'+path+item), isRoot: (path+item==''),resources: resources, dirs: dirs});
				} else {
					notfound(req, res);
				}
			} else {
				notfound(req, res);
			}
		} catch (e) {
			if(e.errno == 34) // file not found
				notfound(req, res);
			else {
				console.log(e);
				res.send('Internal server error', 500);
			}
		}
	});
	
	// PUT an IFC object or directory
	var re = RegExp('/' + PATH_PREFIX + '/(.+/)*(.*)');
	app.put(re, function(req, res) {
		var path = req.params[0]==null ? '' : unescape(req.params[0].replace(/\+/g, " "));
		var item = unescape(req.params[1].replace(/\+/g, " ")).replace(/\s+/g, '');
		var extension = null;
		if(item.length > 4 && validExtension(item.substr(-4))){
			extension = item.substr(-4);
			item = item.substr(0, item.length-4);
		}
		var fspath = UrlToFsPath(path + item);
		try {
			var stats = fs.lstatSync(fspath);
			if(stats.isDirectory()){
				if(isIFCResource(fspath, item)){ // we have an IFC resource
					var files = fs.readdirSync(fspath);
					var i;
					for(i = 0; i < files.length; i++){
						fs.unlinkSync(fspath + files[i]);
					}
					var uploadedFile = fs.readFileSync(req.files.file.path);
					fs.writeFileSync(fspath+'/'+item+'.ifc', uploadedFile);
					res.send('UPDATED ' + req.url, 200);
					generateRDF(fspath, item, req.url);					
				} else {
					console.log('Cannot PUT ' + req.url);
					res.send('Cannot PUT ' + req.url, 405);
				}
			} else {
				res.send('Cannot PUT ' + req.url, 405);
			}
		} catch (e) {
			if(e.errno == 34){ // file not found
				if(path == '' && item == ''){ // at root
					res.send('Cannot PUT ' + req.url, 405);
				} else if (item == ''){ // create directory
					nodefs.mkdirSync(fspath, 0777, true);
					res.send('CREATED ' + req.url, 201);
				} else { // create IFC resource
					nodefs.mkdirSync(fspath, 0777, true);
					var uploadedFile = fs.readFileSync(req.files.file.path);
					fs.writeFileSync(fspath+'/'+item+'.ifc', uploadedFile);
					res.send('CREATED ' + req.url, 201);
					generateRDF(fspath, item, req.url);
				}
			} else {
				console.log(e);
				res.send('Internal server error', 500);
			}
		}		
	});
	
	// DELETE an IFC object or directory
	var re = RegExp('/' + PATH_PREFIX + '/(.+/)*(.*)');
	app.delete(re, function(req, res) {
		var path = req.params[0]==null ? '' : unescape(req.params[0].replace(/\+/g, " "));
		var item = unescape(req.params[1].replace(/\+/g, " ")).replace(/\s+/g, '');
		var extension = null;
		if(item.length > 4 && validExtension(item.substr(-4))){
			extension = item.substr(-4);
			item = item.substr(0, item.length-4);
		}
		var fspath = UrlToFsPath(path + item);
		try {
			var stats = fs.lstatSync(fspath);
			if(stats.isDirectory()){
				if(isIFCResource(fspath, item)){ // we have an IFC resource
					rimraf(fspath, function (er) {
						if (er) throw er;
						res.send('DELETED ' + req.url, 200);
					});
				} else if(item == '' && containsOnlyDirs(fspath)) { // we have a directory
					if(path != ''){
						rimraf(fspath, function (er) {
							if (er) throw er;
							res.send('DELETED ' + req.url, 200);
						});
					} else {
						res.send('Cannot DELETE ' + req.url, 405);
					}
				} else {
					res.send('Cannot DELETE ' + req.url, 405);
				}
			} else {
				res.send('Cannot DELETE ' + req.url, 405);
			}
		} catch (e) {
			if(e.errno == 34) // file not found
				notfound(req, res);
			else {
				console.log(e);
				res.send('Internal server error', 500);
			}
		}		
	});
	
	return app;
}

function generateRDF(fspath, item, url){	
	var java = spawn('java', ['-Xms2048m', '-Xmx3072m', '-jar', 'workspace/IFC-to-RDF_NOGUI.jar', fspath+'/'+item+'.ifc', fspath+'/'+item+'.ttl']);
	java.stderr.on('data', function (data) {
		console.log('stderr: ' + data);
	});
	java.on('exit', function(java_code) {
		if (java_code == 0) {
			//All is handled by jar file normally
		} 
	});
}

function clone(x){
    if (x.clone)
        return x.clone();
    if (x.constructor == Array)
    {
        var r = [];
        for (var i=0,n=x.length; i<n; i++)
            r.push(clone(x[i]));
        return r;
    }
    return x;
}

function notfound(req, res){
	res.send('Cannot GET ' + req.url, 404);
}

function isIFCResource(fspath, item){
	if(item=='')
		return false;
	return fs.existsSync(fspath + '/' + item + '.ifc');
}

function validExtension(ext){
	var exts = ['.ifc', '.rdf', '.ttl'];
	var i;
	for(i = 0; i < exts.length; i++){
		if(ext == exts[i])
			return true;
	}
	return false;
}

function getMimeType(extension){
	if(extension == '.ifc')
		return 'application/ifc';
	if(extension == '.rdf')
		return 'application/rdf+xml';
	if(extension == '.ttl')
		return 'text/turtle';
	
}

function UrlToFsPath(url){
    return settings.base_path + url;
}

function containsOnlyDirs(dir){
	var files = fs.readdirSync(dir);
	var i;
	for(i = 0; i < files.length; i++){
		if(fs.lstatSync(dir + files[i]).isFile())
			return false;
	}
	return true;
}

function writeError(error, response){
	response.statusCode = 500;
	console.log("Error " + error);
	response.end();
}

var app = configureServer(settings.base_path);
app.listen(settings.server_port);