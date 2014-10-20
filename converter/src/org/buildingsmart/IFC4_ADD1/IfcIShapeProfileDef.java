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

public class IfcIShapeProfileDef extends IfcParameterizedProfileDef 
{
	// The property attributes
	private IfcPositiveLengthMeasure OverallWidth_of_IfcIShapeProfileDef;
	private IfcPositiveLengthMeasure OverallDepth_of_IfcIShapeProfileDef;
	private IfcPositiveLengthMeasure WebThickness_of_IfcIShapeProfileDef;
	private IfcPositiveLengthMeasure FlangeThickness_of_IfcIShapeProfileDef;
	private IfcNonNegativeLengthMeasure FilletRadius_of_IfcIShapeProfileDef;
	private IfcNonNegativeLengthMeasure FlangeEdgeRadius_of_IfcIShapeProfileDef;
	private IfcPlaneAngleMeasure FlangeSlope_of_IfcIShapeProfileDef;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getOverallWidth_of_IfcIShapeProfileDef() {
		return OverallWidth_of_IfcIShapeProfileDef;
	}

	public void setOverallWidth_of_IfcIShapeProfileDef(IfcPositiveLengthMeasure value){
		this.OverallWidth_of_IfcIShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getOverallDepth_of_IfcIShapeProfileDef() {
		return OverallDepth_of_IfcIShapeProfileDef;
	}

	public void setOverallDepth_of_IfcIShapeProfileDef(IfcPositiveLengthMeasure value){
		this.OverallDepth_of_IfcIShapeProfileDef=value;
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

	public IfcNonNegativeLengthMeasure getFilletRadius_of_IfcIShapeProfileDef() {
		return FilletRadius_of_IfcIShapeProfileDef;
	}

	public void setFilletRadius_of_IfcIShapeProfileDef(IfcNonNegativeLengthMeasure value){
		this.FilletRadius_of_IfcIShapeProfileDef=value;
	}

	public IfcNonNegativeLengthMeasure getFlangeEdgeRadius_of_IfcIShapeProfileDef() {
		return FlangeEdgeRadius_of_IfcIShapeProfileDef;
	}

	public void setFlangeEdgeRadius_of_IfcIShapeProfileDef(IfcNonNegativeLengthMeasure value){
		this.FlangeEdgeRadius_of_IfcIShapeProfileDef=value;
	}

	public IfcPlaneAngleMeasure getFlangeSlope_of_IfcIShapeProfileDef() {
		return FlangeSlope_of_IfcIShapeProfileDef;
	}

	public void setFlangeSlope_of_IfcIShapeProfileDef(IfcPlaneAngleMeasure value){
		this.FlangeSlope_of_IfcIShapeProfileDef=value;
	}

}
