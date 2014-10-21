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

public class IfcThermalMaterialProperties extends IfcMaterialProperties 
{
	// The property attributes
	private IfcSpecificHeatCapacityMeasure SpecificHeatCapacity_of_IfcThermalMaterialProperties;
	private IfcThermodynamicTemperatureMeasure BoilingPoint;
	private IfcThermodynamicTemperatureMeasure FreezingPoint;
	private IfcThermalConductivityMeasure ThermalConductivity;


	// Getters and setters of properties
	public IfcSpecificHeatCapacityMeasure getSpecificHeatCapacity_of_IfcThermalMaterialProperties() {
		return SpecificHeatCapacity_of_IfcThermalMaterialProperties;
	}

	public void setSpecificHeatCapacity_of_IfcThermalMaterialProperties(IfcSpecificHeatCapacityMeasure value){
		this.SpecificHeatCapacity_of_IfcThermalMaterialProperties=value;
	}

	public IfcThermodynamicTemperatureMeasure getBoilingPoint() {
		return BoilingPoint;
	}

	public void setBoilingPoint(IfcThermodynamicTemperatureMeasure value){
		this.BoilingPoint=value;
	}

	public IfcThermodynamicTemperatureMeasure getFreezingPoint() {
		return FreezingPoint;
	}

	public void setFreezingPoint(IfcThermodynamicTemperatureMeasure value){
		this.FreezingPoint=value;
	}

	public IfcThermalConductivityMeasure getThermalConductivity() {
		return ThermalConductivity;
	}

	public void setThermalConductivity(IfcThermalConductivityMeasure value){
		this.ThermalConductivity=value;
	}

}
