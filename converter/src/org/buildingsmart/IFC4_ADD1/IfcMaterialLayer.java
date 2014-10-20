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

public class IfcMaterialLayer extends IfcMaterialDefinition 
{
	// The property attributes
	private IfcMaterial Material_of_IfcMaterialLayer;
	private IfcNonNegativeLengthMeasure LayerThickness;
	private IfcLogical IsVentilated;
	private IfcLabel Name_of_IfcMaterialLayer;
	private IfcText Description_of_IfcMaterialLayer;
	private IfcLabel Category_of_IfcMaterialLayer;
	private IfcNormalisedRatioMeasure Priority_of_IfcMaterialLayer;
 // The inverse attributes

	private List<IfcMaterialLayerSet> ToMaterialLayerSet= new ArrayList<IfcMaterialLayerSet>();


	// Getters and setters of properties
	public IfcMaterial getMaterial_of_IfcMaterialLayer() {
		return Material_of_IfcMaterialLayer;
	}

	public void setMaterial_of_IfcMaterialLayer(IfcMaterial value){
		this.Material_of_IfcMaterialLayer=value;
	}

	public IfcNonNegativeLengthMeasure getLayerThickness() {
		return LayerThickness;
	}

	public void setLayerThickness(IfcNonNegativeLengthMeasure value){
		this.LayerThickness=value;
	}

	public IfcLogical getIsVentilated() {
		return IsVentilated;
	}

	public void setIsVentilated(IfcLogical value){
		this.IsVentilated=value;
	}

	public IfcLabel getName_of_IfcMaterialLayer() {
		return Name_of_IfcMaterialLayer;
	}

	public void setName_of_IfcMaterialLayer(IfcLabel value){
		this.Name_of_IfcMaterialLayer=value;
	}

	public IfcText getDescription_of_IfcMaterialLayer() {
		return Description_of_IfcMaterialLayer;
	}

	public void setDescription_of_IfcMaterialLayer(IfcText value){
		this.Description_of_IfcMaterialLayer=value;
	}

	public IfcLabel getCategory_of_IfcMaterialLayer() {
		return Category_of_IfcMaterialLayer;
	}

	public void setCategory_of_IfcMaterialLayer(IfcLabel value){
		this.Category_of_IfcMaterialLayer=value;
	}

	public IfcNormalisedRatioMeasure getPriority_of_IfcMaterialLayer() {
		return Priority_of_IfcMaterialLayer;
	}

	public void setPriority_of_IfcMaterialLayer(IfcNormalisedRatioMeasure value){
		this.Priority_of_IfcMaterialLayer=value;
	}

	// Getters and setters of inverse values

	public List<IfcMaterialLayerSet> getToMaterialLayerSet() {
		return ToMaterialLayerSet;
	}

	public void setToMaterialLayerSet(IfcMaterialLayerSet value){
		this.ToMaterialLayerSet.add(value);
	}

}
