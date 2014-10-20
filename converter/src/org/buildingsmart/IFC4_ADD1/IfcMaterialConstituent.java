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

public class IfcMaterialConstituent extends IfcMaterialDefinition 
{
	// The property attributes
	private IfcLabel Name_of_IfcMaterialConstituent;
	private IfcText Description_of_IfcMaterialConstituent;
	private IfcMaterial Material_of_IfcMaterialConstituent;
	private IfcNormalisedRatioMeasure Fraction;
	private IfcLabel Category_of_IfcMaterialConstituent;
 // The inverse attributes

	private List<IfcMaterialConstituentSet> ToMaterialConstituentSet= new ArrayList<IfcMaterialConstituentSet>();


	// Getters and setters of properties
	public IfcLabel getName_of_IfcMaterialConstituent() {
		return Name_of_IfcMaterialConstituent;
	}

	public void setName_of_IfcMaterialConstituent(IfcLabel value){
		this.Name_of_IfcMaterialConstituent=value;
	}

	public IfcText getDescription_of_IfcMaterialConstituent() {
		return Description_of_IfcMaterialConstituent;
	}

	public void setDescription_of_IfcMaterialConstituent(IfcText value){
		this.Description_of_IfcMaterialConstituent=value;
	}

	public IfcMaterial getMaterial_of_IfcMaterialConstituent() {
		return Material_of_IfcMaterialConstituent;
	}

	public void setMaterial_of_IfcMaterialConstituent(IfcMaterial value){
		this.Material_of_IfcMaterialConstituent=value;
	}

	public IfcNormalisedRatioMeasure getFraction() {
		return Fraction;
	}

	public void setFraction(IfcNormalisedRatioMeasure value){
		this.Fraction=value;
	}

	public IfcLabel getCategory_of_IfcMaterialConstituent() {
		return Category_of_IfcMaterialConstituent;
	}

	public void setCategory_of_IfcMaterialConstituent(IfcLabel value){
		this.Category_of_IfcMaterialConstituent=value;
	}

	// Getters and setters of inverse values

	public List<IfcMaterialConstituentSet> getToMaterialConstituentSet() {
		return ToMaterialConstituentSet;
	}

	public void setToMaterialConstituentSet(IfcMaterialConstituentSet value){
		this.ToMaterialConstituentSet.add(value);
	}

}
