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

public class IfcZShapeProfileDef extends IfcParameterizedProfileDef 
{
	// The property attributes
	private IfcPositiveLengthMeasure Depth_of_IfcZShapeProfileDef;
	private IfcPositiveLengthMeasure FlangeWidth_of_IfcZShapeProfileDef;
	private IfcPositiveLengthMeasure WebThickness_of_IfcZShapeProfileDef;
	private IfcPositiveLengthMeasure FlangeThickness_of_IfcZShapeProfileDef;
	private IfcNonNegativeLengthMeasure FilletRadius_of_IfcZShapeProfileDef;
	private IfcNonNegativeLengthMeasure EdgeRadius_of_IfcZShapeProfileDef;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getDepth_of_IfcZShapeProfileDef() {
		return Depth_of_IfcZShapeProfileDef;
	}

	public void setDepth_of_IfcZShapeProfileDef(IfcPositiveLengthMeasure value){
		this.Depth_of_IfcZShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getFlangeWidth_of_IfcZShapeProfileDef() {
		return FlangeWidth_of_IfcZShapeProfileDef;
	}

	public void setFlangeWidth_of_IfcZShapeProfileDef(IfcPositiveLengthMeasure value){
		this.FlangeWidth_of_IfcZShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getWebThickness_of_IfcZShapeProfileDef() {
		return WebThickness_of_IfcZShapeProfileDef;
	}

	public void setWebThickness_of_IfcZShapeProfileDef(IfcPositiveLengthMeasure value){
		this.WebThickness_of_IfcZShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getFlangeThickness_of_IfcZShapeProfileDef() {
		return FlangeThickness_of_IfcZShapeProfileDef;
	}

	public void setFlangeThickness_of_IfcZShapeProfileDef(IfcPositiveLengthMeasure value){
		this.FlangeThickness_of_IfcZShapeProfileDef=value;
	}

	public IfcNonNegativeLengthMeasure getFilletRadius_of_IfcZShapeProfileDef() {
		return FilletRadius_of_IfcZShapeProfileDef;
	}

	public void setFilletRadius_of_IfcZShapeProfileDef(IfcNonNegativeLengthMeasure value){
		this.FilletRadius_of_IfcZShapeProfileDef=value;
	}

	public IfcNonNegativeLengthMeasure getEdgeRadius_of_IfcZShapeProfileDef() {
		return EdgeRadius_of_IfcZShapeProfileDef;
	}

	public void setEdgeRadius_of_IfcZShapeProfileDef(IfcNonNegativeLengthMeasure value){
		this.EdgeRadius_of_IfcZShapeProfileDef=value;
	}

}
