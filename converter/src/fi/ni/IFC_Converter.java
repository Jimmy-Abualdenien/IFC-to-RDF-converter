package fi.ni;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import net.sf.json.JSONObject;
import fi.ni.rdf.VirtConfig;


/*
The MIT License (MIT)

Copyright (c) 2014 Jyrki Oraskari

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

public class IFC_Converter {

	private static final String DEFAULT_PATH = "http://drum3.cs.hut.fi/";
		
	public static void convert(String jsonConfig) {
		JSONObject obj = JSONObject.fromObject(jsonConfig);
		String express_file = obj.getString("express_file");
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
		
		convert(express_file, ifc_file, output_file, model_name, path, virt);
		
	}
	
	public static void convert(String express_file, String ifc_file, String output_file, String model_version_name, String path, VirtConfig virt) {
		try {
			FileOutputStream fos = new FileOutputStream(output_file);
			long t0 = System.currentTimeMillis();
			ExpressReader er = new ExpressReader(express_file);
			FileInputStream fileInputStream = new FileInputStream(ifc_file);
			IFC_ClassModel model = new IFC_ClassModel(ifc_file, fileInputStream, er.getEntities(), er.getTypes(), model_version_name);
			
			try {
				model.listRDF(fos, path, virt, null);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			long t1 = System.currentTimeMillis();
			System.out.println("done in " + ((t1-t0)/1000.0) + " seconds.");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		if(args.length != 4 && !(args.length == 2 && args[0].startsWith("-json")))
		 	System.out.println("Usage:  java IFC_Converter express_filename ifc_filename output_filename model__version_name \nExample: java IFC_Converter c:\\jo\\IFC2X3_TC1.exp C:\\jo\\sample.ifc c:\\jo\\output_rdf.txt sample_version");
		else {
			if(args.length == 4) {
				convert(args[0], args[1], args[2], args[3], DEFAULT_PATH, null);
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
