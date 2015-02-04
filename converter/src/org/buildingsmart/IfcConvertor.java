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

import org.buildingsmart.vo.EntityVO;
import org.buildingsmart.vo.IFCVO;
import org.buildingsmart.vo.TypeVO;

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
	private String ontURI;
	private String ontNS;
	
	//EXPRESS basis
	private Map<String, EntityVO> ent;
	private Map<String, TypeVO> typ;
	
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
		
		//PREPARATION
		ExpressReader er = new ExpressReader(express_schema, "samples\\" + express_schema + ".exp");
		er.readAndBuild();
		ent = er.getEntities();
		typ = er.getTypes();
		ontURI = "http://www.buildingsmart-tech.org/ifcOWL";
		ontNS = ontURI + "#";
	}

	public Model parseModel(){
		//setup models
		om=ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
		om.read("samples\\" + express_schema + ".ttl"); //TODO: to replace by exact location
		im = ModelFactory.createDefaultModel();
		im.setNsPrefix("ifcowl", ontNS);
		im.setNsPrefix("inst", baseURI);
		
		//Read the whole file into a linemap Map object
		readModel();	
		
//		Model modelInMem = ModelFactory.createDefaultModel();
//		modelInMem.add(om);
//
//		Iterator it = GraphUtil.findAll(modelInMem.getGraph());
//		while (it.hasNext()) {
//		   System.out.println("triple from OntModel " + it.next().toString());
//		}

		//map entries of the linemap Map object to the ontology Model and make new instances in the model	
		mapEntries();		
		createInstances();
		
		

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
			
			//mapping properties to IFCVOs
			for (int i = 0; i < vo.getList().size(); i++) {
				Object o = vo.getList().get(i);
				if (String.class.isInstance(o)) {
					String s = (String) o;
					if (s.length() < 1)
						continue;
					if (s.charAt(0) == '#') {
						Object or = linemap.get(toLong(s.substring(1)));
						System.out.println("1 - created object " + s.substring(1) + " - " + i);
						vo.getList().set(i, or);
					}
				}
				if (LinkedList.class.isInstance(o)) {
					@SuppressWarnings("unchecked")
					LinkedList<Object> tmp_list = (LinkedList<Object>) o;
					for (int j = 0; j < tmp_list.size(); j++) {
						Object o1 = tmp_list.get(j);
						System.out.println("2 - created tmpobject ");
						if (String.class.isInstance(o1)) {
							String s = (String) o1;
							if (s.length() < 1)
								continue;
							if (s.charAt(0) == '#') {
								Object or = linemap.get(toLong(s.substring(1)));
								System.out.println("3 - created object " + s.substring(1) + " - " + i);
								if (or == null) {
									System.err
											.println("Reference to non-existing line in the IFC file.");
									tmp_list.set(j, "-");
								} else
									tmp_list.set(j, or);
							}
						} else if (LinkedList.class.isInstance(o1)) {
							@SuppressWarnings("unchecked")
							LinkedList<Object> tmp2_list = (LinkedList<Object>) o1;
							for (int j2 = 0; j2 < tmp2_list.size(); j2++) {
								Object o2 = tmp2_list.get(j2);
								System.out.println("4 - created tmp_object ");
								if (String.class.isInstance(o2)) {
									String s = (String) o2;
									if (s.length() < 1)
										continue;
									if (s.charAt(0) == '#') {
										Object or = linemap.get(toLong(s
												.substring(1)));
										System.out.println("5 - created object " + s.substring(1) + " - " + i);
										if (or == null) {
											System.err
													.println("Reference to non-existing line in the IFC file.");
											tmp_list.set(j, "-");
										} else
											tmp_list.set(j, or);
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	private void createInstances(){		
		for (Map.Entry<Long, IFCVO> entry : linemap.entrySet()) {
			IFCVO vo = entry.getValue();
			//create class instance
			System.out.println(vo);			
			String typeName = ent.get(vo.getName()).getName();			
			OntClass cl = om.getOntClass(ontNS + typeName);
			im.createResource(baseURI + typeName + "_" + vo.getLine_num(), cl);
			
			FillProperties("root", vo, vo, 0);
		}

		//TODO: inverses
//		try {
//			for (Map.Entry<Long, IFCVO> entry : linemap.entrySet()) {
//				IFCVO vo = entry.getValue();
//				if (vo.getInverse_pointer_sets().size() > 0) {
//					for (Map.Entry<String, LinkedList<IFCVO>> inverse_set : vo.getInverse_pointer_sets()
//							.entrySet()) {
//						LinkedList<IFCVO> li = inverse_set.getValue();
//						String subject = filter_illegal_chars(":"
//								+ ifc_filename + "_" + vo.getLine_num());
//						for (int i = 0; i < li.size(); i++) {
//							IFCVO ivo = li.get(i);
//							addLiteralValue(vo.getLine_num(),
//									ivo.getLine_num(), subject,
//									inverse_set.getKey());
//						}
//					} // for map inverse_set
//				} // if
//			} // for map linemap
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	
	private void FillProperties(String name, IFCVO vo,
			IFCVO level_up_vo, int level) {
		
		EntityVO evo = ent.get(ExpressReader.formatClassName(vo.getName()));
		if (evo == null)
			System.err.println("Does not exist: " + vo.getName());
		
		//we have the base resource... im.createResource was just called
		String subject = evo.getName() + "_" + vo.getLine_num();
		
		// Somebody has pointed here from above:
		if (vo != level_up_vo) {
			String level_up_subject = evo.getName() + "_"
						+ level_up_vo.getLine_num();

			//TODO - addLiteralValue(level_up_vo.getLine_num(), vo.getLine_num(),
					//level_up_subject, name);
		}
		if (vo.is_touched())
			return;
		
//		TODO::
//		TypeVO typeremembrance = null;
//		int attribute_pointer = 0;
//		for (int i = 0; i < vo.getList().size(); i++) {
//			Object o = vo.getList().get(i);
//			if (String.class.isInstance(o)) {
//				if (!((String) o).equals("$")) { 
//					// Do not print out empty values
//
//					if (types.get(ExpressReader.formatClassName((String) o)) == null) {
//
//						if ((evo != null)
//								&& (evo.getDerived_attribute_list() != null)
//								&& (evo.getDerived_attribute_list().size() > attribute_pointer)) {
//							addLiteralValue(
//									vo.getLine_num(),
//									subject,
//									evo.getDerived_attribute_list()
//											.get(attribute_pointer).getName(),
//									"\'" + filter_extras((String) o) + "'");
//						}
//
//						attribute_pointer++;
//					}
//					else{
//						typeremembrance = types.get(ExpressReader.formatClassName((String) o));
//						//System.out.println("Found a reference to : " + types.get(ExpressReader.formatClassName((String) o)) + " for " + vo.getName());
//					}
//				} else
//					attribute_pointer++;
//			} else if (IFCVO.class.isInstance(o)) {
//				if ((evo != null)
//						&& (evo.getDerived_attribute_list() != null)
//						&& (evo.getDerived_attribute_list().size() > attribute_pointer)) {
//					fillJavaClassInstanceValues(evo.getDerived_attribute_list()
//							.get(attribute_pointer).getName(), (IFCVO) o,
//							vo, level + 1);
//					addIFCAttribute(
//							vo,
//							evo.getDerived_attribute_list().get(
//									attribute_pointer), (IFCVO) o);
//				} else {
//					fillJavaClassInstanceValues("-", (IFCVO) o, vo,
//							level + 1);
//					System.out.println("1!" + evo);
//				}
//				attribute_pointer++;
//			} else if (LinkedList.class.isInstance(o)) {
//				@SuppressWarnings("unchecked")
//				LinkedList<Object> tmp_list = (LinkedList<Object>) o;
//				StringBuffer local_txt = new StringBuffer();
//				for (int j = 0; j < tmp_list.size(); j++) {
//					Object o1 = tmp_list.get(j);
//					if (String.class.isInstance(o1)) {
//						if (types.get(ExpressReader.formatClassName((String) o1)) != null && typeremembrance==null) {
//							typeremembrance = types.get(ExpressReader.formatClassName((String) o1));	
//						}
//						else{
//							if (j > 0 && typeremembrance == null)
//								local_txt.append("_, ");
//							local_txt.append(filter_extras((String) o1));							
//						}
//					}
//					if (IFCVO.class.isInstance(o1)) {
//						if ((evo != null)
//								&& (evo.getDerived_attribute_list() != null)
//								&& (evo.getDerived_attribute_list().size() > attribute_pointer)) {
//							fillJavaClassInstanceValues(
//									evo.getDerived_attribute_list()
//											.get(attribute_pointer).getName(),
//									(IFCVO) o1, vo, level + 1);
//							addIFCAttribute(vo, evo.getDerived_attribute_list()
//									.get(attribute_pointer), (IFCVO) o1);
//
//						} else {
//							fillJavaClassInstanceValues("-", (IFCVO) o1,
//									vo, level + 1);
//							System.out.println("2!" + evo);
//						}
//					}
//					if(LinkedList.class.isInstance(o1) && typeremembrance != null){
//						LinkedList<Object> tmp_list_inlist = (LinkedList<Object>) o1;
//						for(int jj = 0; jj<tmp_list_inlist.size(); jj++){
//							Object o2 = tmp_list_inlist.get(jj);
//							if(String.class.isInstance(o2)){
//								local_txt.append(filter_extras((String) o2));
//							}
//						}
//					}
//				}
//
//				if (local_txt.length() > 0) {
//					if(typeremembrance != null){
//						//System.out.println("retrieved the required value : " + typeremembrance.getName() + " - " + local_txt);
//						if ((evo != null)
//								&& (evo.getDerived_attribute_list() != null)
//								&& (evo.getDerived_attribute_list().size() > attribute_pointer)) {
//							addLiteralValue(
//									vo.getLine_num(),
//									subject,
//									evo.getDerived_attribute_list()
//											.get(attribute_pointer).getName(), "'"
//											+ local_txt.toString() + "\'", typeremembrance);
//						}
//						typeremembrance = null;
//					}
//					else if ((evo != null)
//							&& (evo.getDerived_attribute_list() != null)
//							&& (evo.getDerived_attribute_list().size() > attribute_pointer)) {
//						addLiteralValue(
//								vo.getLine_num(),
//								subject,
//								evo.getDerived_attribute_list()
//										.get(attribute_pointer).getName(), "'"
//										+ local_txt.toString() + "\'");
//					}
//				}
//				attribute_pointer++;
//			}
//		}
	
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
