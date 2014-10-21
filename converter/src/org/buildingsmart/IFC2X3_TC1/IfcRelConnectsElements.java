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

public class IfcRelConnectsElements extends IfcRelConnects 
{
	// The property attributes
	private IfcConnectionGeometry ConnectionGeometry_of_IfcRelConnectsElements;
	private IfcElement RelatingElement_of_IfcRelConnectsElements;
	private IfcElement RelatedElement_of_IfcRelConnectsElements;


	// Getters and setters of properties
	public IfcConnectionGeometry getConnectionGeometry_of_IfcRelConnectsElements() {
		return ConnectionGeometry_of_IfcRelConnectsElements;
	}

	public void setConnectionGeometry_of_IfcRelConnectsElements(IfcConnectionGeometry value){
		this.ConnectionGeometry_of_IfcRelConnectsElements=value;
	}

	public IfcElement getRelatingElement_of_IfcRelConnectsElements() {
		return RelatingElement_of_IfcRelConnectsElements;
	}

	public void setRelatingElement_of_IfcRelConnectsElements(IfcElement value){
		this.RelatingElement_of_IfcRelConnectsElements=value;
	}

	public IfcElement getRelatedElement_of_IfcRelConnectsElements() {
		return RelatedElement_of_IfcRelConnectsElements;
	}

	public void setRelatedElement_of_IfcRelConnectsElements(IfcElement value){
		this.RelatedElement_of_IfcRelConnectsElements=value;
	}

}
