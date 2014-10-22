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

public class IfcAppliedValue extends Thing implements IfcObjectReferenceSelect
{
	// The property attributes
	private IfcLabel Name_of_IfcAppliedValue;
	private IfcText Description_of_IfcAppliedValue;
	private IfcAppliedValueSelect AppliedValue;
	private IfcMeasureWithUnit UnitBasis;
	private IfcDateTimeSelect ApplicableDate;
	private IfcDateTimeSelect FixedUntilDate;
	// The inverse attributes
	private List<IfcReferencesValueDocument> ValuesReferenced= new ArrayList<IfcReferencesValueDocument>();
	private List<IfcAppliedValueRelationship> ValueOfComponents= new ArrayList<IfcAppliedValueRelationship>();
	private List<IfcAppliedValueRelationship> IsComponentIn= new ArrayList<IfcAppliedValueRelationship>();


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

	public IfcDateTimeSelect getApplicableDate() {
		return ApplicableDate;
	}

	public void setApplicableDate(IfcDateTimeSelect value){
		this.ApplicableDate=value;
	}

	public IfcDateTimeSelect getFixedUntilDate() {
		return FixedUntilDate;
	}

	public void setFixedUntilDate(IfcDateTimeSelect value){
		this.FixedUntilDate=value;
	}

	// Getters and setters of inverse values

	public List<IfcReferencesValueDocument> getValuesReferenced() {
		return ValuesReferenced;
	}

	public void setValuesReferenced(IfcReferencesValueDocument value){
		this.ValuesReferenced.add(value);
	}

	public List<IfcAppliedValueRelationship> getValueOfComponents() {
		return ValueOfComponents;
	}

	public void setValueOfComponents(IfcAppliedValueRelationship value){
		this.ValueOfComponents.add(value);
	}

	public List<IfcAppliedValueRelationship> getIsComponentIn() {
		return IsComponentIn;
	}

	public void setIsComponentIn(IfcAppliedValueRelationship value){
		this.IsComponentIn.add(value);
	}

}
