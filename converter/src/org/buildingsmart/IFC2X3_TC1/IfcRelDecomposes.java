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

public class IfcRelDecomposes extends IfcRelationship 
{
	// The property attributes
	private IfcObjectDefinition RelatingObject;
	private List<IfcObjectDefinition> RelatedObjects_of_IfcRelDecomposes = new ArrayList<IfcObjectDefinition>();


	// Getters and setters of properties
	public IfcObjectDefinition getRelatingObject() {
		return RelatingObject;
	}

	public void setRelatingObject(IfcObjectDefinition value){
		this.RelatingObject=value;
	}

	public List<IfcObjectDefinition> getRelatedObjects_of_IfcRelDecomposes() {
		return RelatedObjects_of_IfcRelDecomposes;
	}

	public void setRelatedObjects_of_IfcRelDecomposes(IfcObjectDefinition value){
		this.RelatedObjects_of_IfcRelDecomposes.add(value);
	}

}
