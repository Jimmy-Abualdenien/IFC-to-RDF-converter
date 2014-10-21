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

public class IfcPropertyDependencyRelationship extends Thing 
{
	// The property attributes
	private IfcProperty DependingProperty;
	private IfcProperty DependantProperty;
	private IfcLabel Name_of_IfcPropertyDependencyRelationship;
	private IfcText Description_of_IfcPropertyDependencyRelationship;
	private IfcText Expression_of_IfcPropertyDependencyRelationship;


	// Getters and setters of properties
	public IfcProperty getDependingProperty() {
		return DependingProperty;
	}

	public void setDependingProperty(IfcProperty value){
		this.DependingProperty=value;
	}

	public IfcProperty getDependantProperty() {
		return DependantProperty;
	}

	public void setDependantProperty(IfcProperty value){
		this.DependantProperty=value;
	}

	public IfcLabel getName_of_IfcPropertyDependencyRelationship() {
		return Name_of_IfcPropertyDependencyRelationship;
	}

	public void setName_of_IfcPropertyDependencyRelationship(IfcLabel value){
		this.Name_of_IfcPropertyDependencyRelationship=value;
	}

	public IfcText getDescription_of_IfcPropertyDependencyRelationship() {
		return Description_of_IfcPropertyDependencyRelationship;
	}

	public void setDescription_of_IfcPropertyDependencyRelationship(IfcText value){
		this.Description_of_IfcPropertyDependencyRelationship=value;
	}

	public IfcText getExpression_of_IfcPropertyDependencyRelationship() {
		return Expression_of_IfcPropertyDependencyRelationship;
	}

	public void setExpression_of_IfcPropertyDependencyRelationship(IfcText value){
		this.Expression_of_IfcPropertyDependencyRelationship=value;
	}

}
