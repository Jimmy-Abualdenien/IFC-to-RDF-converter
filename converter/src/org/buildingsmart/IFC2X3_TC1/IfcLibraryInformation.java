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

public class IfcLibraryInformation extends Thing implements IfcLibrarySelect
{
	// The property attributes
	private IfcLabel Name_of_IfcLibraryInformation;
	private IfcLabel Version_of_IfcLibraryInformation;
	private IfcOrganization Publisher;
	private IfcCalendarDate VersionDate;
	private List<IfcLibraryReference> LibraryReference = new ArrayList<IfcLibraryReference>();


	// Getters and setters of properties
	public IfcLabel getName_of_IfcLibraryInformation() {
		return Name_of_IfcLibraryInformation;
	}

	public void setName_of_IfcLibraryInformation(IfcLabel value){
		this.Name_of_IfcLibraryInformation=value;
	}

	public IfcLabel getVersion_of_IfcLibraryInformation() {
		return Version_of_IfcLibraryInformation;
	}

	public void setVersion_of_IfcLibraryInformation(IfcLabel value){
		this.Version_of_IfcLibraryInformation=value;
	}

	public IfcOrganization getPublisher() {
		return Publisher;
	}

	public void setPublisher(IfcOrganization value){
		this.Publisher=value;
	}

	public IfcCalendarDate getVersionDate() {
		return VersionDate;
	}

	public void setVersionDate(IfcCalendarDate value){
		this.VersionDate=value;
	}

	public List<IfcLibraryReference> getLibraryReference() {
		return LibraryReference;
	}

	public void setLibraryReference(IfcLibraryReference value){
		this.LibraryReference.add(value);
	}

}
