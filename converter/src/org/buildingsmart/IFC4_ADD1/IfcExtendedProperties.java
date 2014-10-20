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

public class IfcExtendedProperties extends IfcPropertyAbstraction 
{
	// The property attributes
	private IfcIdentifier Name_of_IfcExtendedProperties;
	private IfcText Description_of_IfcExtendedProperties;
	private List<IfcProperty> Properties = new ArrayList<IfcProperty>();


	// Getters and setters of properties
	public IfcIdentifier getName_of_IfcExtendedProperties() {
		return Name_of_IfcExtendedProperties;
	}

	public void setName_of_IfcExtendedProperties(IfcIdentifier value){
		this.Name_of_IfcExtendedProperties=value;
	}

	public IfcText getDescription_of_IfcExtendedProperties() {
		return Description_of_IfcExtendedProperties;
	}

	public void setDescription_of_IfcExtendedProperties(IfcText value){
		this.Description_of_IfcExtendedProperties=value;
	}

	public List<IfcProperty> getProperties() {
		return Properties;
	}

	public void setProperties(IfcProperty value){
		this.Properties.add(value);
	}

}
