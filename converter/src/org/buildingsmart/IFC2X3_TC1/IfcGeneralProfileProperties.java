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

public class IfcGeneralProfileProperties extends IfcProfileProperties 
{
	// The property attributes
	private IfcMassPerLengthMeasure PhysicalWeight;
	private IfcPositiveLengthMeasure Perimeter;
	private IfcPositiveLengthMeasure MinimumPlateThickness;
	private IfcPositiveLengthMeasure MaximumPlateThickness;
	private IfcAreaMeasure CrossSectionArea_of_IfcGeneralProfileProperties;


	// Getters and setters of properties
	public IfcMassPerLengthMeasure getPhysicalWeight() {
		return PhysicalWeight;
	}

	public void setPhysicalWeight(IfcMassPerLengthMeasure value){
		this.PhysicalWeight=value;
	}

	public IfcPositiveLengthMeasure getPerimeter() {
		return Perimeter;
	}

	public void setPerimeter(IfcPositiveLengthMeasure value){
		this.Perimeter=value;
	}

	public IfcPositiveLengthMeasure getMinimumPlateThickness() {
		return MinimumPlateThickness;
	}

	public void setMinimumPlateThickness(IfcPositiveLengthMeasure value){
		this.MinimumPlateThickness=value;
	}

	public IfcPositiveLengthMeasure getMaximumPlateThickness() {
		return MaximumPlateThickness;
	}

	public void setMaximumPlateThickness(IfcPositiveLengthMeasure value){
		this.MaximumPlateThickness=value;
	}

	public IfcAreaMeasure getCrossSectionArea_of_IfcGeneralProfileProperties() {
		return CrossSectionArea_of_IfcGeneralProfileProperties;
	}

	public void setCrossSectionArea_of_IfcGeneralProfileProperties(IfcAreaMeasure value){
		this.CrossSectionArea_of_IfcGeneralProfileProperties=value;
	}

}
