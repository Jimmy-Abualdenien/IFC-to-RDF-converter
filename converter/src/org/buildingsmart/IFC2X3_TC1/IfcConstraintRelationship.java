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

public class IfcConstraintRelationship extends Thing 
{
	// The property attributes
	private IfcLabel Name_of_IfcConstraintRelationship;
	private IfcText Description_of_IfcConstraintRelationship;
	private IfcConstraint RelatingConstraint_of_IfcConstraintRelationship;
	private List<IfcConstraint> RelatedConstraints_of_IfcConstraintRelationship = new ArrayList<IfcConstraint>();


	// Getters and setters of properties
	public IfcLabel getName_of_IfcConstraintRelationship() {
		return Name_of_IfcConstraintRelationship;
	}

	public void setName_of_IfcConstraintRelationship(IfcLabel value){
		this.Name_of_IfcConstraintRelationship=value;
	}

	public IfcText getDescription_of_IfcConstraintRelationship() {
		return Description_of_IfcConstraintRelationship;
	}

	public void setDescription_of_IfcConstraintRelationship(IfcText value){
		this.Description_of_IfcConstraintRelationship=value;
	}

	public IfcConstraint getRelatingConstraint_of_IfcConstraintRelationship() {
		return RelatingConstraint_of_IfcConstraintRelationship;
	}

	public void setRelatingConstraint_of_IfcConstraintRelationship(IfcConstraint value){
		this.RelatingConstraint_of_IfcConstraintRelationship=value;
	}

	public List<IfcConstraint> getRelatedConstraints_of_IfcConstraintRelationship() {
		return RelatedConstraints_of_IfcConstraintRelationship;
	}

	public void setRelatedConstraints_of_IfcConstraintRelationship(IfcConstraint value){
		this.RelatedConstraints_of_IfcConstraintRelationship.add(value);
	}

}
