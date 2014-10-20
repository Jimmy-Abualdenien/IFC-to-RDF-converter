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

public class IfcPresentationLayerAssignment extends Thing 
{
	// The property attributes
	private IfcLabel Name_of_IfcPresentationLayerAssignment;
	private IfcText Description_of_IfcPresentationLayerAssignment;
	private List<IfcLayeredItem> AssignedItems = new ArrayList<IfcLayeredItem>();
	private IfcIdentifier Identifier_of_IfcPresentationLayerAssignment;


	// Getters and setters of properties
	public IfcLabel getName_of_IfcPresentationLayerAssignment() {
		return Name_of_IfcPresentationLayerAssignment;
	}

	public void setName_of_IfcPresentationLayerAssignment(IfcLabel value){
		this.Name_of_IfcPresentationLayerAssignment=value;
	}

	public IfcText getDescription_of_IfcPresentationLayerAssignment() {
		return Description_of_IfcPresentationLayerAssignment;
	}

	public void setDescription_of_IfcPresentationLayerAssignment(IfcText value){
		this.Description_of_IfcPresentationLayerAssignment=value;
	}

	public List<IfcLayeredItem> getAssignedItems() {
		return AssignedItems;
	}

	public void setAssignedItems(IfcLayeredItem value){
		this.AssignedItems.add(value);
	}

	public IfcIdentifier getIdentifier_of_IfcPresentationLayerAssignment() {
		return Identifier_of_IfcPresentationLayerAssignment;
	}

	public void setIdentifier_of_IfcPresentationLayerAssignment(IfcIdentifier value){
		this.Identifier_of_IfcPresentationLayerAssignment=value;
	}

}
