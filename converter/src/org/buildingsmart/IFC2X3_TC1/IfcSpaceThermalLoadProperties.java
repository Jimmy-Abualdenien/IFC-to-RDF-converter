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

public class IfcSpaceThermalLoadProperties extends IfcPropertySetDefinition 
{
	// The property attributes
	private IfcPositiveRatioMeasure ApplicableValueRatio;
	private IfcThermalLoadSourceEnum ThermalLoadSource;
	private IfcPropertySourceEnum PropertySource_of_IfcSpaceThermalLoadProperties;
	private IfcText SourceDescription;
	private IfcPowerMeasure MaximumValue;
	private IfcPowerMeasure MinimumValue;
	private IfcTimeSeries ThermalLoadTimeSeriesValues;
	private IfcLabel UserDefinedThermalLoadSource;
	private IfcLabel UserDefinedPropertySource_of_IfcSpaceThermalLoadProperties;
	private IfcThermalLoadTypeEnum ThermalLoadType;


	// Getters and setters of properties
	public IfcPositiveRatioMeasure getApplicableValueRatio() {
		return ApplicableValueRatio;
	}

	public void setApplicableValueRatio(IfcPositiveRatioMeasure value){
		this.ApplicableValueRatio=value;
	}

	public IfcThermalLoadSourceEnum getThermalLoadSource() {
		return ThermalLoadSource;
	}

	public void setThermalLoadSource(IfcThermalLoadSourceEnum value){
		this.ThermalLoadSource=value;
	}

	public IfcPropertySourceEnum getPropertySource_of_IfcSpaceThermalLoadProperties() {
		return PropertySource_of_IfcSpaceThermalLoadProperties;
	}

	public void setPropertySource_of_IfcSpaceThermalLoadProperties(IfcPropertySourceEnum value){
		this.PropertySource_of_IfcSpaceThermalLoadProperties=value;
	}

	public IfcText getSourceDescription() {
		return SourceDescription;
	}

	public void setSourceDescription(IfcText value){
		this.SourceDescription=value;
	}

	public IfcPowerMeasure getMaximumValue() {
		return MaximumValue;
	}

	public void setMaximumValue(IfcPowerMeasure value){
		this.MaximumValue=value;
	}

	public IfcPowerMeasure getMinimumValue() {
		return MinimumValue;
	}

	public void setMinimumValue(IfcPowerMeasure value){
		this.MinimumValue=value;
	}

	public IfcTimeSeries getThermalLoadTimeSeriesValues() {
		return ThermalLoadTimeSeriesValues;
	}

	public void setThermalLoadTimeSeriesValues(IfcTimeSeries value){
		this.ThermalLoadTimeSeriesValues=value;
	}

	public IfcLabel getUserDefinedThermalLoadSource() {
		return UserDefinedThermalLoadSource;
	}

	public void setUserDefinedThermalLoadSource(IfcLabel value){
		this.UserDefinedThermalLoadSource=value;
	}

	public IfcLabel getUserDefinedPropertySource_of_IfcSpaceThermalLoadProperties() {
		return UserDefinedPropertySource_of_IfcSpaceThermalLoadProperties;
	}

	public void setUserDefinedPropertySource_of_IfcSpaceThermalLoadProperties(IfcLabel value){
		this.UserDefinedPropertySource_of_IfcSpaceThermalLoadProperties=value;
	}

	public IfcThermalLoadTypeEnum getThermalLoadType() {
		return ThermalLoadType;
	}

	public void setThermalLoadType(IfcThermalLoadTypeEnum value){
		this.ThermalLoadType=value;
	}

}
