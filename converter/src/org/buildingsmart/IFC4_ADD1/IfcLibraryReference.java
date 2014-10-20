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

public class IfcLibraryReference extends IfcExternalReference implements IfcLibrarySelect
{
	// The property attributes
	private IfcText Description_of_IfcLibraryReference;
	private IfcLanguageId Language;
	private IfcLibraryInformation ReferencedLibrary;
 // The inverse attributes

	private List<IfcRelAssociatesLibrary> LibraryRefForObjects= new ArrayList<IfcRelAssociatesLibrary>();


	// Getters and setters of properties
	public IfcText getDescription_of_IfcLibraryReference() {
		return Description_of_IfcLibraryReference;
	}

	public void setDescription_of_IfcLibraryReference(IfcText value){
		this.Description_of_IfcLibraryReference=value;
	}

	public IfcLanguageId getLanguage() {
		return Language;
	}

	public void setLanguage(IfcLanguageId value){
		this.Language=value;
	}

	public IfcLibraryInformation getReferencedLibrary() {
		return ReferencedLibrary;
	}

	public void setReferencedLibrary(IfcLibraryInformation value){
		this.ReferencedLibrary=value;
	}

	// Getters and setters of inverse values

	public List<IfcRelAssociatesLibrary> getLibraryRefForObjects() {
		return LibraryRefForObjects;
	}

	public void setLibraryRefForObjects(IfcRelAssociatesLibrary value){
		this.LibraryRefForObjects.add(value);
	}

}
