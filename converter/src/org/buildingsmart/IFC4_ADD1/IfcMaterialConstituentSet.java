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

public class IfcMaterialConstituentSet extends IfcMaterialDefinition 
{
	// The property attributes
	private IfcLabel Name_of_IfcMaterialConstituentSet;
	private IfcText Description_of_IfcMaterialConstituentSet;
	private List<IfcMaterialConstituent> MaterialConstituents = new ArrayList<IfcMaterialConstituent>();


	// Getters and setters of properties
	public IfcLabel getName_of_IfcMaterialConstituentSet() {
		return Name_of_IfcMaterialConstituentSet;
	}

	public void setName_of_IfcMaterialConstituentSet(IfcLabel value){
		this.Name_of_IfcMaterialConstituentSet=value;
	}

	public IfcText getDescription_of_IfcMaterialConstituentSet() {
		return Description_of_IfcMaterialConstituentSet;
	}

	public void setDescription_of_IfcMaterialConstituentSet(IfcText value){
		this.Description_of_IfcMaterialConstituentSet=value;
	}

	public List<IfcMaterialConstituent> getMaterialConstituents() {
		return MaterialConstituents;
	}

	public void setMaterialConstituents(IfcMaterialConstituent value){
		this.MaterialConstituents.add(value);
	}

}
