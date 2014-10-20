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

public class IfcTendon extends IfcReinforcingElement 
{
	// The property attributes
	private IfcTendonTypeEnum PredefinedType_of_IfcTendon;
	private IfcPositiveLengthMeasure NominalDiameter_of_IfcTendon;
	private IfcAreaMeasure CrossSectionArea_of_IfcTendon;
	private IfcForceMeasure TensionForce;
	private IfcPressureMeasure PreStress;
	private IfcNormalisedRatioMeasure FrictionCoefficient;
	private IfcPositiveLengthMeasure AnchorageSlip;
	private IfcPositiveLengthMeasure MinCurvatureRadius;


	// Getters and setters of properties
	public IfcTendonTypeEnum getPredefinedType_of_IfcTendon() {
		return PredefinedType_of_IfcTendon;
	}

	public void setPredefinedType_of_IfcTendon(IfcTendonTypeEnum value){
		this.PredefinedType_of_IfcTendon=value;
	}

	public IfcPositiveLengthMeasure getNominalDiameter_of_IfcTendon() {
		return NominalDiameter_of_IfcTendon;
	}

	public void setNominalDiameter_of_IfcTendon(IfcPositiveLengthMeasure value){
		this.NominalDiameter_of_IfcTendon=value;
	}

	public IfcAreaMeasure getCrossSectionArea_of_IfcTendon() {
		return CrossSectionArea_of_IfcTendon;
	}

	public void setCrossSectionArea_of_IfcTendon(IfcAreaMeasure value){
		this.CrossSectionArea_of_IfcTendon=value;
	}

	public IfcForceMeasure getTensionForce() {
		return TensionForce;
	}

	public void setTensionForce(IfcForceMeasure value){
		this.TensionForce=value;
	}

	public IfcPressureMeasure getPreStress() {
		return PreStress;
	}

	public void setPreStress(IfcPressureMeasure value){
		this.PreStress=value;
	}

	public IfcNormalisedRatioMeasure getFrictionCoefficient() {
		return FrictionCoefficient;
	}

	public void setFrictionCoefficient(IfcNormalisedRatioMeasure value){
		this.FrictionCoefficient=value;
	}

	public IfcPositiveLengthMeasure getAnchorageSlip() {
		return AnchorageSlip;
	}

	public void setAnchorageSlip(IfcPositiveLengthMeasure value){
		this.AnchorageSlip=value;
	}

	public IfcPositiveLengthMeasure getMinCurvatureRadius() {
		return MinCurvatureRadius;
	}

	public void setMinCurvatureRadius(IfcPositiveLengthMeasure value){
		this.MinCurvatureRadius=value;
	}

}
