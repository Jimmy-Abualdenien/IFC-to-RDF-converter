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

public class IfcStructuralProfileProperties extends IfcGeneralProfileProperties 
{
	// The property attributes
	private IfcMomentOfInertiaMeasure TorsionalConstantX;
	private IfcMomentOfInertiaMeasure MomentOfInertiaYZ;
	private IfcMomentOfInertiaMeasure MomentOfInertiaY;
	private IfcMomentOfInertiaMeasure MomentOfInertiaZ;
	private IfcWarpingConstantMeasure WarpingConstant;
	private IfcLengthMeasure ShearCentreZ;
	private IfcLengthMeasure ShearCentreY;
	private IfcAreaMeasure ShearDeformationAreaZ;
	private IfcAreaMeasure ShearDeformationAreaY;
	private IfcSectionModulusMeasure MaximumSectionModulusY;
	private IfcSectionModulusMeasure MinimumSectionModulusY;
	private IfcSectionModulusMeasure MaximumSectionModulusZ;
	private IfcSectionModulusMeasure MinimumSectionModulusZ;
	private IfcSectionModulusMeasure TorsionalSectionModulus;
	private IfcLengthMeasure CentreOfGravityInX_of_IfcStructuralProfileProperties;
	private IfcLengthMeasure CentreOfGravityInY_of_IfcStructuralProfileProperties;


	// Getters and setters of properties
	public IfcMomentOfInertiaMeasure getTorsionalConstantX() {
		return TorsionalConstantX;
	}

	public void setTorsionalConstantX(IfcMomentOfInertiaMeasure value){
		this.TorsionalConstantX=value;
	}

	public IfcMomentOfInertiaMeasure getMomentOfInertiaYZ() {
		return MomentOfInertiaYZ;
	}

	public void setMomentOfInertiaYZ(IfcMomentOfInertiaMeasure value){
		this.MomentOfInertiaYZ=value;
	}

	public IfcMomentOfInertiaMeasure getMomentOfInertiaY() {
		return MomentOfInertiaY;
	}

	public void setMomentOfInertiaY(IfcMomentOfInertiaMeasure value){
		this.MomentOfInertiaY=value;
	}

	public IfcMomentOfInertiaMeasure getMomentOfInertiaZ() {
		return MomentOfInertiaZ;
	}

	public void setMomentOfInertiaZ(IfcMomentOfInertiaMeasure value){
		this.MomentOfInertiaZ=value;
	}

	public IfcWarpingConstantMeasure getWarpingConstant() {
		return WarpingConstant;
	}

	public void setWarpingConstant(IfcWarpingConstantMeasure value){
		this.WarpingConstant=value;
	}

	public IfcLengthMeasure getShearCentreZ() {
		return ShearCentreZ;
	}

	public void setShearCentreZ(IfcLengthMeasure value){
		this.ShearCentreZ=value;
	}

	public IfcLengthMeasure getShearCentreY() {
		return ShearCentreY;
	}

	public void setShearCentreY(IfcLengthMeasure value){
		this.ShearCentreY=value;
	}

	public IfcAreaMeasure getShearDeformationAreaZ() {
		return ShearDeformationAreaZ;
	}

	public void setShearDeformationAreaZ(IfcAreaMeasure value){
		this.ShearDeformationAreaZ=value;
	}

	public IfcAreaMeasure getShearDeformationAreaY() {
		return ShearDeformationAreaY;
	}

	public void setShearDeformationAreaY(IfcAreaMeasure value){
		this.ShearDeformationAreaY=value;
	}

	public IfcSectionModulusMeasure getMaximumSectionModulusY() {
		return MaximumSectionModulusY;
	}

	public void setMaximumSectionModulusY(IfcSectionModulusMeasure value){
		this.MaximumSectionModulusY=value;
	}

	public IfcSectionModulusMeasure getMinimumSectionModulusY() {
		return MinimumSectionModulusY;
	}

	public void setMinimumSectionModulusY(IfcSectionModulusMeasure value){
		this.MinimumSectionModulusY=value;
	}

	public IfcSectionModulusMeasure getMaximumSectionModulusZ() {
		return MaximumSectionModulusZ;
	}

	public void setMaximumSectionModulusZ(IfcSectionModulusMeasure value){
		this.MaximumSectionModulusZ=value;
	}

	public IfcSectionModulusMeasure getMinimumSectionModulusZ() {
		return MinimumSectionModulusZ;
	}

	public void setMinimumSectionModulusZ(IfcSectionModulusMeasure value){
		this.MinimumSectionModulusZ=value;
	}

	public IfcSectionModulusMeasure getTorsionalSectionModulus() {
		return TorsionalSectionModulus;
	}

	public void setTorsionalSectionModulus(IfcSectionModulusMeasure value){
		this.TorsionalSectionModulus=value;
	}

	public IfcLengthMeasure getCentreOfGravityInX_of_IfcStructuralProfileProperties() {
		return CentreOfGravityInX_of_IfcStructuralProfileProperties;
	}

	public void setCentreOfGravityInX_of_IfcStructuralProfileProperties(IfcLengthMeasure value){
		this.CentreOfGravityInX_of_IfcStructuralProfileProperties=value;
	}

	public IfcLengthMeasure getCentreOfGravityInY_of_IfcStructuralProfileProperties() {
		return CentreOfGravityInY_of_IfcStructuralProfileProperties;
	}

	public void setCentreOfGravityInY_of_IfcStructuralProfileProperties(IfcLengthMeasure value){
		this.CentreOfGravityInY_of_IfcStructuralProfileProperties=value;
	}

}
