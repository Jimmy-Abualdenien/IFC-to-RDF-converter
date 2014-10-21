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

public class IfcFluidFlowProperties extends IfcPropertySetDefinition 
{
	// The property attributes
	private IfcPropertySourceEnum PropertySource_of_IfcFluidFlowProperties;
	private IfcTimeSeries FlowConditionTimeSeries;
	private IfcTimeSeries VelocityTimeSeries;
	private IfcTimeSeries FlowrateTimeSeries;
	private IfcMaterial Fluid;
	private IfcTimeSeries PressureTimeSeries;
	private IfcLabel UserDefinedPropertySource_of_IfcFluidFlowProperties;
	private IfcThermodynamicTemperatureMeasure TemperatureSingleValue;
	private IfcThermodynamicTemperatureMeasure WetBulbTemperatureSingleValue;
	private IfcTimeSeries WetBulbTemperatureTimeSeries;
	private IfcTimeSeries TemperatureTimeSeries;
	private IfcDerivedMeasureValue FlowrateSingleValue;
	private IfcPositiveRatioMeasure FlowConditionSingleValue;
	private IfcLinearVelocityMeasure VelocitySingleValue;
	private IfcPressureMeasure PressureSingleValue;


	// Getters and setters of properties
	public IfcPropertySourceEnum getPropertySource_of_IfcFluidFlowProperties() {
		return PropertySource_of_IfcFluidFlowProperties;
	}

	public void setPropertySource_of_IfcFluidFlowProperties(IfcPropertySourceEnum value){
		this.PropertySource_of_IfcFluidFlowProperties=value;
	}

	public IfcTimeSeries getFlowConditionTimeSeries() {
		return FlowConditionTimeSeries;
	}

	public void setFlowConditionTimeSeries(IfcTimeSeries value){
		this.FlowConditionTimeSeries=value;
	}

	public IfcTimeSeries getVelocityTimeSeries() {
		return VelocityTimeSeries;
	}

	public void setVelocityTimeSeries(IfcTimeSeries value){
		this.VelocityTimeSeries=value;
	}

	public IfcTimeSeries getFlowrateTimeSeries() {
		return FlowrateTimeSeries;
	}

	public void setFlowrateTimeSeries(IfcTimeSeries value){
		this.FlowrateTimeSeries=value;
	}

	public IfcMaterial getFluid() {
		return Fluid;
	}

	public void setFluid(IfcMaterial value){
		this.Fluid=value;
	}

	public IfcTimeSeries getPressureTimeSeries() {
		return PressureTimeSeries;
	}

	public void setPressureTimeSeries(IfcTimeSeries value){
		this.PressureTimeSeries=value;
	}

	public IfcLabel getUserDefinedPropertySource_of_IfcFluidFlowProperties() {
		return UserDefinedPropertySource_of_IfcFluidFlowProperties;
	}

	public void setUserDefinedPropertySource_of_IfcFluidFlowProperties(IfcLabel value){
		this.UserDefinedPropertySource_of_IfcFluidFlowProperties=value;
	}

	public IfcThermodynamicTemperatureMeasure getTemperatureSingleValue() {
		return TemperatureSingleValue;
	}

	public void setTemperatureSingleValue(IfcThermodynamicTemperatureMeasure value){
		this.TemperatureSingleValue=value;
	}

	public IfcThermodynamicTemperatureMeasure getWetBulbTemperatureSingleValue() {
		return WetBulbTemperatureSingleValue;
	}

	public void setWetBulbTemperatureSingleValue(IfcThermodynamicTemperatureMeasure value){
		this.WetBulbTemperatureSingleValue=value;
	}

	public IfcTimeSeries getWetBulbTemperatureTimeSeries() {
		return WetBulbTemperatureTimeSeries;
	}

	public void setWetBulbTemperatureTimeSeries(IfcTimeSeries value){
		this.WetBulbTemperatureTimeSeries=value;
	}

	public IfcTimeSeries getTemperatureTimeSeries() {
		return TemperatureTimeSeries;
	}

	public void setTemperatureTimeSeries(IfcTimeSeries value){
		this.TemperatureTimeSeries=value;
	}

	public IfcDerivedMeasureValue getFlowrateSingleValue() {
		return FlowrateSingleValue;
	}

	public void setFlowrateSingleValue(IfcDerivedMeasureValue value){
		this.FlowrateSingleValue=value;
	}

	public IfcPositiveRatioMeasure getFlowConditionSingleValue() {
		return FlowConditionSingleValue;
	}

	public void setFlowConditionSingleValue(IfcPositiveRatioMeasure value){
		this.FlowConditionSingleValue=value;
	}

	public IfcLinearVelocityMeasure getVelocitySingleValue() {
		return VelocitySingleValue;
	}

	public void setVelocitySingleValue(IfcLinearVelocityMeasure value){
		this.VelocitySingleValue=value;
	}

	public IfcPressureMeasure getPressureSingleValue() {
		return PressureSingleValue;
	}

	public void setPressureSingleValue(IfcPressureMeasure value){
		this.PressureSingleValue=value;
	}

}
