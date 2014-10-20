package org.buildingsmart.IFC4_ADD1;
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

public class IfcCShapeProfileDef extends IfcParameterizedProfileDef 
{
	// The property attributes
	private IfcPositiveLengthMeasure Depth_of_IfcCShapeProfileDef;
	private IfcPositiveLengthMeasure Width_of_IfcCShapeProfileDef;
	private IfcPositiveLengthMeasure WallThickness_of_IfcCShapeProfileDef;
	private IfcPositiveLengthMeasure Girth;
	private IfcNonNegativeLengthMeasure InternalFilletRadius;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getDepth_of_IfcCShapeProfileDef() {
		return Depth_of_IfcCShapeProfileDef;
	}

	public void setDepth_of_IfcCShapeProfileDef(IfcPositiveLengthMeasure value){
		this.Depth_of_IfcCShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getWidth_of_IfcCShapeProfileDef() {
		return Width_of_IfcCShapeProfileDef;
	}

	public void setWidth_of_IfcCShapeProfileDef(IfcPositiveLengthMeasure value){
		this.Width_of_IfcCShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getWallThickness_of_IfcCShapeProfileDef() {
		return WallThickness_of_IfcCShapeProfileDef;
	}

	public void setWallThickness_of_IfcCShapeProfileDef(IfcPositiveLengthMeasure value){
		this.WallThickness_of_IfcCShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getGirth() {
		return Girth;
	}

	public void setGirth(IfcPositiveLengthMeasure value){
		this.Girth=value;
	}

	public IfcNonNegativeLengthMeasure getInternalFilletRadius() {
		return InternalFilletRadius;
	}

	public void setInternalFilletRadius(IfcNonNegativeLengthMeasure value){
		this.InternalFilletRadius=value;
	}

}