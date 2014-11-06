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

public class IfcReference extends Thing implements IfcMetricValueSelect, IfcAppliedValueSelect
{
	// The property attributes
	private IfcIdentifier TypeIdentifier;
	private IfcIdentifier AttributeIdentifier;
	private IfcLabel InstanceName;
	private List<IfcInteger> ListPositions = new ArrayList<IfcInteger>();
	private IfcReference InnerReference;


	// Getters and setters of properties
	public IfcIdentifier getTypeIdentifier() {
		return TypeIdentifier;
	}

	public void setTypeIdentifier(IfcIdentifier value){
		this.TypeIdentifier=value;
	}

	public IfcIdentifier getAttributeIdentifier() {
		return AttributeIdentifier;
	}

	public void setAttributeIdentifier(IfcIdentifier value){
		this.AttributeIdentifier=value;
	}

	public IfcLabel getInstanceName() {
		return InstanceName;
	}

	public void setInstanceName(IfcLabel value){
		this.InstanceName=value;
	}

	public List<IfcInteger> getListPositions() {
		return ListPositions;
	}

	public void setListPositions(IfcInteger value){
		this.ListPositions.add(value);
	}

	public IfcReference getInnerReference() {
		return InnerReference;
	}

	public void setInnerReference(IfcReference value){
		this.InnerReference=value;
	}

}
