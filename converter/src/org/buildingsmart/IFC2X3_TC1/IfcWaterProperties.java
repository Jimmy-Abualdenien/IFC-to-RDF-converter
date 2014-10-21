package org.buildingsmart.IFC2X3_TC1;
import org.buildingsmart.*;
import java.util.*;

/*
 * IFC Java class
/ *
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

public class IfcWaterProperties extends IfcMaterialProperties 
{
	// The property attributes
	private Boolean IsPotable;
	private IfcIonConcentrationMeasure Hardness;
	private IfcIonConcentrationMeasure AlkalinityConcentration;
	private IfcIonConcentrationMeasure AcidityConcentration;
	private IfcNormalisedRatioMeasure ImpuritiesContent;
	private IfcPHMeasure PHLevel;
	private IfcNormalisedRatioMeasure DissolvedSolidsContent;


	// Getters and setters of properties
	public Boolean getIsPotable() {
		return IsPotable;
	}

	public void setIsPotable(Boolean value){
		this.IsPotable=value;
	}

	public IfcIonConcentrationMeasure getHardness() {
		return Hardness;
	}

	public void setHardness(IfcIonConcentrationMeasure value){
		this.Hardness=value;
	}

	public IfcIonConcentrationMeasure getAlkalinityConcentration() {
		return AlkalinityConcentration;
	}

	public void setAlkalinityConcentration(IfcIonConcentrationMeasure value){
		this.AlkalinityConcentration=value;
	}

	public IfcIonConcentrationMeasure getAcidityConcentration() {
		return AcidityConcentration;
	}

	public void setAcidityConcentration(IfcIonConcentrationMeasure value){
		this.AcidityConcentration=value;
	}

	public IfcNormalisedRatioMeasure getImpuritiesContent() {
		return ImpuritiesContent;
	}

	public void setImpuritiesContent(IfcNormalisedRatioMeasure value){
		this.ImpuritiesContent=value;
	}

	public IfcPHMeasure getPHLevel() {
		return PHLevel;
	}

	public void setPHLevel(IfcPHMeasure value){
		this.PHLevel=value;
	}

	public IfcNormalisedRatioMeasure getDissolvedSolidsContent() {
		return DissolvedSolidsContent;
	}

	public void setDissolvedSolidsContent(IfcNormalisedRatioMeasure value){
		this.DissolvedSolidsContent=value;
	}

}
