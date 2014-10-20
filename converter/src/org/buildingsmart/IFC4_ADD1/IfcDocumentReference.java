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

public class IfcDocumentReference extends IfcExternalReference implements IfcDocumentSelect
{
	// The property attributes
	private IfcText Description_of_IfcDocumentReference;
	private IfcDocumentInformation ReferencedDocument;
 // The inverse attributes

	private List<IfcRelAssociatesDocument> DocumentRefForObjects= new ArrayList<IfcRelAssociatesDocument>();


	// Getters and setters of properties
	public IfcText getDescription_of_IfcDocumentReference() {
		return Description_of_IfcDocumentReference;
	}

	public void setDescription_of_IfcDocumentReference(IfcText value){
		this.Description_of_IfcDocumentReference=value;
	}

	public IfcDocumentInformation getReferencedDocument() {
		return ReferencedDocument;
	}

	public void setReferencedDocument(IfcDocumentInformation value){
		this.ReferencedDocument=value;
	}

	// Getters and setters of inverse values

	public List<IfcRelAssociatesDocument> getDocumentRefForObjects() {
		return DocumentRefForObjects;
	}

	public void setDocumentRefForObjects(IfcRelAssociatesDocument value){
		this.DocumentRefForObjects.add(value);
	}

}
