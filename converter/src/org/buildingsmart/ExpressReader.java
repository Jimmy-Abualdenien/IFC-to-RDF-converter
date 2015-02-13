package org.buildingsmart;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

import org.buildingsmart.vo.AttributeVO;
import org.buildingsmart.vo.EntityVO;
import org.buildingsmart.vo.InverseVO;
import org.buildingsmart.vo.NamedIndividualVO;
import org.buildingsmart.vo.PrimaryTypeVO;
import org.buildingsmart.vo.PropertyVO;
import org.buildingsmart.vo.TypeVO;

import fi.ni.rdf.Namespace;

/*
 * ExpressReader reads EXPRESS file11 specification of the IFC files and creates 
 * an internal representation of it.
 * 
 * The usage:
 * ExpressReader er = new ExpressReader(file name);
 * 
 *  - getEntities() - gives map of Entities in IFC
 *  - getTypes()    - gives map of Types in IFC
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

public class ExpressReader {

	private String expressSchemaName;
	//private String expressFile;

	private Map<String, EntityVO> entities = new HashMap<String, EntityVO>();
	private Map<String, TypeVO> types = new HashMap<String, TypeVO>();
	private List<NamedIndividualVO> enumIndividuals = new ArrayList<NamedIndividualVO>();
	private Map<String, AttributeVO> attributes = new HashMap<String, AttributeVO>();
	private Map<String, PropertyVO> properties = new HashMap<String, PropertyVO>();
	private Map<String, Set<String>> siblings = new HashMap<String, Set<String>>();

	private ArrayList<TypeVO> selectTypesToExpand_temp = new ArrayList<TypeVO>(); // unused
	private Map<TypeVO, TypeVO> selectTypesToExpand = new HashMap<TypeVO,TypeVO>();//interface x ,extends

	public ExpressReader(String expressSchemaName) {
		Namespace.IFC = "http://www.buildingsmart-tech.org/ifcOWL";
		this.expressSchemaName = expressSchemaName;
		//this.expressFile = ExpressReader.;		
	}
	
	public void readAndBuild(){
		
		try {
//			String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
//			File logFile = new File("out//log_" + timeLog + ".txt");
//			System.out.println(logFile.getCanonicalPath());		
			
			this.readSpec();
			this.buildExpressStructure();
			this.generateNamedIndividuals();
	
			this.rearrangeAttributes();
			this.rearrangeProperties();
			this.addInverses();
			System.out.println("Ended reading the EXPRESS file and building internals");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		try {
//			ExpressReader er = new ExpressReader("IFC2X2_FINAL");//,"samples\\IFC2X2_FINAL.exp");
//			ExpressReader er = new ExpressReader("IFC2X2_PLATFORM");//,"samples\\IFC2X2_PLATFORM.exp");
//			ExpressReader er = new ExpressReader("IFC2X2_ADD1");//,"samples\\IFC2X2_ADD1.exp");
//			ExpressReader er = new ExpressReader("IFC2X3_Final");//,"samples\\IFC2X3_Final.exp");
//			ExpressReader er = new ExpressReader("IFC2X3_TC1");//,"samples\\IFC2X3_TC1.exp");
//			ExpressReader er = new ExpressReader("IFC4");//,"samples\\IFC4.exp");
			ExpressReader er = new ExpressReader("IFC4_ADD1");//,"samples\\IFC4_ADD1.exp");
			er.readSpec();
			System.out.println("Ended parsing the EXPRESS file");
			er.buildExpressStructure();
			er.generateNamedIndividuals();

			er.rearrangeAttributes();
			er.rearrangeProperties();
			er.addInverses();
			er.unpackSelectTypes();

			OWLWriter ow = new OWLWriter(er.expressSchemaName, er.entities,
					er.types, er.siblings, er.enumIndividuals, er.properties);
			ow.outputOWL();
			System.out
					.println("Ended converting the EXPRESS schema into corresponding OWL file");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	private void generateNamedIndividuals() throws IOException {
		ArrayList<String> doublegeneratednamedindividuals = new ArrayList<String>();
		HashMap<String, NamedIndividualVO> alreadygeneratednamedindividuals = new HashMap<String, NamedIndividualVO>();
		for (Map.Entry<String, TypeVO> entry : types.entrySet()) {
			TypeVO vo = entry.getValue();			
			for (int n = 0; n < vo.getEnum_entities().size(); n++) {
				if (!doublegeneratednamedindividuals.contains(vo
						.getEnum_entities().get(n))) {
					if (alreadygeneratednamedindividuals.containsKey(vo
							.getEnum_entities().get(n))) {
						doublegeneratednamedindividuals.add(vo
								.getEnum_entities().get(n));
						NamedIndividualVO firstind = (NamedIndividualVO) alreadygeneratednamedindividuals
								.get(vo.getEnum_entities().get(n));
						firstind.setNamedIndividual(firstind
								.getOriginalNameOfIndividual()
								+ "_of_"
								+ firstind.getEnumName());
						enumIndividuals.add(new NamedIndividualVO(vo.getName(),
								vo.getEnum_entities().get(n) + "_of_"
										+ vo.getName(), vo.getEnum_entities()
										.get(n)));
					} else {
						NamedIndividualVO ind = new NamedIndividualVO(
								vo.getName(), vo.getEnum_entities().get(n));
						enumIndividuals.add(ind);
						alreadygeneratednamedindividuals.put(vo
								.getEnum_entities().get(n), ind);
					}
				} else
					enumIndividuals.add(new NamedIndividualVO(vo.getName(), vo
							.getEnum_entities().get(n) + "_of_" + vo.getName(),
							vo.getEnum_entities().get(n)));
			}
		}
	}

	private void rearrangeAttributes() throws IOException {
		ArrayList<String> doublegeneratedattributes = new ArrayList<String>();
		HashMap<String, AttributeVO> alreadygeneratedattributes = new HashMap<String, AttributeVO>();
		HashMap<String, PropertyVO> alreadygeneratedinverseprops = new HashMap<String, PropertyVO>();
		
		Iterator<Entry<String, EntityVO>> iter = entities.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, EntityVO> pairs = iter.next();
			EntityVO evo = pairs.getValue();
			
			for (int n = 0; n < evo.getAttributes().size(); n++) {
				AttributeVO attr = evo.getAttributes().get(n);
				attr.setDomain(evo);

				if (!doublegeneratedattributes.contains(attr.getName())) {
					if (alreadygeneratedattributes.containsKey(attr.getName())) {
						doublegeneratedattributes.add(attr.getName());
						AttributeVO firstattr = (AttributeVO) alreadygeneratedattributes
								.get(attr.getName());
						firstattr.setOriginalName(firstattr.getName());
						firstattr.setName(firstattr.getName() + "_of_"
								+ firstattr.getDomain().getName());
						attr.setOriginalName(attr.getName());
						attr.setName(attr.getName() + "_of_"
								+ attr.getDomain().getName());
					} else if (alreadygeneratedinverseprops.containsKey(attr.getName())) {
						doublegeneratedattributes.add(attr.getName());
						PropertyVO firstprop = (PropertyVO) alreadygeneratedinverseprops
								.get(attr.getName());
						firstprop.setOriginalName(firstprop.getName());
						firstprop.setName(firstprop.getName() + "_of_"
								+ firstprop.getDomain().getName());
						attr.setOriginalName(attr.getName());
						attr.setName(attr.getName() + "_of_"
								+ attr.getDomain().getName());
					} 
					else {
						// no name change
						alreadygeneratedattributes.put(attr.getName(), attr);
						attr.setOriginalName(attr.getName());
					}
				} else {
					attr.setOriginalName(attr.getName());
					attr.setName(attr.getName() + "_of_" + evo.getName());
				}
			}
			
			for (int n = 0; n < evo.getInverses().size(); n++) {
				InverseVO inv = evo.getInverses().get(n);
				PropertyVO prop = new PropertyVO();
				inv.setAssociatedProperty(prop);
								
				prop.setName(formatProperty(inv.getName(), false));
				prop.setDomain(evo);
				prop.setRange(inv.getClassRange());
				prop.setSet(inv.isSet());				

				prop.setMinCardinality(inv.getMinCard());
				prop.setMaxCardinality(inv.getMaxCard());

				if (!doublegeneratedattributes.contains(prop.getName())) {
					if (alreadygeneratedattributes.containsKey(prop.getName())) {
						doublegeneratedattributes.add(prop.getName());
						AttributeVO firstattr = (AttributeVO) alreadygeneratedattributes
								.get(prop.getName());
						firstattr.setOriginalName(firstattr.getName());
						firstattr.setName(firstattr.getName() + "_of_"
								+ firstattr.getDomain().getName());
						prop.setOriginalName(prop.getName());
						prop.setName(prop.getName() + "_of_"
								+ prop.getDomain().getName());
					} else if (alreadygeneratedinverseprops.containsKey(prop.getName())) {
						doublegeneratedattributes.add(prop.getName());
						PropertyVO firstprop = (PropertyVO) alreadygeneratedinverseprops
								.get(prop.getName());
						firstprop.setOriginalName(firstprop.getName());
						firstprop.setName(firstprop.getName() + "_of_"
								+ firstprop.getDomain().getName());
						properties.remove(firstprop.getOriginalName());
						properties.put(firstprop.getName(),firstprop);
						prop.setOriginalName(prop.getName());
						prop.setName(prop.getName() + "_of_"
								+ prop.getDomain().getName());
					} 
					else {
						// no name change
						alreadygeneratedinverseprops.put(prop.getName(), prop);
						prop.setOriginalName(prop.getName());
					}
				} else {
					prop.setOriginalName(prop.getName());
					prop.setName(prop.getName() + "_of_" + evo.getName());
				}
				properties.put(prop.getName(), prop);
			}			
		}
	}
		
	private void rearrangeProperties() {
				
		Iterator<Entry<String, EntityVO>> it = entities.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, EntityVO> pairs = it.next();
			EntityVO evo = pairs.getValue();
			for (int n = 0; n < evo.getAttributes().size(); n++) {
				AttributeVO attr = evo.getAttributes().get(n);

				TypeVO type = attr.getType();
				String type_primaryType = attr.getType().getPrimarytype();
				String type_name = attr.getType().getName();

				PropertyVO prop = new PropertyVO();
				prop.setName(attr.getName());
				prop.setOriginalName(attr.getOriginalName());
				prop.setDomain(attr.getDomain());
				prop.setArray(attr.isArray());
				prop.setSet(attr.isSet());
				prop.setList(attr.isList());
				prop.setListOfList(attr.isListOfList());
				prop.setRange(type_name);
				prop.setMinCardinality(attr.getMinCard());
				prop.setMaxCardinality(attr.getMaxCard());
				prop.setMinCardinality_listoflist(attr.getMinCard_listoflist());
				prop.setMaxCardinality_listoflist(attr.getMaxCard_listoflist());
				prop.setOptional(attr.isOptional());

				if (type_primaryType.equalsIgnoreCase("enumeration"))
					prop.setType(PropertyVO.propertyType.TypeVO);
				else if (type_primaryType.equalsIgnoreCase("select")) {
					prop.setType(PropertyVO.propertyType.Select);
					prop.setSelectEntities(type.getSelect_entities());
				} else if (type_primaryType.equalsIgnoreCase("class"))
					prop.setType(PropertyVO.propertyType.EntityVO);
				else if (PrimaryTypeVO.getPrimaryTypeVO(type_primaryType) != null)
					prop.setType(PropertyVO.propertyType.TypeVO);
				else {
					prop.setType(PropertyVO.propertyType.TypeVO);
				}
				
				properties.put(prop.getName(), prop);
			}
		}
	}
	
	private void addInverses() {
		Iterator<Entry<String, EntityVO>> iter = entities.entrySet().iterator();
		ArrayList<PropertyVO> listOfAddedObjectProperties = new ArrayList<PropertyVO>();
		while (iter.hasNext()) {
			Entry<String, EntityVO> pairs = iter.next();
			EntityVO evo = pairs.getValue();
			for (int n = 0; n < evo.getInverses().size(); n++) {
				
				InverseVO inv = evo.getInverses().get(n);						
				PropertyVO prop = inv.getAssociatedProperty();	
				PropertyVO inverseOfInv = properties.get(inv
						.getInverseOfProperty());		
				
				if (inverseOfInv == null) {
					inverseOfInv = properties.get(inv.getInverseOfProperty()
							+ "_of_" + prop.getRange());
				}	
				
				if(!listOfAddedObjectProperties.contains(inverseOfInv) && inverseOfInv!=null){	
					listOfAddedObjectProperties.add(inverseOfInv);
						prop.setInverseProp(inverseOfInv);
						inverseOfInv.setInverseProp(prop);
					
					if(inverseOfInv.isList() || inverseOfInv.isListOfList() || inverseOfInv.isArray()){
						//Property needs to be deleted again to counter inconsistencies in the eventual OWL ontology
						properties.remove(prop.getName());
						inverseOfInv.setInverseProp(null);
						listOfAddedObjectProperties.remove(inverseOfInv);
					}
				}
				else{
					PropertyVO origprop = inverseOfInv;
					if(origprop!=null){			
						PropertyVO originv = inverseOfInv.getInverseProperty();			 
						 if(originv!=null){
							 System.out.println("removing property 2 from property list: " + originv.getName());
							 if(properties.remove(originv.getName())==null){
								 System.out.println("could not remove property 2 from list: " + originv.getName());
								 properties.remove(originv.getOriginalName());
							 }
							 System.out.println("removing property 2 from property list: " + origprop.getName());
							 originv.setInverseProp(null);
							 System.out.println("removed inverses of property: " + originv.getName());
						 }	
						 else{
							 System.out.println("removing property 3: " + origprop.getName());	
							 origprop.setInverseProp(null);								
						 }
						 
						 System.out.println("removing property 4: " + prop.getName());	
						 if(properties.remove(prop.getName())==null)
							 System.out.println("could not remove property 4 from list: " + prop.getName());
						 inverseOfInv.setInverseProp(null);
						 System.out.println("removed inverses of property: " + inverseOfInv.getName());
					}	
					else{
						System.out.println("removing property 5: " + prop.getName());	
						properties.remove(prop.getName());							
					}
				}
			}
		}
	}
	
	// CONVERTING
	private void readSpec() {
		try {
			// parsing file
//			FileInputStream fstream = new FileInputStream(expressFile);
//			DataInputStream in = new DataInputStream(fstream);
			InputStream in = ExpressReader.class.getResourceAsStream("/" + expressSchemaName + ".exp"); 
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			try {
				String strLine;
				while ((strLine = br.readLine()) != null) {
					if (strLine.length() > 0) {
						parse_level(strLine);
					}
				}
			} finally {
				br.close();
			}
		} catch (FileNotFoundException fe) {
			System.err.println("The IFC Express file is missing.");
			System.exit(1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void buildExpressStructure() throws IOException {
		generate_derived_attribute_list();
		generate_derived_inverse_list();
	}

	// WRITING ATTRIBUTE AND INVERSE STRUCTURE
	private void generate_derived_attribute_list() throws IOException {
		Iterator<Entry<String, EntityVO>> it = entities.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, EntityVO> pairs = it.next();
			EntityVO evo = pairs.getValue();
			add_attribute_entries(evo, evo);
		}
	}

	private void add_attribute_entries(EntityVO evo, EntityVO top)
			throws IOException {
		if (evo.getSuperclass() != null) {
			EntityVO sup = entities.get(formatClassName(evo.getSuperclass()));
			if (sup != null)
				add_attribute_entries(sup, top);
		}

		for (int n = 0; n < evo.getAttributes().size(); n++) {
			attributes.put(top.getName() + "#"
					+ evo.getAttributes().get(n).getName(), evo.getAttributes()
					.get(n));
			top.getDerived_attribute_list().add(evo.getAttributes().get(n));
		}
	}

	private void generate_derived_inverse_list() throws IOException {
		Iterator<Entry<String, EntityVO>> it = entities.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, EntityVO> pairs = it.next();
			EntityVO evo = (EntityVO) pairs.getValue();
			add_inverse_entries(evo, evo);
		}
	}

	private void add_inverse_entries(EntityVO evo, EntityVO top)
			throws IOException {
		if (evo.getSuperclass() != null) {
			EntityVO sup = entities.get(evo.getSuperclass());
			if (sup != null)
				add_inverse_entries(sup, top);
		}

		for (int n = 0; n < evo.getInverses().size(); n++) {
			AttributeVO avo = attributes.get(evo.getInverses().get(n)
					.getClassRange()
					+ "#" + evo.getInverses().get(n).getInverseOfProperty());
			boolean unique = false;
			if (avo != null) {
				InverseVO ivo = evo.getInverses().get(n);
				if (ivo.getMaxCard() == 1)
					if (!avo.isSet())
						avo.setOne2One(true);
				if (avo.isUnique())
					unique = true;
				avo.setReverse_pointer(true);
				avo.setPoints_from(evo.getInverses().get(n));
			}
			evo.getInverses().get(n).setUnique(unique);
			top.getDerived_inverse_list().add(evo.getInverses().get(n));
		}
	}

	// FORMATTING and BUILDING
	static public String formatClassName(String s) {
		if (s == null)
			return null;
		return filter_extras(s).toUpperCase();
	}

	static public String formatProperty(String s, boolean isList) {
		if (s == null)
			return null;

		if (isList)
			return s + "_List";
		else
			return s;
	}

	// STATE_MACHINE FOR PARSING EXPRESS FILES
	private static final int INIT_STATE = 0;
	private static final int TYPE_STATE = 1;
	private static final int TYPE_SWITCH = 101;
	private static final int TYPE_SELECT = 102;
	private static final int TYPE_ENUMERATION = 103;
	private static final int TYPE_ENUMERATION_OF = 104;
	private static final int TYPE_LIST = 105;
	private static final int TYPE_ARRAY = 106;

	private static final int ENTITY_STATE = 2;
	private static final int ENTITY_READY = 201;
	private static final int ENTITY_SUBTYPE_STATE = 3;
	private static final int ENTITY_SUBTYPE_OF_STATE = 4;
	private static final int ENTITY_UNIQUE = 50;
	private static final int ENTITY_UNIQUE_TYPE = 51;
	private static final int ENTITY_WHERE = 7;
	private static final int ENTITY_DERIVE = 8;
	private static final int ENTITY_SUPERTYPE = 90;
	private static final int ENTITY_SUPERTYPE_OF_ONEOF = 91;
	private static final int ENTITY_NAME_STATE = 11;
	private static final int ENTITY_INVERSE_STATE = 111;
	private static final int ENTITY_INVERSE_SET_OF = 112;
	private static final int ENTITY_INVERSE_FOR = 113;

	private int state = INIT_STATE;
	private EntityVO current_entity = null;
	private String tmp_inverse_name;
	private String tmp_inverse_classnamerange;
	private String tmp_inverse_inverseprop;
	private int tmp_inverse_mincard = 0;  //default value according to EXPRESS spec	
	private int tmp_inverse_maxcard = -1;  //default value according to EXPRESS spec	

	private String tmp_entity_name;
	private String tmp_entity_type;
	private TypeVO current_type;
	private Set<String> current_sibling_set;

	private boolean is_set = false;
	private boolean is_array = false;
	private boolean is_list = false;
	private int tmp_mincard = 0; //default value according to EXPRESS spec	
	private int tmp_maxcard = -1; //default value according to EXPRESS spec
	private boolean is_optional = false;

	private boolean is_listoflist = false;
	private int tmp_listoflist_mincard = 0;  //default value according to EXPRESS spec
	private int tmp_listoflist_maxcard = -1; //default value according to EXPRESS spec

	private void state_machine(String txt) {
		
		switch (state) {
		case INIT_STATE:
			if (txt.equalsIgnoreCase("TYPE"))
				state = TYPE_STATE;
			if (txt.equalsIgnoreCase("ENTITY"))
				state = ENTITY_NAME_STATE;
			if (txt.equalsIgnoreCase("FUNCTION")) {
				break;
			}
			if (txt.equalsIgnoreCase("RULE")) {
				break;
			}
			if (txt.equalsIgnoreCase("END_SCHEMA;"))
				break;
			break;

		// 1. TYPE
		case TYPE_STATE:
			if (txt.endsWith("=")) {
				state = TYPE_SWITCH;
			} else {
				String txt_t = formatClassName(txt);
				TypeVO t = types.get(txt_t);
				if (t == null) {
					current_type = new TypeVO(txt);
					types.put(txt_t, current_type);
				}
			}
			break;

		case TYPE_SWITCH:
			if (txt.equalsIgnoreCase("SELECT")) {
				state = TYPE_SELECT;
				selectTypesToExpand_temp.add(current_type);
				current_type.setPrimarytype(formatClassName(txt));
			} else if (txt.equalsIgnoreCase("ENUMERATION")) {
				state = TYPE_ENUMERATION;
			} else if (isAllUpper(txt.substring(0, txt.length() - 1))) {
				if (txt.startsWith("ARRAY"))
					state = TYPE_ARRAY;
				else if (txt.startsWith("SET")
						|| txt.startsWith("LIST"))
					state = TYPE_LIST;
				else {
					// primarytypes like REAL/INTEGER/STRING/...
					if(formatClassName(txt).equalsIgnoreCase("NUMBER") || formatClassName(txt).equalsIgnoreCase("REAL") || 
							formatClassName(txt).equalsIgnoreCase("INTEGER") || formatClassName(txt).equalsIgnoreCase("LOGICAL") || 
							formatClassName(txt).equalsIgnoreCase("BOOLEAN") || formatClassName(txt).equalsIgnoreCase("STRING") || 
							formatClassName(txt).equalsIgnoreCase("BINARY"))
					new PrimaryTypeVO(formatClassName(txt));
					state = INIT_STATE;
				}
				txt = formatClassName(txt);
			} else {
				// references to TypeVOs
				if (txt.endsWith(";"))
					txt = txt.substring(0, txt.length() - 1);
				state = INIT_STATE;
			}
			current_type.setPrimarytype(txt);
			break;

		case TYPE_ARRAY:
			if (!txt.endsWith(";")) {
				if (current_type != null)
					current_type.setPrimarytype(current_type.getPrimarytype()
							+ " " + txt);
			} else {
				if (current_type != null)
					current_type.setPrimarytype(current_type.getPrimarytype()
							+ " " + txt);
				state = INIT_STATE;
			}
			break;
		
		case TYPE_LIST:
			if (!txt.endsWith(";")) {
				if (current_type != null)
					current_type.setPrimarytype(current_type.getPrimarytype()
							+ " " + txt);
			} else {
				if (current_type != null)
					current_type.setPrimarytype(current_type.getPrimarytype()
							+ " " + txt);
				state = INIT_STATE;
			}
			break;

		case TYPE_SELECT:
			if (txt.endsWith(";")) {
				String txt_t = filter_extras(txt);
				if (current_type != null)
					current_type.getSelect_entities().add(txt_t);
				state = INIT_STATE;
			} else {
				String txt_t = filter_extras(txt);
				if (current_type != null)
					current_type.getSelect_entities().add(txt_t);
			}
			break;

		case TYPE_ENUMERATION:
			if (txt.equals("OF")) {
				state = TYPE_ENUMERATION_OF;
			}
			break;

		case TYPE_ENUMERATION_OF:
			if (txt.endsWith(";")) {
				String txt_t = formatClassName(txt);
				if (current_type != null)
					current_type.getEnum_entities().add(txt_t);
				state = INIT_STATE;
			} else {
				String txt_t = formatClassName(txt);
				if (current_type != null)
					current_type.getEnum_entities().add(txt_t);
			}
			break;

		// 2. ENTITY
		case ENTITY_NAME_STATE:
			// replaces all non-letter characters with nothing
			String org_name = txt;
			if (org_name.endsWith(";"))
				org_name = org_name.substring(0, org_name.length() - 1);
			String entity_name = ExpressReader.formatClassName(org_name);
			current_entity = entities.get(entity_name);
			if (current_entity == null) {
				current_entity = new EntityVO(org_name);
				entities.put(entity_name, current_entity);
			}
			state = ENTITY_STATE;
			break;

		case ENTITY_STATE:
			is_array = false;
			is_set = false;
			is_list = false;
			is_optional = false;
			tmp_mincard = 0;
			tmp_maxcard = -1;
			is_listoflist = false;
			tmp_listoflist_mincard = 0;
			tmp_listoflist_maxcard = -1;

			if (txt.equalsIgnoreCase("SUBTYPE")) {
				state = ENTITY_SUBTYPE_STATE;
			} else if (txt.equalsIgnoreCase("SUPERTYPE")) {
				state = ENTITY_SUPERTYPE;
			} else if (txt.equalsIgnoreCase("ABSTRACT")) {
				current_entity.setAbstractSuperclass(true);
				state = ENTITY_SUPERTYPE;
			} else if (txt.equalsIgnoreCase("INVERSE")) {
				state = ENTITY_INVERSE_STATE;
			} else if (txt.equalsIgnoreCase("UNIQUE")) {
				state = ENTITY_UNIQUE;
			} else if (txt.equalsIgnoreCase("WHERE")) {
				state = ENTITY_WHERE;
			} else if (txt.equalsIgnoreCase("DERIVE")) {
				state = ENTITY_DERIVE;
			} else if (txt.equalsIgnoreCase("END_ENTITY;")) {
				state = INIT_STATE;
			} else {
				if (is_listoflist == true)
					tmp_entity_name = ExpressReader.formatProperty(
							ExpressReader.formatProperty(txt, true), true);
				else if (is_list == true && is_set == false)
					tmp_entity_name = ExpressReader.formatProperty(txt, true);
				else
					tmp_entity_name = ExpressReader.formatProperty(txt, false);
				state = ENTITY_READY;
			}
			break;

		// 2.1 PROPERTIES
		case ENTITY_READY:			
			if (txt.equalsIgnoreCase("END_ENTITY;")) {
				state = INIT_STATE;
			} else if (txt.equalsIgnoreCase("OPTIONAL")) {
				is_optional = true;
			} else if (txt.equalsIgnoreCase("ARRAY")) {
				is_array = true;
			} else if (txt.equalsIgnoreCase("SET")) {
				is_set = true;
			} else if (txt.equalsIgnoreCase("LIST")) {
				if (is_listoflist == true) {
					System.out
							.println("WARNING: LIST of LIST of LIST property found in EXPRESS for : "
									+ tmp_entity_name
									+ " - this is currently not supported by the converter!!");
				}
				if (is_list == true)
					is_listoflist = true;
				is_list = true;
			} else if (txt.endsWith("]") && txt.startsWith("[")) {
				// //[3:4] or similar parsed
				String[] tempCards = txt.split(":");
				String mincard = txt.split(":")[0].substring(1);
				String maxcard = txt.split(":")[1].substring(0,
						tempCards[1].length() - 1);
				if (is_listoflist == true) {
					if (!mincard.equalsIgnoreCase("?"))
						tmp_listoflist_mincard = Integer.parseInt(mincard);
					if (!maxcard.equalsIgnoreCase("?"))
						tmp_listoflist_maxcard = Integer.parseInt(maxcard);
				} else {
					if (!mincard.equalsIgnoreCase("?"))
						tmp_mincard = Integer.parseInt(mincard);
					if (!maxcard.equalsIgnoreCase("?"))
						tmp_maxcard = Integer.parseInt(maxcard);
				}
			} else if (txt.equalsIgnoreCase("SUBTYPE")) {
				state = ENTITY_SUBTYPE_STATE;
			} else if (txt.contains(";")) {
				tmp_entity_type = ExpressReader.formatClassName(txt.substring(
						0, txt.length() - 1));
				
				String txt_filtered = filter_PTypeExtras(txt);
				if(txt_filtered.equalsIgnoreCase("NUMBER") || txt_filtered.equalsIgnoreCase("REAL") || 
						txt_filtered.equalsIgnoreCase("INTEGER") || txt_filtered.equalsIgnoreCase("LOGICAL") || 
						txt_filtered.equalsIgnoreCase("BOOLEAN") || txt_filtered.equalsIgnoreCase("STRING") || 
						txt_filtered.equalsIgnoreCase("BINARY")){
					// primarytypes like REAL/INTEGER/STRING/...
					System.out.println("Filtering : " + txt + " -> " + txt_filtered);
					new PrimaryTypeVO(formatClassName(txt_filtered));
					TypeVO type = types.get(txt_filtered);
					
					if (type == null) {
						type = new TypeVO(txt_filtered,
								"CLASS");
					}
					current_entity.getAttributes().add(
							new AttributeVO(tmp_entity_name, type, is_array, is_set, is_list,
									is_listoflist, tmp_mincard, tmp_maxcard,
									tmp_listoflist_mincard, tmp_listoflist_maxcard,
									is_optional));
					state = ENTITY_STATE;
				}
				else{
					TypeVO type = types.get(tmp_entity_type);
					
					if (type == null) {
						type = new TypeVO(txt.substring(0, txt.length() - 1),
								"CLASS");
					}
					current_entity.getAttributes().add(
							new AttributeVO(tmp_entity_name, type, is_array, is_set, is_list,
									is_listoflist, tmp_mincard, tmp_maxcard,
									tmp_listoflist_mincard, tmp_listoflist_maxcard,
									is_optional));
					state = ENTITY_STATE;
				}
			}
			break;

		// 2.2 SUBTYPE
		case ENTITY_SUBTYPE_STATE:
			if (txt.equalsIgnoreCase("OF"))
				state = ENTITY_SUBTYPE_OF_STATE;
			else
				state = ENTITY_STATE;
			break;

		case ENTITY_SUBTYPE_OF_STATE:
			current_entity.setSuperclass(filter_extras(txt));

			state = ENTITY_STATE;
			break;

		// 2.3 SUPERTYPE
		case ENTITY_SUPERTYPE:
			if (txt.equalsIgnoreCase("END_ENTITY;")) {
				state = INIT_STATE;
			} else if (txt.equalsIgnoreCase("SUBTYPE")) {
				state = ENTITY_SUBTYPE_STATE;
			} else if (txt.equalsIgnoreCase("(ONEOF")) {
				state = ENTITY_SUPERTYPE_OF_ONEOF;
				current_sibling_set = new HashSet<String>();
			} else {
				if (txt.contains(";"))
					state = ENTITY_STATE;
			}
			break;

		case ENTITY_SUPERTYPE_OF_ONEOF:
			if (txt.equalsIgnoreCase("END_ENTITY;")) {
				state = INIT_STATE;
			} else if (txt.equalsIgnoreCase("SUBTYPE")) {
				state = ENTITY_SUBTYPE_STATE;
			} else {
				if (txt.contains(";")) {
					current_entity.setSubClassList(current_sibling_set);
					state = ENTITY_STATE;
				}
				if (txt.contains(")")) {
					current_entity.setSubClassList(current_sibling_set);
					state = ENTITY_STATE;
				}
				String sibstr = filter_extras(txt);
				current_sibling_set.add(sibstr);
				Set<String> s = this.siblings.get(sibstr);
				if (s != null)
					System.err.println("DUPLICATE: " + sibstr);
				else
					this.siblings.put(sibstr, current_sibling_set);
			}
			break;

		// 2.4 INVERSE
		case ENTITY_INVERSE_STATE:
			is_set = false;
			tmp_inverse_mincard = 0;
			tmp_inverse_maxcard = -1;
			if (txt.equalsIgnoreCase("WHERE")) {
				state = ENTITY_WHERE;
			} else if (txt.equalsIgnoreCase("END_ENTITY;")) {
				state = INIT_STATE;
			} else if (txt.equalsIgnoreCase("SUBTYPE")) {
				state = ENTITY_SUBTYPE_STATE;
			} else if (txt.equalsIgnoreCase(":")) {
				// the name of the inverse attribute
				state = ENTITY_INVERSE_SET_OF;
			} else
				tmp_inverse_name = ExpressReader.formatProperty(txt, false);
			break;

		case ENTITY_INVERSE_SET_OF:
			if (txt.equalsIgnoreCase("END_ENTITY;")) {
				state = INIT_STATE;
			} else if (txt.equalsIgnoreCase("SUBTYPE")) {
				state = ENTITY_SUBTYPE_STATE;
			} else if (txt.equalsIgnoreCase("SET")) {
				is_set = true;
			} else if (txt.equalsIgnoreCase("FOR")) {
				state = ENTITY_INVERSE_FOR;
			} else {
				if (txt.startsWith("[") && txt.endsWith("]")) {
					String[] tempCards = txt.split(":");
					String mincard = txt.split(":")[0].substring(1);
					String maxcard = txt.split(":")[1].substring(0,
							tempCards[1].length() - 1);
					if (!mincard.equalsIgnoreCase("?"))
						tmp_inverse_mincard = Integer.parseInt(mincard);
					if (!maxcard.equalsIgnoreCase("?"))
						tmp_inverse_maxcard = Integer.parseInt(maxcard);
				}
				tmp_inverse_classnamerange = txt;
			}
			break;

		case ENTITY_INVERSE_FOR:
			if (txt.equalsIgnoreCase("END_ENTITY;")) {
				state = INIT_STATE;
			} else if (txt.equalsIgnoreCase("SUBTYPE")) {
				state = ENTITY_SUBTYPE_STATE;
			} else if (txt.contains(";")) {
				tmp_inverse_inverseprop = txt.substring(0, txt.length() - 1);
				current_entity.getInverses().add(
						new InverseVO(tmp_inverse_name,
								tmp_inverse_classnamerange,
								tmp_inverse_inverseprop, is_set,
								tmp_inverse_mincard, tmp_inverse_maxcard));
				state = ENTITY_INVERSE_STATE;
			}
			break;

		// 2.5 UNIQUE RESTRICTIONS
		case ENTITY_UNIQUE:
			if (txt.equals(":"))
				state = ENTITY_UNIQUE_TYPE;
			else if (txt.equalsIgnoreCase("END_ENTITY;")) {
				state = INIT_STATE;
			} else if (txt.equalsIgnoreCase("WHERE")) {
				state = INIT_STATE;
			} else if (txt.equalsIgnoreCase("SUBTYPE")) {
				state = ENTITY_SUBTYPE_STATE;
			}
			break;

		case ENTITY_UNIQUE_TYPE:
			if (txt.equalsIgnoreCase("END_ENTITY;")) {
				state = INIT_STATE;
			} else if (txt.equalsIgnoreCase("WHERE")) {
				state = INIT_STATE;
			} else if (txt.equalsIgnoreCase("SUBTYPE")) {
				state = ENTITY_SUBTYPE_STATE;
			} else {
				if (!txt.contains(",")) {
					String unique_attribute = txt
							.substring(0, txt.length() - 1);

					for (int j = 0; j < current_entity.getAttributes().size(); j++) {
						AttributeVO ao = current_entity.getAttributes().get(j);
						if (ao.getName().equals(unique_attribute)) {
							ao.setUnique(true);
						}
					}
				}
				state = ENTITY_UNIQUE;
			}
			break;

		// 2.6 UNHANLDED WHERE AND DERIVE LINES
		case ENTITY_WHERE:
			// not parsed
			if (txt.equalsIgnoreCase("END_ENTITY;")) {
				state = INIT_STATE;
			} else if (txt.equalsIgnoreCase("SUBTYPE")) {
				state = ENTITY_SUBTYPE_STATE;
			}
			break;

		case ENTITY_DERIVE:
			// not parsed
			if (txt.equalsIgnoreCase("END_ENTITY;")) {
				state = INIT_STATE;
			} else if (txt.equalsIgnoreCase("SUBTYPE")) {
				state = ENTITY_SUBTYPE_STATE;
			} else if (txt.equalsIgnoreCase("INVERSE")) {
				state = ENTITY_INVERSE_STATE;
			}
			break;

		default:
			// Do nothing
		}
	}

	static public String filter_extras(String txt) {
		StringBuffer sb = new StringBuffer();
		for (int n = 0; n < txt.length(); n++) {
			char ch = txt.charAt(n);
			switch (ch) {
			case '(':
				break;
			case ';':
				break;
			case ',':
				break;
			case ')':
				break;
			default:
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	
	static public String filter_PTypeExtras(String txt) {
		StringBuffer sb = new StringBuffer();
		for (int n = 0; n < txt.length(); n++) {
			char ch = txt.charAt(n);
			switch (ch) {
			case '0':
				break;
			case '1':
				break;
			case '2':
				break;
			case '3':
				break;
			case '4':
				break;
			case '5':
				break;
			case '6':
				break;
			case '7':
				break;
			case '8':
				break;
			case '9':
				break;
			case '(':
				break;
			case ';':
				break;
			case ',':
				break;
			case ')':
				break;
			default:
				sb.append(ch);
			}
		}
		return sb.toString();
	}

	private void parse_level(String txt) {
		StringTokenizer st = new StringTokenizer(txt);
		while (st.hasMoreTokens()) {
			state_machine(st.nextToken());
		}
	}

	public static boolean isAllUpper(String s) {
		for (char c : s.toCharArray()) {
			if (Character.isLetter(c) && Character.isLowerCase(c)) {
				return false;
			}
		}
		return true;
	}

	private void unpackSelectTypes() {
		// if a select type is referred to by another select type -> replace it
		// by the elements of the latter!
		for (Map.Entry<String, TypeVO> entry : types.entrySet()) {
			TypeVO vo = entry.getValue();
			for (int n = 0; n < vo.getSelect_entities().size(); n++) {
				String selectEnt = vo.getSelect_entities().get(n);
				for (int i = 0; i < selectTypesToExpand_temp.size(); i++) {
					if (selectTypesToExpand_temp.get(i).getName()
							.equalsIgnoreCase(selectEnt)) {
						selectTypesToExpand.put(selectTypesToExpand_temp.get(i),vo);
					}
				}
			}
		}
	}

	// ACCESSORS
	public Map<String, TypeVO> getTypes() {
		return types;
	}

	public void setTypes(Map<String, TypeVO> types) {
		this.types = types;
	}

	public Map<String, EntityVO> getEntities() {
		return entities;
	}

	public void setEntities(Map<String, EntityVO> entities) {
		this.entities = entities;
	}
}
