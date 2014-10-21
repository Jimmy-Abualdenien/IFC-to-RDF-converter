package org.buildingsmart;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.buildingsmart.vo.AttributeVO;
import org.buildingsmart.vo.EntityVO;
import org.buildingsmart.vo.PrimaryTypeVO;
import org.buildingsmart.vo.TypeVO;

/*
 * JAVAWriter writes JAVA class files from the in-memory EXPRESS model that is parsed by the ExpressReader class.
 * 
 * The usage:
 * JAVAWriter jw = new JAVAWriter(expressSchemaName, entities, interfaces, types, interface_aliases);
 * 
 *  - outputJavaClasses() - writes EXPRESS entities into java classes in appropriate 'schema' package
 *  - outputJavaTypes() - writes EXPRESS types into java classes in appropriate 'schema' package
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

public class JAVAWriter {

	private String expressSchemaName;
	
	private Map<String, EntityVO> entities = new HashMap<String, EntityVO>();
	private Map<String, TypeVO> types = new HashMap<String, TypeVO>();	
	private Map<String, String> selectinterfaces = new HashMap<String, String>();
	private Map<TypeVO, TypeVO> selectTypesToExpand = new HashMap<TypeVO,TypeVO>();
	
	public JAVAWriter() {
		// unused
	}

	public JAVAWriter(String expressSchemaName, Map<String, EntityVO> entities, Map<String, TypeVO> types, Map<TypeVO, TypeVO> selectTypesToExpand) {
		this.expressSchemaName = expressSchemaName;
		this.entities = entities;
		this.types = types;
		this.selectTypesToExpand = selectTypesToExpand;
	}
	
	public void outputJavaClasses() {
		selectInterfaces();
		outputJavaTypes();
		Iterator<Entry<String, EntityVO>> it = entities.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, EntityVO> pairs = it.next();
			EntityVO evo = pairs.getValue();
			try {
				BufferedWriter out = new BufferedWriter(new FileWriter(
						"src\\org\\buildingsmart\\"+expressSchemaName + "\\" + evo.getName() + ".java"));

				out.write("package org.buildingsmart."+expressSchemaName+";\r\n");
				out.write("import org.buildingsmart.*;\r\n");
				out.write("import java.util.*;\r\n");

				out.write("\r\n");
				out.write("/*\r\n");
				out.write(" * IFC Java class\r\n");
				out.write(getLicenseInformation());
				out.write("\r\n");

				out.write("public class ");
				if (evo.getSuperclass() != null)
					out.write(evo.getName() + " extends " + evo.getSuperclass()
							+ " ");
				else
					out.write(evo.getName() + " extends Thing ");				

				if(selectinterfaces.containsKey(evo.getName()))
					out.write("implements " + selectinterfaces.get(evo.getName()));

				out.write("\r\n{\r\n");

				outputJavaAttributes(evo, out);
				outputJavaGetSetMethods2Attributes(evo, out);

				out.write("}\r\n");
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void selectInterfaces(){
		Iterator<Entry<String, TypeVO>> it = types.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, TypeVO> pairs = it.next();
			TypeVO type = pairs.getValue();
			if (type.getPrimarytype().equalsIgnoreCase("SELECT")) {
				for (int i = 0; i < type.getSelect_entities().size(); i++) {
					if(selectinterfaces.containsKey(type.getSelect_entities().get(i))){
						String val = selectinterfaces.get(type.getSelect_entities().get(i));
						val += ", " + type.getName();
						selectinterfaces.remove(type.getSelect_entities().get(i));
						selectinterfaces.put(type.getSelect_entities().get(i), val);						
					}
					else
						selectinterfaces.put(type.getSelect_entities().get(i), type.getName());
				}
			}
		}
	}
	
	private void outputJavaTypes(){
		Iterator<Entry<String, TypeVO>> it = types.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, TypeVO> pairs = it.next();
			TypeVO type = pairs.getValue();
			try {
				BufferedWriter out = new BufferedWriter(new FileWriter(
						"src\\org\\buildingsmart\\"+expressSchemaName + "\\" + type.getName() + ".java"));
				out.write("package org.buildingsmart."+expressSchemaName+";\r\n");
				out.write("import org.buildingsmart.*;\r\n");
				out.write("import java.util.*;\r\n");

				out.write("\r\n");
				out.write("/*\r\n");
				out.write(" * IFC Java class\r\n");
				out.write(getLicenseInformation());
				out.write("\r\n");

				PrimaryTypeVO ptype = PrimaryTypeVO.getPrimaryTypeVO(type.getPrimarytype());				
				if(ptype != null) {					
					out.write("public class ");
					out.write(type.getName());
					out.write(" extends Thing");
					if(selectinterfaces.containsKey(type.getName()))
						out.write(" implements " + selectinterfaces.get(type.getName()));
					
					out.write("\r\n{\r\n");	
					String xsdt = ptype.getXSDType();
					String javat = ptype.getJAVAType();					
					//field
					out.write("\tprivate " + javat + " " + xsdt + "_value;\r\n\r\n");
					
					//getter and setter
					out.write("\tpublic " + javat + " get"	+ formatGetterANDSetter(xsdt) + "() {"+"\r\n");
					out.write("\t\treturn " + xsdt + "_value;"+"\r\n");
					out.write("\t}"+"\r\n\r\n");

					out.write("\tpublic void set" + formatGetterANDSetter(xsdt) + "(" + javat + " value){"+"\r\n");
					out.write("\t\tthis." + xsdt + "_value=value;"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
					
					//close all
					out.write("}\r\n");
				}
				else if (type.getPrimarytype().equalsIgnoreCase("SELECT")) {
					out.write("public interface ");
					out.write(type.getName());
					if(selectTypesToExpand.containsKey(type))
						out.write(" extends " + ((TypeVO)selectTypesToExpand.get(type)).getName());
					out.write("\r\n{\r\n");
					out.write("\t//interface for" + "\r\n");
					for (int i = 0; i < type.getSelect_entities().size(); i++) {
						if (i != type.getSelect_entities().size() - 1)
							out.write("\t//" + type.getSelect_entities().get(i) + "\r\n");
						else
							out.write("\t//" + type.getSelect_entities().get(i));
					}
					out.write("\r\n");
					out.write("};\r\n");					
				}
				else{
					out.write("public class ");
					out.write(type.getName());
					
					if (type.getPrimarytype().equalsIgnoreCase("ENUMERATION")) {

						out.write(" extends Thing");
						if(selectinterfaces.containsKey(type.getName()))
							out.write(" implements " + selectinterfaces.get(type.getName()));
						out.write("\r\n{\r\n");

//						private enum enumvalue{one, two};
//						private enumvalue t = enumvalue.one;						
								
						out.write("\tpublic enum " + type.getName() + "_value{");
						for (int i = 0; i < type.getEnum_entities().size(); i++) {
							if (i != type.getEnum_entities().size() - 1)
								out.write(type.getEnum_entities().get(i) + ", ");
							else
								out.write(type.getEnum_entities().get(i));
						}
						out.write("};\r\n");
						out.write("\tprivate " + type.getName() + "_value value;\r\n\r\n");
						
						//getter and setter
						out.write("\tpublic " + type.getName() + "_value" + " get"	+ formatGetterANDSetter(type.getName()) + "() {"+"\r\n");
						out.write("\t\treturn value;"+"\r\n");
						out.write("\t}"+"\r\n\r\n");

						out.write("\tpublic void set" + formatGetterANDSetter(type.getName()) + "(" + type.getName() + "_value" + " value){"+"\r\n");
						out.write("\t\tthis.value=value;"+"\r\n");
						out.write("\t}"+"\r\n\r\n");

						//close all
						out.write("}\r\n");
					}
					else if(type.getPrimarytype().startsWith("ARRAY") || type.getPrimarytype().startsWith("SET") || type.getPrimarytype().startsWith("LIST")){
						out.write(" extends Thing");
						//sometimes this is LIST [3:3] OF IfcPositiveInteger
						if(selectinterfaces.containsKey(type.getName()))
							out.write(" implements " + selectinterfaces.get(type.getName()));
						out.write("\r\n{\r\n");
						String t= type.getPrimarytype();						
						String[] cList = t.split(" ");
						String content = cList[cList.length - 1];
						if (content.endsWith(";"))
							content = content.substring(0, content.length() - 1);
						content = catchPrimaryTypes(content);	
						
						out.write("\tprivate List<" + content + "> " + content + "_List = new ArrayList<" + content + ">();\r\n\r\n");
						
						//getter and setter
						out.write("\tpublic " + "List<" + content + "> " + " get"	+ formatGetterANDSetter(content + "_List") + "() {"+"\r\n");
						out.write("\t\treturn " + content + "_List;"+"\r\n");
						out.write("\t}"+"\r\n\r\n");

						out.write("\tpublic void set" + formatGetterANDSetter(content + "_List") + "(List<" + content + ">" + " value){"+"\r\n");
						out.write("\t\tthis." + content + "_List=value;"+"\r\n");
						out.write("\t}"+"\r\n\r\n");

						//close all
						out.write("}\r\n");
					}
					else	
					{
						out.write(" extends " + type.getPrimarytype() + " ");
						if(selectinterfaces.containsKey(type.getName()))
							out.write("implements " + selectinterfaces.get(type.getName()));
						out.write("\r\n{\r\n");
						out.write("}\r\n");
					}
				}
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void outputJavaAttributes(EntityVO evo, BufferedWriter out)
			throws IOException {
		if (evo.getAttributes().size() > 0)
			out.write("\t// The property attributes\r\n");

		for (int n = 0; n < evo.getAttributes().size(); n++) {
			AttributeVO attr = evo.getAttributes().get(n);
			String type_primaryType = attr.getType().getPrimarytype();
			String type_name = attr.getType().getName();
			type_name = catchPrimaryTypes(type_name);
						
			if(type_primaryType.equalsIgnoreCase("enumeration") || type_primaryType.equalsIgnoreCase("class")) {
				//reference is made to an object of the associate enumeration. The enum field value of this enumeration class can be set to indicate the content of this enumeration instance. 
				if(attr.isListOfList())
					out.write("\tprivate List<List<" + type_name + ">> " + attr.getName()  + " = new ArrayList<List<" + type_name + ">>();\r\n");
				else if(attr.isList() || attr.isSet())
					out.write("\tprivate List<" + type_name + "> " + attr.getName()  + " = new ArrayList<" + type_name + ">();\r\n");
				else
					out.write("\tprivate " + type_name + " " + attr.getName()  + ";\r\n");				
			}
			else if (type_primaryType.equalsIgnoreCase("select")){
				//the Select entity is set. From there, there is no real means to store the actual instance content if an IFC file is parsed. Perhaps add a pointer to that content somewhere in that select class.
				if(attr.isListOfList())
					out.write("\tprivate List<List<" + type_name + ">> " + attr.getName()  + " = new ArrayList<new ArrayList<" + type_name + ">()>();\r\n");
				else if(attr.isList() || attr.isSet())
					out.write("\tprivate List<" + type_name + "> " + attr.getName()  + " = new ArrayList<" + type_name + ">();\r\n");
				else out.write("\tprivate " + type_name + " " + attr.getName()  + ";\r\n");				
			}
			else if(PrimaryTypeVO.getPrimaryTypeVO(type_primaryType) != null) {
				
				if(attr.isListOfList())
					out.write("\tprivate List<List<" + type_name + ">> " + attr.getName()  + " = new ArrayList<List<" + type_name + ">>();\r\n");
				else if(attr.isList() || attr.isSet())
					out.write("\tprivate List<" + type_name + "> " + attr.getName()  + " = new ArrayList<" + type_name + ">();\r\n");
				else out.write("\tprivate " + type_name + " " + attr.getName()  + ";\r\n");
			}
			else if(type_primaryType.startsWith("Ifc")){
				//ifclengthmeasure type etc.
				if(attr.isListOfList())
					out.write("\tprivate List<List<" + type_name + ">> " + attr.getName()  + " = new ArrayList<List<" + type_name + ">>();\r\n");
				else if(attr.isList() || attr.isSet())
					out.write("\tprivate List<" + type_name + "> " + attr.getName()  + " = new ArrayList<" + type_name + ">();\r\n");
				else out.write("\tprivate " + type_name + " " + attr.getName()  + ";\r\n");
			}
			else if(type_primaryType.startsWith("LIST")){
				//ifclengthmeasure type etc.
				if(attr.isListOfList())
					out.write("\tprivate List<List<" + type_name + ">> " + attr.getName()  + " = new ArrayList<List<" + type_name + ">>();\r\n");
				else if(attr.isList() || attr.isSet())
					out.write("\tprivate List<" + type_name + "> " + attr.getName()  + " = new ArrayList<" + type_name + ">();\r\n");
				else out.write("\tprivate " + type_name + " " + attr.getName()  + ";\r\n");
			}
			else{
				//type_primarytype = LIST [3:4] OF INTEGER
				System.out.println("\tFound an alternative range type : "+ type_primaryType + " - " + attr.getName() + ";\r\n");
			}						
		}		
		
		if (evo.getInverses().size() > 0)
			out.write(" // The inverse attributes\n\n");
		for (int n = 0; n < evo.getInverses().size(); n++) {
			out.write("\tprivate List<"
					+ evo.getInverses().get(n).getClassRange() + "> "
					+ evo.getInverses().get(n).getName()
					+ "= new ArrayList<"
					+ evo.getInverses().get(n).getClassRange() + ">();\n");
		}
		out.write("\n\n");
	}

	private void outputJavaGetSetMethods2Attributes(EntityVO evo,
			BufferedWriter out) throws IOException {
		// Getters & setters of Direct Attributes (not inverse)
		if (evo.getAttributes().size() > 0)
			out.write("\t// Getters and setters of properties\r\n");
		for (int n = 0; n < evo.getAttributes().size(); n++) {
			AttributeVO attr = evo.getAttributes().get(n);
			String type_primaryType = attr.getType().getPrimarytype();
			String type_name = attr.getType().getName();
			type_name = catchPrimaryTypes(type_name);			
			
			if(type_primaryType.equalsIgnoreCase("enumeration") || type_primaryType.equalsIgnoreCase("class")) {
				// GETTER
				if(attr.isListOfList()){
					//LISTOFLIST
					out.write("\tpublic List<List<" + type_name + ">>  get"	+ formatGetterANDSetter(attr.getName()) + "() {"+"\r\n");
					out.write("\t\treturn " + attr.getName() + ";"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
				else if (attr.isList() || attr.isSet()) {
					out.write("\tpublic List<" + type_name + "> get"	+ formatGetterANDSetter(attr.getName()) + "() {"+"\r\n");
					out.write("\t\treturn " + attr.getName() + ";"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				} else {
					out.write("\tpublic " + type_name + " get" + formatGetterANDSetter(attr.getName()) + "() {"+"\r\n");
					out.write("\t\treturn " + attr.getName() + ";"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
				
				// SETTER
				if(attr.isListOfList()){
					//LISTOFLIST
					out.write("\tpublic void set" + formatGetterANDSetter(attr.getName()) + "(List<" + type_name + "> value){"+"\r\n");
					out.write("\t\tthis." + attr.getName() + ".add(value);"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
				else if (attr.isList() || attr.isSet()) {
					out.write("\tpublic void set" + formatGetterANDSetter(attr.getName()) + "(" + type_name + " value){"+"\r\n");
					out.write("\t\tthis." + attr.getName() + ".add(value);"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				} else {
					out.write("\tpublic void set" + formatGetterANDSetter(attr.getName()) + "(" + type_name + " value){"+"\r\n");
					out.write("\t\tthis." + attr.getName() + "=value;"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
			}
			else if (type_primaryType.equalsIgnoreCase("select")){
				//GETTER
				if(attr.isListOfList()){
					out.write("\tpublic List<List<" + type_name + ">> get" + formatGetterANDSetter(attr.getName()) + "() {"+"\r\n");
					out.write("\t\treturn "	+ attr.getName() + ";"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
				else if (attr.isList() || attr.isSet()) {
					out.write("\tpublic List<" + type_name + "> get" + formatGetterANDSetter(attr.getName()) + "() {"+"\r\n");
					out.write("\t\treturn "	+ attr.getName() + ";"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				} 
				else {
					out.write("\tpublic " + type_name + " get" + formatGetterANDSetter(attr.getName()) + "() {"+"\r\n");
					out.write("\t\treturn "	+ attr.getName() + ";"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
				// SETTER
				if(attr.isListOfList()){
					out.write("\tpublic void set" + formatGetterANDSetter(attr.getName()) + "(List<" + type_name + "> value){"+"\r\n");
					out.write("\t\tthis." + attr.getName() + ".add(value);"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
				else if (attr.isList() || attr.isSet()) {
					out.write("\tpublic void set" + formatGetterANDSetter(attr.getName()) + "(" + type_name + " value){"+"\r\n");
					out.write("\t\tthis." + attr.getName() + ".add(value);"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}  
				else {
					out.write("\tpublic void set" + formatGetterANDSetter(attr.getName()) + "(" + type_name + " value){"+"\r\n");
					out.write("\t\tthis." + attr.getName() + "=value;"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
			}
			else if(PrimaryTypeVO.getPrimaryTypeVO(type_primaryType) != null) {				
				// GETTER
				if(attr.isListOfList()){
					out.write("\tpublic List<List<" + type_name + ">> get"	+ formatGetterANDSetter(attr.getName()) + "() {"+"\r\n");
					out.write("\t\treturn " + attr.getName() + ";"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
				else if (attr.isList() || attr.isSet()) {
					out.write("\tpublic List<" + type_name + "> get"	+ formatGetterANDSetter(attr.getName()) + "() {"+"\r\n");
					out.write("\t\treturn " + attr.getName() + ";"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				} else {
					out.write("\tpublic " + type_name + " get" + formatGetterANDSetter(attr.getName()) + "() {"+"\r\n");
					out.write("\t\treturn " + attr.getName() + ";"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
				
				// SETTER
				if(attr.isListOfList()){
					out.write("\tpublic void set" + formatGetterANDSetter(attr.getName()) + "(List<" + type_name + "> value){"+"\r\n");
					out.write("\t\tthis." + attr.getName() + ".add(value);"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
				else if (attr.isList() || attr.isSet()) {
					out.write("\tpublic void set" + formatGetterANDSetter(attr.getName()) + "(" + type_name + " value){"+"\r\n");
					out.write("\t\tthis." + attr.getName() + ".add(value);"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				} else {
					out.write("\tpublic void set" + formatGetterANDSetter(attr.getName()) + "(" + type_name + " value){"+"\r\n");
					out.write("\t\tthis." + attr.getName() + "=value;"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
			}
			else if(type_primaryType.startsWith("Ifc")){
				//ifclengthmeasure type etc.				
				// GETTER
				if(attr.isListOfList()){
					out.write("\tpublic List<List<" + type_name + ">> get"	+ formatGetterANDSetter(attr.getName()) + "() {"+"\r\n");
					out.write("\t\treturn " + attr.getName() + ";"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
				else if (attr.isList() || attr.isSet()) {
					out.write("\tpublic List<" + type_name + "> get"	+ formatGetterANDSetter(attr.getName()) + "() {"+"\r\n");
					out.write("\t\treturn " + attr.getName() + ";"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				} else {
					out.write("\tpublic " + type_name + " get" + formatGetterANDSetter(attr.getName()) + "() {"+"\r\n");
					out.write("\t\treturn " + attr.getName() + ";"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
				
				// SETTER
				if(attr.isListOfList()){
					out.write("\tpublic void set" + formatGetterANDSetter(attr.getName()) + "(List<" + type_name + "> value){"+"\r\n");
					out.write("\t\tthis." + attr.getName() + ".add(value);"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
				else if (attr.isList() || attr.isSet()) {
					out.write("\tpublic void set" + formatGetterANDSetter(attr.getName()) + "(" + type_name + " value){"+"\r\n");
					out.write("\t\tthis." + attr.getName() + ".add(value);"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				} else {
					out.write("\tpublic void set" + formatGetterANDSetter(attr.getName()) + "(" + type_name + " value){"+"\r\n");
					out.write("\t\tthis." + attr.getName() + "=value;"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
			}
			else if(type_primaryType.startsWith("LIST")){
				//ifclengthmeasure type etc.				
				// GETTER
				if(attr.isListOfList()){
					out.write("\tpublic List<List<" + type_name + ">> get"	+ formatGetterANDSetter(attr.getName()) + "() {"+"\r\n");
					out.write("\t\treturn " + attr.getName() + ";"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
				else if (attr.isList() || attr.isSet()) {
					out.write("\tpublic List<" + type_name + "> get"	+ formatGetterANDSetter(attr.getName()) + "() {"+"\r\n");
					out.write("\t\treturn " + attr.getName() + ";"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				} else {
					out.write("\tpublic " + type_name + " get" + formatGetterANDSetter(attr.getName()) + "() {"+"\r\n");
					out.write("\t\treturn " + attr.getName() + ";"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
				
				// SETTER
				if(attr.isListOfList()){
					out.write("\tpublic void set" + formatGetterANDSetter(attr.getName()) + "(List<" + type_name + "> value){"+"\r\n");
					out.write("\t\tthis." + attr.getName() + ".add(value);"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
				else if (attr.isList() || attr.isSet()) {
					out.write("\tpublic void set" + formatGetterANDSetter(attr.getName()) + "(" + type_name + " value){"+"\r\n");
					out.write("\t\tthis." + attr.getName() + ".add(value);"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				} else {
					out.write("\tpublic void set" + formatGetterANDSetter(attr.getName()) + "(" + type_name + " value){"+"\r\n");
					out.write("\t\tthis." + attr.getName() + "=value;"+"\r\n");
					out.write("\t}"+"\r\n\r\n");
				}
			}
			else {
				//type_primarytype = LIST [3:4] OF INTEGER
				System.out.println("\tFound an alternative range type : "+ type_primaryType + " - " + attr.getName() + ";\r\n");
			}
		}
		
		//Get and Set methods for inverse attributes		
		if (evo.getInverses().size() > 0)
			out.write("\t// Getters and setters of inverse values\r\n\r\n");
		for (int n = 0; n < evo.getInverses().size(); n++) {
			org.buildingsmart.vo.InverseVO inv = evo.getInverses().get(n);
			out.write("\tpublic List<" + inv.getClassRange() + "> get" + formatGetterANDSetter(inv.getName()) + "() {"+"\r\n");
			out.write("\t\treturn " + inv.getName() + ";"+"\r\n");
			out.write("\t}"+"\r\n\r\n");
			out.write("\tpublic void set" + formatGetterANDSetter(inv.getName()) + "(" + inv.getClassRange() + " value){"+"\r\n");
			out.write("\t\tthis." + inv.getName() + ".add(value);"+"\r\n");
			out.write("\t}"+"\r\n\r\n");
		}
	}

	//HELPER METHODS
	static private String catchPrimaryTypes(String type_name){
		if(type_name.equalsIgnoreCase("INTEGER"))
			return "Integer";							
		if(type_name.equalsIgnoreCase("REAL"))
			return "Double";							
		if(type_name.equalsIgnoreCase("STRING"))
			return "String";								
		if(type_name.equalsIgnoreCase("LOGICAL") || type_name.equalsIgnoreCase("BOOLEAN"))
			return "Boolean";							
		if(type_name.equalsIgnoreCase("BINARY(32)"))
			return "org.apache.axis2.databinding.types.xsd.HexBinary";
		return type_name;
	}

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
		
		s+= "/ *\r\n";
		s+= " * The GNU Affero General Public License\r\n";
		s+= " * \r\n";
		s+= " * Copyright (c) 2014 Jyrki Oraskari (original)\r\n";
		s+= " * Copyright (c) 2014 Pieter Pauwels (modifications - pipauwel.pauwels@ugent.be / pipauwel@gmail.com)\r\n";
		s+= " * \r\n";
		s+= " * This program is free software: you can redistribute it and/or modify\r\n";
		s+= " * it under the terms of the GNU Affero General Public License as\r\n";
		s+= " * published by the Free Software Foundation, either version 3 of the\r\n";
		s+= " * License, or (at your option) any later version.\r\n";
		s+= " * \r\n";
		s+= " * This program is distributed in the hope that it will be useful,\r\n";
		s+= " * but WITHOUT ANY WARRANTY; without even the implied warranty of\r\n";
		s+= " * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the\r\n";
		s+= " * GNU Affero General Public License for more details.\r\n";
		s+= " * \r\n";
		s+= " * You should have received a copy of the GNU Affero General Public License\r\n";
		s+= " * along with this program. If not, see <http://www.gnu.org/licenses/>.\r\n";
		s+= " */\r\n";

	    return s;	
	}
}
