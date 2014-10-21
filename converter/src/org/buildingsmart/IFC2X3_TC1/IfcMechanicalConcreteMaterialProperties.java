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

public class IfcMechanicalConcreteMaterialProperties extends IfcMechanicalMaterialProperties 
{
	// The property attributes
	private IfcPressureMeasure CompressiveStrength;
	private IfcPositiveLengthMeasure MaxAggregateSize;
	private IfcText AdmixturesDescription;
	private IfcText Workability;
	private IfcNormalisedRatioMeasure ProtectivePoreRatio;
	private IfcText WaterImpermeability;


	// Getters and setters of properties
	public IfcPressureMeasure getCompressiveStrength() {
		return CompressiveStrength;
	}

	public void setCompressiveStrength(IfcPressureMeasure value){
		this.CompressiveStrength=value;
	}

	public IfcPositiveLengthMeasure getMaxAggregateSize() {
		return MaxAggregateSize;
	}

	public void setMaxAggregateSize(IfcPositiveLengthMeasure value){
		this.MaxAggregateSize=value;
	}

	public IfcText getAdmixturesDescription() {
		return AdmixturesDescription;
	}

	public void setAdmixturesDescription(IfcText value){
		this.AdmixturesDescription=value;
	}

	public IfcText getWorkability() {
		return Workability;
	}

	public void setWorkability(IfcText value){
		this.Workability=value;
	}

	public IfcNormalisedRatioMeasure getProtectivePoreRatio() {
		return ProtectivePoreRatio;
	}

	public void setProtectivePoreRatio(IfcNormalisedRatioMeasure value){
		this.ProtectivePoreRatio=value;
	}

	public IfcText getWaterImpermeability() {
		return WaterImpermeability;
	}

	public void setWaterImpermeability(IfcText value){
		this.WaterImpermeability=value;
	}

}
