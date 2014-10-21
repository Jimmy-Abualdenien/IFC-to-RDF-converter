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

public class IfcExternalReference extends Thing implements IfcLightDistributionDataSourceSelect, IfcObjectReferenceSelect
{
	// The property attributes
	private IfcLabel Location_of_IfcExternalReference;
	private IfcIdentifier ItemReference;
	private IfcLabel Name_of_IfcExternalReference;


	// Getters and setters of properties
	public IfcLabel getLocation_of_IfcExternalReference() {
		return Location_of_IfcExternalReference;
	}

	public void setLocation_of_IfcExternalReference(IfcLabel value){
		this.Location_of_IfcExternalReference=value;
	}

	public IfcIdentifier getItemReference() {
		return ItemReference;
	}

	public void setItemReference(IfcIdentifier value){
		this.ItemReference=value;
	}

	public IfcLabel getName_of_IfcExternalReference() {
		return Name_of_IfcExternalReference;
	}

	public void setName_of_IfcExternalReference(IfcLabel value){
		this.Name_of_IfcExternalReference=value;
	}

}
