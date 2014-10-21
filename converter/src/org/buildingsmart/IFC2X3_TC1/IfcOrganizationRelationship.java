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

public class IfcOrganizationRelationship extends Thing 
{
	// The property attributes
	private IfcLabel Name_of_IfcOrganizationRelationship;
	private IfcText Description_of_IfcOrganizationRelationship;
	private IfcOrganization RelatingOrganization;
	private List<IfcOrganization> RelatedOrganizations = new ArrayList<IfcOrganization>();


	// Getters and setters of properties
	public IfcLabel getName_of_IfcOrganizationRelationship() {
		return Name_of_IfcOrganizationRelationship;
	}

	public void setName_of_IfcOrganizationRelationship(IfcLabel value){
		this.Name_of_IfcOrganizationRelationship=value;
	}

	public IfcText getDescription_of_IfcOrganizationRelationship() {
		return Description_of_IfcOrganizationRelationship;
	}

	public void setDescription_of_IfcOrganizationRelationship(IfcText value){
		this.Description_of_IfcOrganizationRelationship=value;
	}

	public IfcOrganization getRelatingOrganization() {
		return RelatingOrganization;
	}

	public void setRelatingOrganization(IfcOrganization value){
		this.RelatingOrganization=value;
	}

	public List<IfcOrganization> getRelatedOrganizations() {
		return RelatedOrganizations;
	}

	public void setRelatedOrganizations(IfcOrganization value){
		this.RelatedOrganizations.add(value);
	}

}
