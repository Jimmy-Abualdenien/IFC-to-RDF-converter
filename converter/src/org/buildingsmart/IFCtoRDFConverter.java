package org.buildingsmart;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;

import com.hp.hpl.jena.rdf.model.InfModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.reasoner.ValidityReport;
import com.hp.hpl.jena.util.FileManager;

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

public class IFCtoRDFConverter {

	private static String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	private static final String DEFAULT_PATH = "http://linkedbuildingdata.net/ifc/instances"+timeLog+"#";
	
	public static void main(String[] args) {
		if(args.length != 5 && !(args.length == 2 && args[0].startsWith("-json")))
		 	System.out.println("Usage:  java IFC_Converter express_filename express_schemaversion ifc_filename output_filename model__version_name \nExample: java IFC_Converter c:\\jo\\IFC2X3_TC1.exp IFC2X3_TC1 C:\\jo\\sample.ifc c:\\jo\\output_rdf.txt sample_version");
		else {
			if(args.length == 5) {
				convert(args[0], args[1], args[2], args[3], args[4], DEFAULT_PATH);
			} else {
				if(args[0].equals("-json")){
					try {
						FileInputStream fis = new FileInputStream(args[1]);
						String jsonString = slurp(fis);
						fis.close();
						convert(jsonString);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if(args[0].equals("-jsonString")){
					convert(args[1]);
				}
			}
		}
	}
	
	public static void convert(String jsonConfig) {
		JSONObject obj = JSONObject.fromObject(jsonConfig);
		String express_file = obj.getString("express_file");
		String express_schema = obj.getString("express_schemaversion");
		String ifc_file = obj.getString("ifc_file");
		String output_file = obj.getString("output_file");
		String model_name = obj.getString("model_name");
		String path = obj.getString("path");
		
		convert(express_file, express_schema, ifc_file, output_file, model_name, path);
	}
	
	public static void convert(String express_file, String express_schema, String ifc_file, String output_file, String model_version_name, String path) {

		path = DEFAULT_PATH;
		
		long t0 = System.currentTimeMillis();
		ExpressReader er = new ExpressReader(express_schema, express_file);
		er.readAndBuild();
		
		IFC_ClassModel model = new IFC_ClassModel(ifc_file, er.getEntities(), er.getTypes(), model_version_name, express_schema);
		model.parseModel();
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(output_file+".TTL")); //Should be N3 syntax / file extension
			model.listRDF(out, path);
			System.out.println("Ended listing RDF");
			validateResultWithJena(output_file, "TTL");
			//writeModelToRDFXML(output_file, "TTL", output_file.substring(0, output_file.lastIndexOf('.'))+".rdf");
		} catch (IOException e) {
			e.printStackTrace();
		}

		long t1 = System.currentTimeMillis();
		System.out.println("done in " + ((t1-t0)/1000.0) + " seconds.");		
	}

	public static String slurp (InputStream in) throws IOException {
		StringBuffer out = new StringBuffer();
		byte[] b = new byte[4096];
		for (int n; (n = in.read(b)) != -1;) {
			out.append(new String(b, 0, n));
		}
		return out.toString();
	}
	
	private static boolean validateResultWithJena(String output_file, String syntax) {
		boolean valid = false;
		Model RDFModel = FileManager.get().loadModel(output_file, syntax);
		InfModel infmodel = ModelFactory.createRDFSModel(RDFModel);
		ValidityReport validity = infmodel.validate();
		if (validity.isValid()) {
			System.out.println("The generated "+syntax+" file is OK!");
			valid = true;
		} else {
			System.out.println("The generated "+syntax+" file contains conflicts");
			for (Iterator i = validity.getReports(); i.hasNext();) {
				System.out.println(" - " + i.next());
			}
		}
		return valid;
	}

	private static boolean writeModelToRDFXML(String output_file, String syntax, String rdfxmlfile) {
		boolean success = false;

		// read model
		Model RDFModel = FileManager.get().loadModel(output_file, syntax);

		try {
			OutputStreamWriter char_output = new OutputStreamWriter(
					new FileOutputStream(rdfxmlfile),
					Charset.forName("UTF-8").newEncoder());

			BufferedWriter out = new BufferedWriter(char_output);
			RDFModel.write(out, "RDF/XML");
			success = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return success;
	}
}
