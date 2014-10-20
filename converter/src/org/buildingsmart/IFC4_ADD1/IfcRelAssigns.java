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

public class IfcRelAssigns extends IfcRelationship 
{
	// The property attributes
	private List<IfcObjectDefinition> RelatedObjects_of_IfcRelAssigns = new ArrayList<IfcObjectDefinition>();
	private IfcObjectTypeEnum RelatedObjectsType;


	// Getters and setters of properties
	public List<IfcObjectDefinition> getRelatedObjects_of_IfcRelAssigns() {
		return RelatedObjects_of_IfcRelAssigns;
	}

	public void setRelatedObjects_of_IfcRelAssigns(IfcObjectDefinition value){
		this.RelatedObjects_of_IfcRelAssigns.add(value);
	}

	public IfcObjectTypeEnum getRelatedObjectsType() {
		return RelatedObjectsType;
	}

	public void setRelatedObjectsType(IfcObjectTypeEnum value){
		this.RelatedObjectsType=value;
	}

}
