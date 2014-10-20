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

public class IfcPersonAndOrganization extends Thing implements IfcActorSelect, IfcObjectReferenceSelect, IfcResourceObjectSelect
{
	// The property attributes
	private IfcPerson ThePerson;
	private IfcOrganization TheOrganization;
	private List<IfcActorRole> Roles_of_IfcPersonAndOrganization = new ArrayList<IfcActorRole>();


	// Getters and setters of properties
	public IfcPerson getThePerson() {
		return ThePerson;
	}

	public void setThePerson(IfcPerson value){
		this.ThePerson=value;
	}

	public IfcOrganization getTheOrganization() {
		return TheOrganization;
	}

	public void setTheOrganization(IfcOrganization value){
		this.TheOrganization=value;
	}

	public List<IfcActorRole> getRoles_of_IfcPersonAndOrganization() {
		return Roles_of_IfcPersonAndOrganization;
	}

	public void setRoles_of_IfcPersonAndOrganization(IfcActorRole value){
		this.Roles_of_IfcPersonAndOrganization.add(value);
	}

}
