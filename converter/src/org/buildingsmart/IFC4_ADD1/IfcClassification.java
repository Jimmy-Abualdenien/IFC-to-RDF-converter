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

public class IfcClassification extends IfcExternalInformation implements IfcClassificationReferenceSelect, IfcClassificationSelect
{
	// The property attributes
	private IfcLabel Source;
	private IfcLabel Edition;
	private IfcDate EditionDate;
	private IfcLabel Name_of_IfcClassification;
	private IfcText Description_of_IfcClassification;
	private IfcURIReference Location_of_IfcClassification;
	private List<IfcIdentifier> ReferenceTokens = new ArrayList<IfcIdentifier>();
	// The inverse attributes
	private List<IfcRelAssociatesClassification> ClassificationForObjects= new ArrayList<IfcRelAssociatesClassification>();
	private List<IfcClassificationReference> HasReferences= new ArrayList<IfcClassificationReference>();


	// Getters and setters of properties
	public IfcLabel getSource() {
		return Source;
	}

	public void setSource(IfcLabel value){
		this.Source=value;
	}

	public IfcLabel getEdition() {
		return Edition;
	}

	public void setEdition(IfcLabel value){
		this.Edition=value;
	}

	public IfcDate getEditionDate() {
		return EditionDate;
	}

	public void setEditionDate(IfcDate value){
		this.EditionDate=value;
	}

	public IfcLabel getName_of_IfcClassification() {
		return Name_of_IfcClassification;
	}

	public void setName_of_IfcClassification(IfcLabel value){
		this.Name_of_IfcClassification=value;
	}

	public IfcText getDescription_of_IfcClassification() {
		return Description_of_IfcClassification;
	}

	public void setDescription_of_IfcClassification(IfcText value){
		this.Description_of_IfcClassification=value;
	}

	public IfcURIReference getLocation_of_IfcClassification() {
		return Location_of_IfcClassification;
	}

	public void setLocation_of_IfcClassification(IfcURIReference value){
		this.Location_of_IfcClassification=value;
	}

	public List<IfcIdentifier> getReferenceTokens() {
		return ReferenceTokens;
	}

	public void setReferenceTokens(IfcIdentifier value){
		this.ReferenceTokens.add(value);
	}

	// Getters and setters of inverse values

	public List<IfcRelAssociatesClassification> getClassificationForObjects() {
		return ClassificationForObjects;
	}

	public void setClassificationForObjects(IfcRelAssociatesClassification value){
		this.ClassificationForObjects.add(value);
	}

	public List<IfcClassificationReference> getHasReferences() {
		return HasReferences;
	}

	public void setHasReferences(IfcClassificationReference value){
		this.HasReferences.add(value);
	}

}
