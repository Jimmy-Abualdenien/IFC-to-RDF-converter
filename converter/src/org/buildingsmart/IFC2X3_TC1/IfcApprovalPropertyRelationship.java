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

public class IfcApprovalPropertyRelationship extends Thing 
{
	// The property attributes
	private List<IfcProperty> ApprovedProperties = new ArrayList<IfcProperty>();
	private IfcApproval Approval_of_IfcApprovalPropertyRelationship;


	// Getters and setters of properties
	public List<IfcProperty> getApprovedProperties() {
		return ApprovedProperties;
	}

	public void setApprovedProperties(IfcProperty value){
		this.ApprovedProperties.add(value);
	}

	public IfcApproval getApproval_of_IfcApprovalPropertyRelationship() {
		return Approval_of_IfcApprovalPropertyRelationship;
	}

	public void setApproval_of_IfcApprovalPropertyRelationship(IfcApproval value){
		this.Approval_of_IfcApprovalPropertyRelationship=value;
	}

}
