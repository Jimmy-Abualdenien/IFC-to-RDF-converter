package org.buildingsmart.vo;

import java.util.ArrayList;
import java.util.List;

public class PrimaryTypeVO {

	private String pTypeName;
	private static List<PrimaryTypeVO> listOfPrimaryTypes = new ArrayList<PrimaryTypeVO>();
	private String XSDType;
	private String JAVAType;
	
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
		if(PTypeName.endsWith(";"))
			PTypeName = PTypeName.substring(0, PTypeName.length()-1);
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
		else if(pTypeName.equalsIgnoreCase("BINARY(32)")) return "hexBinary";
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
			else if(pTypeName.equalsIgnoreCase("BINARY(32)")) XSDType = "hexBinary";
			else if(pTypeName.equalsIgnoreCase("BOOLEAN")) XSDType = "boolean";
			else if(pTypeName.equalsIgnoreCase("INTEGER")) XSDType = "integer";
			else if(pTypeName.equalsIgnoreCase("NUMBER")) XSDType = "integer";
			else if(pTypeName.equalsIgnoreCase("STRING")) XSDType = "string";
			else if(pTypeName.equalsIgnoreCase("STRING22")) XSDType = "string";
			else if(pTypeName.equalsIgnoreCase("STRING255")) XSDType = "string";
			else if(pTypeName.equalsIgnoreCase("LOGICAL")) XSDType = "boolean";
			else XSDType = "XSDTYPE";
	}

	public String getJAVAType() {
		if(pTypeName.equalsIgnoreCase("REAL")) return "Double";
		else if(pTypeName.equalsIgnoreCase("BINARY")) return "org.apache.axis2.databinding.types.xsd.HexBinary";
		else if(pTypeName.equalsIgnoreCase("BINARY(32)")) return "org.apache.axis2.databinding.types.xsd.HexBinary";
		else if(pTypeName.equalsIgnoreCase("BOOLEAN")) return "Boolean";
		else if(pTypeName.equalsIgnoreCase("INTEGER")) return "Integer";
		else if(pTypeName.equalsIgnoreCase("NUMBER")) return "Integer";
		else if(pTypeName.equalsIgnoreCase("STRING")) return "String";
		else if(pTypeName.equalsIgnoreCase("STRING22")) return "String";
		else if(pTypeName.equalsIgnoreCase("STRING255")) return "String";
		else if(pTypeName.equalsIgnoreCase("LOGICAL")) return "Boolean";
		return "JAVAType";
	}

	public void setJAVAType() {
		if(pTypeName.equalsIgnoreCase("REAL")) JAVAType = "Double";
		else if(pTypeName.equalsIgnoreCase("BINARY(32)")) JAVAType = "org.apache.axis2.databinding.types.xsd.HexBinary";
		else if(pTypeName.equalsIgnoreCase("BINARY")) JAVAType = "org.apache.axis2.databinding.types.xsd.HexBinary";
		else if(pTypeName.equalsIgnoreCase("BOOLEAN")) JAVAType = "Boolean";
		else if(pTypeName.equalsIgnoreCase("INTEGER")) JAVAType = "Integer";
		else if(pTypeName.equalsIgnoreCase("NUMBER")) JAVAType = "Integer";
		else if(pTypeName.equalsIgnoreCase("STRING")) JAVAType = "String";
		else if(pTypeName.equalsIgnoreCase("STRING22")) JAVAType = "String";
		else if(pTypeName.equalsIgnoreCase("STRING255")) JAVAType = "String";
		else if(pTypeName.equalsIgnoreCase("LOGICAL")) JAVAType = "Boolean";
		else JAVAType = "JAVATypeTYPE";
	}
}
