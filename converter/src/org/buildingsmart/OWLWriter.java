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

import org.buildingsmart.vo.AttributeVO;
import org.buildingsmart.vo.EntityVO;
import org.buildingsmart.vo.NamedIndividualVO;
import org.buildingsmart.vo.PrimaryTypeVO;
import org.buildingsmart.vo.PropertyVO;
import org.buildingsmart.vo.TypeVO;

import fi.ni.rdf.Namespace;

/*
 * OWLWriter writes .ttl files representing OWL ontologies, thereby relying on the in-memory EXPRESS model that is parsed by the ExpressReader class.
 * 
 * The usage:
 * OWLWriter ow = new OWLWriter(expressSchemaName, entities, types, siblings);
 * 
 *  - outputOWL() - writes the OWL ontology in TTL files in appropriate 'schema' package
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
 */

public class OWLWriter {

	private String expressSchemaName;

	private Map<String, EntityVO> entities = new HashMap<String, EntityVO>();
	private Map<String, PropertyVO> properties = new HashMap<String, PropertyVO>();
	private Map<String, TypeVO> types = new HashMap<String, TypeVO>();
	private Map<String, Set<String>> siblings = new HashMap<String, Set<String>>();
	private List<NamedIndividualVO> enumIndividuals = new ArrayList<NamedIndividualVO>();
	private List<String> listPropertiesOutput = new ArrayList<String>();

	public OWLWriter() {
		// UNUSED
	}

	public OWLWriter(String expressSchemaName, Map<String, EntityVO> entities,
			Map<String, TypeVO> types, Map<String, Set<String>> siblings,
			List<NamedIndividualVO> enumIndividuals,
			Map<String, PropertyVO> properties) {
		this.expressSchemaName = expressSchemaName;
		this.entities = entities;
		this.types = types;
		this.siblings = siblings;
		this.enumIndividuals = enumIndividuals;
		this.properties = properties;
	}

	public void outputOWL() {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("out\\"
					+ expressSchemaName + ".ttl"));
			out.write("@prefix : <" + Namespace.IFC + "> .\r\n");
			out.write("@prefix ifc: <" + Namespace.IFC + "> .\r\n");
			out.write(getOwl_header());

			writePrimaryTypes(out);
			//writeNamedIndividuals(out);
			//writeHelperClasses(out);

			//Iterator<Entry<String, TypeVO>> it_type = types.entrySet()
			//		.iterator();
			//writeTypesToOWL(it_type, out);

