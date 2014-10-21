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

public class IfcPropertyConstraintRelationship extends Thing 
{
	// The property attributes
	private IfcConstraint RelatingConstraint_of_IfcPropertyConstraintRelationship;
	private List<IfcProperty> RelatedProperties = new ArrayList<IfcProperty>();
	private IfcLabel Name_of_IfcPropertyConstraintRelationship;
	private IfcText Description_of_IfcPropertyConstraintRelationship;


	// Getters and setters of properties
	public IfcConstraint getRelatingConstraint_of_IfcPropertyConstraintRelationship() {
		return RelatingConstraint_of_IfcPropertyConstraintRelationship;
	}

	public void setRelatingConstraint_of_IfcPropertyConstraintRelationship(IfcConstraint value){
		this.RelatingConstraint_of_IfcPropertyConstraintRelationship=value;
	}

	public List<IfcProperty> getRelatedProperties() {
		return RelatedProperties;
	}

	public void setRelatedProperties(IfcProperty value){
		this.RelatedProperties.add(value);
	}

	public IfcLabel getName_of_IfcPropertyConstraintRelationship() {
		return Name_of_IfcPropertyConstraintRelationship;
	}

	public void setName_of_IfcPropertyConstraintRelationship(IfcLabel value){
		this.Name_of_IfcPropertyConstraintRelationship=value;
	}

	public IfcText getDescription_of_IfcPropertyConstraintRelationship() {
		return Description_of_IfcPropertyConstraintRelationship;
	}

	public void setDescription_of_IfcPropertyConstraintRelationship(IfcText value){
		this.Description_of_IfcPropertyConstraintRelationship=value;
	}

}
