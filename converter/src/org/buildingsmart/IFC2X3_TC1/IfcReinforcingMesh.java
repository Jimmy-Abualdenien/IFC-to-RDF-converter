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

public class IfcReinforcingMesh extends IfcReinforcingElement 
{
	// The property attributes
	private IfcPositiveLengthMeasure MeshLength;
	private IfcPositiveLengthMeasure MeshWidth;
	private IfcPositiveLengthMeasure LongitudinalBarNominalDiameter;
	private IfcPositiveLengthMeasure TransverseBarNominalDiameter;
	private IfcAreaMeasure LongitudinalBarCrossSectionArea;
	private IfcAreaMeasure TransverseBarCrossSectionArea;
	private IfcPositiveLengthMeasure LongitudinalBarSpacing;
	private IfcPositiveLengthMeasure TransverseBarSpacing;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getMeshLength() {
		return MeshLength;
	}

	public void setMeshLength(IfcPositiveLengthMeasure value){
		this.MeshLength=value;
	}

	public IfcPositiveLengthMeasure getMeshWidth() {
		return MeshWidth;
	}

	public void setMeshWidth(IfcPositiveLengthMeasure value){
		this.MeshWidth=value;
	}

	public IfcPositiveLengthMeasure getLongitudinalBarNominalDiameter() {
		return LongitudinalBarNominalDiameter;
	}

	public void setLongitudinalBarNominalDiameter(IfcPositiveLengthMeasure value){
		this.LongitudinalBarNominalDiameter=value;
	}

	public IfcPositiveLengthMeasure getTransverseBarNominalDiameter() {
		return TransverseBarNominalDiameter;
	}

	public void setTransverseBarNominalDiameter(IfcPositiveLengthMeasure value){
		this.TransverseBarNominalDiameter=value;
	}

	public IfcAreaMeasure getLongitudinalBarCrossSectionArea() {
		return LongitudinalBarCrossSectionArea;
	}

	public void setLongitudinalBarCrossSectionArea(IfcAreaMeasure value){
		this.LongitudinalBarCrossSectionArea=value;
	}

	public IfcAreaMeasure getTransverseBarCrossSectionArea() {
		return TransverseBarCrossSectionArea;
	}

	public void setTransverseBarCrossSectionArea(IfcAreaMeasure value){
		this.TransverseBarCrossSectionArea=value;
	}

	public IfcPositiveLengthMeasure getLongitudinalBarSpacing() {
		return LongitudinalBarSpacing;
	}

	public void setLongitudinalBarSpacing(IfcPositiveLengthMeasure value){
		this.LongitudinalBarSpacing=value;
	}

	public IfcPositiveLengthMeasure getTransverseBarSpacing() {
		return TransverseBarSpacing;
	}

	public void setTransverseBarSpacing(IfcPositiveLengthMeasure value){
		this.TransverseBarSpacing=value;
	}

}
