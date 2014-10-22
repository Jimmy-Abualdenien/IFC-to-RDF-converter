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

public class IfcApproval extends Thing 
{
	// The property attributes
	private IfcText Description_of_IfcApproval;
	private IfcDateTimeSelect ApprovalDateTime;
	private IfcLabel ApprovalStatus;
	private IfcLabel ApprovalLevel;
	private IfcText ApprovalQualifier;
	private IfcLabel Name_of_IfcApproval;
	private IfcIdentifier Identifier_of_IfcApproval;
	// The inverse attributes
	private List<IfcApprovalActorRelationship> Actors= new ArrayList<IfcApprovalActorRelationship>();
	private List<IfcApprovalRelationship> IsRelatedWith= new ArrayList<IfcApprovalRelationship>();
	private List<IfcApprovalRelationship> Relates= new ArrayList<IfcApprovalRelationship>();


	// Getters and setters of properties
	public IfcText getDescription_of_IfcApproval() {
		return Description_of_IfcApproval;
	}

	public void setDescription_of_IfcApproval(IfcText value){
		this.Description_of_IfcApproval=value;
	}

	public IfcDateTimeSelect getApprovalDateTime() {
		return ApprovalDateTime;
	}

	public void setApprovalDateTime(IfcDateTimeSelect value){
		this.ApprovalDateTime=value;
	}

	public IfcLabel getApprovalStatus() {
		return ApprovalStatus;
	}

	public void setApprovalStatus(IfcLabel value){
		this.ApprovalStatus=value;
	}

	public IfcLabel getApprovalLevel() {
		return ApprovalLevel;
	}

	public void setApprovalLevel(IfcLabel value){
		this.ApprovalLevel=value;
	}

	public IfcText getApprovalQualifier() {
		return ApprovalQualifier;
	}

	public void setApprovalQualifier(IfcText value){
		this.ApprovalQualifier=value;
	}

	public IfcLabel getName_of_IfcApproval() {
		return Name_of_IfcApproval;
	}

	public void setName_of_IfcApproval(IfcLabel value){
		this.Name_of_IfcApproval=value;
	}

	public IfcIdentifier getIdentifier_of_IfcApproval() {
		return Identifier_of_IfcApproval;
	}

	public void setIdentifier_of_IfcApproval(IfcIdentifier value){
		this.Identifier_of_IfcApproval=value;
	}

	// Getters and setters of inverse values

	public List<IfcApprovalActorRelationship> getActors() {
		return Actors;
	}

	public void setActors(IfcApprovalActorRelationship value){
		this.Actors.add(value);
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
