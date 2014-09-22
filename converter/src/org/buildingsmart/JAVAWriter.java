package org.buildingsmart;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.buildingsmart.vo.AttributeVO;
import org.buildingsmart.vo.EntityVO;
import org.buildingsmart.vo.PropertyVO;
import org.buildingsmart.vo.TypeVO;

/*
 * JAVAWriter writes JAVA class files from the in-memory EXPRESS model that is parsed by the ExpressReader class.
 * 
 * The usage:
 * JAVAWriter jw = new JAVAWriter(expressSchemaName, entities, interfaces, types, interface_aliases);
 * 
 *  - outputJavaClasses() - writes java classes in appropriate 'schema' package
 *  - outputJavaInterfaces() - writes java classes in appropriate 'schema/interfaces' package
 *   
 * @author Jyrki Oraskari
 * @author of modifications Pieter Pauwels (pipauwel.pauwels@ugent.be / pipauwel@gmail.com)
 */

/*
 * The GNU Affero General Public License
 * 
 * Copyright (c) 2014 Jyrki Oraskari (original)
 * Copyright (c) 2014 Pieter Pauwels (modifications)
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

public class JAVAWriter {

	private String expressSchemaName;
	
	private Map<String, EntityVO> entities = new HashMap<String, EntityVO>();
	private Map<String, TypeVO> types = new HashMap<String, TypeVO>();
	private Map<String, String> interfaces = new HashMap<String, String>();
	private Map<String, String> interface_aliases = new HashMap<String, String>();
//	private Map<String, AttributeVO> attributes = new HashMap<String, AttributeVO>();
//	private Map<String, PropertyVO> properties = new HashMap<String, PropertyVO>();	
//	private Map<String, Set<String>> siblings = new HashMap<String, Set<String>>();
	
	public JAVAWriter() {
		// unused
	}

	public JAVAWriter(String expressSchemaName, Map<String, EntityVO> entities, Map<String, String> interfaces, Map<String, TypeVO> types, Map<String, String> interface_aliases) {
		this.expressSchemaName = expressSchemaName;
		this.entities = entities;
		this.interfaces = interfaces;
		this.interface_aliases = interface_aliases;
		this.types = types;
	}
	
	public void outputJavaClasses() {
		outputJavaInterfaces();
		Iterator<Entry<String, EntityVO>> it = entities.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, EntityVO> pairs = it.next();
			EntityVO evo = pairs.getValue();
			try {
				BufferedWriter out = new BufferedWriter(new FileWriter(
						"src\\org\\buildingsmart\\"+expressSchemaName + "\\" + evo.getName() + ".java"));

				out.write("package org.buildingsmart."+expressSchemaName+";\n");
				out.write("import org.buildingsmart."+expressSchemaName+".interfaces.*;\n");
				out.write("import org.buildingsmart.*;\n");
				out.write("import java.util.*;\n");

				out.write("\n");
				out.write("/*\n");
				out.write(" * IFC Java class\n");
				out.write(getLicenseInformation());
				out.write("\n");

				out.write("public class ");
				if (evo.getSuperclass() != null)
					out.write(evo.getName() + " extends " + evo.getSuperclass()
							+ " ");
				else
					out.write(evo.getName() + " extends Thing ");

				if (evo.getInterfaces().size() > 0)
					out.write("implements");
				for (int n = 0; n < evo.getInterfaces().size(); n++) {
					if (n > 0)
						out.write(",");
					out.write(" " + evo.getInterfaces().get(n));
				}

				out.write("\n{\n");

				outputJavaAttributes(evo, out);
				outputJavaGetSetMethods2Attributes(evo, out);

				if (evo.getInverses().size() > 0)
					out.write(" // Getters and setters of inverse values\n\n");
				for (int n = 0; n < evo.getInverses().size(); n++) {
					out.write(" public InverseLinksList<"
							+ evo.getInverses().get(n).getIfc_class()
							+ "> get"
							+ formatGetterANDSetter(evo.getInverses().get(n)
									.getName()) + "() {\n");
					out.write("   return " + evo.getInverses().get(n).getName()
							+ ";\n");
					out.write("\n }\n");
					out.write(" public void set"
							+ formatGetterANDSetter(evo.getInverses().get(n)
									.getName()) + "("
							+ evo.getInverses().get(n).getIfc_class()
							+ " value){\n");
					out.write("   this." + evo.getInverses().get(n).getName()
							+ ".add(value);\n");
					out.write("\n }\n\n");
				}

				out.write("}\n");
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void outputJavaInterfaces() {
		Iterator<Entry<String, String>> it = interfaces.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, String> pairs = it.next();
			String name = pairs.getValue();
			outputJavaStringClass2Interface(name, expressSchemaName);
			try {
				BufferedWriter out = new BufferedWriter(new FileWriter(
						"src\\org\\buildingsmart\\"+expressSchemaName+"\\interfaces\\" + pairs.getValue() + ".java"));

				out.write("package org.buildingsmart."+expressSchemaName+".interfaces;\n");

				out.write("\n");
				out.write("/*\n");
				out.write(" * IFC type select 2 Java interface\n");
				out.write(getLicenseInformation());
				out.write("\n");

				out.write("public interface ");
				out.write(pairs.getValue() + " ");

				out.write("\n{\n");

				out.write("}\n");
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void outputJavaStringClass2Interface(String interface_name, String outputschema) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(
					"src\\org\\buildingsmart\\"+outputschema + "\\" + interface_name
							+ "_StringValue.java"));

			out.write("package org.buildingsmart."+expressSchemaName+";\n");
			out.write("import org.buildingsmart."+expressSchemaName+".interfaces.*;\n");

			out.write("\n");
			out.write("/*\n");
			out.write(" * IFC Java class for String valued unknown interface type\n");
			out.write(getLicenseInformation());
			out.write("\n");

			out.write("public class ");
			out.write(interface_name + "_StringValue implements "
					+ interface_name);

			out.write("\n{\n");

			out.write("String value;\n");
			out.write("public String geValue() {\n");
			out.write("return value;\n");
			out.write("}\n");
			out.write("public void setValue(String value){\n");
			out.write("this.value=value;\n");

			out.write("}\n");

			out.write("}\n");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void outputJavaAttributes(EntityVO evo, BufferedWriter out)
			throws IOException {
		if (evo.getAttributes().size() > 0)
			out.write(" // The property attributes\n");

		for (int n = 0; n < evo.getAttributes().size(); n++) {

			EntityVO entity = this.entities.get(ExpressReader.formatClassName(evo
					.getAttributes().get(n).getType().getName()));

			String primary_type = evo.getAttributes().get(n).getType()
					.getPrimarytype();
			String java_type = "String";
			if (primary_type.startsWith("IFC"))
				primary_type = types.get(primary_type).getPrimarytype();
			if ("REAL".equals(primary_type))
				java_type = "Double";
			if ("INTEGER".equals(primary_type))
				java_type = "Long";
			if (evo.getAttributes().get(n).getType().getName()
					.equalsIgnoreCase("IfcTimeStamp"))
				java_type = "Date";

			String listtype = "";
			if (evo.getAttributes().get(n).isList())
				listtype = "IfcList";
			else
				listtype = "IfcSet";

			if (entity == null) {
				String typekey = ExpressReader.formatClassName(evo.getAttributes().get(n)
						.getType().getName());
				String alias = interface_aliases.get(evo.getAttributes().get(n)
						.getType().getName());
				if (alias != null)
					typekey = ExpressReader.formatClassName(alias);
				String itype = this.interfaces.get(typekey);

				if (itype != null) {
					// INTERFACE
					if (evo.getAttributes().get(n).isSet())
						out.write(" List<" + itype + "> "
								+ evo.getAttributes().get(n).getName()
								+ " = new " + listtype + "<" + itype + ">();\n");
					else
						out.write(itype + " "
								+ evo.getAttributes().get(n).getName() + ";\n");
				} else {
					// BASIC ATTRIBUTE
					if (evo.getAttributes().get(n).isSet())
						out.write(" List<" + java_type + "> "
								+ evo.getAttributes().get(n).getName()
								+ " = new " + listtype + "<" + java_type
								+ ">();\n");
					else {
						out.write(" " + java_type + " "
								+ evo.getAttributes().get(n).getName() + ";\n");
					}

				}
			} else {
				// IFC ENTITY
				if (evo.getAttributes().get(n).isSet())
					out.write(" List<"
							+ evo.getAttributes().get(n).getType().getName()
							+ "> " + evo.getAttributes().get(n).getName()
							+ " = new " + listtype + "<"
							+ evo.getAttributes().get(n).getType().getName()
							+ ">();\n");
				else
					out.write(" "
							+ evo.getAttributes().get(n).getType().getName()
							+ "   " + evo.getAttributes().get(n).getName()
							+ ";\n");

			}
		}
		if (evo.getInverses().size() > 0)
			out.write(" // The inverse attributes\n\n");
		for (int n = 0; n < evo.getInverses().size(); n++) {
			out.write(" InverseLinksList<"
					+ evo.getInverses().get(n).getIfc_class() + "> "
					+ evo.getInverses().get(n).getName()
					+ "= new InverseLinksList<"
					+ evo.getInverses().get(n).getIfc_class() + ">();\n");

		}
		out.write("\n\n");
	}

	private void outputJavaGetSetMethods2Attributes(EntityVO evo,
			BufferedWriter out) throws IOException {
		// Getters & setters
		if (evo.getAttributes().size() > 0)
			out.write(" // Getters and setters of properties\n\n");
		for (int n = 0; n < evo.getAttributes().size(); n++) {

			EntityVO entity = this.entities.get(ExpressReader.formatClassName(evo
					.getAttributes().get(n).getType().getName()));

			String primary_type = evo.getAttributes().get(n).getType()
					.getPrimarytype();
			String java_type = "String";
			if (primary_type.startsWith("IFC"))
				primary_type = types.get(primary_type).getPrimarytype();
			if ("REAL".equals(primary_type))
				java_type = "Double";
			if ("INTEGER".equals(primary_type))
				java_type = "Long";
			if (evo.getAttributes().get(n).getType().getName()
					.equalsIgnoreCase("IfcTimeStamp"))
				java_type = "Date";

			if (entity == null) {
				String typekey = ExpressReader.formatClassName(evo.getAttributes().get(n)
						.getType().getName());
				String alias = interface_aliases.get(evo.getAttributes().get(n)
						.getType().getName());
				if (alias != null)
					typekey = ExpressReader.formatClassName(alias);
				String itype = this.interfaces.get(typekey);

				if (itype != null) {
					// ITYPE: Interface type
					// GET
					if (evo.getAttributes().get(n).isSet()) {
						out.write(" public List<"
								+ evo.getAttributes().get(n).getType()
										.getName()
								+ "> get"
								+ formatGetterANDSetter(evo.getAttributes()
										.get(n).getName()) + "() {\n");
						out.write("   return "
								+ evo.getAttributes().get(n).getName() + ";");
						out.write("\n }\n");
					} else {
						out.write(" public "
								+ itype
								+ " get"
								+ formatGetterANDSetter(evo.getAttributes()
										.get(n).getName()) + "() {\n");
						out.write("   return "
								+ evo.getAttributes().get(n).getName() + ";");
						out.write("\n }\n");

					}
					// SET

					if (evo.getAttributes().get(n).isSet()) {
						out.write(" public void set"
								+ formatGetterANDSetter(evo.getAttributes()
										.get(n).getName()) + "(" + itype
								+ " value){\n");
						out.write("   this."
								+ evo.getAttributes().get(n).getName()
								+ ".add(value);\n");
						out.write("\n }\n\n");
					} else {
						out.write(" public void set"
								+ formatGetterANDSetter(evo.getAttributes()
										.get(n).getName()) + "(" + itype
								+ " value){\n");
						out.write("   this."
								+ evo.getAttributes().get(n).getName()
								+ "=value;\n");
						out.write("\n }\n\n");
					}
				} else {
					// BASIC TYPES
					// GET
					if (evo.getAttributes().get(n).isSet()) {
						out.write(" public List<"
								+ java_type
								+ "> get"
								+ formatGetterANDSetter(evo.getAttributes()
										.get(n).getName()) + "() {\n");
						out.write("   return "
								+ evo.getAttributes().get(n).getName() + ";");
						out.write("\n }\n");
					} else {
						out.write(" public "
								+ java_type
								+ " get"
								+ formatGetterANDSetter(evo.getAttributes()
										.get(n).getName()) + "() {\n");
						out.write("   return "
								+ evo.getAttributes().get(n).getName() + ";");
						out.write("\n }\n");

					}
					// SET
					if (evo.getAttributes().get(n).isSet()) {

						if ("REAL".equals(primary_type)) {
							out.write(" public void set"
									+ formatGetterANDSetter(evo.getAttributes()
											.get(n).getName())
									+ "(String txt){\n");
							out.write("   List<Double> value = i.toDoubleList(txt);\n");
							out.write("   this."
									+ evo.getAttributes().get(n).getName()
									+ "=value;\n");
							out.write("\n }\n\n");
						}

						else if (evo.getAttributes().get(n).getType().getName()
								.equalsIgnoreCase("IfcTimeStamp")) {
							out.write(" public void set"
									+ formatGetterANDSetter(evo.getAttributes()
											.get(n).getName())
									+ "(String txt){\n");
							out.write("   Date value = new Date(1000l * i.toLong(txt) );\n");
							out.write("   this."
									+ evo.getAttributes().get(n).getName()
									+ ".add(value);\n");
							out.write("\n }\n\n");
						}

						else if ("INTEGER".equals(primary_type)) {
							out.write(" public void set"
									+ formatGetterANDSetter(evo.getAttributes()
											.get(n).getName())
									+ "(String txt){\n");
							out.write("   List<Long> value = i.toLongList(txt);\n");
							out.write("   this."
									+ evo.getAttributes().get(n).getName()
									+ "=value;\n");
							out.write("\n }\n\n");

						} else {
							out.write(" public void set"
									+ formatGetterANDSetter(evo.getAttributes()
											.get(n).getName()) + "("
									+ java_type + " value){\n");
							out.write("   this."
									+ evo.getAttributes().get(n).getName()
									+ ".add(value);\n");
							out.write("\n }\n\n");
						}

					} else {
						if ("REAL".equals(primary_type)) {
							out.write(" public void set"
									+ formatGetterANDSetter(evo.getAttributes()
											.get(n).getName())
									+ "(String txt){\n");
							out.write("   Double value = i.toDouble(txt);\n");
							out.write("   this."
									+ evo.getAttributes().get(n).getName()
									+ "=value;\n");
							out.write("\n }\n\n");
						} else if (evo.getAttributes().get(n).getType()
								.getName().equalsIgnoreCase("IfcTimeStamp")) {
							out.write(" public void set"
									+ formatGetterANDSetter(evo.getAttributes()
											.get(n).getName())
									+ "(String txt){\n");
							out.write("   Date value = new Date(1000l * i.toLong(txt) );\n");
							out.write("   this."
									+ evo.getAttributes().get(n).getName()
									+ "=value;\n");
							out.write("\n }\n\n");
						} else if ("INTEGER".equals(primary_type)) {
							out.write(" public void set"
									+ formatGetterANDSetter(evo.getAttributes()
											.get(n).getName())
									+ "(String txt){\n");
							out.write("   Long value = i.toLong(txt);\n");
							out.write("   this."
									+ evo.getAttributes().get(n).getName()
									+ "=value;\n");
							out.write("\n }\n\n");
						} else {
							out.write(" public void set"
									+ formatGetterANDSetter(evo.getAttributes()
											.get(n).getName()) + "("
									+ java_type + " value){\n");
							out.write("   this."
									+ evo.getAttributes().get(n).getName()
									+ "=value;\n");
							out.write("\n }\n\n");

						}

					}
				}

			} else {
				// IFC ENTIY
				// -------------------------
				// GET
				if (evo.getAttributes().get(n).isSet()) {
					out.write(" public List<"
							+ evo.getAttributes().get(n).getType().getName()
							+ "> get"
							+ formatGetterANDSetter(evo.getAttributes().get(n)
									.getName()) + "() {\n");
					out.write("   return "
							+ evo.getAttributes().get(n).getName() + ";\n");
					out.write("\n }\n");
				} else {
					out.write(" public "
							+ evo.getAttributes().get(n).getType().getName()
							+ " get"
							+ formatGetterANDSetter(evo.getAttributes().get(n)
									.getName()) + "() {\n");
					out.write("   return "
							+ evo.getAttributes().get(n).getName() + ";\n");
					out.write("\n }\n");
				}
				// SET
				if (evo.getAttributes().get(n).isSet()) {
					out.write(" public void set"
							+ formatGetterANDSetter(evo.getAttributes().get(n)
									.getName()) + "("
							+ evo.getAttributes().get(n).getType().getName()
							+ " value){\n");
					out.write("   this." + evo.getAttributes().get(n).getName()
							+ ".add(value);\n");
					out.write("\n }\n\n");
				} else {
					out.write(" public void set"
							+ formatGetterANDSetter(evo.getAttributes().get(n)
									.getName()) + "("
							+ evo.getAttributes().get(n).getType().getName()
							+ " value){\n");
					out.write("   this." + evo.getAttributes().get(n).getName()
							+ "=value;\n");
					out.write("\n }\n\n");
				}

			}

		}
	}

	//HELPER METHODS
	static private String formatGetterANDSetter(String s) {
		if (s == null)
			return null;
		StringBuffer sb = new StringBuffer();
		sb.append(Character.toUpperCase(s.charAt(0)));
		sb.append(s.substring(1));
		return sb.toString();
	}
	
	static private String getLicenseInformation(){
		String s = "";
		s+= "The MIT License (MIT)\n";
		s+= "\n";
		s+=" * @author Jyrki Oraskari\n";
		s+="Permission is hereby granted, free of charge, to any person obtaining a copy\n";
		s+="of this software and associated documentation files (the \"Software\"), to deal\n";
		s+="in the Software without restriction, including without limitation the rights\n";
		s+="to use, copy, modify, merge, publish, distribute, sublicense, and/or sell\n";
		s+="copies of the Software, and to permit persons to whom the Software is\n";
		s+="furnished to do so, subject to the following conditions:\n";
		s+="\n";
		s+="The above copyright notice and this permission notice shall be included in all\n";
		s+="copies or substantial portions of the Software.\n";
		s+="\n";
		s+="THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n";
		s+="IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n";
		s+="FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n";
		s+="AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n";
		s+="LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\n";
	    s+="OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE\n";
	    s+="SOFTWARE.\n";
	    s+=" */\n";

	    return s;	
	}
	
}
