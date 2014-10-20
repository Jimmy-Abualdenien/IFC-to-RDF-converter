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

public class IfcReinforcingMeshType extends IfcReinforcingElementType 
{
	// The property attributes
	private IfcReinforcingMeshTypeEnum PredefinedType_of_IfcReinforcingMeshType;
	private IfcPositiveLengthMeasure MeshLength_of_IfcReinforcingMeshType;
	private IfcPositiveLengthMeasure MeshWidth_of_IfcReinforcingMeshType;
	private IfcPositiveLengthMeasure LongitudinalBarNominalDiameter_of_IfcReinforcingMeshType;
	private IfcPositiveLengthMeasure TransverseBarNominalDiameter_of_IfcReinforcingMeshType;
	private IfcAreaMeasure LongitudinalBarCrossSectionArea_of_IfcReinforcingMeshType;
	private IfcAreaMeasure TransverseBarCrossSectionArea_of_IfcReinforcingMeshType;
	private IfcPositiveLengthMeasure LongitudinalBarSpacing_of_IfcReinforcingMeshType;
	private IfcPositiveLengthMeasure TransverseBarSpacing_of_IfcReinforcingMeshType;
	private IfcLabel BendingShapeCode_of_IfcReinforcingMeshType;
	private List<IfcBendingParameterSelect> BendingParameters_of_IfcReinforcingMeshType = new ArrayList<IfcBendingParameterSelect>();


	// Getters and setters of properties
	public IfcReinforcingMeshTypeEnum getPredefinedType_of_IfcReinforcingMeshType() {
		return PredefinedType_of_IfcReinforcingMeshType;
	}

	public void setPredefinedType_of_IfcReinforcingMeshType(IfcReinforcingMeshTypeEnum value){
		this.PredefinedType_of_IfcReinforcingMeshType=value;
	}

	public IfcPositiveLengthMeasure getMeshLength_of_IfcReinforcingMeshType() {
		return MeshLength_of_IfcReinforcingMeshType;
	}

	public void setMeshLength_of_IfcReinforcingMeshType(IfcPositiveLengthMeasure value){
		this.MeshLength_of_IfcReinforcingMeshType=value;
	}

	public IfcPositiveLengthMeasure getMeshWidth_of_IfcReinforcingMeshType() {
		return MeshWidth_of_IfcReinforcingMeshType;
	}

	public void setMeshWidth_of_IfcReinforcingMeshType(IfcPositiveLengthMeasure value){
		this.MeshWidth_of_IfcReinforcingMeshType=value;
	}

	public IfcPositiveLengthMeasure getLongitudinalBarNominalDiameter_of_IfcReinforcingMeshType() {
		return LongitudinalBarNominalDiameter_of_IfcReinforcingMeshType;
	}

	public void setLongitudinalBarNominalDiameter_of_IfcReinforcingMeshType(IfcPositiveLengthMeasure value){
		this.LongitudinalBarNominalDiameter_of_IfcReinforcingMeshType=value;
	}

	public IfcPositiveLengthMeasure getTransverseBarNominalDiameter_of_IfcReinforcingMeshType() {
		return TransverseBarNominalDiameter_of_IfcReinforcingMeshType;
	}

	public void setTransverseBarNominalDiameter_of_IfcReinforcingMeshType(IfcPositiveLengthMeasure value){
		this.TransverseBarNominalDiameter_of_IfcReinforcingMeshType=value;
	}

	public IfcAreaMeasure getLongitudinalBarCrossSectionArea_of_IfcReinforcingMeshType() {
		return LongitudinalBarCrossSectionArea_of_IfcReinforcingMeshType;
	}

	public void setLongitudinalBarCrossSectionArea_of_IfcReinforcingMeshType(IfcAreaMeasure value){
		this.LongitudinalBarCrossSectionArea_of_IfcReinforcingMeshType=value;
	}

	public IfcAreaMeasure getTransverseBarCrossSectionArea_of_IfcReinforcingMeshType() {
		return TransverseBarCrossSectionArea_of_IfcReinforcingMeshType;
	}

	public void setTransverseBarCrossSectionArea_of_IfcReinforcingMeshType(IfcAreaMeasure value){
		this.TransverseBarCrossSectionArea_of_IfcReinforcingMeshType=value;
	}

	public IfcPositiveLengthMeasure getLongitudinalBarSpacing_of_IfcReinforcingMeshType() {
		return LongitudinalBarSpacing_of_IfcReinforcingMeshType;
	}

	public void setLongitudinalBarSpacing_of_IfcReinforcingMeshType(IfcPositiveLengthMeasure value){
		this.LongitudinalBarSpacing_of_IfcReinforcingMeshType=value;
	}

	public IfcPositiveLengthMeasure getTransverseBarSpacing_of_IfcReinforcingMeshType() {
		return TransverseBarSpacing_of_IfcReinforcingMeshType;
	}

	public void setTransverseBarSpacing_of_IfcReinforcingMeshType(IfcPositiveLengthMeasure value){
		this.TransverseBarSpacing_of_IfcReinforcingMeshType=value;
	}

	public IfcLabel getBendingShapeCode_of_IfcReinforcingMeshType() {
		return BendingShapeCode_of_IfcReinforcingMeshType;
	}

	public void setBendingShapeCode_of_IfcReinforcingMeshType(IfcLabel value){
		this.BendingShapeCode_of_IfcReinforcingMeshType=value;
	}

	public List<IfcBendingParameterSelect> getBendingParameters_of_IfcReinforcingMeshType() {
		return BendingParameters_of_IfcReinforcingMeshType;
	}

	public void setBendingParameters_of_IfcReinforcingMeshType(IfcBendingParameterSelect value){
		this.BendingParameters_of_IfcReinforcingMeshType.add(value);
	}

}
