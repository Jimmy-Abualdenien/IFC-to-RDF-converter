package org.buildingsmart;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

import org.buildingsmart.vo.IFCVO;

import com.hp.hpl.jena.graph.GraphUtil;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.InfModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;

import fi.ni.rdf.Namespace;

public class IfcConvertor {

	//input variables
	private String express_schema;
	private String ifc_file;
	private String output_file;
	private String baseURI;
	
	//conversion variables
	private int IDcounter = 0;	
	private Map<Long, IFCVO> linemap = new HashMap<Long, IFCVO>();
	private OntModel om;
	private Model im;
	
	public IfcConvertor(String express_schema, String ifc_file, String output_file, String baseURI){
		//Namespace.IFC = "http://www.buildingsmart-tech.org/ifcOWL";
		this.express_schema = express_schema;
		this.ifc_file = ifc_file;
		this.output_file = output_file;
		this.baseURI = baseURI;
	}

	public Model parseModel(){
		//setup models
		om=ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
		om.read("samples\\" + express_schema + ".ttl"); //TODO: to replace by exact location
		im = ModelFactory.createDefaultModel();
		
		//Read the whole file into a linemap Map object
		readModel();	
		
		Model modelInMem = ModelFactory.createDefaultModel();
		modelInMem.add(om);

		Iterator it = GraphUtil.findAll(modelInMem.getGraph());
		while (it.hasNext()) {
		   System.out.println("triple from OntModel " + it.next().toString());
		}

		mapEntries();
		
		
		
		
		//map entries of the linemap Map object to the ontology Model and make new instances in the model	
		

		// Save memory
		linemap.clear();
		linemap = null;
		System.gc();
		
		return im;
	}
	
	private void readModel() {
		try {
			FileInputStream fstream = new FileInputStream(ifc_file);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			try {
				String strLine;
				while ((strLine = br.readLine()) != null) {
					if (strLine.length() > 0) {
						if (strLine.charAt(0) == '#') {
							StringBuffer sb = new StringBuffer();
							String stmp = strLine;
							sb.append(stmp.trim());
							while (!stmp.contains(";")) {
								stmp = br.readLine();
								if (stmp == null)
									break;
								sb.append(stmp.trim());
							}
							//the whole IFC gets parsed, and everything ends up as IFCVO objects in the Map<Long, IFCVO> linemap variable
							parse_IFC_LineStatement(sb.toString().substring(1));
						}
					}
				}
			} finally {
				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void parse_IFC_LineStatement(String line) {
		IFCVO ifcvo = new IFCVO();
		int state = 0;
		StringBuffer sb = new StringBuffer();
		int cl_count = 0;
		LinkedList<Object> current = ifcvo.getList();
		Stack<LinkedList<Object>> list_stack = new Stack<LinkedList<Object>>();
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			switch (state) {
			case 0:
				if (ch == '=') {
					ifcvo.setLine_num(toLong(sb.toString()));
					sb.setLength(0);
					state++;
					continue;
				} else if (Character.isDigit(ch))
					sb.append(ch);
				break;
			case 1: // (
				if (ch == '(') {
					ifcvo.setName(sb.toString());
					sb.setLength(0);
					state++;
					continue;
				} else if (ch == ';') {
					ifcvo.setName(sb.toString());
					sb.setLength(0);
					state = Integer.MAX_VALUE;
				} else if (!Character.isWhitespace(ch))
					sb.append(ch);
				break;
			case 2: // (... line started and doing (...
				if (ch == '\'') {
					state++;
				}
				if (ch == '(') {
					list_stack.push(current);
					LinkedList<Object> tmp = new LinkedList<Object>();
					if (sb.toString().trim().length() > 0)
						current.add(sb.toString().trim());
					sb.setLength(0);
					current.add(tmp);
					current = tmp;
					cl_count++;
					// sb.append(ch);
				} else if (ch == ')') {
					if (cl_count == 0) {
						if (sb.toString().trim().length() > 0)
							current.add(sb.toString().trim());
						sb.setLength(0);
						state = Integer.MAX_VALUE; // line is done
						continue;
					} else {
						if (sb.toString().trim().length() > 0)
							current.add(sb.toString().trim());
						sb.setLength(0);
						cl_count--;
						current = list_stack.pop();
					}
				} else if (ch == ',') {
					if (sb.toString().trim().length() > 0)
						current.add(sb.toString().trim());
					current.add(Character.valueOf(ch));

					sb.setLength(0);
				} else {
					sb.append(ch);
				}
				break;
			case 3: // (...
				if (ch == '\'') {
					state--;
				} else {
					sb.append(ch);
				}
				break;
			default:
				// Do nothing
			}
		}
		linemap.put(ifcvo.getLine_num(), ifcvo);
		IDcounter++;
	}
	
	private void mapEntries(){
		for (Map.Entry<Long, IFCVO> entry : linemap.entrySet()) {
			IFCVO vo = entry.getValue();
			System.out.println(vo);
			
			String typeName = vo.getName();
			
			OntClass cl = om.getOntClass("http://www.buildingsmart-tech.org/ifcOWL#IfcProject");
			System.out.println(cl);
			
//			try {
//				Class<?> cls = Class.forName("org.buildingsmart." + schemaName + "."
//						+ entities.get(vo.getName()).getName());
//				Constructor<?> ct = cls.getConstructor();
//				thing = (Thing) ct.newInstance();
//				thing.getI().setLine_number(vo.getLine_num());
//				object_buffer.put(vo.getLine_num(), (Thing) thing);
//			}
		}
	}
	
	
	
	
	
	//HELPER METHODS	
		private String filter_extras(String txt) {
			StringBuffer sb = new StringBuffer();
			for (int n = 0; n < txt.length(); n++) {
				char ch = txt.charAt(n);
				switch (ch) {
				case '\'':
					break;
				case '=':
					break;
				default:
					sb.append(ch);
				}
			}
			return sb.toString();
		}

		private String filter_illegal_chars(String txt) {
			StringBuffer sb = new StringBuffer();
			for (int n = 0; n < txt.length(); n++) {
				char ch = txt.charAt(n);
				switch (ch) {
				case '.':
					sb.append('_');
					break;
				case '\"':
					sb.append("\\\"");
					break;
				case '\'':
					sb.append("\\\'");
					break;
				case '\\':
					sb.append("\\\\");
					break;
				default:
					sb.append(ch);
				}
			}
			return sb.toString();
		}

		private String filter_spaces(String txt) {
			StringBuffer sb = new StringBuffer();
			for (int n = 0; n < txt.length(); n++) {
				char ch = txt.charAt(n);
				switch (ch) {
				case '\'':
					break;
				case ' ':
					sb.append('_');
					break;
				default:
					sb.append(ch);
				}
			}
			return sb.toString();
		}
		
		private Long toLong(String txt) {
			try {
				return Long.valueOf(txt);
			} catch (Exception e) {
				return Long.MIN_VALUE;
			}
		}
		
		private Double parseDouble(String val){
			Double d = new Double(0);
			if(val.contains("_E-"))
				val = val.replaceAll("_", "");
			
			if(val.contains("_"))
				val = val.replaceAll("_", ".");
			
			try{
				d = Double.parseDouble(val);
				return d;
			}
			catch(Exception e){
				System.out.println("error in parsing double : " + val);
				return null;
			}
		}

}
