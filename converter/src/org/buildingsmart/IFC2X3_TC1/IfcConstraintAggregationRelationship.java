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

public class IfcConstraintAggregationRelationship extends Thing 
{
	// The property attributes
	private IfcLabel Name_of_IfcConstraintAggregationRelationship;
	private IfcText Description_of_IfcConstraintAggregationRelationship;
	private IfcConstraint RelatingConstraint_of_IfcConstraintAggregationRelationship;
	private List<IfcConstraint> RelatedConstraints_of_IfcConstraintAggregationRelationship = new ArrayList<IfcConstraint>();
	private IfcLogicalOperatorEnum LogicalAggregator;


	// Getters and setters of properties
	public IfcLabel getName_of_IfcConstraintAggregationRelationship() {
		return Name_of_IfcConstraintAggregationRelationship;
	}

	public void setName_of_IfcConstraintAggregationRelationship(IfcLabel value){
		this.Name_of_IfcConstraintAggregationRelationship=value;
	}

	public IfcText getDescription_of_IfcConstraintAggregationRelationship() {
		return Description_of_IfcConstraintAggregationRelationship;
	}

	public void setDescription_of_IfcConstraintAggregationRelationship(IfcText value){
		this.Description_of_IfcConstraintAggregationRelationship=value;
	}

	public IfcConstraint getRelatingConstraint_of_IfcConstraintAggregationRelationship() {
		return RelatingConstraint_of_IfcConstraintAggregationRelationship;
	}

	public void setRelatingConstraint_of_IfcConstraintAggregationRelationship(IfcConstraint value){
		this.RelatingConstraint_of_IfcConstraintAggregationRelationship=value;
	}

	public List<IfcConstraint> getRelatedConstraints_of_IfcConstraintAggregationRelationship() {
		return RelatedConstraints_of_IfcConstraintAggregationRelationship;
	}

	public void setRelatedConstraints_of_IfcConstraintAggregationRelationship(IfcConstraint value){
		this.RelatedConstraints_of_IfcConstraintAggregationRelationship.add(value);
	}

	public IfcLogicalOperatorEnum getLogicalAggregator() {
		return LogicalAggregator;
	}

	public void setLogicalAggregator(IfcLogicalOperatorEnum value){
		this.LogicalAggregator=value;
	}

}
