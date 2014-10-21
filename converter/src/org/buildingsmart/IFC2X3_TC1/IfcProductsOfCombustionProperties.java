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

public class IfcProductsOfCombustionProperties extends IfcMaterialProperties 
{
	// The property attributes
	private IfcSpecificHeatCapacityMeasure SpecificHeatCapacity_of_IfcProductsOfCombustionProperties;
	private IfcPositiveRatioMeasure N20Content;
	private IfcPositiveRatioMeasure COContent;
	private IfcPositiveRatioMeasure CO2Content;


	// Getters and setters of properties
	public IfcSpecificHeatCapacityMeasure getSpecificHeatCapacity_of_IfcProductsOfCombustionProperties() {
		return SpecificHeatCapacity_of_IfcProductsOfCombustionProperties;
	}

	public void setSpecificHeatCapacity_of_IfcProductsOfCombustionProperties(IfcSpecificHeatCapacityMeasure value){
		this.SpecificHeatCapacity_of_IfcProductsOfCombustionProperties=value;
	}

	public IfcPositiveRatioMeasure getN20Content() {
		return N20Content;
	}

	public void setN20Content(IfcPositiveRatioMeasure value){
		this.N20Content=value;
	}

	public IfcPositiveRatioMeasure getCOContent() {
		return COContent;
	}

	public void setCOContent(IfcPositiveRatioMeasure value){
		this.COContent=value;
	}

	public IfcPositiveRatioMeasure getCO2Content() {
		return CO2Content;
	}

	public void setCO2Content(IfcPositiveRatioMeasure value){
		this.CO2Content=value;
	}

}
