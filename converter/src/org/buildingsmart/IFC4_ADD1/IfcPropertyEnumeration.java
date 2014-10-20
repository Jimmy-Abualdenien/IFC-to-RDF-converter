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

public class IfcPropertyEnumeration extends IfcPropertyAbstraction 
{
	// The property attributes
	private IfcLabel Name_of_IfcPropertyEnumeration;
	private List<IfcValue> EnumerationValues_of_IfcPropertyEnumeration = new ArrayList<IfcValue>();
	private IfcUnit Unit_of_IfcPropertyEnumeration;


	// Getters and setters of properties
	public IfcLabel getName_of_IfcPropertyEnumeration() {
		return Name_of_IfcPropertyEnumeration;
	}

	public void setName_of_IfcPropertyEnumeration(IfcLabel value){
		this.Name_of_IfcPropertyEnumeration=value;
	}

	public List<IfcValue> getEnumerationValues_of_IfcPropertyEnumeration() {
		return EnumerationValues_of_IfcPropertyEnumeration;
	}

	public void setEnumerationValues_of_IfcPropertyEnumeration(IfcValue value){
		this.EnumerationValues_of_IfcPropertyEnumeration.add(value);
	}

	public IfcUnit getUnit_of_IfcPropertyEnumeration() {
		return Unit_of_IfcPropertyEnumeration;
	}

	public void setUnit_of_IfcPropertyEnumeration(IfcUnit value){
		this.Unit_of_IfcPropertyEnumeration=value;
	}

}
