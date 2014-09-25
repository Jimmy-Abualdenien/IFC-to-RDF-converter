package org.buildingsmart.vo;

import java.util.ArrayList;
import java.util.List;

public class PrimaryTypeVO {

	private String pTypeName;
	private static List<PrimaryTypeVO> listOfPrimaryTypes = new ArrayList<PrimaryTypeVO>();
	
	public PrimaryTypeVO() {
		//unused
	}

	public PrimaryTypeVO(String pTypeName) {
		if(pTypeName.endsWith(";"))
			pTypeName = pTypeName.substring(0, pTypeName.length()-1);
		if(getPrimaryTypeVO(pTypeName)==null){
			this.pTypeName = pTypeName;
			listOfPrimaryTypes.add(this);
		}
	}
	
	
	
	private static PrimaryTypeVO getPrimaryTypeVO(String PTypeName){
		for (PrimaryTypeVO pt : listOfPrimaryTypes){
			if (pt.pTypeName.equalsIgnoreCase(PTypeName)) return pt;
		}
		return null;
	}

	public String getPTypeName(){ return pTypeName;}
	
	public static List<PrimaryTypeVO> getListOfPrimaryTypes(){return listOfPrimaryTypes;}
	
	public String getXSDType(){
		if(pTypeName.equalsIgnoreCase("REAL")) return "double";
		else if(pTypeName.equalsIgnoreCase("BINARY")) return "string";
		else if(pTypeName.equalsIgnoreCase("BOOLEAN")) return "boolean";
		else if(pTypeName.equalsIgnoreCase("INTEGER")) return "integer";
		else if(pTypeName.equalsIgnoreCase("NUMBER")) return "integer";
		else if(pTypeName.equalsIgnoreCase("STRING")) return "string";
		else if(pTypeName.equalsIgnoreCase("STRING(22)")) return "string";
		else if(pTypeName.equalsIgnoreCase("STRING(255)")) return "string";
		else if(pTypeName.equalsIgnoreCase("LOGICAL")) return "boolean";
		return "XSDTYPE";
	}
}
