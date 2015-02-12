package org.buildingsmart;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;

import net.sf.json.JSONObject;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.InfModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.reasoner.ReasonerRegistry;
import com.hp.hpl.jena.reasoner.ValidityReport;
import com.hp.hpl.jena.reasoner.ValidityReport.Report;

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

	private static String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	private static final String DEFAULT_PATH = "http://linkedbuildingdata.net/ifc/instances"+timeLog+"#";
	
	/**
	 * @param args filePath schemaname
	 */
	public static void main(String[] args) {
		if(args.length != 3 && !(args.length == 2 && args[0].startsWith("-json")))
		 	System.out.println("Usage: java IFC_Converter express_schemaversion ifc_filename output_filename \nExample: java IFC_Converter IFC2X4_ADD1 C:\\sample.ifc c:\\output.rdf");
		else {
			if(args.length == 3) {
				convert(args[0], args[1], args[2], DEFAULT_PATH);
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
		
		String express_schema = obj.getString("express_schemaversion");
		String ifc_file = obj.getString("ifc_file");
		String output_file = obj.getString("output_file");
		
		convert(express_schema, ifc_file, output_file, DEFAULT_PATH);
	}
	
	public static String slurp (InputStream in) throws IOException {
		StringBuffer out = new StringBuffer();
		byte[] b = new byte[4096];
		for (int n; (n = in.read(b)) != -1;) {
			out.append(new String(b, 0, n));
		}
		return out.toString();
	}

	public static void convert(String express_schema, String ifc_file, String output_file, String baseURI) {
		long t0 = System.currentTimeMillis();
		
		//CONVERSION
		IfcConvertor conv = new IfcConvertor(express_schema, ifc_file, output_file, baseURI);
		Model model = conv.parseModel();		
		
		//VALIDATION
		boolean valid = false;
		System.out.println("reading ontology model");
		OntModel ontology=ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
		ontology.read("samples\\" + express_schema + ".ttl"); //TODO: to replace by exact location
		System.out.println("reading ontology model done");
		
		//Check the created model with the OWL ontology
		System.out.println("createInfModel");
		InfModel infModel = ModelFactory.createInfModel(ReasonerRegistry.getRDFSReasoner(), ontology, model);
		System.out.println("validate");
		ValidityReport validity = infModel.validate();
		if (validity.isValid()) {
			System.out.println("generated RDF model is OK! Writing RDF file...");
			valid = true;
		} else {
			System.out.println("generated RDF model contains conflicts. No RDF file produced.");
			for (Iterator<Report> i = validity.getReports(); i.hasNext();) {
				System.out.println(" - " + i.next());
			}
		}
		
		if(valid==true){			
			try {
				OutputStreamWriter char_output = new OutputStreamWriter(
						new FileOutputStream(output_file+".ttl"),
						Charset.forName("UTF-8").newEncoder());
				BufferedWriter out = new BufferedWriter(char_output);
				model.write(out, "TTL");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}

		long t1 = System.currentTimeMillis();
		System.out.println("done in " + ((t1-t0)/1000.0) + " seconds.");		
	}	
}
