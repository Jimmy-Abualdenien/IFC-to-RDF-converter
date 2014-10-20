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

public class IfcApproval extends Thing implements IfcResourceObjectSelect
{
	// The property attributes
	private IfcIdentifier Identifier_of_IfcApproval;
	private IfcLabel Name_of_IfcApproval;
	private IfcText Description_of_IfcApproval;
	private IfcDateTime TimeOfApproval;
	private IfcLabel Status_of_IfcApproval;
	private IfcLabel Level;
	private IfcText Qualifier;
	private IfcActorSelect RequestingApproval;
	private IfcActorSelect GivingApproval;
 // The inverse attributes

	private List<IfcExternalReferenceRelationship> HasExternalReferences= new ArrayList<IfcExternalReferenceRelationship>();
	private List<IfcRelAssociatesApproval> ApprovedObjects= new ArrayList<IfcRelAssociatesApproval>();
	private List<IfcResourceApprovalRelationship> ApprovedResources= new ArrayList<IfcResourceApprovalRelationship>();
	private List<IfcApprovalRelationship> IsRelatedWith= new ArrayList<IfcApprovalRelationship>();
	private List<IfcApprovalRelationship> Relates= new ArrayList<IfcApprovalRelationship>();


	// Getters and setters of properties
	public IfcIdentifier getIdentifier_of_IfcApproval() {
		return Identifier_of_IfcApproval;
	}

	public void setIdentifier_of_IfcApproval(IfcIdentifier value){
		this.Identifier_of_IfcApproval=value;
	}

	public IfcLabel getName_of_IfcApproval() {
		return Name_of_IfcApproval;
	}

	public void setName_of_IfcApproval(IfcLabel value){
		this.Name_of_IfcApproval=value;
	}

	public IfcText getDescription_of_IfcApproval() {
		return Description_of_IfcApproval;
	}

	public void setDescription_of_IfcApproval(IfcText value){
		this.Description_of_IfcApproval=value;
	}

	public IfcDateTime getTimeOfApproval() {
		return TimeOfApproval;
	}

	public void setTimeOfApproval(IfcDateTime value){
		this.TimeOfApproval=value;
	}

	public IfcLabel getStatus_of_IfcApproval() {
		return Status_of_IfcApproval;
	}

	public void setStatus_of_IfcApproval(IfcLabel value){
		this.Status_of_IfcApproval=value;
	}

	public IfcLabel getLevel() {
		return Level;
	}

	public void setLevel(IfcLabel value){
		this.Level=value;
	}

	public IfcText getQualifier() {
		return Qualifier;
	}

	public void setQualifier(IfcText value){
		this.Qualifier=value;
	}

	public IfcActorSelect getRequestingApproval() {
		return RequestingApproval;
	}

	public void setRequestingApproval(IfcActorSelect value){
		this.RequestingApproval=value;
	}

	public IfcActorSelect getGivingApproval() {
		return GivingApproval;
	}

	public void setGivingApproval(IfcActorSelect value){
		this.GivingApproval=value;
	}

	// Getters and setters of inverse values

	public List<IfcExternalReferenceRelationship> getHasExternalReferences() {
		return HasExternalReferences;
	}

	public void setHasExternalReferences(IfcExternalReferenceRelationship value){
		this.HasExternalReferences.add(value);
	}

	public List<IfcRelAssociatesApproval> getApprovedObjects() {
		return ApprovedObjects;
	}

	public void setApprovedObjects(IfcRelAssociatesApproval value){
		this.ApprovedObjects.add(value);
	}

	public List<IfcResourceApprovalRelationship> getApprovedResources() {
		return ApprovedResources;
	}

	public void setApprovedResources(IfcResourceApprovalRelationship value){
		this.ApprovedResources.add(value);
	}

	public List<IfcApprovalRelationship> getIsRelatedWith() {
		return IsRelatedWith;
	}

	public void setIsRelatedWith(IfcApprovalRelationship value){
		this.IsRelatedWith.add(value);
	}

	public List<IfcApprovalRelationship> getRelates() {
		return Relates;
	}

	public void setRelates(IfcApprovalRelationship value){
		this.Relates.add(value);
	}

}
