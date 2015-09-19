package org.buildingsmart;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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

	private static String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss")
			.format(Calendar.getInstance().getTime());
	private static final String DEFAULT_PATH = "http://linkedbuildingdata.net/ifc/resources"
			+ timeLog + "/";

	/**
	 * @param args
	 *            filePath schemaname
	 */
	public static void main(String[] args) {
		//TODO: only IFC4_ADD1, IFC4, IFC2X3_TC1, and IFC2X3_Final files should be accepted, nothing else
		if (args.length != 2) {
			System.out
					.println("Usage: java IfcReader ifc_filename output_filename \nExample: java IfcReader C:\\sample.ifc c:\\output.ttl (we only convert to TTL)");
			for (int i = 0; i < args.length; i++) {
				System.out.println("arg[" + i + "] : " + args[i]);
			}
		} else {
			if (args.length == 2 && !args[0].startsWith("-json")) {
				convert(args[0], args[1], DEFAULT_PATH);
			} else {
				if (args[0].equals("-json")) {
					try {
						FileInputStream fis = new FileInputStream(args[1]);
						String jsonString = slurp(fis);
						fis.close();
						convert(jsonString);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (args[0].equals("-jsonString")) {
					convert(args[1]);
				}
			}
		}
	}

	public static void convert(String jsonConfig) {
		JSONObject obj = JSONObject.fromObject(jsonConfig);

		String ifc_file = obj.getString("ifc_file");
		String output_file = obj.getString("output_file");

		convert(ifc_file, output_file, DEFAULT_PATH);
	}

	private static String getExpressSchema(String ifc_file) {
		try {
			FileInputStream fstream = new FileInputStream(ifc_file);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			try {
				String strLine;
				while ((strLine = br.readLine()) != null) {
					if (strLine.length() > 0) {
						if (strLine.startsWith("FILE_SCHEMA")) {
							if (strLine.indexOf("IFC4MVD_PP") != -1)
								return "IFC4MVD_PP";
							if (strLine.indexOf("IFC2X3") != -1)
								return "IFC2X3_TC1";
							if (strLine.indexOf("IFC4") != -1)
								return "IFC4_ADD1";
//							if (strLine.indexOf("IFC2X2") != -1)
//								return "IFC2X2_ADD1";
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

	public static void convert(String ifc_file, String output_file,
			String baseURI) {
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
			return;

		// CONVERSION
		OntModel om = null;
		Model model = null;
		InputStream in = null;
		InputStream expin = null;
		try {
//			om = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM_RDFS_INF); //this takes a LOT more time (like 30 times as much for a simple model)
			om = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
			in = IfcReader.class.getResourceAsStream("/org/buildingsmart/resources/" + exp + ".ttl");
			om.read(in, null, "TTL");

			expin = IfcConvertor.class.getResourceAsStream("/org/buildingsmart/resources/" + exp + ".exp");
			ExpressReader er = new ExpressReader(expin);
			er.readAndBuildVersion2015();

			IfcConvertor conv = new IfcConvertor(om, er, new FileInputStream(
					ifc_file), baseURI, exp);
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
				writeTTLRDFFiles(model, output_file);
			} else {
				System.err.println("The generated RDF model is invalid");
				System.exit(1);
			}
			long t1 = System.currentTimeMillis();
			System.out.println("done in " + ((t1 - t0) / 1000.0) + " seconds.");
		} else {
			System.out
					.println("No ontologyModel or instanceModel found -> no files generated.");
		}
	}
	
	public Model convert(String ifc_file, String baseURI) {
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

			IfcConvertor conv = new IfcConvertor(om, er, new FileInputStream(
					ifc_file), baseURI, exp);
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
		} else {
			System.out
					.println("No ontologyModel or instanceModel found -> no files generated.");
		}
		return model;
	}

	// VALIDATION
	private static boolean validateGeneratedModel(OntModel om, Model model) {
		boolean valid = false;

		// Check the created model with the OWL ontology
		System.out.println("createInfModel");
		InfModel infModel = ModelFactory.createInfModel(
				ReasonerRegistry.getRDFSReasoner(), om, model);
		System.out.println("validate");
		ValidityReport validity = infModel.validate();
		if (validity.isValid()) {
			System.out
					.println("generated RDF graph is OK! Writing TTL and RDF file...");
			valid = true;
		} else {
			System.out
					.println("generated RDF model contains conflicts. No TTL or RDF file produced.");
			for (Iterator<Report> i = validity.getReports(); i.hasNext();) {
				System.out.println(" - " + i.next());
			}
		}
		return valid;
	}

	private static void writeTTLRDFFiles(Model model, String output_file) {

		System.out.println("output_file before: " + output_file);
		
		if (!output_file.endsWith(".ttl")) {
			//output_file.replaceAll(".", "");
			output_file += ".ttl";
		}

		System.out.println("output_file after: " + output_file);
		
		String output_file_rdf = output_file.substring(0,
				output_file.length() - 4) + ".rdf";
		
		System.out.println("output_file_rdf: " + output_file_rdf);
		
		try {
			OutputStreamWriter char_output = new OutputStreamWriter(
					new FileOutputStream(output_file), Charset.forName("UTF-8")
							.newEncoder());
			BufferedWriter out = new BufferedWriter(char_output);
			model.write(out, "TTL");
		} catch (IOException e) {
			System.err
					.println("Something went wrong while writing the TTL file");
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
			System.exit(1);
			e.printStackTrace();
		}
	}
}
