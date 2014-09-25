package org.buildingsmart;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.buildingsmart.vo.EntityVO;
import org.buildingsmart.vo.NamedIndividualVO;
import org.buildingsmart.vo.PrimaryTypeVO;
import org.buildingsmart.vo.PropertyVO;
import org.buildingsmart.vo.TypeVO;

import softhema.system.toolkits.ToolkitString;
import fi.ni.rdf.Namespace;

/*
 * OWLWriter writes .n3 files representing OWL ontologies, thereby relying on the in-memory EXPRESS model that is parsed by the ExpressReader class.
 * 
 * The usage:
 * OWLWriter ow = new OWLWriter(expressSchemaName, entities, types, siblings);
 * 
 *  - outputOWL() - writes the OWL ontology in N3 files in appropriate 'schema' package
 *  - outputRDFS() - writes the RDFS ontology in N3 files
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
 */

public class OWLWriter {

	private String expressSchemaName;
	
	private Map<String, EntityVO> entities = new HashMap<String, EntityVO>();
	private Map<String, PropertyVO> properties = new HashMap<String, PropertyVO>();	
	private Map<String, TypeVO> types = new HashMap<String, TypeVO>();
	private Map<String, Set<String>> siblings = new HashMap<String, Set<String>>();
	private List<NamedIndividualVO> enumIndividuals= new ArrayList<NamedIndividualVO>();
//	private Map<String, TypeVO> types = new HashMap<String, TypeVO>();
//	private Map<String, String> interfaces = new HashMap<String, String>();
//	private Map<String, String> interface_aliases = new HashMap<String, String>();
	
	// @formatter:off
	static final String type_datatype_list = "ifc:<_NAME_>\r\n"
				+ "	rdfs:subClassOf [\r\n" + "		a owl:Restriction;\r\n"
				+ "		owl:allValuesFrom [\r\n" + "			a rdfs:Datatype;\r\n"
				+ "			owl:oneOf ( <_DATATYPE_> )\r\n" + "		]\r\n" + "	];\r\n"
				+ "	rdfs:subClassOf rdf:List;\r\n" + "	a owl:Class.\r\n";

	static final String type_entity_list = "ifc:<_NAME_>\r\n"
				+ "	rdfs:subClassOf [\r\n" + "		a owl:Restriction;\r\n"
				+ "		owl:allValuesFrom [\r\n" + "			a owl:Class;\r\n"
				+ "			owl:unionOf ( <_RANGE_> )\r\n" + "		]\r\n" + "	];\r\n"
				+ "	rdfs:subClassOf rdf:List;\r\n" + "	a owl:Class.\r\n";

	static final String type_object_property0 = "ifc:<_NAME_>\r\n"
				+ "	rdfs:domain ifc:<_DOMAIN_>;\r\n" + "	rdfs:range [\r\n"
				+ "		a owl:Class;\r\n" + "		owl:unionOf ( <_RANGE_> )\r\n"
				+ "	];\r\n" + "	a owl:ObjectProperty.\r\n";

	static final String type_object_property1 = "ifc:<_NAME_>\r\n"
				+ "	rdfs:domain [\r\n" + "		a owl:Class;\r\n"
				+ "		owl:unionOf ( <_DOMAIN_> )\r\n" + "	];\r\n"
				+ "	rdfs:range [\r\n" + "		a owl:Class;\r\n"
				+ "		owl:unionOf ( <_RANGE_> )\r\n" + "	];\r\n"
				+ "	a owl:ObjectProperty.\r\n";

	static final String type_type_datatype_property = "ifc:<_NAME_>\r\n"
				+ "	rdfs:domain [\r\n" + "		a owl:Class;\r\n"
				+ "		owl:unionOf ( <_DOMAIN_> )\r\n" + "	];\r\n"
				+ "	rdfs:range <_DATATYPE_>;\r\n" + "	a owl:DatatypeProperty.\r\n";

	static final String type_enum_property = "ifc:<_NAME_>\r\n"
				+ "	owl:oneOf ( <_ENUM_LIST_>);\r\n" + "	a owl:Class.\r\n";

