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

public class IfcMaterialProfile extends IfcMaterialDefinition 
{
	// The property attributes
	private IfcLabel Name_of_IfcMaterialProfile;
	private IfcText Description_of_IfcMaterialProfile;
	private IfcMaterial Material_of_IfcMaterialProfile;
	private IfcProfileDef Profile;
	private IfcNormalisedRatioMeasure Priority_of_IfcMaterialProfile;
	private IfcLabel Category_of_IfcMaterialProfile;
 // The inverse attributes

	private List<IfcMaterialProfileSet> ToMaterialProfileSet= new ArrayList<IfcMaterialProfileSet>();


	// Getters and setters of properties
	public IfcLabel getName_of_IfcMaterialProfile() {
		return Name_of_IfcMaterialProfile;
	}

	public void setName_of_IfcMaterialProfile(IfcLabel value){
		this.Name_of_IfcMaterialProfile=value;
	}

	public IfcText getDescription_of_IfcMaterialProfile() {
		return Description_of_IfcMaterialProfile;
	}

	public void setDescription_of_IfcMaterialProfile(IfcText value){
		this.Description_of_IfcMaterialProfile=value;
	}

	public IfcMaterial getMaterial_of_IfcMaterialProfile() {
		return Material_of_IfcMaterialProfile;
	}

	public void setMaterial_of_IfcMaterialProfile(IfcMaterial value){
		this.Material_of_IfcMaterialProfile=value;
	}

	public IfcProfileDef getProfile() {
		return Profile;
	}

	public void setProfile(IfcProfileDef value){
		this.Profile=value;
	}

	public IfcNormalisedRatioMeasure getPriority_of_IfcMaterialProfile() {
		return Priority_of_IfcMaterialProfile;
	}

	public void setPriority_of_IfcMaterialProfile(IfcNormalisedRatioMeasure value){
		this.Priority_of_IfcMaterialProfile=value;
	}

	public IfcLabel getCategory_of_IfcMaterialProfile() {
		return Category_of_IfcMaterialProfile;
	}

	public void setCategory_of_IfcMaterialProfile(IfcLabel value){
		this.Category_of_IfcMaterialProfile=value;
	}

	// Getters and setters of inverse values

	public List<IfcMaterialProfileSet> getToMaterialProfileSet() {
		return ToMaterialProfileSet;
	}

	public void setToMaterialProfileSet(IfcMaterialProfileSet value){
		this.ToMaterialProfileSet.add(value);
	}

}
