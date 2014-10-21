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

public class IfcCraneRailAShapeProfileDef extends IfcParameterizedProfileDef 
{
	// The property attributes
	private IfcPositiveLengthMeasure OverallHeight_of_IfcCraneRailAShapeProfileDef;
	private IfcPositiveLengthMeasure BaseWidth2;
	private IfcPositiveLengthMeasure Radius_of_IfcCraneRailAShapeProfileDef;
	private IfcPositiveLengthMeasure HeadWidth_of_IfcCraneRailAShapeProfileDef;
	private IfcPositiveLengthMeasure HeadDepth2_of_IfcCraneRailAShapeProfileDef;
	private IfcPositiveLengthMeasure HeadDepth3_of_IfcCraneRailAShapeProfileDef;
	private IfcPositiveLengthMeasure WebThickness_of_IfcCraneRailAShapeProfileDef;
	private IfcPositiveLengthMeasure BaseWidth4;
	private IfcPositiveLengthMeasure BaseDepth1_of_IfcCraneRailAShapeProfileDef;
	private IfcPositiveLengthMeasure BaseDepth2_of_IfcCraneRailAShapeProfileDef;
	private IfcPositiveLengthMeasure BaseDepth3;
	private IfcPositiveLengthMeasure CentreOfGravityInY_of_IfcCraneRailAShapeProfileDef;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getOverallHeight_of_IfcCraneRailAShapeProfileDef() {
		return OverallHeight_of_IfcCraneRailAShapeProfileDef;
	}

	public void setOverallHeight_of_IfcCraneRailAShapeProfileDef(IfcPositiveLengthMeasure value){
		this.OverallHeight_of_IfcCraneRailAShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getBaseWidth2() {
		return BaseWidth2;
	}

	public void setBaseWidth2(IfcPositiveLengthMeasure value){
		this.BaseWidth2=value;
	}

	public IfcPositiveLengthMeasure getRadius_of_IfcCraneRailAShapeProfileDef() {
		return Radius_of_IfcCraneRailAShapeProfileDef;
	}

	public void setRadius_of_IfcCraneRailAShapeProfileDef(IfcPositiveLengthMeasure value){
		this.Radius_of_IfcCraneRailAShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getHeadWidth_of_IfcCraneRailAShapeProfileDef() {
		return HeadWidth_of_IfcCraneRailAShapeProfileDef;
	}

	public void setHeadWidth_of_IfcCraneRailAShapeProfileDef(IfcPositiveLengthMeasure value){
		this.HeadWidth_of_IfcCraneRailAShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getHeadDepth2_of_IfcCraneRailAShapeProfileDef() {
		return HeadDepth2_of_IfcCraneRailAShapeProfileDef;
	}

	public void setHeadDepth2_of_IfcCraneRailAShapeProfileDef(IfcPositiveLengthMeasure value){
		this.HeadDepth2_of_IfcCraneRailAShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getHeadDepth3_of_IfcCraneRailAShapeProfileDef() {
		return HeadDepth3_of_IfcCraneRailAShapeProfileDef;
	}

	public void setHeadDepth3_of_IfcCraneRailAShapeProfileDef(IfcPositiveLengthMeasure value){
		this.HeadDepth3_of_IfcCraneRailAShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getWebThickness_of_IfcCraneRailAShapeProfileDef() {
		return WebThickness_of_IfcCraneRailAShapeProfileDef;
	}

	public void setWebThickness_of_IfcCraneRailAShapeProfileDef(IfcPositiveLengthMeasure value){
		this.WebThickness_of_IfcCraneRailAShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getBaseWidth4() {
		return BaseWidth4;
	}

	public void setBaseWidth4(IfcPositiveLengthMeasure value){
		this.BaseWidth4=value;
	}

	public IfcPositiveLengthMeasure getBaseDepth1_of_IfcCraneRailAShapeProfileDef() {
		return BaseDepth1_of_IfcCraneRailAShapeProfileDef;
	}

	public void setBaseDepth1_of_IfcCraneRailAShapeProfileDef(IfcPositiveLengthMeasure value){
		this.BaseDepth1_of_IfcCraneRailAShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getBaseDepth2_of_IfcCraneRailAShapeProfileDef() {
		return BaseDepth2_of_IfcCraneRailAShapeProfileDef;
	}

	public void setBaseDepth2_of_IfcCraneRailAShapeProfileDef(IfcPositiveLengthMeasure value){
		this.BaseDepth2_of_IfcCraneRailAShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getBaseDepth3() {
		return BaseDepth3;
	}

	public void setBaseDepth3(IfcPositiveLengthMeasure value){
		this.BaseDepth3=value;
	}

	public IfcPositiveLengthMeasure getCentreOfGravityInY_of_IfcCraneRailAShapeProfileDef() {
		return CentreOfGravityInY_of_IfcCraneRailAShapeProfileDef;
	}

	public void setCentreOfGravityInY_of_IfcCraneRailAShapeProfileDef(IfcPositiveLengthMeasure value){
		this.CentreOfGravityInY_of_IfcCraneRailAShapeProfileDef=value;
	}

}