	private String getOwl_header(){
		String s = "";
		s += "@prefix xsd: <" + Namespace.XSD + ">.\n"
				+ "@prefix owl: <" + Namespace.OWL + ">.\n"
				+ "@prefix rdfs: <" + Namespace.RDFS + ">.\n"
				+ "@prefix list: <" + Namespace.LIST + ">.\n"
				+ "@prefix dce: <" + Namespace.DCE + ">.\n"
				+ "@prefix dct: <" + Namespace.DCT + ">.\n"
				+ "@prefix rdf: <" + Namespace.RDF + ">.\n"
				+ "\n" + "ifc:\n" + "	a owl:Thing;\n"
				+ "	a owl:Ontology;\n" + "	dce:title \"\"\""+expressSchemaName +"\"\"\"@en;\n"
				+ "	dce:format \"\"\"OWL Full\"\"\"@en;\n"
				+ " 	dce:identifier \"\"\"ifc\"\"\"@en;\n"
				+ "	dce:language \"\"\"English\"\"\"@en.\n" + "\n";
//				+ "ifc:Entity\n" + "	rdfs:subClassOf owl:Thing;\n"
//				+ "	a owl:Class.";
		return s;
	}
			
	
	// @formatter:on
	
	public OWLWriter() {
		// UNUSED
	}
	
	public OWLWriter(String expressSchemaName, Map<String, EntityVO> entities, Map<String, TypeVO> types, Map<String, Set<String>> siblings, List<NamedIndividualVO> enumIndividuals) {
		this.expressSchemaName = expressSchemaName;
		this.entities = entities;
		this.types = types;
		this.siblings = siblings;
		this.enumIndividuals = enumIndividuals;
	}
	
