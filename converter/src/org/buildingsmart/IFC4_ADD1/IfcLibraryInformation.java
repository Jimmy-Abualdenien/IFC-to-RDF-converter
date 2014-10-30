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

public class IfcLibraryInformation extends IfcExternalInformation implements IfcLibrarySelect
{
	// The property attributes
	private IfcLabel Name_of_IfcLibraryInformation;
	private IfcLabel Version_of_IfcLibraryInformation;
	private IfcActorSelect Publisher;
	private IfcDateTime VersionDate;
	private IfcURIReference Location_of_IfcLibraryInformation;
	private IfcText Description_of_IfcLibraryInformation;
	// The inverse attributes
	private List<IfcRelAssociatesLibrary> LibraryInfoForObjects= new ArrayList<IfcRelAssociatesLibrary>();
	private List<IfcLibraryReference> HasLibraryReferences= new ArrayList<IfcLibraryReference>();


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

	public IfcActorSelect getPublisher() {
		return Publisher;
	}

	public void setPublisher(IfcActorSelect value){
		this.Publisher=value;
	}

	public IfcDateTime getVersionDate() {
		return VersionDate;
	}

	public void setVersionDate(IfcDateTime value){
		this.VersionDate=value;
	}

	public IfcURIReference getLocation_of_IfcLibraryInformation() {
		return Location_of_IfcLibraryInformation;
	}

	public void setLocation_of_IfcLibraryInformation(IfcURIReference value){
		this.Location_of_IfcLibraryInformation=value;
	}

	public IfcText getDescription_of_IfcLibraryInformation() {
		return Description_of_IfcLibraryInformation;
	}

	public void setDescription_of_IfcLibraryInformation(IfcText value){
		this.Description_of_IfcLibraryInformation=value;
	}

	// Getters and setters of inverse values

	public List<IfcRelAssociatesLibrary> getLibraryInfoForObjects() {
		return LibraryInfoForObjects;
	}

	public void setLibraryInfoForObjects(IfcRelAssociatesLibrary value){
		this.LibraryInfoForObjects.add(value);
	}

	public List<IfcLibraryReference> getHasLibraryReferences() {
		return HasLibraryReferences;
	}

	public void setHasLibraryReferences(IfcLibraryReference value){
		this.HasLibraryReferences.add(value);
	}

}