			//Iterator<Entry<String, EntityVO>> it = entities.entrySet()
			//		.iterator();
			//writeEntitiesToOWL(it, out);

//			for (Map.Entry<String, PropertyVO> entry : properties.entrySet()) {
//				PropertyVO property = entry.getValue();
//				outputOWLproperty(out, property);
//			}

			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void outputOWLproperty(BufferedWriter out, PropertyVO property) {
		try {
			if (property.isList()) {
				out.write("ifc:" + property.getName() + "\r\n");
				out.write("\trdfs:label \"" + property.getOriginalName()
						+ "\" ;\r\n");
				out.write("\trdfs:domain ifc:" + property.getDomain().getName()
						+ " ;\r\n");

				// range
				if (property.isListOfList())
					out.write("\trdfs:range ifc:" + property.getRange()
							+ "_List_List ;\r\n");
				else if (property.isSet())
					out.write("\trdfs:range ifc:" + property.getRange()
							+ " ;\r\n");
				else
					out.write("\trdfs:range ifc:" + property.getRange()
							+ "_List ;\r\n");

				// inverse
				if (property.getInverseProperty() != null)
					out.write("\towl:inverseOf ifc:"
							+ property.getInverseProperty().getName()
							+ " ;\r\n");
				
				// typesetting
				if (!property.isSet())
					out.write("\trdf:type owl:FunctionalProperty, owl:ObjectProperty .\r\n\r\n");
				else
					out.write("\trdf:type owl:ObjectProperty .\r\n\r\n");

				// write List range if necessary
				if (!property.isSet()) {
					if (property.isListOfList()) {
						if (listPropertiesOutput.contains(property.getRange()
								+ "_List")) {
							// property already contained in resulting OWL file
							// (.TTL) -> no need to write additional property
						} else {
							listPropertiesOutput.add(property.getRange()
									+ "_List");

							out.write("ifc:" + property.getRange()
									+ "_List_List" + "\r\n");
							out.write("\trdf:type owl:Class ;" + "\r\n");
							out.write("\trdfs:subClassOf ifc:List ;" + "\r\n");
							out.write("\trdfs:subClassOf" + "\r\n");
							out.write("\t\t[" + "\r\n");
							out.write("\t\t\trdf:type owl:Restriction ;"
									+ "\r\n");
							out.write("\t\t\towl:onProperty ifc:hasListContent ;"
									+ "\r\n");
							out.write("\t\t\towl:allValuesFrom ifc:"
									+ property.getRange() + "_List" + "\r\n");
							out.write("\t\t] ;" + "\r\n");
							out.write("\trdfs:subClassOf" + "\r\n");
							out.write("\t\t[" + "\r\n");
							out.write("\t\t\trdf:type owl:Restriction ;"
									+ "\r\n");
							out.write("\t\t\towl:onProperty ifc:isFollowedBy ;"
									+ "\r\n");
							out.write("\t\t\towl:allValuesFrom ifc:"
									+ property.getRange() + "_List_List\r\n");
							out.write("\t\t] ;" + "\r\n");
							out.write("\trdfs:subClassOf" + "\r\n");
							out.write("\t\t[" + "\r\n");
							out.write("\t\t\trdf:type owl:Restriction ;"
									+ "\r\n");
							out.write("\t\t\towl:onProperty ifc:hasNext ;"
									+ "\r\n");
							out.write("\t\t\towl:allValuesFrom ifc:"
									+ property.getRange() + "_List_List\r\n");
							out.write("\t\t] ." + "\r\n\r\n");
						}
					}

					if (listPropertiesOutput.contains(property.getRange())) {
						// property already contained in resulting OWL file
						// (.TTL)
						// -> no need to write additional property
					} else {
						listPropertiesOutput.add(property.getRange());

						out.write("ifc:" + property.getRange() + "_List"
								+ "\r\n");
						out.write("\trdf:type owl:Class ;" + "\r\n");
						out.write("\trdfs:subClassOf ifc:List ;" + "\r\n");
						out.write("\trdfs:subClassOf" + "\r\n");
						out.write("\t\t[" + "\r\n");
						out.write("\t\t\trdf:type owl:Restriction ;" + "\r\n");
						out.write("\t\t\towl:onProperty ifc:hasListContent ;"
								+ "\r\n");
						out.write("\t\t\towl:allValuesFrom ifc:"
								+ property.getRange() + "\r\n");
						out.write("\t\t] ;" + "\r\n");
						out.write("\trdfs:subClassOf" + "\r\n");
						out.write("\t\t[" + "\r\n");
						out.write("\t\t\trdf:type owl:Restriction ;" + "\r\n");
						out.write("\t\t\towl:onProperty ifc:isFollowedBy ;"
								+ "\r\n");
						out.write("\t\t\towl:allValuesFrom ifc:"
								+ property.getRange() + "_List\r\n");
						out.write("\t\t] ;" + "\r\n");
						out.write("\trdfs:subClassOf" + "\r\n");
						out.write("\t\t[" + "\r\n");
						out.write("\t\t\trdf:type owl:Restriction ;" + "\r\n");
						out.write("\t\t\towl:onProperty ifc:hasNext ;" + "\r\n");
						out.write("\t\t\towl:allValuesFrom ifc:"
								+ property.getRange() + "_List\r\n");
						out.write("\t\t] ." + "\r\n\r\n");
					}
				} else {
					// do nothing additional for a set
				}

				return;

			} else {
				out.write("ifc:" + property.getName() + "\r\n");
				out.write("\trdfs:label \"" + property.getOriginalName()
						+ "\" ;\r\n");
				out.write("\trdfs:domain ifc:" + property.getDomain().getName()
						+ " ;\r\n");
				out.write("\trdfs:range ifc:" + property.getRange() + " ;\r\n");
				if (property.getInverseProperty() != null)
					out.write("\towl:inverseOf ifc:"
							+ property.getInverseProperty().getName()
							+ " ;\r\n");
				if (property.isSet() && property.getMaxCardinality() != 1) {
					// System.out.println("Set Prop found : " +
					// property.getName()
					// + " - " + property.getMinCardinality() + " - "
					// + property.getMaxCardinality());
					out.write("\trdf:type owl:ObjectProperty .\r\n\r\n");
				} else
					out.write("\trdf:type owl:FunctionalProperty, owl:ObjectProperty .\r\n\r\n");
				return;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void writePrimaryTypes(BufferedWriter out) throws IOException {
		HashMap<String, String> hm = new HashMap<String, String>();
		for (PrimaryTypeVO pt : PrimaryTypeVO.getListOfPrimaryTypes()) {
			out.write("ifc:" + pt.getPTypeName() + "\r\n");
			out.write("\trdf:type owl:Class ;" + "\r\n");
			out.write("\trdfs:subClassOf " + "\r\n");
			out.write("\t\t[ " + "\r\n");
			out.write("\t\t\trdf:type owl:Restriction ;" + "\r\n");
			out.write("\t\t\towl:allValuesFrom xsd:" + pt.getXSDType() + " ;"
					+ "\r\n");
			out.write("\t\t\towl:onProperty ifc:has_" + pt.getXSDType()
					+ "\r\n");
			out.write("\t\t] ." + "\r\n" + "\r\n");

			String key = pt.getXSDType();
			String val = hm.get(pt.getXSDType());
			if (hm.containsKey(key)) {
				hm.remove(key);
				hm.put(key, val + " ifc:" + pt.getPTypeName());
			} else {
				hm.put(key, "ifc:" + pt.getPTypeName());
			}
		}
		Iterator<Map.Entry<String, String>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> pairs = (Map.Entry<String, String>) it
					.next();
			out.write("ifc:has_" + pairs.getKey() + "\r\n");
			out.write("\trdf:type owl:DatatypeProperty, owl:FunctionalProperty ;"
					+ "\r\n");
			out.write("\trdfs:label \"has_" + pairs.getKey() + "\" ;"
					+ "\r\n");
			out.write("\trdfs:range xsd:" + pairs.getKey() + " ;" + "\r\n");
			out.write("\trdfs:domain " + "\r\n");
			out.write("\t\t[ " + "\r\n");
			out.write("\t\t\trdf:type owl:Class ;" + "\r\n");
			out.write("\t\t\towl:unionOf ( " + pairs.getValue() + " )" + "\r\n");
			out.write("\t\t] ." + "\r\n" + "\r\n");
			it.remove(); // avoids a ConcurrentModificationException
		}
	}

	private void writeNamedIndividuals(BufferedWriter out) throws IOException {
		for (NamedIndividualVO ni : enumIndividuals) {
			out.write("ifc:" + ni.getNamedIndividual() + "\r\n");
			out.write("\trdf:type owl:NamedIndividual ;" + "\r\n");
			out.write("\trdf:type ifc:" + ni.getEnumName() + " ;" + "\r\n");
			out.write("\trdfs:label \"" + ni.getOriginalNameOfIndividual()
					+ "\" ." + "\r\n" + "\r\n");
		}
	}

	private void writeHelperClasses(BufferedWriter out) throws IOException {
		// enumeration class
		out.write("ifc:ENUMERATION" + "\r\n");
		out.write("\trdf:type owl:Class ." + "\r\n\r\n");

		// select class
		out.write("ifc:SELECT" + "\r\n");
		out.write("\trdf:type owl:Class ." + "\r\n\r\n");

		// list class + associates properties etc.
		out.write("ifc:List" + "\r\n");
		out.write("\trdf:type owl:Class ;" + "\r\n");
		out.write("\trdfs:subClassOf" + "\r\n");
		out.write("\t\t[" + "\r\n");
		out.write("\t\t\trdf:type owl:Restriction ;" + "\r\n");
		out.write("\t\t\towl:onProperty ifc:isFollowedBy ;" + "\r\n");
		out.write("\t\t\towl:allValuesFrom ifc:List" + "\r\n");
		out.write("\t\t] ," + "\r\n");
		out.write("\t\t[" + "\r\n");
		out.write("\t\t\trdf:type owl:Restriction ;" + "\r\n");
		out.write("\t\t\towl:onProperty ifc:hasNext ;" + "\r\n");
		out.write("\t\t\towl:allValuesFrom ifc:List" + "\r\n");
		out.write("\t\t] ." + "\r\n\r\n");

		out.write("ifc:hasListContent" + "\r\n");
		out.write("\trdf:type owl:ObjectProperty, owl:FunctionalProperty ;"
				+ "\r\n");
		out.write("\trdfs:label \"hasListContent\" ;" + "\r\n");
		out.write("\trdfs:domain ifc:List ." + "\r\n\r\n");

		out.write("ifc:hasNext" + "\r\n");
		out.write("\trdf:type owl:ObjectProperty, owl:FunctionalProperty ;"
				+ "\r\n");
		out.write("\trdfs:label \"hasNext\" ;" + "\r\n");
		out.write("\trdfs:range ifc:List ;" + "\r\n");
		out.write("\trdfs:domain ifc:List ;" + "\r\n");
		out.write("\trdfs:subPropertyOf  ifc:isFollowedBy ." + "\r\n\r\n");

		out.write("ifc:isFollowedBy" + "\r\n");
		out.write("\trdf:type owl:ObjectProperty, owl:TransitiveProperty ;"
				+ "\r\n");
		out.write("\trdfs:label \"isFollowedBy\" ;" + "\r\n");
		out.write("\trdfs:range ifc:List ;" + "\r\n");
		out.write("\trdfs:domain ifc:List ." + "\r\n\r\n");
	}

	private void writeEntitiesToOWL(Iterator<Entry<String, EntityVO>> it,
			BufferedWriter out) throws IOException {
		// out.write("# start writing entity classes\r\n");
		while (it.hasNext()) {
			Entry<String, EntityVO> pairs = it.next();
			EntityVO evo = pairs.getValue();

			// Generate the disjoint set:
			StringBuffer sibtxt = new StringBuffer();
			Set<String> sibling_set = this.siblings.get(evo.getName());
			if (sibling_set != null) {
				Iterator<String> sib_it = sibling_set.iterator();
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

			// Write classes
			out.write("ifc:" + evo.getName() + "\r\n");
			out.write("\trdf:type owl:Class");
			if (evo.getSuperclass() != null) {
				out.write(" ;\r\n");
				out.write("\trdfs:subClassOf ifc:" + evo.getSuperclass());
			}

			// Writing abstractness
			if (evo.isAbstractSuperclass()) {
				out.write(" ;\r\n");
				out.write("\trdfs:subClassOf " + "\r\n");
				out.write("\t\t[" + "\r\n");
				out.write("\t\t\trdf:type owl:Class ;" + "\r\n");
				out.write("\t\t\towl:unionOf" + "\r\n");
				out.write("\t\t\t\t(" + "\r\n");
				Set<String> l = evo.getSubClassList();
				for (Iterator<String> lit = l.iterator(); lit.hasNext();) {
					String x = lit.next();
					out.write("\t\t\t\t\tifc:" + x + "\r\n");
				}
				out.write("\t\t\t\t)" + "\r\n");
				out.write("\t\t]");
			}

			// Writing disjointness
			if (sibtxt.length() > 0) {
				out.write(" ;\r\n");
				out.write("\towl:disjointWith " + sibtxt.toString());
			}

			// Writing properties
			for (int n = 0; n < evo.getAttributes().size(); n++) {
				AttributeVO attr = evo.getAttributes().get(n);
				writeRegularProperty(attr,out);
			}

			// write inverse properties
			for (int n = 0; n < evo.getInverses().size(); n++) {
				PropertyVO prop = evo.getInverses().get(n)
						.getAssociatedProperty();
				writeInverseProperty(prop, out);
			}

			out.write(" .\r\n");
			out.write("\r\n");
		}
	}
	
	private void writeRegularProperty(AttributeVO attr, BufferedWriter out) throws IOException {
		//write property range
		out.write(" ;\r\n");
		out.write("\trdfs:subClassOf" + "\r\n");//
		out.write("\t\t[" + "\r\n");
		out.write("\t\t\trdf:type owl:Restriction ; " + "\r\n");
		if (attr.isSet()) {
			out.write("\t\t\towl:allValuesFrom ifc:"
					+ attr.getType().getName() + " ; \r\n");
		} else if (attr.isListOfList()) {
			out.write("\t\t\towl:allValuesFrom ifc:"
					+ attr.getType().getName() + "_List_List"
					+ " ; \r\n");
		} else if (attr.isList()) {
			out.write("\t\t\towl:allValuesFrom ifc:"
					+ attr.getType().getName() + "_List" + " ; \r\n");
		} else {
			out.write("\t\t\towl:allValuesFrom ifc:"
					+ attr.getType().getName() + " ; \r\n");
		}
		out.write("\t\t\towl:onProperty ifc:" + attr.getName() + "\r\n");
		out.write("\t\t]");

		if (attr.isUnique()) {
			// this is ignored
		}

		// cardinality restrictions for lists
		if (attr.isListOfList() && !attr.isSet()) {
			writeCardinalityRestrictionsForListOfList(attr, out);
		} else if (attr.isList() && !attr.isSet()) {
			writeCardinalityRestrictionsForList(attr, out);
		} else {
			// System.out.println("not a set, not a list, not a list of list: "
			// + attr.getName());
		}

		// cardinality restriction for property (depends on optional /
		// set / list etc.)
		if (attr.isSet() && attr.getMaxCard() == -1
				&& attr.getMinCard() ==0 ) {
			// no cardinality restrictions needed
		} else {
			if (!attr.isSet()) {
				out.write(" ;\r\n");
				out.write("\t" + "rdfs:subClassOf " + "\r\n");
				out.write("\t\t" + "[" + "\r\n");
				out.write("\t\t\t" + "rdf:type owl:Restriction ;"
						+ "\r\n");
				if (!attr.isOptional()) {
					out.write("\t\t\t"
							+ "owl:qualifiedCardinality \"1\"^^xsd:nonNegativeInteger ;"
							+ "\r\n");
				} else {
					out.write("\t\t\t"
							+ "owl:maxQualifiedCardinality \"1\"^^xsd:nonNegativeInteger ;"
							+ "\r\n");
				}
				out.write("\t\t\t" + "owl:onProperty ifc:"
						+ attr.getName() + " ;\r\n");
				
				if (attr.isListOfList()) {
					out.write("\t\t\t" + "owl:onClass ifc:"
							+ attr.getType().getName() + "_List_List"
							+ "\r\n");
				} else if (attr.isList()) {
					out.write("\t\t\t" + "owl:onClass ifc:"
							+ attr.getType().getName() + "_List"
							+ "\r\n");
				} else {
					out.write("\t\t\t" + "owl:onClass ifc:"
							+ attr.getType().getName() + "\r\n");
				}
				out.write("\t\t" + "]");
			} else {
				if(attr.isOptional()&&attr.getMaxCard()==-1){
					//do nothing
				}
				else{				
					if(attr.getMinCard()>0&&!attr.isOptional()){
						out.write(" ;\r\n");
						out.write("\t" + "rdfs:subClassOf " + "\r\n");
						out.write("\t\t" + "[" + "\r\n");
						out.write("\t\t\t" + "rdf:type owl:Restriction ;"
								+ "\r\n");				
							out.write("\t\t\t"
									+ "owl:minQualifiedCardinality \"" + attr.getMinCard() + "\"^^xsd:nonNegativeInteger ;"
									+ "\r\n");
						out.write("\t\t\t" + "owl:onProperty ifc:"
								+ attr.getName() + " ;\r\n");
						out.write("\t\t\t" + "owl:onClass ifc:"
								+ attr.getType().getName() + "\r\n");					
						out.write("\t\t" + "]");
					}

					if(attr.getMaxCard()!=-1){
						out.write(" ;\r\n");
						out.write("\t" + "rdfs:subClassOf " + "\r\n");
						out.write("\t\t" + "[" + "\r\n");
						out.write("\t\t\t" + "rdf:type owl:Restriction ;"
								+ "\r\n");	
							out.write("\t\t\t"
									+ "owl:maxQualifiedCardinality \"" + attr.getMaxCard() + "\"^^xsd:nonNegativeInteger ;"
									+ "\r\n");
						out.write("\t\t\t" + "owl:onProperty ifc:"
								+ attr.getName() + " ;\r\n");
						out.write("\t\t\t" + "owl:onClass ifc:"
								+ attr.getType().getName() + "\r\n");					
						out.write("\t\t" + "]");
					}
				}
			}
		}
	}

	private void writeInverseProperty(PropertyVO prop, BufferedWriter out)
			throws IOException {
		out.write(" ;\r\n");
		out.write("\trdfs:subClassOf" + "\r\n");
		out.write("\t\t[" + "\r\n");
		out.write("\t\t\trdf:type owl:Restriction ; " + "\r\n");
		out.write("\t\t\towl:allValuesFrom ifc:" + prop.getRange() + " ; \r\n");
		out.write("\t\t\towl:onProperty ifc:" + prop.getName() + "\r\n");
		out.write("\t\t]");

		if (prop.getMinCardinality() == -1 && prop.getMaxCardinality() == -1) {
			// [?:?]
			// no cardinality restrictions explicitly stated
			// however, as there is no OPTIONAL statement listed for any INVERSE
			// property, this property is considered to be required
			// qualifiedCadinality = 1
			out.write(" ;" + "\r\n");
			out.write("\trdfs:subClassOf" + "\r\n");
			out.write("\t\t[" + "\r\n");
			out.write("\t\t\trdf:type owl:Restriction ;" + "\r\n");
			out.write("\t\t\towl:onProperty ifc:" + prop.getName() + " ;"
					+ "\r\n");
			out.write("\t\t\towl:onClass ifc:" + prop.getRange() + " ;"
					+ "\r\n");
			out.write("\t\t\towl:qualifiedCardinality \"1\"^^xsd:nonNegativeInteger"
					+ "\r\n");
			out.write("\t\t]");

		} else if (prop.getMinCardinality() == -1
				&& prop.getMaxCardinality() != -1) {
			// [?:2]
			// This is not supposed to happen
			System.out
					.println("WARNING - IMPOSSIBLE: found 'unlimited' mincardinality restriction combined with a bounded maxcardinality restriction for :"
							+ prop.getName());
		} else if (prop.getMinCardinality() != -1
				&& prop.getMaxCardinality() == -1) {
			int start = prop.getMinCardinality();
			// [2:?]
			if (start != 0) {
				out.write(" ;" + "\r\n");
				out.write("\trdfs:subClassOf" + "\r\n");
				out.write("\t\t[" + "\r\n");
				out.write("\t\t\trdf:type owl:Restriction ;" + "\r\n");
				out.write("\t\t\towl:onProperty ifc:" + prop.getName() + " ;"
						+ "\r\n");
				out.write("\t\t\towl:onClass ifc:" + prop.getRange() + " ;"
						+ "\r\n");
				out.write("\t\t\towl:minQualifiedCardinality \"" + start
						+ "\"^^xsd:nonNegativeInteger" + "\r\n");
				out.write("\t\t]");
			}
		} else {
			int start = prop.getMinCardinality();
			int end = prop.getMaxCardinality();
			if (start == end) {
				// [3:3]
				// explicitly qualified cardinality
				if (end != 0) {
					out.write(" ;" + "\r\n");
					out.write("\trdfs:subClassOf" + "\r\n");
					out.write("\t\t[" + "\r\n");
					out.write("\t\t\trdf:type owl:Restriction ;" + "\r\n");
					out.write("\t\t\towl:onProperty ifc:" + prop.getName()
							+ " ;" + "\r\n");
					out.write("\t\t\towl:onClass ifc:" + prop.getRange() + " ;"
							+ "\r\n");
					out.write("\t\t\towl:qualifiedCardinality \"" + end
							+ "\"^^xsd:nonNegativeInteger" + "\r\n");
					out.write("\t\t]");
				}
			} else if (start < end) {
				// [1:2]
				// min-max qualified cardinality

				if (end != 0) {
					out.write(" ;" + "\r\n");
					out.write("\trdfs:subClassOf" + "\r\n");
					out.write("\t\t[" + "\r\n");
					out.write("\t\t\trdf:type owl:Restriction ;" + "\r\n");
					out.write("\t\t\towl:onProperty ifc:" + prop.getName()
							+ " ;" + "\r\n");
					out.write("\t\t\towl:onClass ifc:" + prop.getRange() + " ;"
							+ "\r\n");
					out.write("\t\t\towl:maxQualifiedCardinality \"" + end
							+ "\"^^xsd:nonNegativeInteger" + "\r\n");
					out.write("\t\t]");
				}
				if (start != 0) {
					out.write(" ;" + "\r\n");
					out.write("\trdfs:subClassOf" + "\r\n");
					out.write("\t\t[" + "\r\n");
					out.write("\t\t\trdf:type owl:Restriction ;" + "\r\n");
					out.write("\t\t\towl:onProperty ifc:" + prop.getName()
							+ " ;" + "\r\n");
					out.write("\t\t\towl:onClass ifc:" + prop.getRange() + " ;"
							+ "\r\n");
					out.write("\t\t\towl:minQualifiedCardinality \"" + start
							+ "\"^^xsd:nonNegativeInteger" + "\r\n");
					out.write("\t\t]");
				}
			} else {
				// This is not supposed to happen
				System.out
						.println("WARNING - IMPOSSIBLE: found mincardinality restriction that is greater than maxcardinality restriction for :"
								+ prop.getName());
			}
		}
	}

	private void writeCardinalityRestrictionsForList(AttributeVO attr,
			BufferedWriter out) throws IOException {
		// write cardinality restrictions for the referenced list
		// out.write(" ;\r\n");
		if (attr.getMinCard() == -1 && attr.getMaxCard() == -1) {
			System.out.println("WARNING: [?,?] found for : " + attr.getName()
					+ " - " + attr.getType().getName());
		} else if (attr.getMinCard() == -1 && attr.getMaxCard() != -1) {
			// [?:2]
			// This is not supposed to happen
			System.out
					.println("WARNING - IMPOSSIBLE: found 'unlimited' mincardinality restriction combined with a bounded maxcardinality restriction for :"
							+ attr.getName());
		} else if (attr.getMinCard() != -1 && attr.getMaxCard() == -1) {
			int start = attr.getMinCard();
			// [2:?]
			if (start > 1) {
				out.write(" ;\r\n");
				out.write("\trdfs:subClassOf" + "\r\n");//
				out.write("\t\t[" + "\r\n");
				out.write("\t\t\trdf:type owl:Restriction ; " + "\r\n");
				out.write("\t\t\towl:allValuesFrom" + "\r\n");
				out.write("\t\t\t\t[" + "\r\n");
				out.write("\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
				out.write("\t\t\t\t\towl:onProperty ifc:isFollowedBy ; "
						+ "\r\n");
				out.write("\t\t\t\t\towl:onClass ifc:"
						+ attr.getType().getName() + "_List ; " + "\r\n");
				out.write("\t\t\t\t\towl:minQualifiedCardinality \""
						+ (start - 1) + "\"^^xsd:nonNegativeInteger " + "\r\n");
				out.write("\t\t\t\t] ;" + "\r\n");
				out.write("\t\t\towl:onProperty ifc:" + attr.getName() + "\r\n");
				out.write("\t\t]");
			}
		} else {
			int start = attr.getMinCard();
			int end = attr.getMaxCard();
			if (start == end && end > 1) {
				// [3:3]
				// explicitly qualified cardinality
				out.write(" ;\r\n");
				out.write("\trdfs:subClassOf" + "\r\n");//
				out.write("\t\t[" + "\r\n");
				out.write("\t\t\trdf:type owl:Restriction ; " + "\r\n");
				out.write("\t\t\towl:allValuesFrom" + "\r\n");
				out.write("\t\t\t\t[" + "\r\n");
				out.write("\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
				out.write("\t\t\t\t\towl:onProperty ifc:isFollowedBy ; "
						+ "\r\n");
				out.write("\t\t\t\t\towl:onClass ifc:"
						+ attr.getType().getName() + "_List ; " + "\r\n");
				out.write("\t\t\t\t\towl:qualifiedCardinality \"" + (start - 1)
						+ "\"^^xsd:nonNegativeInteger " + "\r\n");
				out.write("\t\t\t\t] ;" + "\r\n");
				out.write("\t\t\towl:onProperty ifc:" + attr.getName() + "\r\n");
				out.write("\t\t]");
			} else if (start < end) {
				// [1:2]
				// min-max qualified cardinality

				if (end > 1) {
					out.write(" ;\r\n");
					out.write("\trdfs:subClassOf" + "\r\n");//
					out.write("\t\t[" + "\r\n");
					out.write("\t\t\trdf:type owl:Restriction ; " + "\r\n");
					out.write("\t\t\towl:allValuesFrom" + "\r\n");
					out.write("\t\t\t\t[" + "\r\n");
					out.write("\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
					out.write("\t\t\t\t\towl:onProperty ifc:isFollowedBy ; "
							+ "\r\n");
					out.write("\t\t\t\t\towl:onClass ifc:"
							+ attr.getType().getName() + "_List ; " + "\r\n");
					out.write("\t\t\t\t\towl:maxQualifiedCardinality \""
							+ (end - 1) + "\"^^xsd:nonNegativeInteger "
							+ "\r\n");
					out.write("\t\t\t\t] ;" + "\r\n");
					out.write("\t\t\towl:onProperty ifc:" + attr.getName()
							+ "\r\n");
					out.write("\t\t]");
				}
				if (start > 1) {
					out.write(" ;\r\n");
					out.write("\trdfs:subClassOf" + "\r\n");//
					out.write("\t\t[" + "\r\n");
					out.write("\t\t\trdf:type owl:Restriction ; " + "\r\n");
					out.write("\t\t\towl:allValuesFrom" + "\r\n");
					out.write("\t\t\t\t[" + "\r\n");
					out.write("\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
					out.write("\t\t\t\t\towl:onProperty ifc:isFollowedBy ; "
							+ "\r\n");
					out.write("\t\t\t\t\towl:onClass ifc:"
							+ attr.getType().getName() + "_List ; " + "\r\n");
					out.write("\t\t\t\t\towl:minQualifiedCardinality \""
							+ (start - 1) + "\"^^xsd:nonNegativeInteger "
							+ "\r\n");
					out.write("\t\t\t\t] ;" + "\r\n");
					out.write("\t\t\towl:onProperty ifc:" + attr.getName()
							+ "\r\n");
					out.write("\t\t]");
				}
			} else {
				// This is not supposed to happen
				System.out
						.println("WARNING - IMPOSSIBLE: found mincardinality restriction that is greater than maxcardinality restriction for :"
								+ attr.getName());
			}
		}
	}

	private void writeCardinalityRestrictionsForListOfList(AttributeVO attr,
			BufferedWriter out) throws IOException {
		// write cardinality restrictions for the referenced list
		
		
		if (attr.getMinCard() == -1 && attr.getMaxCard() == -1) {
			System.out.println("WARNING: [?,?] found for : " + attr.getName()
					+ " - " + attr.getType().getName());
			return;
		} else if (attr.getMinCard() == -1 && attr.getMaxCard() != -1) {
			// [?:2]
			// This is not supposed to happen
			System.out
					.println("WARNING - IMPOSSIBLE: found 'unlimited' mincardinality restriction combined with a bounded maxcardinality restriction for :"
							+ attr.getName());
			return;
		} else if (attr.getMinCard() != -1 && attr.getMaxCard() == -1) {
				int start = attr.getMinCard();
				// [2:?]
				if (start > 1) {					
					out.write(" ;\r\n");
					out.write("\trdfs:subClassOf" + "\r\n");//
					out.write("\t\t[" + "\r\n");
					out.write("\t\t\trdf:type owl:Restriction ; " + "\r\n");
					out.write("\t\t\towl:allValuesFrom" + "\r\n");
					out.write("\t\t\t\t[" + "\r\n");
					out.write("\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
					out.write("\t\t\t\t\towl:onProperty ifc:isFollowedBy ; " + "\r\n");
					out.write("\t\t\t\t\towl:onClass ifc:" + attr.getType().getName() + "_List_List ; " + "\r\n");
					out.write("\t\t\t\t\towl:minQualifiedCardinality \"" + (start - 1)	+ "\"^^xsd:nonNegativeInteger " + "\r\n");
					out.write("\t\t\t\t] ;" + "\r\n");
					out.write("\t\t\towl:onProperty ifc:" + attr.getName() + "\r\n");
					out.write("\t\t]");
				}
				writeExtraCardinalityRestrictionsForListOfList(attr, out);
				return;
			} else {
			int start = attr.getMinCard();
			int end = attr.getMaxCard();
			if (start == end && end > 1) {
				// [3:3]
				// explicitly qualified cardinality
				out.write(" ;\r\n");
				out.write("\trdfs:subClassOf" + "\r\n");//
				out.write("\t\t[" + "\r\n");
				out.write("\t\t\trdf:type owl:Restriction ; " + "\r\n");
				out.write("\t\t\towl:allValuesFrom" + "\r\n");
				out.write("\t\t\t\t[" + "\r\n");				
				out.write("\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
				out.write("\t\t\t\t\towl:onProperty ifc:isFollowedBy ; " + "\r\n");
				out.write("\t\t\t\t\towl:onClass ifc:" + attr.getType().getName() + "_List_List ; " + "\r\n");
				out.write("\t\t\t\t\towl:qualifiedCardinality \"" + (start - 1)	+ "\"^^xsd:nonNegativeInteger " + "\r\n");
				out.write("\t\t\t\t] ;" + "\r\n");
				out.write("\t\t\towl:onProperty ifc:" + attr.getName() + "\r\n");
				out.write("\t\t]");
			} else if (start < end) {
				// [1:2]
				// min-max qualified cardinality

				if (end > 1) {
					out.write(" ;\r\n");
					out.write("\trdfs:subClassOf" + "\r\n");//
					out.write("\t\t[" + "\r\n");
					out.write("\t\t\trdf:type owl:Restriction ; " + "\r\n");
					out.write("\t\t\towl:allValuesFrom" + "\r\n");
					out.write("\t\t\t\t[" + "\r\n");
					out.write("\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
					out.write("\t\t\t\t\towl:onProperty ifc:isFollowedBy ; "
							+ "\r\n");					
					out.write("\t\t\t\t\towl:onClass ifc:" + attr.getType().getName() + "_List_List ; " + "\r\n");
					out.write("\t\t\t\t\towl:maxQualifiedCardinality \"" + (end - 1)	+ "\"^^xsd:nonNegativeInteger " + "\r\n");
					out.write("\t\t\t\t] ;" + "\r\n");
					out.write("\t\t\towl:onProperty ifc:" + attr.getName()
							+ "\r\n");
					out.write("\t\t]");
				}
				if (start > 1) {
					out.write(" ;\r\n");
					out.write("\trdfs:subClassOf" + "\r\n");//
					out.write("\t\t[" + "\r\n");
					out.write("\t\t\trdf:type owl:Restriction ; " + "\r\n");
					out.write("\t\t\towl:allValuesFrom" + "\r\n");
					out.write("\t\t\t\t[" + "\r\n");
					out.write("\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
					out.write("\t\t\t\t\towl:onProperty ifc:isFollowedBy ; "
							+ "\r\n");					
					out.write("\t\t\t\t\towl:onClass ifc:" + attr.getType().getName() + "_List_List ; " + "\r\n");
					out.write("\t\t\t\t\towl:minQualifiedCardinality \"" + (start - 1)	+ "\"^^xsd:nonNegativeInteger " + "\r\n");					
					out.write("\t\t\t\t] ;" + "\r\n");
					out.write("\t\t\towl:onProperty ifc:" + attr.getName()
							+ "\r\n");
					out.write("\t\t]");
				}
			} else {
				// This is not supposed to happen
				System.out
						.println("WARNING - IMPOSSIBLE: found mincardinality restriction that is greater than maxcardinality restriction for :"
								+ attr.getName());
			}
			writeExtraCardinalityRestrictionsForListOfList(attr, out);
			return;
		}
	}
	
	private void writeExtraCardinalityRestrictionsForListOfList(
			AttributeVO attr, BufferedWriter out) throws IOException {
		if (attr.getMinCard_listoflist() == -1 && attr.getMaxCard_listoflist() == -1) {
			System.out.println("WARNING: [?,?] found for : " + attr.getName()
					+ " - " + attr.getType().getName());
		} else if (attr.getMinCard_listoflist() == -1 && attr.getMaxCard_listoflist() != -1) {
			// [?:2]
			// This is not supposed to happen
			System.out
					.println("WARNING - IMPOSSIBLE: found 'unlimited' mincardinality restriction combined with a bounded maxcardinality restriction for :"
							+ attr.getName());
		} else if (attr.getMinCard_listoflist() != -1 && attr.getMaxCard_listoflist() == -1) {
			int start = attr.getMinCard_listoflist();
			// [2:?]
			if (start > 1) {

				out.write(" ;\r\n");
				out.write("\trdfs:subClassOf" + "\r\n");
				out.write("\t\t[" + "\r\n");
				out.write("\t\t\trdf:type owl:Restriction ; " + "\r\n");
				out.write("\t\t\towl:onProperty ifc:" + attr.getName()
						+ " ; \r\n");
				out.write("\t\t\towl:allValuesFrom" + "\r\n");
				out.write("\t\t\t\t[" + "\r\n");
				out.write("\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
				out.write("\t\t\t\t\towl:onProperty ifc:hasListContent ; "
						+ "\r\n");
				out.write("\t\t\t\t\towl:someValuesFrom" + "\r\n");
				out.write("\t\t\t\t\t\t[" + "\r\n");
				out.write("\t\t\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
				out.write("\t\t\t\t\t\t\towl:onProperty ifc:isFollowedBy ; "
						+ "\r\n");
				out.write("\t\t\t\t\t\t\towl:onClass ifc:"
						+ attr.getType().getName() + "_List ; " + "\r\n");
				out.write("\t\t\t\t\t\t\towl:minQualifiedCardinality \""
						+ (start - 1) + "\"^^xsd:nonNegativeInteger " + "\r\n");
				out.write("\t\t\t\t\t\t]" + "\r\n");
				out.write("\t\t\t\t]" + "\r\n");
				out.write("\t\t]");

				out.write(" ;\r\n");
				out.write("\trdfs:subClassOf" + "\r\n");
				out.write("\t\t[" + "\r\n");
				out.write("\t\t\trdf:type owl:Restriction ; " + "\r\n");
				out.write("\t\t\towl:onProperty ifc:" + attr.getName()
						+ " ; \r\n");
				out.write("\t\t\towl:allValuesFrom" + "\r\n");
				out.write("\t\t\t\t[" + "\r\n");
				out.write("\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
				out.write("\t\t\t\t\towl:onProperty ifc:isFollowedBy ; "
						+ "\r\n");
				out.write("\t\t\t\t\towl:allValuesFrom" + "\r\n");
				out.write("\t\t\t\t\t\t[" + "\r\n");
				out.write("\t\t\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
				out.write("\t\t\t\t\t\t\towl:onProperty ifc:hasListContent ; "
						+ "\r\n");
				out.write("\t\t\t\t\t\t\towl:someValuesFrom" + "\r\n");
				out.write("\t\t\t\t\t\t\t\t[" + "\r\n");
				out.write("\t\t\t\t\t\t\t\t\trdf:type owl:Restriction ; "
						+ "\r\n");
				out.write("\t\t\t\t\t\t\t\t\towl:onProperty ifc:isFollowedBy ; "
						+ "\r\n");
				out.write("\t\t\t\t\t\t\t\t\towl:onClass ifc:"
						+ attr.getType().getName() + "_List ; " + "\r\n");
				out.write("\t\t\t\t\t\t\t\t\towl:minQualifiedCardinality \""
						+ (start - 1) + "\"^^xsd:nonNegativeInteger " + "\r\n");
				out.write("\t\t\t\t\t\t\t\t]" + "\r\n");
				out.write("\t\t\t\t\t\t]" + "\r\n");
				out.write("\t\t\t\t]" + "\r\n");
				out.write("\t\t]");
			}
		} else {
			int start = attr.getMinCard_listoflist();
			int end = attr.getMaxCard_listoflist();
			if (start == end && end > 1) {
				// [3:3]
				// explicitly qualified cardinality
				out.write(" ;\r\n");
				out.write("\trdfs:subClassOf" + "\r\n");
				out.write("\t\t[" + "\r\n");
				out.write("\t\t\trdf:type owl:Restriction ; " + "\r\n");
				out.write("\t\t\towl:onProperty ifc:" + attr.getName()
						+ " ; \r\n");
				out.write("\t\t\towl:allValuesFrom" + "\r\n");
				out.write("\t\t\t\t[" + "\r\n");
				out.write("\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
				out.write("\t\t\t\t\towl:onProperty ifc:hasListContent ; "
						+ "\r\n");
				out.write("\t\t\t\t\towl:someValuesFrom" + "\r\n");
				out.write("\t\t\t\t\t\t[" + "\r\n");
				out.write("\t\t\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
				out.write("\t\t\t\t\t\t\towl:onProperty ifc:isFollowedBy ; "
						+ "\r\n");
				out.write("\t\t\t\t\t\t\towl:onClass ifc:"
						+ attr.getType().getName() + "_List ; " + "\r\n");
				out.write("\t\t\t\t\t\t\towl:qualifiedCardinality \""
						+ (start - 1) + "\"^^xsd:nonNegativeInteger " + "\r\n");
				out.write("\t\t\t\t\t\t]" + "\r\n");
				out.write("\t\t\t\t]" + "\r\n");
				out.write("\t\t]");

				out.write(" ;\r\n");
				out.write("\trdfs:subClassOf" + "\r\n");
				out.write("\t\t[" + "\r\n");
				out.write("\t\t\trdf:type owl:Restriction ; " + "\r\n");
				out.write("\t\t\towl:onProperty ifc:" + attr.getName()
						+ " ; \r\n");
				out.write("\t\t\towl:allValuesFrom" + "\r\n");
				out.write("\t\t\t\t[" + "\r\n");
				out.write("\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
				out.write("\t\t\t\t\towl:onProperty ifc:isFollowedBy ; "
						+ "\r\n");
				out.write("\t\t\t\t\towl:allValuesFrom" + "\r\n");
				out.write("\t\t\t\t\t\t[" + "\r\n");
				out.write("\t\t\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
				out.write("\t\t\t\t\t\t\towl:onProperty ifc:hasListContent ; "
						+ "\r\n");

				out.write("\t\t\t\t\t\t\towl:someValuesFrom" + "\r\n");
				out.write("\t\t\t\t\t\t\t\t[" + "\r\n");
				out.write("\t\t\t\t\t\t\t\t\trdf:type owl:Restriction ; "
						+ "\r\n");
				out.write("\t\t\t\t\t\t\t\t\towl:onProperty ifc:isFollowedBy ; "
						+ "\r\n");
				out.write("\t\t\t\t\t\t\t\t\towl:onClass ifc:"
						+ attr.getType().getName() + "_List ; " + "\r\n");
				out.write("\t\t\t\t\t\t\t\t\towl:qualifiedCardinality \""
						+ (start - 1) + "\"^^xsd:nonNegativeInteger " + "\r\n");
				out.write("\t\t\t\t\t\t\t\t]" + "\r\n");
				out.write("\t\t\t\t\t\t]" + "\r\n");
				out.write("\t\t\t\t]" + "\r\n");
				out.write("\t\t]");
			} else if (start < end) {
				// [1:2]
				// min-max qualified cardinality

				if (end > 1) {
					out.write(" ;\r\n");
					out.write("\trdfs:subClassOf" + "\r\n");
					out.write("\t\t[" + "\r\n");
					out.write("\t\t\trdf:type owl:Restriction ; " + "\r\n");
					out.write("\t\t\towl:onProperty ifc:" + attr.getName()
							+ " ; \r\n");
					out.write("\t\t\towl:allValuesFrom" + "\r\n");
					out.write("\t\t\t\t[" + "\r\n");
					out.write("\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
					out.write("\t\t\t\t\towl:onProperty ifc:hasListContent ; "
							+ "\r\n");
					out.write("\t\t\t\t\towl:someValuesFrom" + "\r\n");
					out.write("\t\t\t\t\t\t[" + "\r\n");
					out.write("\t\t\t\t\t\t\trdf:type owl:Restriction ; "
							+ "\r\n");
					out.write("\t\t\t\t\t\t\towl:onProperty ifc:isFollowedBy ; "
							+ "\r\n");
					out.write("\t\t\t\t\t\t\towl:onClass ifc:"
							+ attr.getType().getName() + "_List ; " + "\r\n");
					out.write("\t\t\t\t\t\t\towl:maxQualifiedCardinality \""
							+ (end - 1) + "\"^^xsd:nonNegativeInteger "
							+ "\r\n");
					out.write("\t\t\t\t\t\t]" + "\r\n");
					out.write("\t\t\t\t]" + "\r\n");
					out.write("\t\t]");

					out.write(" ;\r\n");
					out.write("\trdfs:subClassOf" + "\r\n");
					out.write("\t\t[" + "\r\n");
					out.write("\t\t\trdf:type owl:Restriction ; " + "\r\n");
					out.write("\t\t\towl:onProperty ifc:" + attr.getName()
							+ " ; \r\n");
					out.write("\t\t\towl:allValuesFrom" + "\r\n");
					out.write("\t\t\t\t[" + "\r\n");
					out.write("\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
					out.write("\t\t\t\t\towl:onProperty ifc:isFollowedBy ; "
							+ "\r\n");
					out.write("\t\t\t\t\towl:allValuesFrom" + "\r\n");
					out.write("\t\t\t\t\t\t[" + "\r\n");
					out.write("\t\t\t\t\t\t\trdf:type owl:Restriction ; "
							+ "\r\n");
					out.write("\t\t\t\t\t\t\towl:onProperty ifc:hasListContent ; "
							+ "\r\n");

					out.write("\t\t\t\t\t\t\towl:someValuesFrom" + "\r\n");
					out.write("\t\t\t\t\t\t\t\t[" + "\r\n");
					out.write("\t\t\t\t\t\t\t\t\trdf:type owl:Restriction ; "
							+ "\r\n");
					out.write("\t\t\t\t\t\t\t\t\towl:onProperty ifc:isFollowedBy ; "
							+ "\r\n");
					out.write("\t\t\t\t\t\t\t\t\towl:onClass ifc:"
							+ attr.getType().getName() + "_List ; " + "\r\n");
					out.write("\t\t\t\t\t\t\t\t\towl:maxQualifiedCardinality \""
							+ (end - 1)
							+ "\"^^xsd:nonNegativeInteger "
							+ "\r\n");
					out.write("\t\t\t\t\t\t\t\t]" + "\r\n");
					out.write("\t\t\t\t\t\t]" + "\r\n");
					out.write("\t\t\t\t]" + "\r\n");
					out.write("\t\t]");

				}
				if (start > 1) {
					out.write(" ;\r\n");
					out.write("\trdfs:subClassOf" + "\r\n");
					out.write("\t\t[" + "\r\n");
					out.write("\t\t\trdf:type owl:Restriction ; " + "\r\n");
					out.write("\t\t\towl:onProperty ifc:" + attr.getName()
							+ " ; \r\n");
					out.write("\t\t\towl:allValuesFrom" + "\r\n");
					out.write("\t\t\t\t[" + "\r\n");
					out.write("\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
					out.write("\t\t\t\t\towl:onProperty ifc:hasListContent ; "
							+ "\r\n");
					out.write("\t\t\t\t\towl:someValuesFrom" + "\r\n");
					out.write("\t\t\t\t\t\t[" + "\r\n");
					out.write("\t\t\t\t\t\t\trdf:type owl:Restriction ; "
							+ "\r\n");
					out.write("\t\t\t\t\t\t\towl:onProperty ifc:isFollowedBy ; "
							+ "\r\n");
					out.write("\t\t\t\t\t\t\towl:onClass ifc:"
							+ attr.getType().getName() + "_List ; " + "\r\n");
					out.write("\t\t\t\t\t\t\towl:minQualifiedCardinality \""
							+ (start - 1) + "\"^^xsd:nonNegativeInteger "
							+ "\r\n");
					out.write("\t\t\t\t\t\t]" + "\r\n");
					out.write("\t\t\t\t]" + "\r\n");
					out.write("\t\t]");

					out.write(" ;\r\n");
					out.write("\trdfs:subClassOf" + "\r\n");
					out.write("\t\t[" + "\r\n");
					out.write("\t\t\trdf:type owl:Restriction ; " + "\r\n");
					out.write("\t\t\towl:onProperty ifc:" + attr.getName()
							+ " ; \r\n");
					out.write("\t\t\towl:allValuesFrom" + "\r\n");
					out.write("\t\t\t\t[" + "\r\n");
					out.write("\t\t\t\t\trdf:type owl:Restriction ; " + "\r\n");
					out.write("\t\t\t\t\towl:onProperty ifc:isFollowedBy ; "
							+ "\r\n");
					out.write("\t\t\t\t\towl:allValuesFrom" + "\r\n");
					out.write("\t\t\t\t\t\t[" + "\r\n");
					out.write("\t\t\t\t\t\t\trdf:type owl:Restriction ; "
							+ "\r\n");
					out.write("\t\t\t\t\t\t\towl:onProperty ifc:hasListContent ; "
							+ "\r\n");
					out.write("\t\t\t\t\t\t\towl:someValuesFrom" + "\r\n");
					out.write("\t\t\t\t\t\t\t\t[" + "\r\n");
					out.write("\t\t\t\t\t\t\t\t\trdf:type owl:Restriction ; "
							+ "\r\n");
					out.write("\t\t\t\t\t\t\t\t\towl:onProperty ifc:isFollowedBy ; "
							+ "\r\n");
					out.write("\t\t\t\t\t\t\t\t\towl:onClass ifc:"
							+ attr.getType().getName() + "_List ; " + "\r\n");
					out.write("\t\t\t\t\t\t\t\t\towl:minQualifiedCardinality \""
							+ (start - 1)
							+ "\"^^xsd:nonNegativeInteger "
							+ "\r\n");
					out.write("\t\t\t\t\t\t\t\t]" + "\r\n");
					out.write("\t\t\t\t\t\t]" + "\r\n");
					out.write("\t\t\t\t]" + "\r\n");
					out.write("\t\t]");
				}
			} else {
				// This is not supposed to happen
				System.out
						.println("WARNING - IMPOSSIBLE: found mincardinality restriction that is greater than maxcardinality restriction for :"
								+ attr.getName());
			}
		}
	}

	private void writeTypesToOWL(Iterator<Entry<String, TypeVO>> it,
			BufferedWriter out) throws IOException {
		while (it.hasNext()) {
			Entry<String, TypeVO> pairs = it.next();
			TypeVO tvo = pairs.getValue();

			if (tvo.getPrimarytype().equalsIgnoreCase("ENUMERATION")) {
				out.write("ifc:" + tvo.getName() + "\r\n");
				out.write("\trdf:type owl:Class ;" + "\r\n");
				out.write("\towl:equivalentClass " + "\r\n");
				out.write("\t\t[" + "\r\n");
				out.write("\t\t\trdf:type owl:Class ;" + "\r\n");
				out.write("\t\t\towl:oneOf " + "\r\n");
				out.write("\t\t\t\t( " + "\r\n");
				for (int i = 0; i < tvo.getEnum_entities().size(); i++) {
					if (i != tvo.getEnum_entities().size() - 1)
						out.write("\t\t\t\t\tifc:"
								+ getNamedIndividual(
										tvo.getEnum_entities().get(i),
										tvo.getName()).getNamedIndividual()
								+ " " + "\r\n");// -> owl:oneOf (uniquely named
					// individuals + label property)
					else
						out.write("\t\t\t\t\tifc:"
								+ getNamedIndividual(
										tvo.getEnum_entities().get(i),
										tvo.getName()).getNamedIndividual()
								+ "\r\n");
				}
				out.write("\t\t\t\t) " + "\r\n");
				out.write("\t\t] ; " + "\r\n");
				out.write("\trdfs:subClassOf ifc:ENUMERATION ." + "\r\n\r\n");
			}

			else if (tvo.getPrimarytype().equalsIgnoreCase("SELECT")) {
				out.write("ifc:" + tvo.getName() + "\r\n");
				out.write("\trdf:type owl:Class ;" + "\r\n");
				out.write("\towl:equivalentClass" + "\r\n");
				out.write("\t\t[" + "\r\n");
				out.write("\t\t\trdf:type owl:Class ;" + "\r\n");
				out.write("\t\t\towl:unionOf " + "\r\n");
				out.write("\t\t\t\t( " + "\r\n");
				List<String> selects = tvo.getSelect_entities();
				for (int i = 0; i < selects.size(); i++) {
					out.write("\t\t\t\t\tifc:" + selects.get(i) + " " + "\r\n");
				}
				out.write("\t\t\t\t) " + "\r\n");
				out.write("\t\t] ; " + "\r\n");
				out.write("\trdfs:subClassOf ifc:SELECT ." + "\r\n\r\n");
			} else {
				String type = tvo.getPrimarytype();
				if (type.startsWith("ARRAY") || type.startsWith("SET")
						|| type.startsWith("LIST")) {
					String startIndex = type.substring(type.indexOf('[') + 1,
							type.indexOf('[') + 2);
					String endIndex = type.substring(type.indexOf(']') - 1,
							type.indexOf(']'));
					String[] cList = type.split(" ");
					String content = cList[cList.length - 1];

					out.write("ifc:" + tvo.getName() + "\r\n");
					out.write("\trdf:type owl:Class ;" + "\r\n");
					if (content.endsWith(";"))
						content = content.substring(0, content.length() - 1);
					out.write("\trdfs:subClassOf ifc:" + content + "_List ");
					// check for cardinality restrictions and add if available

					boolean startIsInt = false;
					try {
						Integer.parseInt(startIndex);
						startIsInt = true;
					} catch (NumberFormatException e) {
						startIsInt = false;
					}

					boolean endIsInt = false;
					try {
						Integer.parseInt(endIndex);
						endIsInt = true;
					} catch (NumberFormatException e) {
						endIsInt = false;
					}

					if (startIsInt == false && endIsInt == false) {
						// [?:?]
						// no cardinality restrictions
						// nothing to add
					} else if (startIsInt == false && endIsInt == true) {
						// [?:2]
						// This is not supposed to happen
						System.out
								.println("WARNING - IMPOSSIBLE: found 'unlimited' mincardinality restriction combined with a bounded maxcardinality restriction for :"
										+ tvo.getName());
					} else if (startIsInt == true && endIsInt == false) {
						int start = Integer.parseInt(startIndex);
						// [2:?]
						if (start > 1) {
							out.write(";" + "\r\n");
							out.write("\trdfs:subClassOf" + "\r\n");
							out.write("\t\t[" + "\r\n");
							out.write("\t\t\trdf:type owl:Restriction ;"
									+ "\r\n");
							out.write("\t\t\towl:onProperty ifc:isFollowedBy ;"
									+ "\r\n");
							out.write("\t\t\towl:onClass ifc:" + content
									+ "_List ;" + "\r\n");
							out.write("\t\t\towl:minQualifiedCardinality \""
									+ (start - 1)
									+ "\"^^xsd:nonNegativeInteger" + "\r\n");
							out.write("\t\t] ");
						}
					} else {
						int start = Integer.parseInt(startIndex);
						int end = Integer.parseInt(endIndex);
						if (start == end) {
							// [3:3]
							// explicitly qualified cardinality
							out.write(";" + "\r\n");
							out.write("\trdfs:subClassOf" + "\r\n");
							out.write("\t\t[" + "\r\n");
							out.write("\t\t\trdf:type owl:Restriction ;"
									+ "\r\n");
							out.write("\t\t\towl:onProperty ifc:isFollowedBy ;"
									+ "\r\n");
							out.write("\t\t\towl:onClass ifc:" + content
									+ "_List ;" + "\r\n");
							out.write("\t\t\towl:qualifiedCardinality \""
									+ (start - 1)
									+ "\"^^xsd:nonNegativeInteger" + "\r\n");
							out.write("\t\t] ");
						} else if (start < end) {
							// [1:2]
							// min-max qualified cardinality

							if (end > 1) {
								out.write(";" + "\r\n");
								out.write("\trdfs:subClassOf" + "\r\n");
								out.write("\t\t[" + "\r\n");
								out.write("\t\t\trdf:type owl:Restriction ;"
										+ "\r\n");
								out.write("\t\t\towl:onProperty ifc:isFollowedBy ;"
										+ "\r\n");
								out.write("\t\t\towl:onClass ifc:" + content
										+ "_List ;" + "\r\n");
								out.write("\t\t\towl:maxQualifiedCardinality \""
										+ (end - 1)
										+ "\"^^xsd:nonNegativeInteger" + "\r\n");
								out.write("\t\t] ");
							}
							if (start > 1) {
								out.write(";" + "\r\n");
								out.write("\trdfs:subClassOf" + "\r\n");
								out.write("\t\t[" + "\r\n");
								out.write("\t\t\trdf:type owl:Restriction ;"
										+ "\r\n");
								out.write("\t\t\towl:onProperty ifc:isFollowedBy ;"
										+ "\r\n");
								out.write("\t\t\towl:onClass ifc:" + content
										+ "_List ;" + "\r\n");
								out.write("\t\t\towl:minQualifiedCardinality \""
										+ (start - 1)
										+ "\"^^xsd:nonNegativeInteger" + "\r\n");
								out.write("\t\t] ");
							}
						} else {
							// This is not supposed to happen
							System.out
									.println("WARNING - IMPOSSIBLE: found mincardinality restriction that is greater than maxcardinality restriction for :"
											+ tvo.getName());
						}
					}
					out.write("." + "\r\n\r\n");

					if (listPropertiesOutput.contains(content)) {
						// property already contained in resulting OWL file
						// (.TTL) -> no need to write additional property
					} else {
						listPropertiesOutput.add(content);

						out.write("ifc:" + content + "_List" + "\r\n");
						out.write("\trdf:type owl:Class ;" + "\r\n");
						out.write("\trdfs:subClassOf ifc:List ;" + "\r\n");
						out.write("\trdfs:subClassOf" + "\r\n");
						out.write("\t\t[" + "\r\n");
						out.write("\t\t\trdf:type owl:Restriction ;" + "\r\n");
						out.write("\t\t\towl:onProperty ifc:hasListContent ;"
								+ "\r\n");
						out.write("\t\t\towl:allValuesFrom ifc:" + content
								+ "\r\n");
						out.write("\t\t] ;" + "\r\n");
						out.write("\trdfs:subClassOf" + "\r\n");
						out.write("\t\t[" + "\r\n");
						out.write("\t\t\trdf:type owl:Restriction ;" + "\r\n");
						out.write("\t\t\towl:onProperty ifc:isFollowedBy ;"
								+ "\r\n");
						out.write("\t\t\towl:allValuesFrom ifc:" + content
								+ "_List\r\n");
						out.write("\t\t] ;" + "\r\n");
						out.write("\trdfs:subClassOf" + "\r\n");
						out.write("\t\t[" + "\r\n");
						out.write("\t\t\trdf:type owl:Restriction ;" + "\r\n");
						out.write("\t\t\towl:onProperty ifc:hasNext ;" + "\r\n");
						out.write("\t\t\towl:allValuesFrom ifc:" + content
								+ "_List\r\n");
						out.write("\t\t] ." + "\r\n\r\n");
					}
				} else {
					// typeVO
					out.write("ifc:" + tvo.getName() + "\r\n");
					out.write("\trdf:type owl:Class ;" + "\r\n");
					out.write("\trdfs:subClassOf ifc:" + tvo.getPrimarytype()
							+ " .\r\n\r\n");
				}
			}
		}
	}

	private NamedIndividualVO getNamedIndividual(String originalIndividualName,
			String enumName) {
		for (NamedIndividualVO ni : enumIndividuals) {
			if (ni.getOriginalNameOfIndividual() == originalIndividualName
					&& ni.getEnumName() == enumName) {
				return ni;
			}
		}
		return null;
	}

	private String getOwl_header() {
		String s = "";
		s += "@prefix xsd: <" + Namespace.XSD + "> .\r\n" + "@prefix owl: <"
				+ Namespace.OWL
				+ "> .\r\n"
				+ "@prefix rdfs: <"
				+ Namespace.RDFS
				+ "> .\r\n"
				+ "@prefix dce: <" + Namespace.DCE + "> .\r\n"
				// + "@prefix dct: <" + Namespace.DCT + "> .\r\n"
				+ "@prefix rdf: <" + Namespace.RDF + "> .\r\n" + "\r\n"
				+ "ifc:\r\n"
				+ "\trdf:type owl:Ontology ;\r\n"
				// + "	dce:title \"\"\"" + expressSchemaName + "\"\"\"@en ;\r\n"
				// + "	dce:format \"\"\"OWL Full\"\"\"@en ;\r\n"
				// + " dce:identifier \"\"\"ifc\"\"\"@en ;\r\n"
				// + "	dce:language \"\"\"English\"\"\"@en .\r\n"
				+ " dce:creator \"Pieter Pauwels\" ;\r\n"
				+ " dce:creator \"Walter Terkaj\" ;\r\n"
				+ " dce:contributor \"Aleksandra Sojic\" ;\r\n"
				+ " dce:isBasedOn \"http://www.buildingsmart-tech.org/specifications/ifc-releases/ifc4-release/ifc4-release-summary\" ;\r\n"
				+ " dce:title \"" + expressSchemaName + "\" ;\r\n"
				+ " dce:description \"Conceptual data schema and exchange file format for Building Information Model (BIM) data\" ;\r\n"
				+ " dce:format \"ttl\" ;\r\n"
				+ " dce:identifier \"" + expressSchemaName + "\" ;\r\n"
				+ " dce:language \"English\""
				+ ". \r\n\r\n";
		return s;
	}
}
