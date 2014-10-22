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

public class IfcConstraint extends Thing 
{
	// The property attributes
	private IfcLabel Name_of_IfcConstraint;
	private IfcText Description_of_IfcConstraint;
	private IfcConstraintEnum ConstraintGrade;
	private IfcLabel ConstraintSource;
	private IfcActorSelect CreatingActor;
	private IfcDateTimeSelect CreationTime_of_IfcConstraint;
	private IfcLabel UserDefinedGrade;
	// The inverse attributes
	private List<IfcConstraintClassificationRelationship> ClassifiedAs= new ArrayList<IfcConstraintClassificationRelationship>();
	private List<IfcConstraintRelationship> RelatesConstraints= new ArrayList<IfcConstraintRelationship>();
	private List<IfcConstraintRelationship> IsRelatedWith= new ArrayList<IfcConstraintRelationship>();
	private List<IfcPropertyConstraintRelationship> PropertiesForConstraint= new ArrayList<IfcPropertyConstraintRelationship>();
	private List<IfcConstraintAggregationRelationship> Aggregates= new ArrayList<IfcConstraintAggregationRelationship>();
	private List<IfcConstraintAggregationRelationship> IsAggregatedIn= new ArrayList<IfcConstraintAggregationRelationship>();


	// Getters and setters of properties
	public IfcLabel getName_of_IfcConstraint() {
		return Name_of_IfcConstraint;
	}

	public void setName_of_IfcConstraint(IfcLabel value){
		this.Name_of_IfcConstraint=value;
	}

	public IfcText getDescription_of_IfcConstraint() {
		return Description_of_IfcConstraint;
	}

	public void setDescription_of_IfcConstraint(IfcText value){
		this.Description_of_IfcConstraint=value;
	}

	public IfcConstraintEnum getConstraintGrade() {
		return ConstraintGrade;
	}

	public void setConstraintGrade(IfcConstraintEnum value){
		this.ConstraintGrade=value;
	}

	public IfcLabel getConstraintSource() {
		return ConstraintSource;
	}

	public void setConstraintSource(IfcLabel value){
		this.ConstraintSource=value;
	}

	public IfcActorSelect getCreatingActor() {
		return CreatingActor;
	}

	public void setCreatingActor(IfcActorSelect value){
		this.CreatingActor=value;
	}

	public IfcDateTimeSelect getCreationTime_of_IfcConstraint() {
		return CreationTime_of_IfcConstraint;
	}

	public void setCreationTime_of_IfcConstraint(IfcDateTimeSelect value){
		this.CreationTime_of_IfcConstraint=value;
	}

	public IfcLabel getUserDefinedGrade() {
		return UserDefinedGrade;
	}

	public void setUserDefinedGrade(IfcLabel value){
		this.UserDefinedGrade=value;
	}

	// Getters and setters of inverse values

	public List<IfcConstraintClassificationRelationship> getClassifiedAs() {
		return ClassifiedAs;
	}

	public void setClassifiedAs(IfcConstraintClassificationRelationship value){
		this.ClassifiedAs.add(value);
	}

	public List<IfcConstraintRelationship> getRelatesConstraints() {
		return RelatesConstraints;
	}

	public void setRelatesConstraints(IfcConstraintRelationship value){
		this.RelatesConstraints.add(value);
	}

	public List<IfcConstraintRelationship> getIsRelatedWith() {
		return IsRelatedWith;
	}

	public void setIsRelatedWith(IfcConstraintRelationship value){
		this.IsRelatedWith.add(value);
	}

	public List<IfcPropertyConstraintRelationship> getPropertiesForConstraint() {
		return PropertiesForConstraint;
	}

	public void setPropertiesForConstraint(IfcPropertyConstraintRelationship value){
		this.PropertiesForConstraint.add(value);
	}

	public List<IfcConstraintAggregationRelationship> getAggregates() {
		return Aggregates;
	}

	public void setAggregates(IfcConstraintAggregationRelationship value){
		this.Aggregates.add(value);
	}

	public List<IfcConstraintAggregationRelationship> getIsAggregatedIn() {
		return IsAggregatedIn;
	}

	public void setIsAggregatedIn(IfcConstraintAggregationRelationship value){
		this.IsAggregatedIn.add(value);
	}

}
