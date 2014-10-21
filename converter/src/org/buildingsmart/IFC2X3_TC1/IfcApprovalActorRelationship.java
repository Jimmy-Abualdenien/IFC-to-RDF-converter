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

public class IfcApprovalActorRelationship extends Thing 
{
	// The property attributes
	private IfcActorSelect Actor;
	private IfcApproval Approval_of_IfcApprovalActorRelationship;
	private IfcActorRole Role_of_IfcApprovalActorRelationship;


	// Getters and setters of properties
	public IfcActorSelect getActor() {
		return Actor;
	}

	public void setActor(IfcActorSelect value){
		this.Actor=value;
	}

	public IfcApproval getApproval_of_IfcApprovalActorRelationship() {
		return Approval_of_IfcApprovalActorRelationship;
	}

	public void setApproval_of_IfcApprovalActorRelationship(IfcApproval value){
		this.Approval_of_IfcApprovalActorRelationship=value;
	}

	public IfcActorRole getRole_of_IfcApprovalActorRelationship() {
		return Role_of_IfcApprovalActorRelationship;
	}

	public void setRole_of_IfcApprovalActorRelationship(IfcActorRole value){
		this.Role_of_IfcApprovalActorRelationship=value;
	}

}
