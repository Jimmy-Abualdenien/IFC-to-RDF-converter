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

public class IfcDocumentInformation extends IfcExternalInformation implements IfcDocumentSelect
{
	// The property attributes
	private IfcIdentifier Identification_of_IfcDocumentInformation;
	private IfcLabel Name_of_IfcDocumentInformation;
	private IfcText Description_of_IfcDocumentInformation;
	private IfcURIReference Location_of_IfcDocumentInformation;
	private IfcText Purpose_of_IfcDocumentInformation;
	private IfcText IntendedUse;
	private IfcText Scope;
	private IfcLabel Revision;
	private IfcActorSelect DocumentOwner;
	private List<IfcActorSelect> Editors = new ArrayList<IfcActorSelect>();
	private IfcDateTime CreationTime_of_IfcDocumentInformation;
	private IfcDateTime LastRevisionTime;
	private IfcIdentifier ElectronicFormat;
	private IfcDate ValidFrom;
	private IfcDate ValidUntil;
	private IfcDocumentConfidentialityEnum Confidentiality;
	private IfcDocumentStatusEnum Status_of_IfcDocumentInformation;
	// The inverse attributes
	private List<IfcRelAssociatesDocument> DocumentInfoForObjects= new ArrayList<IfcRelAssociatesDocument>();
	private List<IfcDocumentReference> HasDocumentReferences= new ArrayList<IfcDocumentReference>();
	private List<IfcDocumentInformationRelationship> IsPointedTo= new ArrayList<IfcDocumentInformationRelationship>();
	private List<IfcDocumentInformationRelationship> IsPointer= new ArrayList<IfcDocumentInformationRelationship>();


	// Getters and setters of properties
	public IfcIdentifier getIdentification_of_IfcDocumentInformation() {
		return Identification_of_IfcDocumentInformation;
	}

	public void setIdentification_of_IfcDocumentInformation(IfcIdentifier value){
		this.Identification_of_IfcDocumentInformation=value;
	}

	public IfcLabel getName_of_IfcDocumentInformation() {
		return Name_of_IfcDocumentInformation;
	}

	public void setName_of_IfcDocumentInformation(IfcLabel value){
		this.Name_of_IfcDocumentInformation=value;
	}

	public IfcText getDescription_of_IfcDocumentInformation() {
		return Description_of_IfcDocumentInformation;
	}

	public void setDescription_of_IfcDocumentInformation(IfcText value){
		this.Description_of_IfcDocumentInformation=value;
	}

	public IfcURIReference getLocation_of_IfcDocumentInformation() {
		return Location_of_IfcDocumentInformation;
	}

	public void setLocation_of_IfcDocumentInformation(IfcURIReference value){
		this.Location_of_IfcDocumentInformation=value;
	}

	public IfcText getPurpose_of_IfcDocumentInformation() {
		return Purpose_of_IfcDocumentInformation;
	}

	public void setPurpose_of_IfcDocumentInformation(IfcText value){
		this.Purpose_of_IfcDocumentInformation=value;
	}

	public IfcText getIntendedUse() {
		return IntendedUse;
	}

	public void setIntendedUse(IfcText value){
		this.IntendedUse=value;
	}

	public IfcText getScope() {
		return Scope;
	}

	public void setScope(IfcText value){
		this.Scope=value;
	}

	public IfcLabel getRevision() {
		return Revision;
	}

	public void setRevision(IfcLabel value){
		this.Revision=value;
	}

	public IfcActorSelect getDocumentOwner() {
		return DocumentOwner;
	}

	public void setDocumentOwner(IfcActorSelect value){
		this.DocumentOwner=value;
	}

	public List<IfcActorSelect> getEditors() {
		return Editors;
	}

	public void setEditors(IfcActorSelect value){
		this.Editors.add(value);
	}

	public IfcDateTime getCreationTime_of_IfcDocumentInformation() {
		return CreationTime_of_IfcDocumentInformation;
	}

	public void setCreationTime_of_IfcDocumentInformation(IfcDateTime value){
		this.CreationTime_of_IfcDocumentInformation=value;
	}

	public IfcDateTime getLastRevisionTime() {
		return LastRevisionTime;
	}

	public void setLastRevisionTime(IfcDateTime value){
		this.LastRevisionTime=value;
	}

	public IfcIdentifier getElectronicFormat() {
		return ElectronicFormat;
	}

	public void setElectronicFormat(IfcIdentifier value){
		this.ElectronicFormat=value;
	}

	public IfcDate getValidFrom() {
		return ValidFrom;
	}

	public void setValidFrom(IfcDate value){
		this.ValidFrom=value;
	}

	public IfcDate getValidUntil() {
		return ValidUntil;
	}

	public void setValidUntil(IfcDate value){
		this.ValidUntil=value;
	}

	public IfcDocumentConfidentialityEnum getConfidentiality() {
		return Confidentiality;
	}

	public void setConfidentiality(IfcDocumentConfidentialityEnum value){
		this.Confidentiality=value;
	}

	public IfcDocumentStatusEnum getStatus_of_IfcDocumentInformation() {
		return Status_of_IfcDocumentInformation;
	}

	public void setStatus_of_IfcDocumentInformation(IfcDocumentStatusEnum value){
		this.Status_of_IfcDocumentInformation=value;
	}

	// Getters and setters of inverse values

	public List<IfcRelAssociatesDocument> getDocumentInfoForObjects() {
		return DocumentInfoForObjects;
	}

	public void setDocumentInfoForObjects(IfcRelAssociatesDocument value){
		this.DocumentInfoForObjects.add(value);
	}

	public List<IfcDocumentReference> getHasDocumentReferences() {
		return HasDocumentReferences;
	}

	public void setHasDocumentReferences(IfcDocumentReference value){
		this.HasDocumentReferences.add(value);
	}

	public List<IfcDocumentInformationRelationship> getIsPointedTo() {
		return IsPointedTo;
	}

	public void setIsPointedTo(IfcDocumentInformationRelationship value){
		this.IsPointedTo.add(value);
	}

	public List<IfcDocumentInformationRelationship> getIsPointer() {
		return IsPointer;
	}

	public void setIsPointer(IfcDocumentInformationRelationship value){
		this.IsPointer.add(value);
	}

}
