package org.buildingsmart.vo;

import java.util.ArrayList;
import java.util.List;

public class PrimaryTypeVO {

	private String pTypeName;
	private static List<PrimaryTypeVO> listOfPrimaryTypes = new ArrayList<PrimaryTypeVO>();
	private String XSDType;
	
	public PrimaryTypeVO() {
		//unused
	}

	public PrimaryTypeVO(String pTypeName) {
		if(pTypeName.endsWith(";"))
			pTypeName = pTypeName.substring(0, pTypeName.length()-1);
		if(getPrimaryTypeVO(pTypeName)==null){
			this.pTypeName = pTypeName;
			this.setXSDType();
			listOfPrimaryTypes.add(this);
		}
	}	
	
	public static PrimaryTypeVO getPrimaryTypeVO(String PTypeName){
		for (PrimaryTypeVO pt : listOfPrimaryTypes){
			if (pt.pTypeName.equalsIgnoreCase(PTypeName)) return pt;
		}
		return null;
	}

	public String getPTypeName(){ return pTypeName;}
	
	public static List<PrimaryTypeVO> getListOfPrimaryTypes(){return listOfPrimaryTypes;}
	
	public String getXSDType(){
		if(pTypeName.equalsIgnoreCase("REAL")) return "double";
		else if(pTypeName.equalsIgnoreCase("BINARY")) return "hexBinary";
		else if(pTypeName.equalsIgnoreCase("BOOLEAN")) return "boolean";
		else if(pTypeName.equalsIgnoreCase("INTEGER")) return "integer";
		else if(pTypeName.equalsIgnoreCase("NUMBER")) return "integer";
		else if(pTypeName.equalsIgnoreCase("STRING")) return "string";
		else if(pTypeName.equalsIgnoreCase("STRING22")) return "string";
		else if(pTypeName.equalsIgnoreCase("STRING255")) return "string";
		else if(pTypeName.equalsIgnoreCase("LOGICAL")) return "boolean";
		return "XSDTYPE";
	}
	
	private void setXSDType(){
			if(pTypeName.equalsIgnoreCase("REAL")) XSDType = "double";
			else if(pTypeName.equalsIgnoreCase("BINARY")) XSDType = "hexBinary";
			else if(pTypeName.equalsIgnoreCase("BOOLEAN")) XSDType = "boolean";
			else if(pTypeName.equalsIgnoreCase("INTEGER")) XSDType = "integer";
			else if(pTypeName.equalsIgnoreCase("NUMBER")) XSDType = "integer";
			else if(pTypeName.equalsIgnoreCase("STRING")) XSDType = "string";
			else if(pTypeName.equalsIgnoreCase("STRING22")) XSDType = "string";
			else if(pTypeName.equalsIgnoreCase("STRING255")) XSDType = "string";
			else if(pTypeName.equalsIgnoreCase("LOGICAL")) XSDType = "boolean";
			else XSDType = "XSDTYPE";
	}
}