	public void outputRDFS() {
		Iterator<Entry<String, EntityVO>> it = entities.entrySet().iterator();
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(
					"out\\"+expressSchemaName + "_rdfs.n3"));
			out.write("@prefix rdf:  <" + Namespace.RDF + "> .\n");
			out.write("@prefix rdfs: <" + Namespace.RDFS + "> .\n");
			out.write("@prefix owl: <" + Namespace.OWL + "> .\n");
			out.write("@prefix ifc: <" + Namespace.IFC + "> .\n");
			out.write("@prefix xsd: <" + Namespace.XSD + "> .\n");
			out.write("\n");
			while (it.hasNext()) {
				Entry<String, EntityVO> pairs = it.next();
				EntityVO evo = pairs.getValue();

				if (evo.getSuperclass() == null)
					out.write("ifc:" + evo.getName() + " a rdfs:Class.\n");
				else
					out.write("ifc:" + evo.getName()
							+ " a rdfs:Class; rdfs:subClassOf ifc:"
							+ evo.getSuperclass() + ".\n");

				for (int n = 0; n < evo.getAttributes().size(); n++) {
					String property = evo.getAttributes().get(n).getName()
							.toLowerCase();// formatProperty(evo.getAttributes().get(n).getName());
					PropertyVO t = properties.get(property);
					if (t == null) {
						properties.put(property, null);
						out.write("ifc:" + property + " a rdf:Property.\n");
					}

					out.write("ifc:" + property + " rdfs:domain ifc:"
							+ pairs.getValue().getName() + ".\n");
				}

				for (int n = 0; n < evo.getInverses().size(); n++) {
					String property = ExpressReader.formatProperty(evo.getInverses().get(n)
							.getName());
					PropertyVO t = properties.get(property);
					if (t == null) {

						properties.put(property, null);
						out.write("ifc:" + property + " a rdf:Property.\n");
					}

					out.write("ifc:" + property + " rdfs:domain ifc:"
							+ pairs.getValue().getName() + ".\n");
				}

			}
			out.write("ifc:has_linenumber a rdf:Property.\n");
			out.write("ifc:graph_deep a rdf:Property.\n");
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void outputOWLproperty(BufferedWriter out, PropertyVO property) {
		try {
			// TODO Select, Inverse
			if (property.isEnumeration) {
				String tmp;
				tmp = type_enum_property;
				tmp = ToolkitString.strReplaceLike(tmp, "<_NAME_>",
						property.getName() + "_enumeration");
				tmp = ToolkitString.strReplaceLike(tmp, "<_ENUM_LIST_>",
						property.getEnumerationsAsString());
				out.write(tmp);

				tmp = type_object_property1;
				tmp = ToolkitString.strReplaceLike(tmp, "<_NAME_>",
						property.getName());
				tmp = ToolkitString.strReplaceLike(tmp, "<_DOMAIN_>",
						property.getIfcClassesAsString());
				tmp = ToolkitString.strReplaceLike(tmp, "<_RANGE_>", "ifc:"
						+ property.getName() + "_enumeration");
				out.write(tmp);

				return; // handled
			}

			if (property.isList)
				if (property.isEntity) {
					String tmp;
					tmp = type_entity_list;
					tmp = ToolkitString.strReplaceLike(tmp, "<_NAME_>",
							property.getName() + "_list");
					tmp = ToolkitString.strReplaceLike(tmp, "<_RANGE_>", "ifc:"
							+ property.getRawtype());
					out.write(tmp);

					tmp = type_object_property1;
					tmp = ToolkitString.strReplaceLike(tmp, "<_NAME_>",
							property.getName());
					tmp = ToolkitString.strReplaceLike(tmp, "<_DOMAIN_>",
							property.getIfcClassesAsString());
					tmp = ToolkitString.strReplaceLike(tmp, "<_RANGE_>", "ifc:"
							+ property.getName() + "_list");
					out.write(tmp);

				} else {
					String tmp;
					tmp = type_datatype_list;
					tmp = ToolkitString.strReplaceLike(tmp, "<_NAME_>",
							property.getName() + "_list");
					tmp = ToolkitString.strReplaceLike(tmp, "<_DATATYPE_>",
							property.getRawtype());
					out.write(tmp);

					tmp = type_object_property1;
					tmp = ToolkitString.strReplaceLike(tmp, "<_NAME_>",
							property.getName());
					tmp = ToolkitString.strReplaceLike(tmp, "<_DOMAIN_>",
							property.getIfcClassesAsString());
					tmp = ToolkitString.strReplaceLike(tmp, "<_RANGE_>", "ifc:"
							+ property.getName() + "_list");
					out.write(tmp);
				}

			else if (property.isEntity) {
				String tmp;
				tmp = type_object_property1;
				tmp = ToolkitString.strReplaceLike(tmp, "<_NAME_>",
						property.getName());
				tmp = ToolkitString.strReplaceLike(tmp, "<_DOMAIN_>",
						property.getIfcClassesAsString());
				tmp = ToolkitString.strReplaceLike(tmp, "<_RANGE_>", "ifc:"
						+ property.getRawtype());
				out.write(tmp);

			} else {
				String tmp;
				tmp = type_type_datatype_property;
				tmp = ToolkitString.strReplaceLike(tmp, "<_NAME_>",
						property.getName());
				tmp = ToolkitString.strReplaceLike(tmp, "<_DOMAIN_>",
						property.getIfcClassesAsString());
				tmp = ToolkitString.strReplaceLike(tmp, "<_DATATYPE_>",
						property.getRawtype());
				out.write(tmp);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void outputOWL() {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(
					"out\\"+expressSchemaName + "_owl.n3"));
			out.write("@prefix ifc: <" + Namespace.IFC + "> .\n");
			out.write(getOwl_header());
			
			writePrimaryTypes(out);
			writeNamedIndividuals(out);
			
			Iterator<Entry<String, TypeVO>> it_type = types.entrySet().iterator();
			writeTypesToOWL(it_type,out);
			
			Iterator<Entry<String, EntityVO>> it = entities.entrySet().iterator();
			writeEntitiesToOWL(it,out);
			
			out.write("# start writing properties\n");
			for (Map.Entry<String, PropertyVO> entry : properties.entrySet()) {
				out.write("# start a property\n");
				PropertyVO property = entry.getValue();
				outputOWLproperty(out, property);
				out.write("# end a property\n\n");
			}
			out.write("# printed all\n");
			
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void writePrimaryTypes(BufferedWriter out) throws IOException{
		for(PrimaryTypeVO pt : PrimaryTypeVO.getListOfPrimaryTypes()){
			out.write("ifc:"+pt.getPTypeName() + "\n");
			out.write("\ta owl:Class" + "\n");
			out.write("\trdfs:subClassOf  [ " + "\n");
			out.write("\t\ta owl:Restriction ;" + "\n");
			out.write("\t\towl:allValuesFrom xsd:"+pt.getXSDType()+";" + "\n");
			out.write("\t\towl:onProperty ifc:hasContent" + "\n");
			out.write("\t\t] ." + "\n"+ "\n");
		}
	}
	
	private void writeNamedIndividuals(BufferedWriter out) throws IOException{
		for(NamedIndividualVO ni : enumIndividuals){
			out.write("ifc:" + ni.getNamedIndividual() + "\n");
			out.write("\ta owl:NamedIndividual;" + "\n");
			out.write("\trdfs:label \""+ni.getOriginalNameOfIndividual()+"\"^^xsd:string ." + "\n" + "\n");
		}
	}
	
	private void writeEntitiesToOWL(Iterator<Entry<String, EntityVO>> it, BufferedWriter out) throws IOException{
		out.write("# start writing entity classes\n");
		while (it.hasNext()) {
			Entry<String, EntityVO> pairs = it.next();
			EntityVO evo = pairs.getValue();
			// Generate the disjoined set:
			StringBuffer sibtxt = new StringBuffer();
			Set<String> sibling_set = this.siblings.get(evo.getName());
			if (sibling_set != null) {
				Iterator sib_it = sibling_set.iterator();
				int ii = 0;
				while (sib_it.hasNext()) {
					String sib = sib_it.next().toString();
					if (!sib.equalsIgnoreCase(evo.getName())) {
						if (ii > 0)
							sibtxt.append(",");
						sibtxt.append(" ifc:");
						sibtxt.append(sib);
						ii++;
					}
				}
			}

			//Write classes
			out.write("# writing entity class\n");
			out.write("ifc:" + evo.getName() + "\n");
			out.write("\ta owl:Class ;\n");
			if (evo.getSuperclass() != null)
				out.write("\trdfs:subClassOf ifc:" + evo.getSuperclass()
						+ " ;\n");
			if(evo.isAbstractSuperclass()){
				out.write("\towl:equivalentClass [" + "\n");
				out.write("\t\ta owl:Class ;" + "\n");
				out.write("\t\towl:unionOf ( ");
				Set l = evo.getSubClassList();
				for (Iterator<String> lit = l.iterator(); lit.hasNext(); ) {
					String x = lit.next();
					if ( ! lit.hasNext())
						out.write("ifc:" + x);
					else
						out.write("ifc:" + x + ", ");
				}
				out.write(" ) ." + "\n");
				out.write("\t\t] ;" + "\n");
			}

			//Writing disjointness
			out.write("# writing disjoint\n");
			if (sibtxt.length() > 0)
				out.write("\towl:disjointWith " + sibtxt.toString() + " ;\n");

			//Writing properties
			out.write("# writing properties\n");
			for (int n = 0; n < evo.getAttributes().size(); n++) {

				out.write("# property found\n");
				String property = evo.getAttributes().get(n).getName()
						.toLowerCase();// formatProperty(evo.getAttributes().get(n).getName());
				PropertyVO t = properties.get(property);
				if (t == null) {
					EntityVO entity = this.entities.get(ExpressReader.formatClassName(evo
							.getAttributes().get(n).getType().getName()));

					String primary_type = evo.getAttributes().get(n)
							.getType().getPrimarytype();
					if (primary_type.equals("ENUMERATION")) {
						t = new PropertyVO(property, evo.getAttributes()
								.get(n).isSet(), false, null, true, evo
								.getAttributes().get(n).getType()
								.getEnum_entities());
					} else {
						String xsd_type = "xsd:string";
						if (primary_type.startsWith("IFC"))
							primary_type = types.get(primary_type)
									.getPrimarytype();
						if ("REAL".equals(primary_type))
							xsd_type = "xsd:double";
						if ("INTEGER".equals(primary_type))
							xsd_type = "xsd:integer";

						if (entity != null)
							t = new PropertyVO(property, evo
									.getAttributes().get(n).isSet(), true,
									evo.getAttributes().get(n).getType()
											.getName());
						else
							t = new PropertyVO(property, evo
									.getAttributes().get(n).isSet(), false,
									xsd_type);
					}
					properties.put(property, t);
				}
				t.addIfcClass(evo.getName());
			}

			out.write("# writing inverses");
			for (int n = 0; n < evo.getInverses().size(); n++) {

				out.write("# inverse found\n");
				
				String property = ExpressReader.formatProperty(evo.getInverses().get(n)
						.getName());
				PropertyVO t = properties.get(property);
				if (t == null) {
					t = new PropertyVO(property, true, true, evo
							.getInverses().get(n).getIfc_class());
					properties.put(property, t);
				}
				t.addIfcClass(evo.getName());
			}

			out.write("\n");
			out.write("# printed an entity\n\n");
		}
	}
	
	private void writeTypesToOWL(Iterator<Entry<String, TypeVO>> it, BufferedWriter out) throws IOException{
		while (it.hasNext()) {
			Entry<String, TypeVO> pairs = it.next();
			TypeVO tvo = pairs.getValue();
			
			if(tvo.getPrimarytype().equalsIgnoreCase("ENUMERATION")){
				
				//out.write("#TYPE " + tvo.getName() + " - " + tvo.getPrimarytype() + "\n");
				out.write("ifc:" + tvo.getName() + "\n");
				out.write("\ta owl:Class;" + "\n");//-> owl:Class
				out.write("\towl:oneOf (");
				for(int i = 0; i<tvo.getEnum_entities().size();i++){
					if(i!=tvo.getEnum_entities().size()-1)
						out.write("ifc:" + getNamedIndividual(tvo.getEnum_entities().get(i), tvo.getName()).getNamedIndividual() + ", ");//-> owl:oneOf (uniquely named individuals + label property)		
					else
						out.write("ifc:" + getNamedIndividual(tvo.getEnum_entities().get(i), tvo.getName()).getNamedIndividual());
				}
				out.write(").\n\n");
			}
			
			else if(tvo.getPrimarytype().equalsIgnoreCase("SELECT")){
				//ignored here			
			}
			else {
				String type = tvo.getPrimarytype();
				if (type.startsWith("ARRAY") || type.startsWith("SET") || type.startsWith("LIST")){
					//list
					String startIndex = type.substring(type.indexOf('[')+1, type.indexOf('[')+2);
					String endIndex = type.substring(type.indexOf(']')-1, type.indexOf(']'));
					String[] cList = type.split(" ");
					String content = cList[cList.length-1];
					
					out.write("ifc:"+tvo.getName()+ "\n");
					out.write("\ta owl:Class"+ "\n");
					out.write("\trdfs:subClassOf olo:OrderedList;"+ "\n");
					out.write("\trdfs:subClassOf ["+ "\n");
					out.write("\t\ta owl:Restriction, owl:Class ;"+ "\n");
					out.write("\t\towl:allValuesFrom [ "+ "\n");
					out.write("\t\t\ta rdfs:Datatype;"+ "\n");
					out.write("\t\t\towl:oneOf (\""+startIndex+"\"^^xsd:int \""+endIndex+"\"^^xsd:int)"+ "\n");//TODO: check this, seems wrong
					out.write("\t\t\t] ;"+ "\n");
					out.write("\t\towl:onProperty olo:length ."+ "\n");
					out.write("\trdfs:subClassOf ["+ "\n");
					out.write("\t\ta owl:Restriction ;"+ "\n");
					out.write("\t\towl:allValuesFrom ifc:"+tvo.getName()+"_Slot ;"+ "\n");
					out.write("\t\towl:onProperty olo:slot"+ "\n");
					out.write("\t] ."+ "\n"+ "\n");
					
					out.write("ifc:"+tvo.getName()+"_Slot a owl:Class;"+ "\n");
					out.write("\trdfs:subClassOf olo:Slot ;"+ "\n");
					out.write("\trdfs:subClassOf ["+ "\n");
					out.write("\t\ta owl:Restriction ;"+ "\n");
					out.write("\t\towl:allValuesFrom ifc:"+content+ "\n");
					out.write("\t\towl:onProperty olo:item"+ "\n");
					out.write("\t\t] ."+ "\n"+ "\n");
				}
				else if(ExpressReader.isAllUpper(type)){
					//primaryType
					out.write(tvo.getName() + "\n");
					out.write("\ta owl:Class;" + "\n");
					out.write("\trdfs:subClassOf  [ " +"\n");
					out.write("\t\ta owl:Restriction ;" + "\n");
					out.write("\t\towl:allValuesFrom ifc:"+tvo.getPrimarytype()+";" + "\n");
					out.write("\t\towl:onProperty ifc:hasContent" + "\n");
					out.write("\t\t] ." + "\n" + "\n");
				}
				else{
					//typeVO
					out.write(tvo.getName() + "\n");
					out.write("\ta owl:Class;" + "\n");
					out.write("\t rdfs:subClassOf  [ " +"\n");
					out.write("\t\ta owl:Restriction ;" + "\n");
					out.write("\t\towl:allValuesFrom ifc:"+tvo.getPrimarytype()+";" + "\n");
					out.write("\t\towl:onProperty ifc:hasContent" + "\n");
					out.write("\t\t] ." + "\n" + "\n");
				}
			}
		}
	}
	
	private NamedIndividualVO getNamedIndividual(String originalIndividualName, String enumName){
		for(NamedIndividualVO ni : enumIndividuals){
			if(ni.getOriginalNameOfIndividual() == originalIndividualName && ni.getEnumName() == enumName){
				return ni;
			}
		}
		return null;		
	}
}
