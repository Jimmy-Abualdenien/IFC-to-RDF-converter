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

public class IfcExternalReference extends Thing implements IfcObjectReferenceSelect, IfcResourceObjectSelect, IfcLightDistributionDataSourceSelect
{
	// The property attributes
	private IfcURIReference Location_of_IfcExternalReference;
	private IfcIdentifier Identification_of_IfcExternalReference;
	private IfcLabel Name_of_IfcExternalReference;
 // The inverse attributes

	private List<IfcExternalReferenceRelationship> ExternalReferenceForResources= new ArrayList<IfcExternalReferenceRelationship>();


	// Getters and setters of properties
	public IfcURIReference getLocation_of_IfcExternalReference() {
		return Location_of_IfcExternalReference;
	}

	public void setLocation_of_IfcExternalReference(IfcURIReference value){
		this.Location_of_IfcExternalReference=value;
	}

	public IfcIdentifier getIdentification_of_IfcExternalReference() {
		return Identification_of_IfcExternalReference;
	}

	public void setIdentification_of_IfcExternalReference(IfcIdentifier value){
		this.Identification_of_IfcExternalReference=value;
	}

	public IfcLabel getName_of_IfcExternalReference() {
		return Name_of_IfcExternalReference;
	}

	public void setName_of_IfcExternalReference(IfcLabel value){
		this.Name_of_IfcExternalReference=value;
	}

	// Getters and setters of inverse values

	public List<IfcExternalReferenceRelationship> getExternalReferenceForResources() {
		return ExternalReferenceForResources;
	}

	public void setExternalReferenceForResources(IfcExternalReferenceRelationship value){
		this.ExternalReferenceForResources.add(value);
	}

}
