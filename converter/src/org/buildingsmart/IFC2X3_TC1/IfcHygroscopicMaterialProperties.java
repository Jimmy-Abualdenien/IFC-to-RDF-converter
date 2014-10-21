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

public class IfcHygroscopicMaterialProperties extends IfcMaterialProperties 
{
	// The property attributes
	private IfcPositiveRatioMeasure UpperVaporResistanceFactor;
	private IfcPositiveRatioMeasure LowerVaporResistanceFactor;
	private IfcIsothermalMoistureCapacityMeasure IsothermalMoistureCapacity;
	private IfcVaporPermeabilityMeasure VaporPermeability;
	private IfcMoistureDiffusivityMeasure MoistureDiffusivity;


	// Getters and setters of properties
	public IfcPositiveRatioMeasure getUpperVaporResistanceFactor() {
		return UpperVaporResistanceFactor;
	}

	public void setUpperVaporResistanceFactor(IfcPositiveRatioMeasure value){
		this.UpperVaporResistanceFactor=value;
	}

	public IfcPositiveRatioMeasure getLowerVaporResistanceFactor() {
		return LowerVaporResistanceFactor;
	}

	public void setLowerVaporResistanceFactor(IfcPositiveRatioMeasure value){
		this.LowerVaporResistanceFactor=value;
	}

	public IfcIsothermalMoistureCapacityMeasure getIsothermalMoistureCapacity() {
		return IsothermalMoistureCapacity;
	}

	public void setIsothermalMoistureCapacity(IfcIsothermalMoistureCapacityMeasure value){
		this.IsothermalMoistureCapacity=value;
	}

	public IfcVaporPermeabilityMeasure getVaporPermeability() {
		return VaporPermeability;
	}

	public void setVaporPermeability(IfcVaporPermeabilityMeasure value){
		this.VaporPermeability=value;
	}

	public IfcMoistureDiffusivityMeasure getMoistureDiffusivity() {
		return MoistureDiffusivity;
	}

	public void setMoistureDiffusivity(IfcMoistureDiffusivityMeasure value){
		this.MoistureDiffusivity=value;
	}

}
