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

public class IfcMechanicalSteelMaterialProperties extends IfcMechanicalMaterialProperties 
{
	// The property attributes
	private IfcPressureMeasure YieldStress;
	private IfcPressureMeasure UltimateStress;
	private IfcPositiveRatioMeasure UltimateStrain;
	private IfcModulusOfElasticityMeasure HardeningModule;
	private IfcPressureMeasure ProportionalStress;
	private IfcPositiveRatioMeasure PlasticStrain;
	private List<IfcRelaxation> Relaxations = new ArrayList<IfcRelaxation>();


	// Getters and setters of properties
	public IfcPressureMeasure getYieldStress() {
		return YieldStress;
	}

	public void setYieldStress(IfcPressureMeasure value){
		this.YieldStress=value;
	}

	public IfcPressureMeasure getUltimateStress() {
		return UltimateStress;
	}

	public void setUltimateStress(IfcPressureMeasure value){
		this.UltimateStress=value;
	}

	public IfcPositiveRatioMeasure getUltimateStrain() {
		return UltimateStrain;
	}

	public void setUltimateStrain(IfcPositiveRatioMeasure value){
		this.UltimateStrain=value;
	}

	public IfcModulusOfElasticityMeasure getHardeningModule() {
		return HardeningModule;
	}

	public void setHardeningModule(IfcModulusOfElasticityMeasure value){
		this.HardeningModule=value;
	}

	public IfcPressureMeasure getProportionalStress() {
		return ProportionalStress;
	}

	public void setProportionalStress(IfcPressureMeasure value){
		this.ProportionalStress=value;
	}

	public IfcPositiveRatioMeasure getPlasticStrain() {
		return PlasticStrain;
	}

	public void setPlasticStrain(IfcPositiveRatioMeasure value){
		this.PlasticStrain=value;
	}

	public List<IfcRelaxation> getRelaxations() {
		return Relaxations;
	}

	public void setRelaxations(IfcRelaxation value){
		this.Relaxations.add(value);
	}

}
