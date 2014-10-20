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

public class IfcRepresentationMap extends Thing implements IfcProductRepresentationSelect
{
	// The property attributes
	private IfcAxis2Placement MappingOrigin;
	private IfcRepresentation MappedRepresentation;
 // The inverse attributes

	private List<IfcShapeAspect> HasShapeAspects= new ArrayList<IfcShapeAspect>();
	private List<IfcMappedItem> MapUsage= new ArrayList<IfcMappedItem>();


	// Getters and setters of properties
	public IfcAxis2Placement getMappingOrigin() {
		return MappingOrigin;
	}

	public void setMappingOrigin(IfcAxis2Placement value){
		this.MappingOrigin=value;
	}

	public IfcRepresentation getMappedRepresentation() {
		return MappedRepresentation;
	}

	public void setMappedRepresentation(IfcRepresentation value){
		this.MappedRepresentation=value;
	}

	// Getters and setters of inverse values

	public List<IfcShapeAspect> getHasShapeAspects() {
		return HasShapeAspects;
	}

	public void setHasShapeAspects(IfcShapeAspect value){
		this.HasShapeAspects.add(value);
	}

	public List<IfcMappedItem> getMapUsage() {
		return MapUsage;
	}

	public void setMapUsage(IfcMappedItem value){
		this.MapUsage.add(value);
	}

}
