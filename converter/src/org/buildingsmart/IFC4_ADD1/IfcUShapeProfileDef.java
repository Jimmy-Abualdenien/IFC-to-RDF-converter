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

public class IfcUShapeProfileDef extends IfcParameterizedProfileDef 
{
	// The property attributes
	private IfcPositiveLengthMeasure Depth_of_IfcUShapeProfileDef;
	private IfcPositiveLengthMeasure FlangeWidth_of_IfcUShapeProfileDef;
	private IfcPositiveLengthMeasure WebThickness_of_IfcUShapeProfileDef;
	private IfcPositiveLengthMeasure FlangeThickness_of_IfcUShapeProfileDef;
	private IfcNonNegativeLengthMeasure FilletRadius_of_IfcUShapeProfileDef;
	private IfcNonNegativeLengthMeasure EdgeRadius_of_IfcUShapeProfileDef;
	private IfcPlaneAngleMeasure FlangeSlope_of_IfcUShapeProfileDef;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getDepth_of_IfcUShapeProfileDef() {
		return Depth_of_IfcUShapeProfileDef;
	}

	public void setDepth_of_IfcUShapeProfileDef(IfcPositiveLengthMeasure value){
		this.Depth_of_IfcUShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getFlangeWidth_of_IfcUShapeProfileDef() {
		return FlangeWidth_of_IfcUShapeProfileDef;
	}

	public void setFlangeWidth_of_IfcUShapeProfileDef(IfcPositiveLengthMeasure value){
		this.FlangeWidth_of_IfcUShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getWebThickness_of_IfcUShapeProfileDef() {
		return WebThickness_of_IfcUShapeProfileDef;
	}

	public void setWebThickness_of_IfcUShapeProfileDef(IfcPositiveLengthMeasure value){
		this.WebThickness_of_IfcUShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getFlangeThickness_of_IfcUShapeProfileDef() {
		return FlangeThickness_of_IfcUShapeProfileDef;
	}

	public void setFlangeThickness_of_IfcUShapeProfileDef(IfcPositiveLengthMeasure value){
		this.FlangeThickness_of_IfcUShapeProfileDef=value;
	}

	public IfcNonNegativeLengthMeasure getFilletRadius_of_IfcUShapeProfileDef() {
		return FilletRadius_of_IfcUShapeProfileDef;
	}

	public void setFilletRadius_of_IfcUShapeProfileDef(IfcNonNegativeLengthMeasure value){
		this.FilletRadius_of_IfcUShapeProfileDef=value;
	}

	public IfcNonNegativeLengthMeasure getEdgeRadius_of_IfcUShapeProfileDef() {
		return EdgeRadius_of_IfcUShapeProfileDef;
	}

	public void setEdgeRadius_of_IfcUShapeProfileDef(IfcNonNegativeLengthMeasure value){
		this.EdgeRadius_of_IfcUShapeProfileDef=value;
	}

	public IfcPlaneAngleMeasure getFlangeSlope_of_IfcUShapeProfileDef() {
		return FlangeSlope_of_IfcUShapeProfileDef;
	}

	public void setFlangeSlope_of_IfcUShapeProfileDef(IfcPlaneAngleMeasure value){
		this.FlangeSlope_of_IfcUShapeProfileDef=value;
	}

}
