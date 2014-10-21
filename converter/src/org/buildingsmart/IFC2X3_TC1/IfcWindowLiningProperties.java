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

public class IfcWindowLiningProperties extends IfcPropertySetDefinition 
{
	// The property attributes
	private IfcPositiveLengthMeasure LiningDepth_of_IfcWindowLiningProperties;
	private IfcPositiveLengthMeasure LiningThickness_of_IfcWindowLiningProperties;
	private IfcPositiveLengthMeasure TransomThickness_of_IfcWindowLiningProperties;
	private IfcPositiveLengthMeasure MullionThickness;
	private IfcNormalisedRatioMeasure FirstTransomOffset;
	private IfcNormalisedRatioMeasure SecondTransomOffset;
	private IfcNormalisedRatioMeasure FirstMullionOffset;
	private IfcNormalisedRatioMeasure SecondMullionOffset;
	private IfcShapeAspect ShapeAspectStyle_of_IfcWindowLiningProperties;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getLiningDepth_of_IfcWindowLiningProperties() {
		return LiningDepth_of_IfcWindowLiningProperties;
	}

	public void setLiningDepth_of_IfcWindowLiningProperties(IfcPositiveLengthMeasure value){
		this.LiningDepth_of_IfcWindowLiningProperties=value;
	}

	public IfcPositiveLengthMeasure getLiningThickness_of_IfcWindowLiningProperties() {
		return LiningThickness_of_IfcWindowLiningProperties;
	}

	public void setLiningThickness_of_IfcWindowLiningProperties(IfcPositiveLengthMeasure value){
		this.LiningThickness_of_IfcWindowLiningProperties=value;
	}

	public IfcPositiveLengthMeasure getTransomThickness_of_IfcWindowLiningProperties() {
		return TransomThickness_of_IfcWindowLiningProperties;
	}

	public void setTransomThickness_of_IfcWindowLiningProperties(IfcPositiveLengthMeasure value){
		this.TransomThickness_of_IfcWindowLiningProperties=value;
	}

	public IfcPositiveLengthMeasure getMullionThickness() {
		return MullionThickness;
	}

	public void setMullionThickness(IfcPositiveLengthMeasure value){
		this.MullionThickness=value;
	}

	public IfcNormalisedRatioMeasure getFirstTransomOffset() {
		return FirstTransomOffset;
	}

	public void setFirstTransomOffset(IfcNormalisedRatioMeasure value){
		this.FirstTransomOffset=value;
	}

	public IfcNormalisedRatioMeasure getSecondTransomOffset() {
		return SecondTransomOffset;
	}

	public void setSecondTransomOffset(IfcNormalisedRatioMeasure value){
		this.SecondTransomOffset=value;
	}

	public IfcNormalisedRatioMeasure getFirstMullionOffset() {
		return FirstMullionOffset;
	}

	public void setFirstMullionOffset(IfcNormalisedRatioMeasure value){
		this.FirstMullionOffset=value;
	}

	public IfcNormalisedRatioMeasure getSecondMullionOffset() {
		return SecondMullionOffset;
	}

	public void setSecondMullionOffset(IfcNormalisedRatioMeasure value){
		this.SecondMullionOffset=value;
	}

	public IfcShapeAspect getShapeAspectStyle_of_IfcWindowLiningProperties() {
		return ShapeAspectStyle_of_IfcWindowLiningProperties;
	}

	public void setShapeAspectStyle_of_IfcWindowLiningProperties(IfcShapeAspect value){
		this.ShapeAspectStyle_of_IfcWindowLiningProperties=value;
	}

}
