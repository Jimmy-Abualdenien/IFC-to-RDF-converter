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

public class IfcProperty extends IfcPropertyAbstraction 
{
	// The property attributes
	private IfcIdentifier Name_of_IfcProperty;
	private IfcText Description_of_IfcProperty;
 // The inverse attributes

	private List<IfcPropertySet> PartOfPset= new ArrayList<IfcPropertySet>();
	private List<IfcPropertyDependencyRelationship> PropertyForDependance= new ArrayList<IfcPropertyDependencyRelationship>();
	private List<IfcPropertyDependencyRelationship> PropertyDependsOn= new ArrayList<IfcPropertyDependencyRelationship>();
	private List<IfcComplexProperty> PartOfComplex= new ArrayList<IfcComplexProperty>();
	private List<IfcResourceConstraintRelationship> HasConstraints= new ArrayList<IfcResourceConstraintRelationship>();
	private List<IfcResourceApprovalRelationship> HasApprovals= new ArrayList<IfcResourceApprovalRelationship>();


	// Getters and setters of properties
	public IfcIdentifier getName_of_IfcProperty() {
		return Name_of_IfcProperty;
	}

	public void setName_of_IfcProperty(IfcIdentifier value){
		this.Name_of_IfcProperty=value;
	}

	public IfcText getDescription_of_IfcProperty() {
		return Description_of_IfcProperty;
	}

	public void setDescription_of_IfcProperty(IfcText value){
		this.Description_of_IfcProperty=value;
	}

	// Getters and setters of inverse values

	public List<IfcPropertySet> getPartOfPset() {
		return PartOfPset;
	}

	public void setPartOfPset(IfcPropertySet value){
		this.PartOfPset.add(value);
	}

	public List<IfcPropertyDependencyRelationship> getPropertyForDependance() {
		return PropertyForDependance;
	}

	public void setPropertyForDependance(IfcPropertyDependencyRelationship value){
		this.PropertyForDependance.add(value);
	}

	public List<IfcPropertyDependencyRelationship> getPropertyDependsOn() {
		return PropertyDependsOn;
	}

	public void setPropertyDependsOn(IfcPropertyDependencyRelationship value){
		this.PropertyDependsOn.add(value);
	}

	public List<IfcComplexProperty> getPartOfComplex() {
		return PartOfComplex;
	}

	public void setPartOfComplex(IfcComplexProperty value){
		this.PartOfComplex.add(value);
	}

	public List<IfcResourceConstraintRelationship> getHasConstraints() {
		return HasConstraints;
	}

	public void setHasConstraints(IfcResourceConstraintRelationship value){
		this.HasConstraints.add(value);
	}

	public List<IfcResourceApprovalRelationship> getHasApprovals() {
		return HasApprovals;
	}

	public void setHasApprovals(IfcResourceApprovalRelationship value){
		this.HasApprovals.add(value);
	}

}
