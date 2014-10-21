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

public class IfcIShapeProfileDef extends IfcParameterizedProfileDef 
{
	// The property attributes
	private IfcPositiveLengthMeasure OverallWidth_of_IfcIShapeProfileDef;
	private IfcPositiveLengthMeasure OverallDepth;
	private IfcPositiveLengthMeasure WebThickness_of_IfcIShapeProfileDef;
	private IfcPositiveLengthMeasure FlangeThickness_of_IfcIShapeProfileDef;
	private IfcPositiveLengthMeasure FilletRadius_of_IfcIShapeProfileDef;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getOverallWidth_of_IfcIShapeProfileDef() {
		return OverallWidth_of_IfcIShapeProfileDef;
	}

	public void setOverallWidth_of_IfcIShapeProfileDef(IfcPositiveLengthMeasure value){
		this.OverallWidth_of_IfcIShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getOverallDepth() {
		return OverallDepth;
	}

	public void setOverallDepth(IfcPositiveLengthMeasure value){
		this.OverallDepth=value;
	}

	public IfcPositiveLengthMeasure getWebThickness_of_IfcIShapeProfileDef() {
		return WebThickness_of_IfcIShapeProfileDef;
	}

	public void setWebThickness_of_IfcIShapeProfileDef(IfcPositiveLengthMeasure value){
		this.WebThickness_of_IfcIShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getFlangeThickness_of_IfcIShapeProfileDef() {
		return FlangeThickness_of_IfcIShapeProfileDef;
	}

	public void setFlangeThickness_of_IfcIShapeProfileDef(IfcPositiveLengthMeasure value){
		this.FlangeThickness_of_IfcIShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getFilletRadius_of_IfcIShapeProfileDef() {
		return FilletRadius_of_IfcIShapeProfileDef;
	}

	public void setFilletRadius_of_IfcIShapeProfileDef(IfcPositiveLengthMeasure value){
		this.FilletRadius_of_IfcIShapeProfileDef=value;
	}

}
