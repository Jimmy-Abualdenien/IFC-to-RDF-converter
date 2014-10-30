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

public class IfcActorRole extends Thing implements IfcResourceObjectSelect
{
	// The property attributes
	private IfcRoleEnum Role;
	private IfcLabel UserDefinedRole;
	private IfcText Description_of_IfcActorRole;
	// The inverse attributes
	private List<IfcExternalReferenceRelationship> HasExternalReference= new ArrayList<IfcExternalReferenceRelationship>();


	// Getters and setters of properties
	public IfcRoleEnum getRole() {
		return Role;
	}

	public void setRole(IfcRoleEnum value){
		this.Role=value;
	}

	public IfcLabel getUserDefinedRole() {
		return UserDefinedRole;
	}

	public void setUserDefinedRole(IfcLabel value){
		this.UserDefinedRole=value;
	}

	public IfcText getDescription_of_IfcActorRole() {
		return Description_of_IfcActorRole;
	}

	public void setDescription_of_IfcActorRole(IfcText value){
		this.Description_of_IfcActorRole=value;
	}

	// Getters and setters of inverse values

	public List<IfcExternalReferenceRelationship> getHasExternalReference() {
		return HasExternalReference;
	}

	public void setHasExternalReference(IfcExternalReferenceRelationship value){
		this.HasExternalReference.add(value);
	}

}
