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

public class IfcAppliedValue extends Thing implements IfcObjectReferenceSelect, IfcResourceObjectSelect, IfcMetricValueSelect
{
	// The property attributes
	private IfcLabel Name_of_IfcAppliedValue;
	private IfcText Description_of_IfcAppliedValue;
	private IfcAppliedValueSelect AppliedValue;
	private IfcMeasureWithUnit UnitBasis;
	private IfcDate ApplicableDate;
	private IfcDate FixedUntilDate;
	private IfcLabel Category_of_IfcAppliedValue;
	private IfcLabel Condition;
	private IfcArithmeticOperatorEnum ArithmeticOperator;
	private List<IfcAppliedValue> Components = new ArrayList<IfcAppliedValue>();
	// The inverse attributes
	private List<IfcExternalReferenceRelationship> HasExternalReference= new ArrayList<IfcExternalReferenceRelationship>();


	// Getters and setters of properties
	public IfcLabel getName_of_IfcAppliedValue() {
		return Name_of_IfcAppliedValue;
	}

	public void setName_of_IfcAppliedValue(IfcLabel value){
		this.Name_of_IfcAppliedValue=value;
	}

	public IfcText getDescription_of_IfcAppliedValue() {
		return Description_of_IfcAppliedValue;
	}

	public void setDescription_of_IfcAppliedValue(IfcText value){
		this.Description_of_IfcAppliedValue=value;
	}

	public IfcAppliedValueSelect getAppliedValue() {
		return AppliedValue;
	}

	public void setAppliedValue(IfcAppliedValueSelect value){
		this.AppliedValue=value;
	}

	public IfcMeasureWithUnit getUnitBasis() {
		return UnitBasis;
	}

	public void setUnitBasis(IfcMeasureWithUnit value){
		this.UnitBasis=value;
	}

	public IfcDate getApplicableDate() {
		return ApplicableDate;
	}

	public void setApplicableDate(IfcDate value){
		this.ApplicableDate=value;
	}

	public IfcDate getFixedUntilDate() {
		return FixedUntilDate;
	}

	public void setFixedUntilDate(IfcDate value){
		this.FixedUntilDate=value;
	}

	public IfcLabel getCategory_of_IfcAppliedValue() {
		return Category_of_IfcAppliedValue;
	}

	public void setCategory_of_IfcAppliedValue(IfcLabel value){
		this.Category_of_IfcAppliedValue=value;
	}

	public IfcLabel getCondition() {
		return Condition;
	}

	public void setCondition(IfcLabel value){
		this.Condition=value;
	}

	public IfcArithmeticOperatorEnum getArithmeticOperator() {
		return ArithmeticOperator;
	}

	public void setArithmeticOperator(IfcArithmeticOperatorEnum value){
		this.ArithmeticOperator=value;
	}

	public List<IfcAppliedValue> getComponents() {
		return Components;
	}

	public void setComponents(IfcAppliedValue value){
		this.Components.add(value);
	}

	// Getters and setters of inverse values

	public List<IfcExternalReferenceRelationship> getHasExternalReference() {
		return HasExternalReference;
	}

	public void setHasExternalReference(IfcExternalReferenceRelationship value){
		this.HasExternalReference.add(value);
	}

}
