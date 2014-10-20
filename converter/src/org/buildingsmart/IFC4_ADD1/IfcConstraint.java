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

public class IfcConstraint extends Thing implements IfcResourceObjectSelect
{
	// The property attributes
	private IfcLabel Name_of_IfcConstraint;
	private IfcText Description_of_IfcConstraint;
	private IfcConstraintEnum ConstraintGrade;
	private IfcLabel ConstraintSource;
	private IfcActorSelect CreatingActor;
	private IfcDateTime CreationTime_of_IfcConstraint;
	private IfcLabel UserDefinedGrade;
 // The inverse attributes

	private List<IfcExternalReferenceRelationship> HasExternalReferences= new ArrayList<IfcExternalReferenceRelationship>();
	private List<IfcResourceConstraintRelationship> PropertiesForConstraint= new ArrayList<IfcResourceConstraintRelationship>();


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

	public IfcDateTime getCreationTime_of_IfcConstraint() {
		return CreationTime_of_IfcConstraint;
	}

	public void setCreationTime_of_IfcConstraint(IfcDateTime value){
		this.CreationTime_of_IfcConstraint=value;
	}

	public IfcLabel getUserDefinedGrade() {
		return UserDefinedGrade;
	}

	public void setUserDefinedGrade(IfcLabel value){
		this.UserDefinedGrade=value;
	}

	// Getters and setters of inverse values

	public List<IfcExternalReferenceRelationship> getHasExternalReferences() {
		return HasExternalReferences;
	}

	public void setHasExternalReferences(IfcExternalReferenceRelationship value){
		this.HasExternalReferences.add(value);
	}

	public List<IfcResourceConstraintRelationship> getPropertiesForConstraint() {
		return PropertiesForConstraint;
	}

	public void setPropertiesForConstraint(IfcResourceConstraintRelationship value){
		this.PropertiesForConstraint.add(value);
	}

}
