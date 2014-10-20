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

public class IfcProfileDef extends Thing implements IfcResourceObjectSelect
{
	// The property attributes
	private IfcProfileTypeEnum ProfileType;
	private IfcLabel ProfileName;
 // The inverse attributes

	private List<IfcExternalReferenceRelationship> HasExternalReference= new ArrayList<IfcExternalReferenceRelationship>();
	private List<IfcProfileProperties> HasProperties= new ArrayList<IfcProfileProperties>();


	// Getters and setters of properties
	public IfcProfileTypeEnum getProfileType() {
		return ProfileType;
	}

	public void setProfileType(IfcProfileTypeEnum value){
		this.ProfileType=value;
	}

	public IfcLabel getProfileName() {
		return ProfileName;
	}

	public void setProfileName(IfcLabel value){
		this.ProfileName=value;
	}

	// Getters and setters of inverse values

	public List<IfcExternalReferenceRelationship> getHasExternalReference() {
		return HasExternalReference;
	}

	public void setHasExternalReference(IfcExternalReferenceRelationship value){
		this.HasExternalReference.add(value);
	}

	public List<IfcProfileProperties> getHasProperties() {
		return HasProperties;
	}

	public void setHasProperties(IfcProfileProperties value){
		this.HasProperties.add(value);
	}

}
