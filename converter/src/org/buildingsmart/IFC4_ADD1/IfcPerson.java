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

public class IfcPerson extends Thing implements IfcActorSelect, IfcObjectReferenceSelect, IfcResourceObjectSelect
{
	// The property attributes
	private IfcIdentifier Identification_of_IfcPerson;
	private IfcLabel FamilyName;
	private IfcLabel GivenName;
	private List<IfcLabel> MiddleNames = new ArrayList<IfcLabel>();
	private List<IfcLabel> PrefixTitles = new ArrayList<IfcLabel>();
	private List<IfcLabel> SuffixTitles = new ArrayList<IfcLabel>();
	private List<IfcActorRole> Roles_of_IfcPerson = new ArrayList<IfcActorRole>();
	private List<IfcAddress> Addresses_of_IfcPerson = new ArrayList<IfcAddress>();
	// The inverse attributes
	private List<IfcPersonAndOrganization> EngagedIn= new ArrayList<IfcPersonAndOrganization>();


	// Getters and setters of properties
	public IfcIdentifier getIdentification_of_IfcPerson() {
		return Identification_of_IfcPerson;
	}

	public void setIdentification_of_IfcPerson(IfcIdentifier value){
		this.Identification_of_IfcPerson=value;
	}

	public IfcLabel getFamilyName() {
		return FamilyName;
	}

	public void setFamilyName(IfcLabel value){
		this.FamilyName=value;
	}

	public IfcLabel getGivenName() {
		return GivenName;
	}

	public void setGivenName(IfcLabel value){
		this.GivenName=value;
	}

	public List<IfcLabel> getMiddleNames() {
		return MiddleNames;
	}

	public void setMiddleNames(IfcLabel value){
		this.MiddleNames.add(value);
	}

	public List<IfcLabel> getPrefixTitles() {
		return PrefixTitles;
	}

	public void setPrefixTitles(IfcLabel value){
		this.PrefixTitles.add(value);
	}

	public List<IfcLabel> getSuffixTitles() {
		return SuffixTitles;
	}

	public void setSuffixTitles(IfcLabel value){
		this.SuffixTitles.add(value);
	}

	public List<IfcActorRole> getRoles_of_IfcPerson() {
		return Roles_of_IfcPerson;
	}

	public void setRoles_of_IfcPerson(IfcActorRole value){
		this.Roles_of_IfcPerson.add(value);
	}

	public List<IfcAddress> getAddresses_of_IfcPerson() {
		return Addresses_of_IfcPerson;
	}

	public void setAddresses_of_IfcPerson(IfcAddress value){
		this.Addresses_of_IfcPerson.add(value);
	}

	// Getters and setters of inverse values

	public List<IfcPersonAndOrganization> getEngagedIn() {
		return EngagedIn;
	}

	public void setEngagedIn(IfcPersonAndOrganization value){
		this.EngagedIn.add(value);
	}

}
