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

public class IfcOrganization extends Thing implements IfcActorSelect, IfcObjectReferenceSelect
{
	// The property attributes
	private IfcIdentifier Id_of_IfcOrganization;
	private IfcLabel Name_of_IfcOrganization;
	private IfcText Description_of_IfcOrganization;
	private List<IfcActorRole> Roles_of_IfcOrganization = new ArrayList<IfcActorRole>();
	private List<IfcAddress> Addresses_of_IfcOrganization = new ArrayList<IfcAddress>();
 // The inverse attributes

	private List<IfcOrganizationRelationship> IsRelatedBy= new ArrayList<IfcOrganizationRelationship>();
	private List<IfcOrganizationRelationship> Relates= new ArrayList<IfcOrganizationRelationship>();
	private List<IfcPersonAndOrganization> Engages= new ArrayList<IfcPersonAndOrganization>();


	// Getters and setters of properties
	public IfcIdentifier getId_of_IfcOrganization() {
		return Id_of_IfcOrganization;
	}

	public void setId_of_IfcOrganization(IfcIdentifier value){
		this.Id_of_IfcOrganization=value;
	}

	public IfcLabel getName_of_IfcOrganization() {
		return Name_of_IfcOrganization;
	}

	public void setName_of_IfcOrganization(IfcLabel value){
		this.Name_of_IfcOrganization=value;
	}

	public IfcText getDescription_of_IfcOrganization() {
		return Description_of_IfcOrganization;
	}

	public void setDescription_of_IfcOrganization(IfcText value){
		this.Description_of_IfcOrganization=value;
	}

	public List<IfcActorRole> getRoles_of_IfcOrganization() {
		return Roles_of_IfcOrganization;
	}

	public void setRoles_of_IfcOrganization(IfcActorRole value){
		this.Roles_of_IfcOrganization.add(value);
	}

	public List<IfcAddress> getAddresses_of_IfcOrganization() {
		return Addresses_of_IfcOrganization;
	}

	public void setAddresses_of_IfcOrganization(IfcAddress value){
		this.Addresses_of_IfcOrganization.add(value);
	}

	// Getters and setters of inverse values

	public List<IfcOrganizationRelationship> getIsRelatedBy() {
		return IsRelatedBy;
	}

	public void setIsRelatedBy(IfcOrganizationRelationship value){
		this.IsRelatedBy.add(value);
	}

	public List<IfcOrganizationRelationship> getRelates() {
		return Relates;
	}

	public void setRelates(IfcOrganizationRelationship value){
		this.Relates.add(value);
	}

	public List<IfcPersonAndOrganization> getEngages() {
		return Engages;
	}

	public void setEngages(IfcPersonAndOrganization value){
		this.Engages.add(value);
	}

}
