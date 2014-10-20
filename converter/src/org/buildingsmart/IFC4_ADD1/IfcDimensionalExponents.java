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

public class IfcDimensionalExponents extends Thing 
{
	// The property attributes
	private Integer LengthExponent;
	private Integer MassExponent;
	private Integer TimeExponent;
	private Integer ElectricCurrentExponent;
	private Integer ThermodynamicTemperatureExponent;
	private Integer AmountOfSubstanceExponent;
	private Integer LuminousIntensityExponent;


	// Getters and setters of properties
	public Integer getLengthExponent() {
		return LengthExponent;
	}

	public void setLengthExponent(Integer value){
		this.LengthExponent=value;
	}

	public Integer getMassExponent() {
		return MassExponent;
	}

	public void setMassExponent(Integer value){
		this.MassExponent=value;
	}

	public Integer getTimeExponent() {
		return TimeExponent;
	}

	public void setTimeExponent(Integer value){
		this.TimeExponent=value;
	}

	public Integer getElectricCurrentExponent() {
		return ElectricCurrentExponent;
	}

	public void setElectricCurrentExponent(Integer value){
		this.ElectricCurrentExponent=value;
	}

	public Integer getThermodynamicTemperatureExponent() {
		return ThermodynamicTemperatureExponent;
	}

	public void setThermodynamicTemperatureExponent(Integer value){
		this.ThermodynamicTemperatureExponent=value;
	}

	public Integer getAmountOfSubstanceExponent() {
		return AmountOfSubstanceExponent;
	}

	public void setAmountOfSubstanceExponent(Integer value){
		this.AmountOfSubstanceExponent=value;
	}

	public Integer getLuminousIntensityExponent() {
		return LuminousIntensityExponent;
	}

	public void setLuminousIntensityExponent(Integer value){
		this.LuminousIntensityExponent=value;
	}

}
