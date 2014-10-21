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

public class IfcRepresentation extends Thing implements IfcLayeredItem
{
	// The property attributes
	private IfcRepresentationContext ContextOfItems;
	private IfcLabel RepresentationIdentifier;
	private IfcLabel RepresentationType;
	private List<IfcRepresentationItem> Items = new ArrayList<IfcRepresentationItem>();
 // The inverse attributes

	private List<IfcRepresentationMap> RepresentationMap= new ArrayList<IfcRepresentationMap>();
	private List<IfcPresentationLayerAssignment> LayerAssignments= new ArrayList<IfcPresentationLayerAssignment>();
	private List<IfcProductRepresentation> OfProductRepresentation= new ArrayList<IfcProductRepresentation>();


	// Getters and setters of properties
	public IfcRepresentationContext getContextOfItems() {
		return ContextOfItems;
	}

	public void setContextOfItems(IfcRepresentationContext value){
		this.ContextOfItems=value;
	}

	public IfcLabel getRepresentationIdentifier() {
		return RepresentationIdentifier;
	}

	public void setRepresentationIdentifier(IfcLabel value){
		this.RepresentationIdentifier=value;
	}

	public IfcLabel getRepresentationType() {
		return RepresentationType;
	}

	public void setRepresentationType(IfcLabel value){
		this.RepresentationType=value;
	}

	public List<IfcRepresentationItem> getItems() {
		return Items;
	}

	public void setItems(IfcRepresentationItem value){
		this.Items.add(value);
	}

	// Getters and setters of inverse values

	public List<IfcRepresentationMap> getRepresentationMap() {
		return RepresentationMap;
	}

	public void setRepresentationMap(IfcRepresentationMap value){
		this.RepresentationMap.add(value);
	}

	public List<IfcPresentationLayerAssignment> getLayerAssignments() {
		return LayerAssignments;
	}

	public void setLayerAssignments(IfcPresentationLayerAssignment value){
		this.LayerAssignments.add(value);
	}

	public List<IfcProductRepresentation> getOfProductRepresentation() {
		return OfProductRepresentation;
	}

	public void setOfProductRepresentation(IfcProductRepresentation value){
		this.OfProductRepresentation.add(value);
	}

}
