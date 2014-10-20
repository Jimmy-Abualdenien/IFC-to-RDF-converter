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

public class IfcResourceConstraintRelationship extends IfcResourceLevelRelationship 
{
	// The property attributes
	private IfcConstraint RelatingConstraint_of_IfcResourceConstraintRelationship;
	private List<IfcResourceObjectSelect> RelatedResourceObjects_of_IfcResourceConstraintRelationship = new ArrayList<IfcResourceObjectSelect>();


	// Getters and setters of properties
	public IfcConstraint getRelatingConstraint_of_IfcResourceConstraintRelationship() {
		return RelatingConstraint_of_IfcResourceConstraintRelationship;
	}

	public void setRelatingConstraint_of_IfcResourceConstraintRelationship(IfcConstraint value){
		this.RelatingConstraint_of_IfcResourceConstraintRelationship=value;
	}

	public List<IfcResourceObjectSelect> getRelatedResourceObjects_of_IfcResourceConstraintRelationship() {
		return RelatedResourceObjects_of_IfcResourceConstraintRelationship;
	}

	public void setRelatedResourceObjects_of_IfcResourceConstraintRelationship(IfcResourceObjectSelect value){
		this.RelatedResourceObjects_of_IfcResourceConstraintRelationship.add(value);
	}

}
