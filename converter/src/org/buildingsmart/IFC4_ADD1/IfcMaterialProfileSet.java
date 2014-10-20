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

public class IfcMaterialProfileSet extends IfcMaterialDefinition 
{
	// The property attributes
	private IfcLabel Name_of_IfcMaterialProfileSet;
	private IfcText Description_of_IfcMaterialProfileSet;
	private List<IfcMaterialProfile> MaterialProfiles = new ArrayList<IfcMaterialProfile>();
	private IfcCompositeProfileDef CompositeProfile;


	// Getters and setters of properties
	public IfcLabel getName_of_IfcMaterialProfileSet() {
		return Name_of_IfcMaterialProfileSet;
	}

	public void setName_of_IfcMaterialProfileSet(IfcLabel value){
		this.Name_of_IfcMaterialProfileSet=value;
	}

	public IfcText getDescription_of_IfcMaterialProfileSet() {
		return Description_of_IfcMaterialProfileSet;
	}

	public void setDescription_of_IfcMaterialProfileSet(IfcText value){
		this.Description_of_IfcMaterialProfileSet=value;
	}

	public List<IfcMaterialProfile> getMaterialProfiles() {
		return MaterialProfiles;
	}

	public void setMaterialProfiles(IfcMaterialProfile value){
		this.MaterialProfiles.add(value);
	}

	public IfcCompositeProfileDef getCompositeProfile() {
		return CompositeProfile;
	}

	public void setCompositeProfile(IfcCompositeProfileDef value){
		this.CompositeProfile=value;
	}

}
