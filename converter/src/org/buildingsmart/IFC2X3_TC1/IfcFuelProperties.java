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

public class IfcFuelProperties extends IfcMaterialProperties 
{
	// The property attributes
	private IfcThermodynamicTemperatureMeasure CombustionTemperature;
	private IfcPositiveRatioMeasure CarbonContent;
	private IfcHeatingValueMeasure LowerHeatingValue;
	private IfcHeatingValueMeasure HigherHeatingValue;


	// Getters and setters of properties
	public IfcThermodynamicTemperatureMeasure getCombustionTemperature() {
		return CombustionTemperature;
	}

	public void setCombustionTemperature(IfcThermodynamicTemperatureMeasure value){
		this.CombustionTemperature=value;
	}

	public IfcPositiveRatioMeasure getCarbonContent() {
		return CarbonContent;
	}

	public void setCarbonContent(IfcPositiveRatioMeasure value){
		this.CarbonContent=value;
	}

	public IfcHeatingValueMeasure getLowerHeatingValue() {
		return LowerHeatingValue;
	}

	public void setLowerHeatingValue(IfcHeatingValueMeasure value){
		this.LowerHeatingValue=value;
	}

	public IfcHeatingValueMeasure getHigherHeatingValue() {
		return HigherHeatingValue;
	}

	public void setHigherHeatingValue(IfcHeatingValueMeasure value){
		this.HigherHeatingValue=value;
	}

}
