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

public class IfcClassificationReference extends IfcExternalReference implements IfcClassificationReferenceSelect, IfcClassificationSelect
{
	// The property attributes
	private IfcClassificationReferenceSelect ReferencedSource;
	private IfcText Description_of_IfcClassificationReference;
	private IfcIdentifier Sort;
 // The inverse attributes

	private List<IfcRelAssociatesClassification> ClassificationRefForObjects= new ArrayList<IfcRelAssociatesClassification>();
	private List<IfcClassificationReference> HasReferences= new ArrayList<IfcClassificationReference>();


	// Getters and setters of properties
	public IfcClassificationReferenceSelect getReferencedSource() {
		return ReferencedSource;
	}

	public void setReferencedSource(IfcClassificationReferenceSelect value){
		this.ReferencedSource=value;
	}

	public IfcText getDescription_of_IfcClassificationReference() {
		return Description_of_IfcClassificationReference;
	}

	public void setDescription_of_IfcClassificationReference(IfcText value){
		this.Description_of_IfcClassificationReference=value;
	}

	public IfcIdentifier getSort() {
		return Sort;
	}

	public void setSort(IfcIdentifier value){
		this.Sort=value;
	}

	// Getters and setters of inverse values

	public List<IfcRelAssociatesClassification> getClassificationRefForObjects() {
		return ClassificationRefForObjects;
	}

	public void setClassificationRefForObjects(IfcRelAssociatesClassification value){
		this.ClassificationRefForObjects.add(value);
	}

	public List<IfcClassificationReference> getHasReferences() {
		return HasReferences;
	}

	public void setHasReferences(IfcClassificationReference value){
		this.HasReferences.add(value);
	}

}
