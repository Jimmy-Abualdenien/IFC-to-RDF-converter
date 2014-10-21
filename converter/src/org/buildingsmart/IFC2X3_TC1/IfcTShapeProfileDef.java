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

public class IfcTShapeProfileDef extends IfcParameterizedProfileDef 
{
	// The property attributes
	private IfcPositiveLengthMeasure Depth_of_IfcTShapeProfileDef;
	private IfcPositiveLengthMeasure FlangeWidth_of_IfcTShapeProfileDef;
	private IfcPositiveLengthMeasure WebThickness_of_IfcTShapeProfileDef;
	private IfcPositiveLengthMeasure FlangeThickness_of_IfcTShapeProfileDef;
	private IfcPositiveLengthMeasure FilletRadius_of_IfcTShapeProfileDef;
	private IfcPositiveLengthMeasure FlangeEdgeRadius;
	private IfcPositiveLengthMeasure WebEdgeRadius;
	private IfcPlaneAngleMeasure WebSlope;
	private IfcPlaneAngleMeasure FlangeSlope_of_IfcTShapeProfileDef;
	private IfcPositiveLengthMeasure CentreOfGravityInY_of_IfcTShapeProfileDef;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getDepth_of_IfcTShapeProfileDef() {
		return Depth_of_IfcTShapeProfileDef;
	}

	public void setDepth_of_IfcTShapeProfileDef(IfcPositiveLengthMeasure value){
		this.Depth_of_IfcTShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getFlangeWidth_of_IfcTShapeProfileDef() {
		return FlangeWidth_of_IfcTShapeProfileDef;
	}

	public void setFlangeWidth_of_IfcTShapeProfileDef(IfcPositiveLengthMeasure value){
		this.FlangeWidth_of_IfcTShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getWebThickness_of_IfcTShapeProfileDef() {
		return WebThickness_of_IfcTShapeProfileDef;
	}

	public void setWebThickness_of_IfcTShapeProfileDef(IfcPositiveLengthMeasure value){
		this.WebThickness_of_IfcTShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getFlangeThickness_of_IfcTShapeProfileDef() {
		return FlangeThickness_of_IfcTShapeProfileDef;
	}

	public void setFlangeThickness_of_IfcTShapeProfileDef(IfcPositiveLengthMeasure value){
		this.FlangeThickness_of_IfcTShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getFilletRadius_of_IfcTShapeProfileDef() {
		return FilletRadius_of_IfcTShapeProfileDef;
	}

	public void setFilletRadius_of_IfcTShapeProfileDef(IfcPositiveLengthMeasure value){
		this.FilletRadius_of_IfcTShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getFlangeEdgeRadius() {
		return FlangeEdgeRadius;
	}

	public void setFlangeEdgeRadius(IfcPositiveLengthMeasure value){
		this.FlangeEdgeRadius=value;
	}

	public IfcPositiveLengthMeasure getWebEdgeRadius() {
		return WebEdgeRadius;
	}

	public void setWebEdgeRadius(IfcPositiveLengthMeasure value){
		this.WebEdgeRadius=value;
	}

	public IfcPlaneAngleMeasure getWebSlope() {
		return WebSlope;
	}

	public void setWebSlope(IfcPlaneAngleMeasure value){
		this.WebSlope=value;
	}

	public IfcPlaneAngleMeasure getFlangeSlope_of_IfcTShapeProfileDef() {
		return FlangeSlope_of_IfcTShapeProfileDef;
	}

	public void setFlangeSlope_of_IfcTShapeProfileDef(IfcPlaneAngleMeasure value){
		this.FlangeSlope_of_IfcTShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getCentreOfGravityInY_of_IfcTShapeProfileDef() {
		return CentreOfGravityInY_of_IfcTShapeProfileDef;
	}

	public void setCentreOfGravityInY_of_IfcTShapeProfileDef(IfcPositiveLengthMeasure value){
		this.CentreOfGravityInY_of_IfcTShapeProfileDef=value;
	}

}
