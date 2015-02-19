package org.buildingsmart;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.buildingsmart.vo.EntityVO;
import org.buildingsmart.vo.IFCVO;
import org.buildingsmart.vo.PrimaryTypeVO;
import org.buildingsmart.vo.TypeVO;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.ontology.OntResource;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.ResourceFactory;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;
import com.hp.hpl.jena.vocabulary.RDFS;

/*
 * IFCtoRDFConverter is the final interface for this code. Through this class, one is able to submit an IFC file and the EXPRESS schema it follows so that
 * a corresponding IFC/RDF graph can be built.
 * 
 * The usage:
 * IFCtoRDFConverter converter = new IFCtoRDFConverter(file name);
 *   
 * @author Jyrki Oraskari
 * @author of modifications Pieter Pauwels (pipauwel.pauwels@ugent.be / pipauwel@gmail.com)
 */

/*
 * The GNU Affero General Public License
 * 
 * Copyright (c) 2014, 2015 Jyrki Oraskari (Jyrki.Oraskari@aalto.fi / rkiorri@gmail.com)
 * Copyright (c) 2015 Pieter Pauwels (pipauwel.pauwels@ugent.be / pipauwel@gmail.com)
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


public class IfcConvertor {

	//input variables
	private String baseURI;
	private String ontURI;
	private String ontNS;
	
	//EXPRESS basis
	private Map<String, EntityVO> ent;
	private Map<String, TypeVO> typ;
	
	//conversion variables
	private int IDcounter = 0;	
	private Map<Long, IFCVO> linemap = new HashMap<Long, IFCVO>();
	private Model im;
	private InputStream inputStream;
	private OntModel ontModel;
	
	// Taking care of avoiding duplicate resources
	private Map<String,Resource> resource_map=new HashMap<String,Resource>();  
	
	public IfcConvertor(OntModel ontModel, ExpressReader expressReader, InputStream inputStream, String baseURI){
		this.ontModel = ontModel;
		this.inputStream = inputStream;
		this.baseURI = baseURI;
		
		//PREPARATION
		ent = expressReader.getEntities();
		typ = expressReader.getTypes();
		ontURI = "http://www.buildingsmart-tech.org/ifcOWL";
		ontNS = ontURI + "#";
	}

	public Model parseModel(){
		//setup models
		im = ModelFactory.createDefaultModel();
		im.setNsPrefix("ifcowl", ontNS);
		im.setNsPrefix("inst", baseURI);
		
		//Read the whole file into a linemap Map object
		System.out.println("start to read model");
		readModel();	
		
//		Model modelInMem = ModelFactory.createDefaultModel();
//		modelInMem.add(om);
//
//		Iterator it = GraphUtil.findAll(modelInMem.getGraph());
//		while (it.hasNext()) {
//		   System.out.println("triple from OntModel " + it.next().toString());
//		}

		System.out.println("ended reading model");
		System.out.println("started mapEntries");
		//map entries of the linemap Map object to the ontology Model and make new instances in the model	
		mapEntries();		
		System.out.println("ended mapEntries");
		System.out.println("started createInstances");
		createInstances();
		System.out.println("ended createInstances");
		
		// Save memory
		linemap.clear();
		linemap = null;
		System.gc();
		
		return im;
	}
	
	private void readModel() {
		try {
			DataInputStream in = new DataInputStream(inputStream);
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
		LinkedList<Object> current = ifcvo.getObjectList();
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
			for (int i = 0; i < vo.getObjectList().size(); i++) {
				Object o = vo.getObjectList().get(i);
				if (String.class.isInstance(o)) {
					String s = (String) o;
					if (s.length() < 1)
						continue;
					if (s.charAt(0) == '#') {
						Object or = linemap.get(toLong(s.substring(1)));
						vo.getObjectList().set(i, or);
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
	
	private void createInstances(){		
		for (Map.Entry<Long, IFCVO> entry : linemap.entrySet()) {
			IFCVO ifc_lineEntry = entry.getValue();	
			String typeName = ent.get(ifc_lineEntry.getName()).getName();			
			OntClass cl = ontModel.getOntClass(ontNS + typeName);
			Resource r = im.createResource(baseURI + typeName + "_" + ifc_lineEntry.getLine_num(), cl);
			
			fillProperties(ifc_lineEntry, r, cl);
		}
		// The map is used only to avoid duplicates.
		// So, it can be cleared here
		resource_map.clear();
	}
	
	TypeVO typeremembrance = null;
	@SuppressWarnings("unchecked")
	private void fillProperties(IFCVO ifc_lineEntry,Resource r, OntClass cl) {		
	
		EntityVO evo = ent.get(ExpressReader.formatClassName(ifc_lineEntry.getName()));
		if (evo == null)
			System.err.println("Does not exist: " + ifc_lineEntry.getName());
	
		final String subject = evo.getName() + "_" + ifc_lineEntry.getLine_num();
	
		typeremembrance = null;
		int attribute_pointer = 0;
		for (Object o: ifc_lineEntry.getObjectList()) {
			
			if (String.class.isInstance(o)) {
				attribute_pointer = fillProperties_handleStringObject(r, evo,
						subject, attribute_pointer, o);
			} else if (IFCVO.class.isInstance(o)) {
				attribute_pointer = fillProperties_handleIFC_Object(r,
						evo, attribute_pointer, o);
			} else if (LinkedList.class.isInstance(o)) {
				attribute_pointer = fillProperties_handleListObject(r, evo,
						attribute_pointer, o);
			}	
		}
	}

	private int fillProperties_handleStringObject(Resource r, EntityVO evo,
			String subject, int attribute_pointer, Object o) {
		if (!((String) o).equals("$") && !((String) o).equals("*")) { 
	
			if (typ.get(ExpressReader.formatClassName((String) o)) == null) {
				if ((evo != null)
						&& (evo.getDerived_attribute_list() != null)
						&& (evo.getDerived_attribute_list().size() > attribute_pointer)) {
	
					final String propURI = ontNS + evo.getDerived_attribute_list().get(attribute_pointer).getName();
					final String literalString = filter_extras((String) o);					
	
					OntProperty p = ontModel.getOntProperty(propURI);
					OntResource range = p.getRange();
					if(range.isClass()){
						if(range.asClass().hasSuperClass(ontModel.getOntClass(ontNS + "ENUMERATION"))){
							addEnumProperty(r,p,range,literalString);
						}								
						//Check for SELECT
						else if(range.asClass().hasSuperClass(ontModel.getOntClass(ontNS + "SELECT"))){
							System.out.println("1 - WARNING TODO: found SELECT property: " + p + " - " + range.getLocalName() + " - " + literalString);
						}									
						else if(range.asClass().hasSuperClass(ontModel.getOntClass(ontNS + "List"))){
							System.out.println("1a - WARNING TODO: found LIST property: " + subject + " -- " + p + " - " + range.getLocalName() + " - " + literalString);
						}	
						else {
	
							String xsdType = getXSDTypeFromRange(range);
							if(xsdType!=null){
								OntProperty valueProp = ontModel.getOntProperty(ontNS + "has_" + xsdType);
								
								// Create only when needed...
								String key=valueProp.toString()+":"+xsdType+":"+literalString;
								Resource r1 = resource_map.get(key);
								if(r1==null)
								{
								 r1 = im.createResource(baseURI + range.getLocalName() + "_" + IDcounter, range.asResource());
								 IDcounter++;
								 resource_map.put(key,r1);
								 addLiteralToResource(r1,valueProp,xsdType,literalString);
								}
								r.addProperty(p, r1);

							}
							else{
								System.out.println("1b - WARNING TODO: this should not happen for: " + p + " - " + range.getLocalName() + " - " + literalString);
							}
						}									
					}
					else {
						System.out.println("5 - WARNING: found other kind of property: " + p + " - " + range.getLocalName());									
					}
				}
				attribute_pointer++;
			}
			else{
				typeremembrance = typ.get(ExpressReader.formatClassName((String) o));
			}
		} else
			attribute_pointer++;
		return attribute_pointer;
	}

	private int fillProperties_handleIFC_Object(Resource r, EntityVO evo,
			int attribute_pointer, Object o) {
		if ((evo != null)
				&& (evo.getDerived_attribute_list() != null)
				&& (evo.getDerived_attribute_list().size() > attribute_pointer)) {
			final String propURI = ontNS + evo.getDerived_attribute_list().get(attribute_pointer).getName();
			EntityVO evorange = ent.get(ExpressReader.formatClassName(((IFCVO)o).getName()));

			OntProperty p = ontModel.getOntProperty(propURI);
			OntResource rclass = ontModel.getOntResource(evorange.getName());

			Resource r1 = im.getResource(baseURI + evorange.getName() + "_" + ((IFCVO) o).getLine_num());
			if(r1 == null)
				r1 = im.createResource(baseURI + evorange.getName() + "_" + ((IFCVO) o).getLine_num(), rclass);
			r.addProperty(p, r1);								
		} 
		attribute_pointer++;
		return attribute_pointer;
	}

	private int fillProperties_handleListObject(Resource r, EntityVO evo,
			int attribute_pointer, Object o) {
		@SuppressWarnings("unchecked")
		final LinkedList<Object> tmp_list = (LinkedList<Object>) o;
		LinkedList<String> literals=new LinkedList<String>();
		

//				if(tmp_list.size()==0)
//					attribute_pointer++;
		
		//process list
		for (int j = 0; j < tmp_list.size(); j++) {
			Object o1 = tmp_list.get(j);
			if (String.class.isInstance(o1)) {
				if (typ.get(ExpressReader.formatClassName((String) o1)) != null && typeremembrance==null) {
					typeremembrance = typ.get(ExpressReader.formatClassName((String) o1));	
				}
				else{
					literals.add(filter_extras((String) o1));
				}
			}
			if (IFCVO.class.isInstance(o1)) {
				if ((evo != null)
						&& (evo.getDerived_attribute_list() != null)
						&& (evo.getDerived_attribute_list().size() > attribute_pointer)) {

					String propURI = evo.getDerived_attribute_list().get(attribute_pointer).getName();
					OntProperty p = ontModel.getOntProperty(ontNS + propURI);
					OntResource typerange = p.getRange();

					if(typerange.asClass().hasSuperClass(ontModel.getOntClass(ontNS + "List"))){
						String listvaluepropURI = ontNS + typerange.getLocalName().substring(0, typerange.getLocalName().length()-5);	
						OntResource listrange = ontModel.getOntResource(listvaluepropURI);

						if(listrange.asClass().hasSuperClass(ontModel.getOntClass(ontNS + "List"))){
							System.out.println("6 - WARNING: Found unhandled ListOfList");
						}													
						else{
							fillClassInstanceList(tmp_list, typerange, p, r);
							j = tmp_list.size()-1;
						}
					}					
					else{
						EntityVO evorange = ent.get(ExpressReader.formatClassName(((IFCVO)o1).getName()));								
						OntResource rclass = ontModel.getOntResource(ontNS + evorange.getName());

						Resource r1 = im.getResource(baseURI + evorange.getName() + "_" + ((IFCVO) o1).getLine_num());
						if(r1 == null)
							r1 = im.createResource(baseURI + evorange.getName() + "_" + ((IFCVO) o1).getLine_num(), rclass);
						r.addProperty(p, r1);									
					}
				}
			}
			if(LinkedList.class.isInstance(o1) && typeremembrance != null){
				LinkedList<Object> tmp_list_inlist = (LinkedList<Object>) o1;
				for(int jj = 0; jj<tmp_list_inlist.size(); jj++){
					Object o2 = tmp_list_inlist.get(jj);
					if(String.class.isInstance(o2)){
						literals.add(filter_extras((String) o2));
					}
				}
			}
		}

		//interpret parse
		if (literals.size() > 0) {
			if(typeremembrance != null){
				if ((evo != null)
						&& (evo.getDerived_attribute_list() != null)
						&& (evo.getDerived_attribute_list().size() > attribute_pointer)) {				

					String propURI = ontNS + evo.getDerived_attribute_list().get(attribute_pointer).getName();
					OntProperty p = ontModel.getOntProperty(propURI);

					addSinglePropertyFromTypeRemembrance(r, p, literals.getFirst(), typeremembrance);
				}
				typeremembrance = null;
			}
			else if ((evo != null)
					&& (evo.getDerived_attribute_list() != null)
					&& (evo.getDerived_attribute_list().size() > attribute_pointer)) {						
				String propURI = ontNS + evo.getDerived_attribute_list().get(attribute_pointer).getName();
				OntProperty p = ontModel.getOntProperty(propURI);

				addRegularListProperty(r, p, literals);
				
			}
		}
		attribute_pointer++;
		return attribute_pointer;
	}

	private void addSinglePropertyFromTypeRemembrance(Resource r, OntProperty p, String literalString, TypeVO typeremembrance){				
		OntResource range = ontModel.getOntResource(ontNS + typeremembrance.getName());
		
		if(range.isClass()){
			//Check for ENUM
			if(range.asClass().hasSuperClass(ontModel.getOntClass(ontNS + "ENUMERATION"))){
				addEnumProperty(r,p,range,literalString);									
			}								
			//Check for SELECT
			else if(range.asClass().hasSuperClass(ontModel.getOntClass(ontNS + "SELECT"))){
				System.out.println("9 - WARNING TODO: found SELECT property: " + p + " - " + range.getLocalName() + " - " + literalString);
			}								
			else {
				String xsdType = getXSDTypeFromRange(range);
				if(xsdType!=null){
					OntProperty valueProp = ontModel.getOntProperty(ontNS + "has_" + xsdType);	
					String key=valueProp.toString()+":"+xsdType+":"+literalString;
					
					Resource r1 = resource_map.get(key);
					if(r1==null)
					{
					 r1 = im.createResource(baseURI + typeremembrance.getName() + "_" + IDcounter, range);
					 IDcounter++;
					 resource_map.put(key,r1);
					 addLiteralToResource(r1,valueProp,xsdType,literalString);
					}
					r.addProperty(p, r1);
					
				}
			}									
		}
		else {
			System.out.println("12 - WARNING: found other kind of property: " + p + " - " + range.getLocalName());									
		}
	}
	
	private String getXSDTypeFromRange(OntResource range){	
		if(range.asClass().getSuperClass()!=null && range.asClass().getSuperClass().getLocalName()!=null){
			if(PrimaryTypeVO.getPrimaryTypeVO(range.asClass().getSuperClass().getLocalName()) != null){
				return PrimaryTypeVO.getPrimaryTypeVO(range.asClass().getSuperClass().getLocalName()).getXSDType();
			}
			else if(TypeVO.checkIfType(range.asClass().getSuperClass().getLocalName())){
				//regular property that is likely two 'levels' deep...
				if(range.asClass().getSuperClass().getSuperClass()!=null && range.asClass().getSuperClass().getSuperClass().getLocalName()!=null){
					return PrimaryTypeVO.getPrimaryTypeVO(range.asClass().getSuperClass().getSuperClass().getLocalName()).getXSDType();
				}
				else{
					System.out.println("WARNING A: did not find XSDType for : " + range.getLocalName());	
					return null;
				}
			}
			else {
				System.out.println("WARNING B: did not find XSDType for : " + range.getLocalName());
				return null;
			}
		}
		else if(PrimaryTypeVO.getPrimaryTypeVO(range.getLocalName()) != null){
			return PrimaryTypeVO.getPrimaryTypeVO(range.asClass().getLocalName()).getXSDType();
		}	
		else {
			//likely, the range of this property is an abstract class (
			
			System.out.println("WARNING C: did not find XSDType for : " + range.getLocalName());
			return null;
		}	
	}
	
	private void addEnumProperty(Resource r, Property p, OntResource range, String literalString){
		for (ExtendedIterator<? extends OntResource> instances = range.asClass().listInstances(); instances.hasNext(); ) {
            OntResource rangeInstance = instances.next();
            if( rangeInstance.getProperty(RDFS.label).getString().equalsIgnoreCase(filter_points(literalString))){
            	im.add(im.createStatement(r, p, rangeInstance));							            	
            	//System.out.println( "OK: added statement " + p + " - " + rangeInstance.getLocalName());
            	break;
            }
		}
	}
	
	private void addLiteralToResource(Resource r1, OntProperty valueProp, String xsdType, String literalString){
		if(xsdType.equalsIgnoreCase("integer"))
			r1.addLiteral(valueProp, ResourceFactory.createTypedLiteral(literalString, XSDDatatype.XSDinteger));	
		else if(xsdType.equalsIgnoreCase("double"))
			r1.addLiteral(valueProp, ResourceFactory.createTypedLiteral(literalString, XSDDatatype.XSDdouble));	
		else if(xsdType.equalsIgnoreCase("hexBinary"))
			r1.addLiteral(valueProp, ResourceFactory.createTypedLiteral(literalString, XSDDatatype.XSDhexBinary));	
		else if(xsdType.equalsIgnoreCase("boolean")){
			if(literalString.equalsIgnoreCase(".F."))
				r1.addLiteral(valueProp, ResourceFactory.createTypedLiteral("false", XSDDatatype.XSDboolean));	
			else if(literalString.equalsIgnoreCase(".T."))
					r1.addLiteral(valueProp, ResourceFactory.createTypedLiteral("true", XSDDatatype.XSDboolean));
			else
				System.out.println("4 - WARNING: found odd boolean value: " + literalString);
		}
		else if(xsdType.equalsIgnoreCase("string"))
			r1.addLiteral(valueProp, ResourceFactory.createTypedLiteral(literalString, XSDDatatype.XSDstring));	
		else
			r1.addLiteral(valueProp, ResourceFactory.createTypedLiteral(literalString));
	}
	
	//LIST HANDLING
	private void addRegularListProperty(Resource r, OntProperty p, List<String> el){
		
		OntResource range = p.getRange();
		if(range.isClass()){
			OntResource listrange = getListContentType(range.asClass());
			
			if(listrange.asClass().hasSuperClass(ontModel.getOntClass(ontNS + "List"))){
				System.out.println("14 - WARNING: Found unhandled ListOfList");
			}	
			else{
				List<Resource> reslist = new ArrayList<Resource>();
				//createrequirednumberofresources
				for(int ii = 0; ii<el.size();ii++){	
					Resource r1 = im.createResource(baseURI + range.getLocalName() + "_" + IDcounter, range.asResource());
					reslist.add(r1);
					IDcounter++;
					if(ii==0){
						r.addProperty(p, r1);
						//System.out.println("OK: added property: " + r.getLocalName() + " - " + p.getLocalName() + " - " + r1.getLocalName());		
					}
				}	
				//bindtheproperties
				AddListInstanceProperties(reslist,el,listrange);	
			}
		}
	}
	
	private List<String> getListElements(String literalString){
		String[] elements = literalString.split("_, ");
		List<String> el = new ArrayList<String>();
		for(String element : elements){
			if(element.startsWith("_") && element.endsWith("_"))
				System.out.println("WARNING getListElements(): Found list of enumerations");
			if(element.contains("_")){
				System.out.println("WARNING getListElements(): Found '_' in list elements");
				element = element.replaceAll("_", "");
			}
			el.add(element);
		}
		return el;
	}
	
	private OntResource getListContentType(OntClass range){
		if(range.hasSuperClass(ontModel.getOntClass(ontNS + "List"))){
			String listvaluepropURI = ontNS + range.getLocalName().substring(0, range.getLocalName().length()-5);	
			return ontModel.getOntResource(listvaluepropURI);
		}
		
		OntClass cl = range.asClass().getSuperClass();
		if(cl==null)
			return null;
		else{
			return getListContentType(cl);
		}
	}
	
	private void fillClassInstanceList(LinkedList<Object> tmp_list, OntResource typerange, OntProperty p, Resource r){
		List<Resource> reslist = new ArrayList<Resource>();
		List<IFCVO> entlist = new ArrayList<IFCVO>();
		
		//createrequirednumberofresources
		for (int i = 0; i < tmp_list.size(); i++) {
			if (IFCVO.class.isInstance(tmp_list.get(i))) {
				Resource r1 = im.createResource(
						baseURI + typerange.getLocalName() + "_" + IDcounter,
						typerange);
				reslist.add(r1);
				IDcounter++;
				entlist.add((IFCVO)tmp_list.get(i));
				if (i == 0) {
					r.addProperty(p, r1);
				}
			}
		}	
		
		//bindtheproperties
		String listvaluepropURI = ontNS + typerange.getLocalName().substring(0, typerange.getLocalName().length()-5);	
		OntResource listrange = ontModel.getOntResource(listvaluepropURI);
		
		AddClassInstanceListProperties(reslist,entlist,listrange);
	}
	
	private void AddClassInstanceListProperties(List<Resource> reslist, List<IFCVO> entlist, OntResource listrange){
		OntProperty listp = ontModel.getOntProperty(ontNS + "hasListContent");
		OntProperty isfollowed = ontModel.getOntProperty(ontNS + "isFollowedBy");
		
		for(int i = 0; i<reslist.size();i++){	
			Resource r = reslist.get(i);					
			
			EntityVO evorange = ent.get(ExpressReader.formatClassName(entlist.get(i).getName()));									
			OntResource rclass = ontModel.getOntResource(ontNS + evorange.getName());
			
			Resource r1 = im.getResource(baseURI + evorange.getName() + "_" + entlist.get(i).getLine_num());
			if(r1 == null)
				r1 = im.createResource(baseURI + evorange.getName() + "_" + entlist.get(i).getLine_num(), rclass);
			r.addProperty(listp, r1);			
																
			if(i<reslist.size()-1){								
				r.addProperty(isfollowed,reslist.get(i+1));
				//System.out.println("OK: created class property: " + r.getLocalName() + " - " + isfollowed.getLocalName() + " - " + reslist.get(i+1).getLocalName());
			}	
		}
	}
	
	private void AddListInstanceProperties(List<Resource> reslist, List<String> listelements, OntResource listrange){		
		//GetListType
		String xsdType = getXSDTypeFromRange(listrange);
		if(xsdType!=null){
			OntProperty valueProp = ontModel.getOntProperty(ontNS + "has_" + xsdType);	
			//Adding Content only if found
			for(int i = 0; i<reslist.size();i++){	
				Resource r = reslist.get(i);
				String literalString = listelements.get(i);
				String key=valueProp.toString()+":"+xsdType+":"+literalString;
				Resource r2 = resource_map.get(key);
				if(r2==null)
				{
					r2 = im.createResource(baseURI + listrange.getLocalName() + "_" + IDcounter, listrange.asResource());
					IDcounter++;
					resource_map.put(key,r2);
					addLiteralToResource(r2,valueProp,xsdType,literalString);
				}
				r.addProperty(ontModel.getOntProperty(ontNS + "hasListContent"), r2);

				if(i<listelements.size()-1){								
					r.addProperty(ontModel.getOntProperty(ontNS + "isFollowedBy"),reslist.get(i+1));
					//System.out.println("OK: added property: " + r.getLocalName() + " - " + isfollowed.getLocalName() + " - " + reslist.get(i+1).getLocalName());
				}	
			}
		}	
		else
			return;
	}
	
	// HELPER METHODS
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

	private String filter_points(String txt) {
		StringBuffer sb = new StringBuffer();
		for (int n = 0; n < txt.length(); n++) {
			char ch = txt.charAt(n);
			switch (ch) {
			case '.':
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
}
