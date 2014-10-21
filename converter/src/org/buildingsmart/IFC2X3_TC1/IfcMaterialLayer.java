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

public class IfcMaterialLayer extends Thing implements IfcObjectReferenceSelect, IfcMaterialSelect
{
	// The property attributes
	private IfcMaterial Material_of_IfcMaterialLayer;
	private IfcPositiveLengthMeasure LayerThickness;
	private IfcLogical IsVentilated;
 // The inverse attributes

	private List<IfcMaterialLayerSet> ToMaterialLayerSet= new ArrayList<IfcMaterialLayerSet>();


	// Getters and setters of properties
	public IfcMaterial getMaterial_of_IfcMaterialLayer() {
		return Material_of_IfcMaterialLayer;
	}

	public void setMaterial_of_IfcMaterialLayer(IfcMaterial value){
		this.Material_of_IfcMaterialLayer=value;
	}

	public IfcPositiveLengthMeasure getLayerThickness() {
		return LayerThickness;
	}

	public void setLayerThickness(IfcPositiveLengthMeasure value){
		this.LayerThickness=value;
	}

	public IfcLogical getIsVentilated() {
		return IsVentilated;
	}

	public void setIsVentilated(IfcLogical value){
		this.IsVentilated=value;
	}

	// Getters and setters of inverse values

	public List<IfcMaterialLayerSet> getToMaterialLayerSet() {
		return ToMaterialLayerSet;
	}

	public void setToMaterialLayerSet(IfcMaterialLayerSet value){
		this.ToMaterialLayerSet.add(value);
	}

}
