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

public class IfcOpticalMaterialProperties extends IfcMaterialProperties 
{
	// The property attributes
	private IfcPositiveRatioMeasure VisibleTransmittance;
	private IfcPositiveRatioMeasure SolarTransmittance;
	private IfcPositiveRatioMeasure ThermalIrTransmittance;
	private IfcPositiveRatioMeasure ThermalIrEmissivityBack;
	private IfcPositiveRatioMeasure ThermalIrEmissivityFront;
	private IfcPositiveRatioMeasure VisibleReflectanceBack;
	private IfcPositiveRatioMeasure VisibleReflectanceFront;
	private IfcPositiveRatioMeasure SolarReflectanceFront;
	private IfcPositiveRatioMeasure SolarReflectanceBack;


	// Getters and setters of properties
	public IfcPositiveRatioMeasure getVisibleTransmittance() {
		return VisibleTransmittance;
	}

	public void setVisibleTransmittance(IfcPositiveRatioMeasure value){
		this.VisibleTransmittance=value;
	}

	public IfcPositiveRatioMeasure getSolarTransmittance() {
		return SolarTransmittance;
	}

	public void setSolarTransmittance(IfcPositiveRatioMeasure value){
		this.SolarTransmittance=value;
	}

	public IfcPositiveRatioMeasure getThermalIrTransmittance() {
		return ThermalIrTransmittance;
	}

	public void setThermalIrTransmittance(IfcPositiveRatioMeasure value){
		this.ThermalIrTransmittance=value;
	}

	public IfcPositiveRatioMeasure getThermalIrEmissivityBack() {
		return ThermalIrEmissivityBack;
	}

	public void setThermalIrEmissivityBack(IfcPositiveRatioMeasure value){
		this.ThermalIrEmissivityBack=value;
	}

	public IfcPositiveRatioMeasure getThermalIrEmissivityFront() {
		return ThermalIrEmissivityFront;
	}

	public void setThermalIrEmissivityFront(IfcPositiveRatioMeasure value){
		this.ThermalIrEmissivityFront=value;
	}

	public IfcPositiveRatioMeasure getVisibleReflectanceBack() {
		return VisibleReflectanceBack;
	}

	public void setVisibleReflectanceBack(IfcPositiveRatioMeasure value){
		this.VisibleReflectanceBack=value;
	}

	public IfcPositiveRatioMeasure getVisibleReflectanceFront() {
		return VisibleReflectanceFront;
	}

	public void setVisibleReflectanceFront(IfcPositiveRatioMeasure value){
		this.VisibleReflectanceFront=value;
	}

	public IfcPositiveRatioMeasure getSolarReflectanceFront() {
		return SolarReflectanceFront;
	}

	public void setSolarReflectanceFront(IfcPositiveRatioMeasure value){
		this.SolarReflectanceFront=value;
	}

	public IfcPositiveRatioMeasure getSolarReflectanceBack() {
		return SolarReflectanceBack;
	}

	public void setSolarReflectanceBack(IfcPositiveRatioMeasure value){
		this.SolarReflectanceBack=value;
	}

}
