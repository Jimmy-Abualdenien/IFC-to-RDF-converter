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

public class IfcTypeObject extends IfcObjectDefinition 
{
	// The property attributes
	private IfcLabel ApplicableOccurrence;
	private List<IfcPropertySetDefinition> HasPropertySets = new ArrayList<IfcPropertySetDefinition>();
	// The inverse attributes
	private List<IfcRelDefinesByType> ObjectTypeOf= new ArrayList<IfcRelDefinesByType>();


	// Getters and setters of properties
	public IfcLabel getApplicableOccurrence() {
		return ApplicableOccurrence;
	}

	public void setApplicableOccurrence(IfcLabel value){
		this.ApplicableOccurrence=value;
	}

	public List<IfcPropertySetDefinition> getHasPropertySets() {
		return HasPropertySets;
	}

	public void setHasPropertySets(IfcPropertySetDefinition value){
		this.HasPropertySets.add(value);
	}

	// Getters and setters of inverse values

	public List<IfcRelDefinesByType> getObjectTypeOf() {
		return ObjectTypeOf;
	}

	public void setObjectTypeOf(IfcRelDefinesByType value){
		this.ObjectTypeOf.add(value);
	}

}
