package org.buildingsmart;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.InfModel;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.reasoner.ReasonerRegistry;
import org.apache.jena.reasoner.ValidityReport;
import org.apache.jena.reasoner.ValidityReport.Report;

import fi.ni.gui.fx.FxInterface;
import net.sf.json.JSONObject;

/*
 * IFCtoRDFConverter is the final interface for this code. Through this class, one is able to submit an IFC file and the EXPRESS schema it follows so that
 * a corresponding IFC/RDF graph can be built.
 * 
 * The usage:
 * IFCtoRDFConverter converter = new IFCtoRDFConverter(file name);
 *   
 * @author Jyrki Oraskari
 * @author of modifications Pieter Pauwels (pipauwel.pauwels@ugent.be / pipauwel@gmail.com)
 */

/*
 * The GNU Affero General Public License
 * 
 * Copyright (c) 2014 Jyrki Oraskari (original)
 * Copyright (c) 2014 Pieter Pauwels (modifications - pipauwel.pauwels@ugent.be / pipauwel@gmail.com)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

public class IfcReader {

	private String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss")
			.format(Calendar.getInstance().getTime());
	public final String DEFAULT_PATH = "http://linkedbuildingdata.net/ifc/resources"
			+ timeLog + "/";
	//public Logger logger;
	public boolean logToFile = false;
	public BufferedWriter bw;
	
	/**
	 * @param args
	 *            filePath schemaname
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		if(args[0].equalsIgnoreCase("LOG") && args[1].equalsIgnoreCase("DIR") && args.length == 3){
			//do not give too many files to the machine!!!!					
			List<String> files = showFiles(args[2]);			
			for(String f : files){
				if(f.endsWith(".ifc")){
					IfcReader r = new IfcReader();
					r.logToFile = true;	
					r.setupLogger(f);
					System.out.println("Converting file : " + f + "\r\n");
					if(r.logToFile) r.bw.write("Converting file : " + f + "\r\n");
					String path = f.substring(0,f.length()-4);		
					r.convert(path+".ifc", path+".ttl", r.DEFAULT_PATH);
					r.bw.flush();
					r.bw.close();
				}
			}
		}
		else if(args[0].equalsIgnoreCase("DIR") && args.length == 2){
			//do not give too many files to the machine!!!!					
			List<String> files = showFiles(args[1]);			
			for(String f : files){
				if(f.endsWith(".ifc")){
					IfcReader r = new IfcReader();					
					System.out.println("Converting file : " + f + "\r\n");
					if(r.logToFile) r.bw.write("Converting file : " + f + "\r\n");
					String path = f.substring(0,f.length()-4);		
					r.convert(path+".ifc", path+".ttl", r.DEFAULT_PATH);
					r.bw.flush();
					r.bw.close();
				}
			}
		}
		else if(args[0].equalsIgnoreCase("LOG") && args.length == 3){
			IfcReader r = new IfcReader();
			r.logToFile = true;
			r.setupLogger(args[2]);
			r.convert(args[1], args[2], r.DEFAULT_PATH);
			r.bw.flush();
			r.bw.close();
		}
		else if (args.length != 2) {
			System.out
					.println("Usage: java IfcReader ifc_filename output_filename \nExample: java IfcReader C:\\sample.ifc c:\\output.ttl (we only convert to TTL)");
			for (int i = 0; i < args.length; i++) {
				System.out.println("arg[" + i + "] : " + args[i]);
			}
		} else {
			if (args.length == 2 && !args[0].startsWith("-json")) {
				IfcReader r = new IfcReader();
				r.convert(args[0], args[1], r.DEFAULT_PATH);
			} else {
				if (args[0].equals("-json")) {
					try {
						IfcReader r = new IfcReader();
						FileInputStream fis = new FileInputStream(args[1]);
						String jsonString = slurp(fis);
						fis.close();
						r.convert(jsonString);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (args[0].equals("-jsonString")) {
					IfcReader r = new IfcReader();
					r.convert(args[1]);
				}
			}
		}
	}
	
	public void setupLogger(String path){	
		String outputFile = path.substring(0,path.length()-4) + ".log";

		try {			
			File file = new File(outputFile);
			if (!file.exists()) 
				file.createNewFile();
					
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			bw = new BufferedWriter(fw);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void convert(String jsonConfig) throws IOException {
		JSONObject obj = JSONObject.fromObject(jsonConfig);
		String ifc_file = obj.getString("ifc_file");
		String output_file = obj.getString("output_file");
		convert(ifc_file, output_file, DEFAULT_PATH);
	}

	private String getExpressSchema(String ifc_file) {
		try {
			FileInputStream fstream = new FileInputStream(ifc_file);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			try {
				String strLine;
				while ((strLine = br.readLine()) != null) {
					if (strLine.length() > 0) {
						if (strLine.startsWith("FILE_SCHEMA")) {
							if (strLine.indexOf("IFC2X3") != -1)
								return "IFC2X3_TC1";
							if (strLine.indexOf("IFC4") != -1)
								return "IFC4_ADD1";
							else
								return "";
						}
					}
				}
			} finally {
				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

	public static String slurp(InputStream in) throws IOException {
		StringBuffer out = new StringBuffer();
		byte[] b = new byte[4096];
		for (int n; (n = in.read(b)) != -1;) {
			out.append(new String(b, 0, n));
		}
		return out.toString();
	}

	public void convert(String ifc_file, String output_file,
			String baseURI) throws IOException {
		long t0 = System.currentTimeMillis();

		if (!ifc_file.endsWith(".ifc")) {
			ifc_file += ".ifc";
		}

		String exp = getExpressSchema(ifc_file);

		// check if we are able to convert this: only four schemas are supported
		if (!exp.equalsIgnoreCase("IFC2X3_Final")
				&& !exp.equalsIgnoreCase("IFC2X3_TC1")
				&& !exp.equalsIgnoreCase("IFC4_ADD1")
				&& !exp.equalsIgnoreCase("IFC4")){
			if(logToFile) bw.write("ERROR: Unrecognised EXPRESS schema: " + exp + ". File should be in IFC4 or IFC2X3 schema. Stopping conversion." + "\r\n");
			return;
		}

		// CONVERSION
		OntModel om = null;
		Model model = null;
		InputStream in = null;
		InputStream expin = null;
		try {
//			om = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM_RDFS_INF); //this takes a LOT more time (like 30 times as much for a simple model)
			om = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
			in = IfcReader.class.getResourceAsStream("/" + exp + ".ttl");
			om.read(in, null, "TTL");

			expin = IfcConvertor.class.getResourceAsStream("/" + exp + ".exp");
			ExpressReader er = new ExpressReader(expin);
			er.readAndBuildVersion2015();

			String expresTtl = "/express.ttl";
			InputStream expresTtlStream = IfcConvertor.class.getResourceAsStream(expresTtl);
			OntModel expressModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
			expressModel.read(expresTtlStream, null, "TTL");
			
			String rdfList = "/list.rdf";
			InputStream rdfListStream = IfcConvertor.class.getResourceAsStream(rdfList);
			OntModel listModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
			listModel.read(rdfListStream, null, "RDF/XML");
			
			IfcConvertor conv = new IfcConvertor(om, expressModel, listModel, er, new FileInputStream(ifc_file), baseURI, exp);
			conv.setIfcReader(this);
			model = conv.parseModel();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} 
		catch (Exception e1) {
			e1.printStackTrace();
		}
		finally {
			try {
				in.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			try {
				expin.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

		if (om != null && model != null) {
			boolean valid = validateGeneratedModel(om, model);
			if (valid == true) {
				writeTTLRDFFiles(model, output_file);
			} else {
				System.err.println("The generated RDF model is invalid");
				System.exit(1);
			}
			long t1 = System.currentTimeMillis();
			System.out.println("done in " + ((t1 - t0) / 1000.0) + " seconds.");
			if(logToFile) bw.write("done in " + ((t1 - t0) / 1000.0) + " seconds." + "\r\n");
		} else {
			System.out
					.println("No ontologyModel or instanceModel found -> no files generated.");
			if(logToFile) bw.write("No ontologyModel or instanceModel found -> no files generated." + "\r\n");
		}
	}
	
	public Model convert(String ifc_file, String baseURI) throws IOException {
		long t0 = System.currentTimeMillis();

		if (!ifc_file.endsWith(".ifc")) {
			ifc_file += ".ifc";
		}

		String exp = getExpressSchema(ifc_file);

		// check if we are able to convert this: only four schemas are supported
		if (!exp.equalsIgnoreCase("IFC2X3_Final")
				&& !exp.equalsIgnoreCase("IFC2X3_TC1")
				&& !exp.equalsIgnoreCase("IFC4_ADD1")
				&& !exp.equalsIgnoreCase("IFC4"))
			return null;

		// CONVERSION
		OntModel om = null;
		Model model = null;
		InputStream in = null;
		InputStream expin = null;
		try {
			om = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
			in = IfcReader.class.getResourceAsStream("/" + exp + ".ttl");
			om.read(in, null, "TTL");

			expin = IfcConvertor.class.getResourceAsStream("/" + exp + ".exp");
			ExpressReader er = new ExpressReader(expin);
			er.readAndBuildVersion2015();

			String expresTtl = "/express.ttl";
			InputStream expresTtlStream = IfcConvertor.class.getResourceAsStream(expresTtl);

			OntModel expressModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
			expressModel.read(expresTtlStream, null, "TTL");
			
			String rdfList = "/list.rdf";
			InputStream rdfListStream = IfcConvertor.class.getResourceAsStream(rdfList);

			OntModel listModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
			listModel.read(rdfListStream, null, "RDF/XML");
			
			IfcConvertor conv = new IfcConvertor(om, expressModel, listModel, er, new FileInputStream(ifc_file), baseURI, exp);
			conv.setIfcReader(this);
			model = conv.parseModel();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			try {
				expin.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

		if (om != null && model != null) {
			boolean valid = validateGeneratedModel(om, model);
			if (valid == true) {
				return model;//writeTTLRDFFiles(model, output_file);
			} else {
				System.err.println("The generated RDF model is invalid");
				System.exit(1);
			}
			long t1 = System.currentTimeMillis();
			System.out.println("done in " + ((t1 - t0) / 1000.0) + " seconds.");
			if(logToFile) bw.write("done in " + ((t1 - t0) / 1000.0) + " seconds." + "\r\n");
		} else {
			System.out
					.println("No ontologyModel or instanceModel found -> no files generated.");
			if(logToFile) bw.write("No ontologyModel or instanceModel found -> no files generated." + "\r\n");
		}
		return model;
	}

	// VALIDATION
	private boolean validateGeneratedModel(OntModel om, Model model) throws IOException {
		boolean valid = false;

		// Check the created model with the OWL ontology
		System.out.println("createInfModel");
		InfModel infModel = ModelFactory.createInfModel(
				ReasonerRegistry.getRDFSReasoner(), om, model);
		if(logToFile) bw.write("validate" + "\r\n");
		System.out.println("validate");
		ValidityReport validity = infModel.validate();
		if (validity.isValid()) {
			System.out
					.println("generated RDF graph is OK! Writing TTL and RDF file...");
			if(logToFile) bw.write("generated RDF graph is OK! Writing TTL and RDF file..." + "\r\n");
			valid = true;
		} else {
			System.out
					.println("generated RDF model contains conflicts. No TTL or RDF file produced.");
			if(logToFile) bw.write("generated RDF model contains conflicts. No TTL or RDF file produced." + "\r\n");
			for (Iterator<Report> i = validity.getReports(); i.hasNext();) {
				System.out.println(" - " + i.next());
				if(logToFile) bw.write(" - " + i.next() + "\r\n");
			}
		}
		return valid;
	}

	private void writeTTLRDFFiles(Model model, String output_file) throws IOException {

		System.out.println("output_file before: " + output_file);
		if(logToFile) bw.write("output_file before: " + output_file+"\r\n");
		
		if (!output_file.endsWith(".ttl")) {
			//output_file.replaceAll(".", "");
			output_file += ".ttl";
		}

		System.out.println("output_file after: " + output_file);
		if(logToFile) bw.write("output_file after: " + output_file+"\r\n");
		
		String output_file_rdf = output_file.substring(0,
				output_file.length() - 4) + ".rdf";
		
		System.out.println("output_file_rdf: " + output_file_rdf);
		if(logToFile) bw.write("output_file_rdf: " + output_file_rdf+"\r\n");
		
		try {
			OutputStreamWriter char_output = new OutputStreamWriter(
					new FileOutputStream(output_file), Charset.forName("UTF-8")
							.newEncoder());
			BufferedWriter out = new BufferedWriter(char_output);
			model.write(out, "TTL");
		} catch (IOException e) {
			System.err
					.println("Something went wrong while writing the TTL file");
			if(logToFile) bw.write("Something went wrong while writing the TTL file"+"\r\n");
			System.exit(1);
			e.printStackTrace();
		}
		try {
			OutputStreamWriter char_output = new OutputStreamWriter(
					new FileOutputStream(output_file_rdf), Charset.forName(
							"UTF-8").newEncoder());
			BufferedWriter out = new BufferedWriter(char_output);
			model.write(out, "RDF/XML");
		} catch (IOException e) {
			System.err
					.println("Something went wrong while writing the RDF file");
			if(logToFile) bw.write("Something went wrong while writing the TTL file"+"\r\n");
			System.exit(1);
			e.printStackTrace();
		}
	}
	
	public static List<String> showFiles(String dir) {
		List<String> goodFiles = new ArrayList<String>();
		
		File folder = new File(dir);
		File[] listOfFiles = folder.listFiles();
		
		for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile())
		    	  goodFiles.add(listOfFiles[i].getAbsolutePath());
		      else if (listOfFiles[i].isDirectory())
		    	  goodFiles.addAll(showFiles(listOfFiles[i].getAbsolutePath()));
		    }
	    return goodFiles;
	}

	/*  These methods are created to handle the FX interface and drag&drop features */
	
	public void convert(String ifc_file, String output_file, String baseURI,FxInterface fx_gui) throws IOException {
		long t0 = System.currentTimeMillis();

		if (!ifc_file.endsWith(".ifc")) {
			ifc_file += ".ifc";
		}

		String exp = getExpressSchema(ifc_file);


		// check if we are able to convert this: only four schemas are supported
		if (!exp.equalsIgnoreCase("IFC2X3_Final")
				&& !exp.equalsIgnoreCase("IFC2X3_TC1")
				&& !exp.equalsIgnoreCase("IFC4_ADD1")
				&& !exp.equalsIgnoreCase("IFC4")){
			fx_gui.handle_notification("ERROR: Unrecognised EXPRESS schema: " + exp + ".\nFile should be in IFC4 or IFC2X3 schema. Stopping conversion.");
			if(logToFile) bw.write("ERROR: Unrecognised EXPRESS schema: " + exp + ". File should be in IFC4 or IFC2X3 schema. Stopping conversion." + "\r\n");
			return;
		}

		// CONVERSION
		OntModel om = null;
		Model model = null;
		InputStream in = null;
		InputStream expin = null;
		try {
			om = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
			System.out.println("exp ttl: "+"/data/" + exp + ".ttl");
			in = IfcReader.class.getResourceAsStream("/" + exp + ".ttl");
			System.out.println("exp ttl raw: "+in);
			om.read(in, null, "TTL");

			expin = IfcConvertor.class.getResourceAsStream("/" + exp + ".exp");
			ExpressReader er = new ExpressReader(expin);
			er.readAndBuildVersion2015();

			String expresTtl = "/express.ttl";
			InputStream expresTtlStream = IfcConvertor.class.getResourceAsStream(expresTtl);

			OntModel expressModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
			expressModel.read(expresTtlStream, null, "TTL");
			
			String rdfList = "/list.rdf";
			InputStream rdfListStream = IfcConvertor.class.getResourceAsStream(rdfList);

			OntModel listModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
			listModel.read(rdfListStream, null, "RDF/XML");
			
			IfcConvertor conv = new IfcConvertor(om, expressModel, listModel, er, new FileInputStream(ifc_file), baseURI, exp);
			conv.setIfcReader(this);
			model = conv.parseModel();
		} catch (FileNotFoundException e1) {
			fx_gui.handle_notification(e1.getMessage());
			e1.printStackTrace();
		} 
		catch (Exception e1) {
			fx_gui.handle_notification(e1.getMessage());
			e1.printStackTrace();
		}
		finally {
			try {
				in.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			try {
				expin.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

		if (om != null && model != null) {
			boolean valid = validateGeneratedModel(om, model);
			if (valid == true) {
				writeTTLRDFFiles(model, output_file);
			} else {
				fx_gui.handle_notification("The generated RDF model is invalid");
				return;
			}
			long t1 = System.currentTimeMillis();
			fx_gui.handle_notification("done in " + ((t1 - t0) / 1000.0) + " seconds.");
			if(logToFile) bw.write("done in " + ((t1 - t0) / 1000.0) + " seconds." + "\r\n");
		} else {
			fx_gui.handle_notification("No ontologyModel or instanceModel found -> no files generated.");
			if(logToFile) bw.write("No ontologyModel or instanceModel found -> no files generated." + "\r\n");
		}
	}

	public void convert(String ifc_file, File output_file, String baseURI,FxInterface fx_gui) throws IOException {
		long t0 = System.currentTimeMillis();

		if (!ifc_file.endsWith(".ifc")) {
			ifc_file += ".ifc";
		}

		String exp = getExpressSchema(ifc_file);


		// check if we are able to convert this: only four schemas are supported
		if (!exp.equalsIgnoreCase("IFC2X3_Final")
				&& !exp.equalsIgnoreCase("IFC2X3_TC1")
				&& !exp.equalsIgnoreCase("IFC4_ADD1")
				&& !exp.equalsIgnoreCase("IFC4")){
			fx_gui.handle_notification("ERROR: Unrecognised EXPRESS schema: " + exp + ".\nFile should be in IFC4 or IFC2X3 schema. Stopping conversion.");
			if(logToFile) bw.write("ERROR: Unrecognised EXPRESS schema: " + exp + ". File should be in IFC4 or IFC2X3 schema. Stopping conversion." + "\r\n");
			return;
		}

		// CONVERSION
		OntModel om = null;
		Model model = null;
		InputStream in = null;
		InputStream expin = null;
		try {
			om = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
			System.out.println("exp ttl: "+"/data/" + exp + ".ttl");
			in = IfcReader.class.getResourceAsStream("/" + exp + ".ttl");
			System.out.println("exp ttl raw: "+in);
			om.read(in, null, "TTL");

			expin = IfcConvertor.class.getResourceAsStream("/" + exp + ".exp");
			ExpressReader er = new ExpressReader(expin);
			er.readAndBuildVersion2015();

			String expresTtl = "/express.ttl";
			InputStream expresTtlStream = IfcConvertor.class.getResourceAsStream(expresTtl);

			OntModel expressModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
			expressModel.read(expresTtlStream, null, "TTL");
			
			String rdfList = "/list.rdf";
			InputStream rdfListStream = IfcConvertor.class.getResourceAsStream(rdfList);

			OntModel listModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
			listModel.read(rdfListStream, null, "RDF/XML");
			
			IfcConvertor conv = new IfcConvertor(om, expressModel, listModel, er, new FileInputStream(ifc_file), baseURI, exp);
			conv.setIfcReader(this);
			model = conv.parseModel();
		} catch (FileNotFoundException e1) {
			fx_gui.handle_notification(e1.getMessage());
			e1.printStackTrace();
		} 
		catch (Exception e1) {
			fx_gui.handle_notification(e1.getMessage());
			e1.printStackTrace();
		}
		finally {
			try {
				in.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			try {
				expin.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

		if (om != null && model != null) {
			boolean valid = validateGeneratedModel(om, model);
			if (valid == true) {
				writeTTLRDFFiles(model, output_file);
			} else {
				fx_gui.handle_notification("The generated RDF model is invalid");
				return;
			}
			long t1 = System.currentTimeMillis();
			fx_gui.handle_notification("done in " + ((t1 - t0) / 1000.0) + " seconds.");
			if(logToFile) bw.write("done in " + ((t1 - t0) / 1000.0) + " seconds." + "\r\n");
		} else {
			fx_gui.handle_notification("No ontologyModel or instanceModel found -> no files generated.");
			if(logToFile) bw.write("No ontologyModel or instanceModel found -> no files generated." + "\r\n");
		}
	}

	private void writeTTLRDFFiles(Model model, File output_file) throws IOException {

		System.out.println("output_file before: " + output_file.getAbsolutePath());
		if(logToFile) bw.write("output_file before: " + output_file.getAbsolutePath()+"\r\n");
		
		System.out.println("output_file after: " + output_file.getAbsolutePath());
		if(logToFile) bw.write("output_file after: " + output_file.getAbsolutePath()+"\r\n");
		
		try {
			OutputStreamWriter char_output = new OutputStreamWriter(
					new FileOutputStream(output_file), Charset.forName("UTF-8")
							.newEncoder());
			BufferedWriter out = new BufferedWriter(char_output);
			model.write(out, "TTL");
			out.close();			
		} catch (IOException e) {
			System.err
					.println("Something went wrong while writing the TTL file");
			if(logToFile) bw.write("Something went wrong while writing the TTL file"+"\r\n");
			System.exit(1);
			e.printStackTrace();
		}
		
	}	
}
