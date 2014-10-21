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

public class IfcAddress extends Thing implements IfcObjectReferenceSelect
{
	// The property attributes
	private IfcAddressTypeEnum Purpose_of_IfcAddress;
	private IfcText Description_of_IfcAddress;
	private IfcLabel UserDefinedPurpose;
 // The inverse attributes

	private List<IfcPerson> OfPerson= new ArrayList<IfcPerson>();
	private List<IfcOrganization> OfOrganization= new ArrayList<IfcOrganization>();


	// Getters and setters of properties
	public IfcAddressTypeEnum getPurpose_of_IfcAddress() {
		return Purpose_of_IfcAddress;
	}

	public void setPurpose_of_IfcAddress(IfcAddressTypeEnum value){
		this.Purpose_of_IfcAddress=value;
	}

	public IfcText getDescription_of_IfcAddress() {
		return Description_of_IfcAddress;
	}

	public void setDescription_of_IfcAddress(IfcText value){
		this.Description_of_IfcAddress=value;
	}

	public IfcLabel getUserDefinedPurpose() {
		return UserDefinedPurpose;
	}

	public void setUserDefinedPurpose(IfcLabel value){
		this.UserDefinedPurpose=value;
	}

	// Getters and setters of inverse values

	public List<IfcPerson> getOfPerson() {
		return OfPerson;
	}

	public void setOfPerson(IfcPerson value){
		this.OfPerson.add(value);
	}

	public List<IfcOrganization> getOfOrganization() {
		return OfOrganization;
	}

	public void setOfOrganization(IfcOrganization value){
		this.OfOrganization.add(value);
	}

}
