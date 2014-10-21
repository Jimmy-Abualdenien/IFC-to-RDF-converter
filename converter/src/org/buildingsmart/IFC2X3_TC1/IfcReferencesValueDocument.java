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

public class IfcReferencesValueDocument extends Thing 
{
	// The property attributes
	private IfcDocumentSelect ReferencedDocument;
	private List<IfcAppliedValue> ReferencingValues = new ArrayList<IfcAppliedValue>();
	private IfcLabel Name_of_IfcReferencesValueDocument;
	private IfcText Description_of_IfcReferencesValueDocument;


	// Getters and setters of properties
	public IfcDocumentSelect getReferencedDocument() {
		return ReferencedDocument;
	}

	public void setReferencedDocument(IfcDocumentSelect value){
		this.ReferencedDocument=value;
	}

	public List<IfcAppliedValue> getReferencingValues() {
		return ReferencingValues;
	}

	public void setReferencingValues(IfcAppliedValue value){
		this.ReferencingValues.add(value);
	}

	public IfcLabel getName_of_IfcReferencesValueDocument() {
		return Name_of_IfcReferencesValueDocument;
	}

	public void setName_of_IfcReferencesValueDocument(IfcLabel value){
		this.Name_of_IfcReferencesValueDocument=value;
	}

	public IfcText getDescription_of_IfcReferencesValueDocument() {
		return Description_of_IfcReferencesValueDocument;
	}

	public void setDescription_of_IfcReferencesValueDocument(IfcText value){
		this.Description_of_IfcReferencesValueDocument=value;
	}

}
