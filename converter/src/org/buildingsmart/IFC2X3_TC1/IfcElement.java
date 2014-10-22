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

public class IfcElement extends IfcProduct implements IfcStructuralActivityAssignmentSelect
{
	// The property attributes
	private IfcIdentifier Tag_of_IfcElement;
	// The inverse attributes
	private List<IfcRelConnectsStructuralElement> HasStructuralMember= new ArrayList<IfcRelConnectsStructuralElement>();
	private List<IfcRelFillsElement> FillsVoids= new ArrayList<IfcRelFillsElement>();
	private List<IfcRelConnectsElements> ConnectedTo= new ArrayList<IfcRelConnectsElements>();
	private List<IfcRelCoversBldgElements> HasCoverings= new ArrayList<IfcRelCoversBldgElements>();
	private List<IfcRelProjectsElement> HasProjections= new ArrayList<IfcRelProjectsElement>();
	private List<IfcRelReferencedInSpatialStructure> ReferencedInStructures= new ArrayList<IfcRelReferencedInSpatialStructure>();
	private List<IfcRelConnectsPortToElement> HasPorts= new ArrayList<IfcRelConnectsPortToElement>();
	private List<IfcRelVoidsElement> HasOpenings= new ArrayList<IfcRelVoidsElement>();
	private List<IfcRelConnectsWithRealizingElements> IsConnectionRealization= new ArrayList<IfcRelConnectsWithRealizingElements>();
	private List<IfcRelSpaceBoundary> ProvidesBoundaries= new ArrayList<IfcRelSpaceBoundary>();
	private List<IfcRelConnectsElements> ConnectedFrom= new ArrayList<IfcRelConnectsElements>();
	private List<IfcRelContainedInSpatialStructure> ContainedInStructure= new ArrayList<IfcRelContainedInSpatialStructure>();


	// Getters and setters of properties
	public IfcIdentifier getTag_of_IfcElement() {
		return Tag_of_IfcElement;
	}

	public void setTag_of_IfcElement(IfcIdentifier value){
		this.Tag_of_IfcElement=value;
	}

	// Getters and setters of inverse values

	public List<IfcRelConnectsStructuralElement> getHasStructuralMember() {
		return HasStructuralMember;
	}

	public void setHasStructuralMember(IfcRelConnectsStructuralElement value){
		this.HasStructuralMember.add(value);
	}

	public List<IfcRelFillsElement> getFillsVoids() {
		return FillsVoids;
	}

	public void setFillsVoids(IfcRelFillsElement value){
		this.FillsVoids.add(value);
	}

	public List<IfcRelConnectsElements> getConnectedTo() {
		return ConnectedTo;
	}

	public void setConnectedTo(IfcRelConnectsElements value){
		this.ConnectedTo.add(value);
	}

	public List<IfcRelCoversBldgElements> getHasCoverings() {
		return HasCoverings;
	}

	public void setHasCoverings(IfcRelCoversBldgElements value){
		this.HasCoverings.add(value);
	}

	public List<IfcRelProjectsElement> getHasProjections() {
		return HasProjections;
	}

	public void setHasProjections(IfcRelProjectsElement value){
		this.HasProjections.add(value);
	}

	public List<IfcRelReferencedInSpatialStructure> getReferencedInStructures() {
		return ReferencedInStructures;
	}

	public void setReferencedInStructures(IfcRelReferencedInSpatialStructure value){
		this.ReferencedInStructures.add(value);
	}

	public List<IfcRelConnectsPortToElement> getHasPorts() {
		return HasPorts;
	}

	public void setHasPorts(IfcRelConnectsPortToElement value){
		this.HasPorts.add(value);
	}

	public List<IfcRelVoidsElement> getHasOpenings() {
		return HasOpenings;
	}

	public void setHasOpenings(IfcRelVoidsElement value){
		this.HasOpenings.add(value);
	}

	public List<IfcRelConnectsWithRealizingElements> getIsConnectionRealization() {
		return IsConnectionRealization;
	}

	public void setIsConnectionRealization(IfcRelConnectsWithRealizingElements value){
		this.IsConnectionRealization.add(value);
	}

	public List<IfcRelSpaceBoundary> getProvidesBoundaries() {
		return ProvidesBoundaries;
	}

	public void setProvidesBoundaries(IfcRelSpaceBoundary value){
		this.ProvidesBoundaries.add(value);
	}

	public List<IfcRelConnectsElements> getConnectedFrom() {
		return ConnectedFrom;
	}

	public void setConnectedFrom(IfcRelConnectsElements value){
		this.ConnectedFrom.add(value);
	}

	public List<IfcRelContainedInSpatialStructure> getContainedInStructure() {
		return ContainedInStructure;
	}

	public void setContainedInStructure(IfcRelContainedInSpatialStructure value){
		this.ContainedInStructure.add(value);
	}

}
