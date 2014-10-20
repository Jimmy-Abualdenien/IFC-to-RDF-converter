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

public class IfcRelReferencedInSpatialStructure extends IfcRelConnects 
{
	// The property attributes
	private List<IfcProduct> RelatedElements_of_IfcRelReferencedInSpatialStructure = new ArrayList<IfcProduct>();
	private IfcSpatialElement RelatingStructure_of_IfcRelReferencedInSpatialStructure;


	// Getters and setters of properties
	public List<IfcProduct> getRelatedElements_of_IfcRelReferencedInSpatialStructure() {
		return RelatedElements_of_IfcRelReferencedInSpatialStructure;
	}

	public void setRelatedElements_of_IfcRelReferencedInSpatialStructure(IfcProduct value){
		this.RelatedElements_of_IfcRelReferencedInSpatialStructure.add(value);
	}

	public IfcSpatialElement getRelatingStructure_of_IfcRelReferencedInSpatialStructure() {
		return RelatingStructure_of_IfcRelReferencedInSpatialStructure;
	}

	public void setRelatingStructure_of_IfcRelReferencedInSpatialStructure(IfcSpatialElement value){
		this.RelatingStructure_of_IfcRelReferencedInSpatialStructure=value;
	}

}
