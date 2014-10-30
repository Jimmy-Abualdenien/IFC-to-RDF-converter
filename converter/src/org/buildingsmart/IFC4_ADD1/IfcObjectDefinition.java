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

public class IfcObjectDefinition extends IfcRoot implements IfcDefinitionSelect
{
	// The inverse attributes
	private List<IfcRelAssigns> HasAssignments= new ArrayList<IfcRelAssigns>();
	private List<IfcRelNests> Nests= new ArrayList<IfcRelNests>();
	private List<IfcRelNests> IsNestedBy= new ArrayList<IfcRelNests>();
	private List<IfcRelDeclares> HasContext= new ArrayList<IfcRelDeclares>();
	private List<IfcRelAggregates> IsDecomposedBy= new ArrayList<IfcRelAggregates>();
	private List<IfcRelAggregates> Decomposes= new ArrayList<IfcRelAggregates>();
	private List<IfcRelAssociates> HasAssociations= new ArrayList<IfcRelAssociates>();


	// Getters and setters of inverse values

	public List<IfcRelAssigns> getHasAssignments() {
		return HasAssignments;
	}

	public void setHasAssignments(IfcRelAssigns value){
		this.HasAssignments.add(value);
	}

	public List<IfcRelNests> getNests() {
		return Nests;
	}

	public void setNests(IfcRelNests value){
		this.Nests.add(value);
	}

	public List<IfcRelNests> getIsNestedBy() {
		return IsNestedBy;
	}

	public void setIsNestedBy(IfcRelNests value){
		this.IsNestedBy.add(value);
	}

	public List<IfcRelDeclares> getHasContext() {
		return HasContext;
	}

	public void setHasContext(IfcRelDeclares value){
		this.HasContext.add(value);
	}

	public List<IfcRelAggregates> getIsDecomposedBy() {
		return IsDecomposedBy;
	}

	public void setIsDecomposedBy(IfcRelAggregates value){
		this.IsDecomposedBy.add(value);
	}

	public List<IfcRelAggregates> getDecomposes() {
		return Decomposes;
	}

	public void setDecomposes(IfcRelAggregates value){
		this.Decomposes.add(value);
	}

	public List<IfcRelAssociates> getHasAssociations() {
		return HasAssociations;
	}

	public void setHasAssociations(IfcRelAssociates value){
		this.HasAssociations.add(value);
	}

}
