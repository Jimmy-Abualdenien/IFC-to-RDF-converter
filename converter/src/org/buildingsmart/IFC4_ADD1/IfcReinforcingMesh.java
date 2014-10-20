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

public class IfcReinforcingMesh extends IfcReinforcingElement 
{
	// The property attributes
	private IfcPositiveLengthMeasure MeshLength_of_IfcReinforcingMesh;
	private IfcPositiveLengthMeasure MeshWidth_of_IfcReinforcingMesh;
	private IfcPositiveLengthMeasure LongitudinalBarNominalDiameter_of_IfcReinforcingMesh;
	private IfcPositiveLengthMeasure TransverseBarNominalDiameter_of_IfcReinforcingMesh;
	private IfcAreaMeasure LongitudinalBarCrossSectionArea_of_IfcReinforcingMesh;
	private IfcAreaMeasure TransverseBarCrossSectionArea_of_IfcReinforcingMesh;
	private IfcPositiveLengthMeasure LongitudinalBarSpacing_of_IfcReinforcingMesh;
	private IfcPositiveLengthMeasure TransverseBarSpacing_of_IfcReinforcingMesh;
	private IfcReinforcingMeshTypeEnum PredefinedType_of_IfcReinforcingMesh;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getMeshLength_of_IfcReinforcingMesh() {
		return MeshLength_of_IfcReinforcingMesh;
	}

	public void setMeshLength_of_IfcReinforcingMesh(IfcPositiveLengthMeasure value){
		this.MeshLength_of_IfcReinforcingMesh=value;
	}

	public IfcPositiveLengthMeasure getMeshWidth_of_IfcReinforcingMesh() {
		return MeshWidth_of_IfcReinforcingMesh;
	}

	public void setMeshWidth_of_IfcReinforcingMesh(IfcPositiveLengthMeasure value){
		this.MeshWidth_of_IfcReinforcingMesh=value;
	}

	public IfcPositiveLengthMeasure getLongitudinalBarNominalDiameter_of_IfcReinforcingMesh() {
		return LongitudinalBarNominalDiameter_of_IfcReinforcingMesh;
	}

	public void setLongitudinalBarNominalDiameter_of_IfcReinforcingMesh(IfcPositiveLengthMeasure value){
		this.LongitudinalBarNominalDiameter_of_IfcReinforcingMesh=value;
	}

	public IfcPositiveLengthMeasure getTransverseBarNominalDiameter_of_IfcReinforcingMesh() {
		return TransverseBarNominalDiameter_of_IfcReinforcingMesh;
	}

	public void setTransverseBarNominalDiameter_of_IfcReinforcingMesh(IfcPositiveLengthMeasure value){
		this.TransverseBarNominalDiameter_of_IfcReinforcingMesh=value;
	}

	public IfcAreaMeasure getLongitudinalBarCrossSectionArea_of_IfcReinforcingMesh() {
		return LongitudinalBarCrossSectionArea_of_IfcReinforcingMesh;
	}

	public void setLongitudinalBarCrossSectionArea_of_IfcReinforcingMesh(IfcAreaMeasure value){
		this.LongitudinalBarCrossSectionArea_of_IfcReinforcingMesh=value;
	}

	public IfcAreaMeasure getTransverseBarCrossSectionArea_of_IfcReinforcingMesh() {
		return TransverseBarCrossSectionArea_of_IfcReinforcingMesh;
	}

	public void setTransverseBarCrossSectionArea_of_IfcReinforcingMesh(IfcAreaMeasure value){
		this.TransverseBarCrossSectionArea_of_IfcReinforcingMesh=value;
	}

	public IfcPositiveLengthMeasure getLongitudinalBarSpacing_of_IfcReinforcingMesh() {
		return LongitudinalBarSpacing_of_IfcReinforcingMesh;
	}

	public void setLongitudinalBarSpacing_of_IfcReinforcingMesh(IfcPositiveLengthMeasure value){
		this.LongitudinalBarSpacing_of_IfcReinforcingMesh=value;
	}

	public IfcPositiveLengthMeasure getTransverseBarSpacing_of_IfcReinforcingMesh() {
		return TransverseBarSpacing_of_IfcReinforcingMesh;
	}

	public void setTransverseBarSpacing_of_IfcReinforcingMesh(IfcPositiveLengthMeasure value){
		this.TransverseBarSpacing_of_IfcReinforcingMesh=value;
	}

	public IfcReinforcingMeshTypeEnum getPredefinedType_of_IfcReinforcingMesh() {
		return PredefinedType_of_IfcReinforcingMesh;
	}

	public void setPredefinedType_of_IfcReinforcingMesh(IfcReinforcingMeshTypeEnum value){
		this.PredefinedType_of_IfcReinforcingMesh=value;
	}

}
