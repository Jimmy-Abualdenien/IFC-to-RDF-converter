package org.buildingsmart;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import net.sf.json.JSONObject;
import fi.ni.rdf.VirtConfig;


/*
The GNU Affero General Public License

Copyright (c) 2014 Jyrki Oraskari

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

public class IFC_Converter {

	private static final String DEFAULT_PATH = "http://drum3.cs.hut.fi/";
		
	public static void convert(String jsonConfig) {
		JSONObject obj = JSONObject.fromObject(jsonConfig);
		String express_file = obj.getString("express_file");
		String express_schema = obj.getString("express_schemaversion");
		String ifc_file = obj.getString("ifc_file");
		String output_file = obj.getString("output_file");
		String model_name = obj.getString("model_name");
		String path = obj.getString("path");	
		
		VirtConfig virt = null;
		if(obj.containsKey("virtuoso")){
			virt = new VirtConfig();
			JSONObject virtObj = obj.getJSONObject("virtuoso");
			virt.user = virtObj.getString("user");
			virt.password = virtObj.getString("password");
			virt.jdbc_uri = virtObj.getString("jdbc_uri");
		}
		
		convert(express_file, express_schema, ifc_file, output_file, model_name, path, virt);
		
	}
	
	public static void convert(String express_file, String express_schema, String ifc_file, String output_file, String model_version_name, String path, VirtConfig virt) {

		long t0 = System.currentTimeMillis();
		//TODO: constructor changed!!
		ExpressReader er = new ExpressReader(express_schema, express_file);
		IFC_ClassModel model = new IFC_ClassModel(ifc_file, er.getEntities(), er.getTypes(), model_version_name);
				
		try {
			model.listRDF(output_file, path, virt);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		long t1 = System.currentTimeMillis();
		System.out.println("done in " + ((t1-t0)/1000.0) + " seconds.");
		
	}

	public static void main(String[] args) {
		//TODO: constructor changed!!
		if(args.length != 5 && !(args.length == 2 && args[0].startsWith("-json")))
		 	System.out.println("Usage:  java IFC_Converter express_filename express_schemaversion ifc_filename output_filename model__version_name \nExample: java IFC_Converter c:\\jo\\IFC2X3_TC1.exp IFC2X3_TC1 C:\\jo\\sample.ifc c:\\jo\\output_rdf.txt sample_version");
		else {
			if(args.length == 4) {
				convert(args[0], args[1], args[2], args[3], args[4], DEFAULT_PATH, null);
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

	public static String slurp (InputStream in) throws IOException {
		StringBuffer out = new StringBuffer();
		byte[] b = new byte[4096];
		for (int n; (n = in.read(b)) != -1;) {
			out.append(new String(b, 0, n));
		}
		return out.toString();
	}
}
