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

public class IfcDoorLiningProperties extends IfcPropertySetDefinition 
{
	// The property attributes
	private IfcPositiveLengthMeasure LiningDepth_of_IfcDoorLiningProperties;
	private IfcPositiveLengthMeasure LiningThickness_of_IfcDoorLiningProperties;
	private IfcPositiveLengthMeasure ThresholdDepth;
	private IfcPositiveLengthMeasure ThresholdThickness;
	private IfcPositiveLengthMeasure TransomThickness_of_IfcDoorLiningProperties;
	private IfcLengthMeasure TransomOffset;
	private IfcLengthMeasure LiningOffset;
	private IfcLengthMeasure ThresholdOffset;
	private IfcPositiveLengthMeasure CasingThickness;
	private IfcPositiveLengthMeasure CasingDepth;
	private IfcShapeAspect ShapeAspectStyle_of_IfcDoorLiningProperties;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getLiningDepth_of_IfcDoorLiningProperties() {
		return LiningDepth_of_IfcDoorLiningProperties;
	}

	public void setLiningDepth_of_IfcDoorLiningProperties(IfcPositiveLengthMeasure value){
		this.LiningDepth_of_IfcDoorLiningProperties=value;
	}

	public IfcPositiveLengthMeasure getLiningThickness_of_IfcDoorLiningProperties() {
		return LiningThickness_of_IfcDoorLiningProperties;
	}

	public void setLiningThickness_of_IfcDoorLiningProperties(IfcPositiveLengthMeasure value){
		this.LiningThickness_of_IfcDoorLiningProperties=value;
	}

	public IfcPositiveLengthMeasure getThresholdDepth() {
		return ThresholdDepth;
	}

	public void setThresholdDepth(IfcPositiveLengthMeasure value){
		this.ThresholdDepth=value;
	}

	public IfcPositiveLengthMeasure getThresholdThickness() {
		return ThresholdThickness;
	}

	public void setThresholdThickness(IfcPositiveLengthMeasure value){
		this.ThresholdThickness=value;
	}

	public IfcPositiveLengthMeasure getTransomThickness_of_IfcDoorLiningProperties() {
		return TransomThickness_of_IfcDoorLiningProperties;
	}

	public void setTransomThickness_of_IfcDoorLiningProperties(IfcPositiveLengthMeasure value){
		this.TransomThickness_of_IfcDoorLiningProperties=value;
	}

	public IfcLengthMeasure getTransomOffset() {
		return TransomOffset;
	}

	public void setTransomOffset(IfcLengthMeasure value){
		this.TransomOffset=value;
	}

	public IfcLengthMeasure getLiningOffset() {
		return LiningOffset;
	}

	public void setLiningOffset(IfcLengthMeasure value){
		this.LiningOffset=value;
	}

	public IfcLengthMeasure getThresholdOffset() {
		return ThresholdOffset;
	}

	public void setThresholdOffset(IfcLengthMeasure value){
		this.ThresholdOffset=value;
	}

	public IfcPositiveLengthMeasure getCasingThickness() {
		return CasingThickness;
	}

	public void setCasingThickness(IfcPositiveLengthMeasure value){
		this.CasingThickness=value;
	}

	public IfcPositiveLengthMeasure getCasingDepth() {
		return CasingDepth;
	}

	public void setCasingDepth(IfcPositiveLengthMeasure value){
		this.CasingDepth=value;
	}

	public IfcShapeAspect getShapeAspectStyle_of_IfcDoorLiningProperties() {
		return ShapeAspectStyle_of_IfcDoorLiningProperties;
	}

	public void setShapeAspectStyle_of_IfcDoorLiningProperties(IfcShapeAspect value){
		this.ShapeAspectStyle_of_IfcDoorLiningProperties=value;
	}

}
