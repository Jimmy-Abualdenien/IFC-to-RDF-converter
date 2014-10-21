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

public class IfcElectricalBaseProperties extends IfcEnergyProperties 
{
	// The property attributes
	private IfcElectricCurrentEnum ElectricCurrentType;
	private IfcElectricVoltageMeasure InputVoltage;
	private IfcFrequencyMeasure InputFrequency;
	private IfcElectricCurrentMeasure FullLoadCurrent;
	private IfcElectricCurrentMeasure MinimumCircuitCurrent;
	private IfcPowerMeasure MaximumPowerInput;
	private IfcPowerMeasure RatedPowerInput;
	private Integer InputPhase;


	// Getters and setters of properties
	public IfcElectricCurrentEnum getElectricCurrentType() {
		return ElectricCurrentType;
	}

	public void setElectricCurrentType(IfcElectricCurrentEnum value){
		this.ElectricCurrentType=value;
	}

	public IfcElectricVoltageMeasure getInputVoltage() {
		return InputVoltage;
	}

	public void setInputVoltage(IfcElectricVoltageMeasure value){
		this.InputVoltage=value;
	}

	public IfcFrequencyMeasure getInputFrequency() {
		return InputFrequency;
	}

	public void setInputFrequency(IfcFrequencyMeasure value){
		this.InputFrequency=value;
	}

	public IfcElectricCurrentMeasure getFullLoadCurrent() {
		return FullLoadCurrent;
	}

	public void setFullLoadCurrent(IfcElectricCurrentMeasure value){
		this.FullLoadCurrent=value;
	}

	public IfcElectricCurrentMeasure getMinimumCircuitCurrent() {
		return MinimumCircuitCurrent;
	}

	public void setMinimumCircuitCurrent(IfcElectricCurrentMeasure value){
		this.MinimumCircuitCurrent=value;
	}

	public IfcPowerMeasure getMaximumPowerInput() {
		return MaximumPowerInput;
	}

	public void setMaximumPowerInput(IfcPowerMeasure value){
		this.MaximumPowerInput=value;
	}

	public IfcPowerMeasure getRatedPowerInput() {
		return RatedPowerInput;
	}

	public void setRatedPowerInput(IfcPowerMeasure value){
		this.RatedPowerInput=value;
	}

	public Integer getInputPhase() {
		return InputPhase;
	}

	public void setInputPhase(Integer value){
		this.InputPhase=value;
	}

}
