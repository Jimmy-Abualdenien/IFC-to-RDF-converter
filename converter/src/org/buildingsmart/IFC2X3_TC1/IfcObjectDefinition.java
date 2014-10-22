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

public class IfcObjectDefinition extends IfcRoot 
{
	// The inverse attributes
	private List<IfcRelAssigns> HasAssignments= new ArrayList<IfcRelAssigns>();
	private List<IfcRelDecomposes> IsDecomposedBy= new ArrayList<IfcRelDecomposes>();
	private List<IfcRelDecomposes> Decomposes= new ArrayList<IfcRelDecomposes>();
	private List<IfcRelAssociates> HasAssociations= new ArrayList<IfcRelAssociates>();


	// Getters and setters of inverse values

	public List<IfcRelAssigns> getHasAssignments() {
		return HasAssignments;
	}

	public void setHasAssignments(IfcRelAssigns value){
		this.HasAssignments.add(value);
	}

	public List<IfcRelDecomposes> getIsDecomposedBy() {
		return IsDecomposedBy;
	}

	public void setIsDecomposedBy(IfcRelDecomposes value){
		this.IsDecomposedBy.add(value);
	}

	public List<IfcRelDecomposes> getDecomposes() {
		return Decomposes;
	}

	public void setDecomposes(IfcRelDecomposes value){
		this.Decomposes.add(value);
	}

	public List<IfcRelAssociates> getHasAssociations() {
		return HasAssociations;
	}

	public void setHasAssociations(IfcRelAssociates value){
		this.HasAssociations.add(value);
	}

}
