/*
 * IFC_ClassModel is a class to parse any IFC STEP coded file.
 * - creates RDF of the internal representation
 * - creates internal java class representation of the IFC file
 * - returns tree of the building elements
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

package org.buildingsmart;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import fi.ni.rdf.Namespace;
import org.buildingsmart.vo.AttributeVO;
import org.buildingsmart.vo.EntityVO;
import org.buildingsmart.vo.IFCVO;
import org.buildingsmart.vo.TypeVO;
import org.buildingsmart.vo.ValuePair;

public class IFC_ClassModel {

	private final Map<String, EntityVO> entities;
	private final Map<String, TypeVO> types;
	private final String ifc_filename;
	private final String ifc_model_name;
	private String model_file;
	private String schemaName;
	
	private Map<Long, IFCVO> linemap = new HashMap<Long, IFCVO>();
	public final Map<Long, Thing> object_buffer = new HashMap<Long, Thing>(); // line_number,
	//public final Map<String, Thing> gid_map = new HashMap<String, Thing>(); // GID,
	//public boolean has_duplicate_guids = false;
	private Thing root;

	/**
	 * Instantiates a new IFC_ClassModel.
	 * 
	 * @param model_file
	 *            the name of the IFC file to be read in
	 * @param entities
	 *            the entities
	 * @param types
	 *            the types
	 */
	public IFC_ClassModel(String model_file, Map<String, EntityVO> entities,
			Map<String, TypeVO> types, String ifc_model_name, String schemaName) {
		this.entities = entities;
		this.types = types;
		this.ifc_filename = filter_spaces((new File(model_file)).getName());
		this.ifc_model_name = ifc_model_name;
		this.model_file = model_file;
		this.schemaName = schemaName; //IFC2X3_TC1 - IFC4_ADD1
	}
	
	public void parseModel(){
		readModel();
		mapEntries();
		//calculateTheLongestsPathsToTheNode_and_setGlobalIDs();
		createObjectTree();

		for (Map.Entry<Long, Thing> entry : object_buffer.entrySet()) {
			Thing gobject = entry.getValue();

			Class c = gobject.getClass();
			
			if (c.getSimpleName().equalsIgnoreCase("IfcProject"))
				root = (Thing) gobject;
				
//			if (IfcRoot.class.isInstance(gobject)) {
//				IfcRoot t = (IfcRoot) gobject;
//				Thing tmp = gid_map.put(t.getGlobalId(), t);
//				if (tmp != null) {
//					has_duplicate_guids = true;
//					System.err.println("Duplicate GUID:" + tmp.line_number
//							+ " - " + t.line_number);
//				}
//
//			}
//				
//			if (IfcProject.class.isInstance(gobject)) {
//				root = (IfcProject) gobject;
//			}
		}
		// Save memory
		linemap.clear();
		linemap = null;
		System.gc();
	}
		
	private void readModel() {
		try {
			FileInputStream fstream = new FileInputStream(model_file);
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
	}
	
	private void mapEntries() {
		for (Map.Entry<Long, IFCVO> entry : linemap.entrySet()) {
			IFCVO vo = entry.getValue();

			// Initialize the object_buffer
			try {
				Thing thing = object_buffer.get(vo.getLine_num());
				if (thing == null) {
					Class<?> cls = Class.forName("org.buildingsmart." + schemaName + "."
							+ entities.get(vo.getName()).getName());
					Constructor<?> ct = cls.getConstructor();
					thing = (Thing) ct.newInstance();
					thing.getI().setLineNumber(vo.getLine_num());
					object_buffer.put(vo.getLine_num(), (Thing) thing);
				}
			} catch (Exception e) {
				e.printStackTrace();	
			}

			for (int i = 0; i < vo.getList().size(); i++) {
				Object o = vo.getList().get(i);
				if (String.class.isInstance(o)) {
					String s = (String) o;
					if (s.length() < 1)
						continue;
					if (s.charAt(0) == '#') {
						Object or = linemap.get(toLong(s.substring(1)));
						vo.getList().set(i, or);
					}
				}
				if (LinkedList.class.isInstance(o)) {
					@SuppressWarnings("unchecked")
					LinkedList<Object> tmp_list = (LinkedList<Object>) o;
					for (int j = 0; j < tmp_list.size(); j++) {
						Object o1 = tmp_list.get(j);
						if (String.class.isInstance(o1)) {
							String s = (String) o1;
							if (s.length() < 1)
								continue;
							if (s.charAt(0) == '#') {
								Object or = linemap.get(toLong(s.substring(1)));
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
								if (String.class.isInstance(o2)) {
									String s = (String) o2;
									if (s.length() < 1)
										continue;
									if (s.charAt(0) == '#') {
										Object or = linemap.get(toLong(s
												.substring(1)));
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
	
	private void createObjectTree() {
		for (Map.Entry<Long, IFCVO> entry : linemap.entrySet()) {
			IFCVO vo = entry.getValue();
			fillJavaClassInstanceValues("root", vo, vo, 0);
		}

		try {
			for (Map.Entry<Long, IFCVO> entry : linemap.entrySet()) {
				IFCVO vo = entry.getValue();
				if (vo.getInverse_pointer_sets().size() > 0) {
					for (Map.Entry<String, LinkedList<IFCVO>> inverse_set : vo.getInverse_pointer_sets()
							.entrySet()) {
						LinkedList<IFCVO> li = inverse_set.getValue();
						String subject = filter_illegal_chars(":"
								+ ifc_filename + "_i" + vo.getLine_num());
//						if (vo.getGid() != null) {
//							subject = ":guid" + GuidCompressor.uncompressGuidString(filter_extras(vo.getGid()));
//						}
						for (int i = 0; i < li.size(); i++) {
							IFCVO ivo = li.get(i);
							addLiteralValue(vo.getLine_num(),
									ivo.getLine_num(), subject,
									inverse_set.getKey());
						}
					} // for map inverse_set
				} // if
			} // for map linemap
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	// ==============================================================================================================================

	/**
	 * Fill java class instance values.
	 * 
	 * @param name
	 *            the name
	 * @param vo
	 *            the value object representing the IFC file line
	 * @param level_up_vo
	 *            the IFC line pointing to this line
	 * @param level
	 *            the iteration count in the recursive run
	 */
	private void fillJavaClassInstanceValues(String name, IFCVO vo,
			IFCVO level_up_vo, int level) {

		EntityVO evo = entities.get(ExpressReader.formatClassName(vo.getName()));
		if (evo == null)
			System.err.println("Does not exist: " + vo.getName());
		String subject = null;

//		if (vo.getGid() != null) {
//			subject = "gref_" + filter_extras(vo.getGid());
//		} else {
			subject = "iref_" + ifc_filename + "_i" + vo.getLine_num();
//		}

		// Somebody has pointed here from above:
		if (vo != level_up_vo) {
			String level_up_subject;
//			if (level_up_vo.getGid() != null) {
//				level_up_subject = "gref_"
//						+ filter_extras(level_up_vo.getGid());
//			} else {
				level_up_subject = "iref_" + ifc_filename + "_i"
						+ level_up_vo.getLine_num();
//			}

			addLiteralValue(level_up_vo.getLine_num(), vo.getLine_num(),
					level_up_subject, name);
		}
		if (vo.is_touched())
			return;

		int attribute_pointer = 0;
		for (int i = 0; i < vo.getList().size(); i++) {
			Object o = vo.getList().get(i);
			if (String.class.isInstance(o)) {
				if (!((String) o).equals("$")) { // Do not print out empty
					// values'

					if (types.get(ExpressReader.formatClassName((String) o)) == null) {

						if ((evo != null)
								&& (evo.getDerived_attribute_list() != null)
								&& (evo.getDerived_attribute_list().size() > attribute_pointer)) {
							addLiteralValue(
									vo.getLine_num(),
									subject,
									evo.getDerived_attribute_list()
											.get(attribute_pointer).getName(),
									"\'" + filter_extras((String) o) + "'");
						}

						attribute_pointer++;
					}
				} else
					attribute_pointer++;
			} else if (IFCVO.class.isInstance(o)) {
				if ((evo != null)
						&& (evo.getDerived_attribute_list() != null)
						&& (evo.getDerived_attribute_list().size() > attribute_pointer)) {
					fillJavaClassInstanceValues(evo.getDerived_attribute_list()
							.get(attribute_pointer).getName(), (IFCVO) o,
							vo, level + 1);
					addIFCAttribute(
							vo,
							evo.getDerived_attribute_list().get(
									attribute_pointer), (IFCVO) o);
				} else {
					fillJavaClassInstanceValues("-", (IFCVO) o, vo,
							level + 1);
					System.out.println("1!" + evo);

				}
				attribute_pointer++;
			} else if (LinkedList.class.isInstance(o)) {
				@SuppressWarnings("unchecked")
				LinkedList<Object> tmp_list = (LinkedList<Object>) o;
				StringBuffer local_txt = new StringBuffer();
				for (int j = 0; j < tmp_list.size(); j++) {
					Object o1 = tmp_list.get(j);
					if (String.class.isInstance(o1)) {
						if (j > 0)
							local_txt.append(", ");
						local_txt.append(filter_extras((String) o1));
					}
					if (IFCVO.class.isInstance(o1)) {
						if ((evo != null)
								&& (evo.getDerived_attribute_list() != null)
								&& (evo.getDerived_attribute_list().size() > attribute_pointer)) {
							fillJavaClassInstanceValues(
									evo.getDerived_attribute_list()
											.get(attribute_pointer).getName(),
									(IFCVO) o1, vo, level + 1);
							addIFCAttribute(vo, evo.getDerived_attribute_list()
									.get(attribute_pointer), (IFCVO) o1);

						} else {
							fillJavaClassInstanceValues("-", (IFCVO) o1,
									vo, level + 1);
							System.out.println("2!" + evo);
						}

					}
				}

				if (local_txt.length() > 0) {
					if ((evo != null)
							&& (evo.getDerived_attribute_list() != null)
							&& (evo.getDerived_attribute_list().size() > attribute_pointer)) {
						addLiteralValue(
								vo.getLine_num(),
								subject,
								evo.getDerived_attribute_list()
										.get(attribute_pointer).getName(), "'"
										+ local_txt.toString() + "\'");
					}

				}
				attribute_pointer++;
			}
		}
	}
	
	public void listRDF(BufferedWriter out, String path) throws IOException {
		try {
			out.write("@prefix : <" + path + ">.\n");
			out.write("@prefix instances: <" + path + ">. \n");
			out.write("@prefix owl: <" + Namespace.OWL + "> .\n");
			out.write("@prefix ifc: <" + Namespace.IFC + "> .\n");
			out.write("@prefix xsd: <" + Namespace.XSD + "> .\n");
			out.write("\n");
			
			for (Map.Entry<Long, Thing> entry : object_buffer.entrySet()) {
				Thing gobject = entry.getValue();
				String triples = generateTriples(gobject);
				out.write(triples);
			}

		} finally {
			if(out!=null) out.close();
		}
	}
	
	private String generateTriples(Thing pointer)
			throws IOException {
		
		StringBuffer toRet = new StringBuffer();

		String subject = deduceSubject(pointer);
		/*if (IfcRoot.class.isInstance(pointer)) {
			toRet.append(subject + " owl:sameAs instances:" + this.ifc_model_name
					+ "_iref_" + pointer.i.drum_getLine_number() + ".\n");
		}*/
		toRet.append(subject + " a ifc:" + pointer.getClass().getSimpleName()
				+ ".\n");

		List<ValuePair> l = pointer.getI().drum_getParameterAttributeValues();
		for (int n = 0; n < l.size(); n++) {
			ValuePair vp = (ValuePair) l.get(n);
			if (vp.getValue() == null)
				continue; // null values allowed
			if (List.class.isInstance(vp.getValue())) {
				List li = (List) vp.getValue();
				if (li.size() == 0)
					continue; // empty list
				toRet.append(subject + " ifc:"
						+ ExpressReader.formatProperty(vp.getName(),false) + "  (\n");
				for (int j = 0; j < li.size(); j++) {
					Object o1 = li.get(j);
					if (Thing.class.isInstance(o1)) {
						toRet.append(deduceSubject((Thing) o1) + "\n");
						continue;
					}
					toRet.append(" \"" + o1.toString() + "\"");
					if (o1.getClass().equals(java.lang.Long.class))
						toRet.append("^^xsd:integer");
					if (o1.getClass().equals(java.lang.Double.class))
						toRet.append("^^xsd:double");
					if (o1.getClass().equals(java.util.Date.class))
						toRet.append("^^xsd:datetime");
					if (o1.getClass().equals(java.lang.String.class))
						toRet.append("^^xsd:string");
					toRet.append("\n");
				}
				toRet.append(").\n");
				continue; // Case handled
			}
			toRet.append(subject + " ifc:"
					+ ExpressReader.formatProperty(vp.getName(),false));
			if (Thing.class.isInstance(vp.getValue())) {
				toRet.append(" " + deduceSubject((Thing) vp.getValue()) + ".\n"); // Modified
																				  // 13rd
																				  // May
																				  // 2013
				continue;
			}
			toRet.append("  \"" + vp.getValue() + "\"");
			if (vp.getValue().getClass().equals(java.lang.Long.class))
				toRet.append("^^xsd:integer");
			if (vp.getValue().getClass().equals(java.lang.Double.class))
				toRet.append("^^xsd:decimal");
			if (vp.getValue().getClass().equals(java.util.Date.class))
				toRet.append("^^xsd:datetime");
			if (vp.getValue().getClass().equals(java.lang.String.class))
				toRet.append("^^xsd:string");

			toRet.append(".\n");
		}
		
		return toRet.toString();
	}

	private String deduceSubject(Thing pointer) {
		String subject;
		/*if (IfcRoot.class.isInstance(pointer)) {
			subject =":guid" + GuidCompressor.uncompressGuidString(((IfcRoot) pointer).getGlobalId());
		} else {*/
			subject = "instances:" + this.ifc_model_name + "_iref_"
					+ pointer.getI().getLineNumber();
		//}
		return subject;

	}
	
	// ========================================================================================================

	public void neatPrintOut(Long line_number) {
		Thing start = getLineEntry(line_number);
		neatPrintOut(start, 0);
	}

	/**
	 * Neat print out.
	 * 
	 * @param pointer
	 *            the current element at the graph
	 * @param level
	 *            the iteration count in the recursive run
	 */
	private void neatPrintOut(Thing pointer, int level) {
		if (level > 5)
			return;

		List<ValuePair> l = pointer.getI().drum_getParameterAttributes();
		for (int n = 0; n < l.size(); n++) {
			ValuePair vp = (ValuePair) l.get(n);
			for (int i = 0; i < level; i++)
				System.out.print("  ");
			System.out.println(vp.getName() + " = " + vp.getValue());
		}
		List<ValuePair> ifcs = pointer.getI().drum_getIfcClassAttributes();
		for (int n = 0; n < ifcs.size(); n++) {
			ValuePair vp = (ValuePair) ifcs.get(n);
			Thing t = (Thing) vp.getValue();
			neatPrintOut(t, level + 1);
		}
	}

	// ========================================================================================================

	/**
	 * Gets the line entry.
	 * 
	 * @param line_number
	 *            the line_number
	 * @return the line entry
	 */
	public Thing getLineEntry(Long line_number) {
		return getLineEntry(line_number, null);
	}

	/**
	 * Gets the line entry.
	 * 
	 * @param line_number
	 *            the line_number
	 * @param class_name
	 *            the class_name
	 * @return the line entry
	 */

	private Thing getLineEntry(Long line_number, String class_name) {
		Thing thing = object_buffer.get(line_number);
		if (thing == null) {
			if (class_name == null)
				return null;
			@SuppressWarnings("rawtypes")
			Class cls = null;
			try {
				cls = Class.forName("org.buildingsmart." + schemaName + "." + class_name);
				@SuppressWarnings({ "rawtypes", "unchecked" })
				Constructor ct = cls.getConstructor();
				thing = (Thing) ct.newInstance();
				thing.getI().setLineNumber(line_number);
				object_buffer.put(line_number, (Thing) thing);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return thing;
	}

	/**
	 * Format set method.
	 * 
	 * @param s
	 *            the s
	 * @return the string
	 */
	static public String formatSetMethod(String s) {
		if (s == null)
			return null;
		StringBuffer sb = new StringBuffer();
		sb.append("set");
		sb.append(Character.toUpperCase(s.charAt(0)));
		sb.append(s.substring(1));
		return sb.toString();
	}

	/**
	 * Sets the value2 thing.
	 * 
	 * @param t
	 *            the t
	 * @param param_name
	 *            the param_name
	 * @param value
	 *            the value
	 * 
	 *            This uses most of the CPU time
	 */
	@SuppressWarnings("unchecked")
	private void setValue2Thing(Thing t, String param_name, Object value) {
		if (value.equals("*")) {
			return; // No value
		}
		String set_method_name = formatSetMethod(param_name);
		Method method[] = t.getClass().getMethods();
		for (int j = 0; j < method.length; j++) {
			try {
				if (method[j].getName().equals(set_method_name)) {
					method[j].invoke(t, value);
					return; // Only one invocation
				}

			} catch (Exception e) {
				try {

					@SuppressWarnings("rawtypes")
					Class cls = Class.forName("org.buildingsmart." + schemaName + "."
							+ method[j].getParameterTypes()[0].getSimpleName()
							+ "_StringValue");
					@SuppressWarnings("rawtypes")
					Constructor ct = cls.getConstructor();
					Object o = ct.newInstance();
					cls.getMethod(IFC_CLassModelConstants.SET_VALUE,
							String.class).invoke(o, value);
					if (method[j].getName().equals(formatSetMethod(param_name))) {
						if (value.equals("*")) {
							method[j].invoke(t, o);// ; // No value
						} else
							method[j].invoke(t, o);
					}

				} catch (Exception e1) {
					e1.printStackTrace();
					System.err.println("ERR param:" + param_name + " object:"
							+ value.toString() + " class:"
							+ t.getClass().getSimpleName() + " value class:"
							+ value.getClass().getSimpleName());
				}
			}

		}

	}

	/**
	 * Adds the literal value.
	 * 
	 * @param subject_line_number
	 *            the subject_line_number
	 * @param s
	 *            the s
	 * @param p
	 *            the p
	 * @param o
	 *            the o
	 */
	private void addLiteralValue(Long subject_line_number, String s, String p,
			String o) {

		String p_uri;

		Thing subject_line_entry = getLineEntry(subject_line_number);
		p_uri = ExpressReader.formatProperty(p,false);

		try {
			setValue2Thing(subject_line_entry, filter_illegal_chars(p_uri),
					filter_illegal_chars(filter_extras(o)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Adds the literal value.
	 * 
	 * @param subject_line_number
	 *            the subject_line_number
	 * @param object_line_number
	 *            the object_line_number
	 * @param s
	 *            the s
	 * @param p
	 *            the p
	 */
	private void addLiteralValue(Long subject_line_number,
			Long object_line_number, String s, String p) {

		String p_uri;

		Thing subject_line_entry = getLineEntry(subject_line_number);
		p_uri = ExpressReader.formatProperty(p,false);
		Thing object_line_entry = getLineEntry(object_line_number);

		try {
			setValue2Thing(subject_line_entry, filter_illegal_chars(p_uri),
					object_line_entry);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Adds the ifc attribute.
	 * 
	 * @param vo
	 *            the value object representing the IFC file line
	 * @param attribute
	 *            the attribute
	 * @param ref_value
	 *            the ref_value
	 */
	private void addIFCAttribute(IFCVO vo, AttributeVO attribute,
			IFCVO ref_value) {
		if (attribute.isReverse_pointer()) {

			LinkedList<IFCVO> lista = ref_value.getInverse_pointer_sets()
					.get(attribute.getPoints_from().getName());
			if (lista == null) {
				lista = new LinkedList<IFCVO>();
				ref_value.getInverse_pointer_sets().put(attribute.getPoints_from()
						.getName(), lista);
			}
			lista.add(vo);
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
	
	//ACCESSORS	
	public Map<Long, Thing> getObject_buffer() {
		return object_buffer;
	}

	public Thing getRoot() {
		return root;
	}

	public void setRoot(Thing root) {
		this.root = root;
	}

	public Map<Long, IFCVO> getLinemap() {
		return linemap;
	}
	
	// ===========================================================================================================================

	//UNUSED METHODS
	
	/*
	 * Traverse through the graph to check the max levels of the entries. The
	 * level refers the longest path to the node.
	 * 
	 * Sets the Global ID to the nodes.
	 */

//	/**
//	 * Estimate_level.
//	 * 
//	 * @param vo
//	 *            the value object representing the IFC file line
//	 * @param level
//	 *            the iteration count in the recursive run
//	 */
//	private void estimate_level(IFCVO vo, int level) {
//		if (level > vo.getMaxlevel())
//			vo.setMaxlevel(level);
//		EntityVO evo = entities.get(vo.name);
//		int pointer = 0;
//
//		for (int i = 0; i < vo.list.size(); i++) {
//			Object o = vo.list.get(i);
//
//			if (String.class.isInstance(o)) {
//				if (!((String) o).equals("$")) { // Do not handle empty values
//
//					if ((evo != null)
//							&& (evo.getDerived_attribute_list() != null)
//							&& (evo.getDerived_attribute_list().size() > pointer)) {
//						if (evo.getDerived_attribute_list().get(pointer)
//								.getName()
//								.equals(IFC_CLassModelConstants.GLOBAL_ID)) {
//							vo.setGid(filter_extras((String) o));
//						}
//					}
//				}
//				pointer++;
//			} else if (IFCVO.class.isInstance(o)) {
//				estimate_level((IFCVO) o, level + 1);
//			} else if (LinkedList.class.isInstance(o)) {
//				@SuppressWarnings("unchecked")
//				LinkedList<Object> tmp_list = (LinkedList<Object>) o;
//				for (int j = 0; j < tmp_list.size(); j++) {
//					Object o1 = tmp_list.get(j);
//					if (IFCVO.class.isInstance(o1)) {
//						estimate_level((IFCVO) o1, level + 1);
//					} else if (LinkedList.class.isInstance(o1)) {
//						@SuppressWarnings("unchecked")
//						LinkedList<Object> tmp2_list = (LinkedList<Object>) o1;
//						for (int j2 = 0; j2 < tmp2_list.size(); j2++) {
//							Object o2 = tmp2_list.get(j2);
//							if (IFCVO.class.isInstance(o2)) {
//								estimate_level((IFCVO) o2, level + 1);
//							} else if (String.class.isInstance(o2)) {
//								// if (!((String) o2).equals("?"))
//								// System.err.println("ts:" + ((String) o2));
//							} else if (Character.class.isInstance(o2))
//								;
//							else
//								System.err.println("t:"
//										+ o2.getClass().getSimpleName());
//						}
//					}
//
//				}
//			}
//		}
//
//	}

//	/**
//	 * Calculate the longests paths to the node.
//	 */
//	public void calculateTheLongestsPathsToTheNode_and_setGlobalIDs() {
//		for (Map.Entry<Long, IFCVO> entry : linemap.entrySet()) {
//			IFCVO vo = entry.getValue();
//			estimate_level(vo, 0);
//		}
//	}

//	/**
//	 * Gets the gID things.
//	 * 
//	 * @return the gID things
//	 */
//	public Map<String, Thing> getGIDThings() {
//		return gid_map;
//	}
}
