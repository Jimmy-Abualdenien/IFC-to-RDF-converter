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

public class IfcRelSpaceBoundary extends IfcRelConnects 
{
	// The property attributes
	private IfcSpaceBoundarySelect RelatingSpace_of_IfcRelSpaceBoundary;
	private IfcElement RelatedBuildingElement_of_IfcRelSpaceBoundary;
	private IfcConnectionGeometry ConnectionGeometry_of_IfcRelSpaceBoundary;
	private IfcPhysicalOrVirtualEnum PhysicalOrVirtualBoundary;
	private IfcInternalOrExternalEnum InternalOrExternalBoundary;


	// Getters and setters of properties
	public IfcSpaceBoundarySelect getRelatingSpace_of_IfcRelSpaceBoundary() {
		return RelatingSpace_of_IfcRelSpaceBoundary;
	}

	public void setRelatingSpace_of_IfcRelSpaceBoundary(IfcSpaceBoundarySelect value){
		this.RelatingSpace_of_IfcRelSpaceBoundary=value;
	}

	public IfcElement getRelatedBuildingElement_of_IfcRelSpaceBoundary() {
		return RelatedBuildingElement_of_IfcRelSpaceBoundary;
	}

	public void setRelatedBuildingElement_of_IfcRelSpaceBoundary(IfcElement value){
		this.RelatedBuildingElement_of_IfcRelSpaceBoundary=value;
	}

	public IfcConnectionGeometry getConnectionGeometry_of_IfcRelSpaceBoundary() {
		return ConnectionGeometry_of_IfcRelSpaceBoundary;
	}

	public void setConnectionGeometry_of_IfcRelSpaceBoundary(IfcConnectionGeometry value){
		this.ConnectionGeometry_of_IfcRelSpaceBoundary=value;
	}

	public IfcPhysicalOrVirtualEnum getPhysicalOrVirtualBoundary() {
		return PhysicalOrVirtualBoundary;
	}

	public void setPhysicalOrVirtualBoundary(IfcPhysicalOrVirtualEnum value){
		this.PhysicalOrVirtualBoundary=value;
	}

	public IfcInternalOrExternalEnum getInternalOrExternalBoundary() {
		return InternalOrExternalBoundary;
	}

	public void setInternalOrExternalBoundary(IfcInternalOrExternalEnum value){
		this.InternalOrExternalBoundary=value;
	}

}
