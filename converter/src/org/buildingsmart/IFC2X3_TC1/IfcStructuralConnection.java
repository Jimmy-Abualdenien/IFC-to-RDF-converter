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

public class IfcStructuralConnection extends IfcStructuralItem 
{
	// The property attributes
	private IfcBoundaryCondition AppliedCondition_of_IfcStructuralConnection;
	// The inverse attributes
	private List<IfcRelConnectsStructuralMember> ConnectsStructuralMembers= new ArrayList<IfcRelConnectsStructuralMember>();


	// Getters and setters of properties
	public IfcBoundaryCondition getAppliedCondition_of_IfcStructuralConnection() {
		return AppliedCondition_of_IfcStructuralConnection;
	}

	public void setAppliedCondition_of_IfcStructuralConnection(IfcBoundaryCondition value){
		this.AppliedCondition_of_IfcStructuralConnection=value;
	}

	// Getters and setters of inverse values

	public List<IfcRelConnectsStructuralMember> getConnectsStructuralMembers() {
		return ConnectsStructuralMembers;
	}

	public void setConnectsStructuralMembers(IfcRelConnectsStructuralMember value){
		this.ConnectsStructuralMembers.add(value);
	}

}
