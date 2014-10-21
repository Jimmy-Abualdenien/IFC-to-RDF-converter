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

public class IfcRelFillsElement extends IfcRelConnects 
{
	// The property attributes
	private IfcOpeningElement RelatingOpeningElement;
	private IfcElement RelatedBuildingElement_of_IfcRelFillsElement;


	// Getters and setters of properties
	public IfcOpeningElement getRelatingOpeningElement() {
		return RelatingOpeningElement;
	}

	public void setRelatingOpeningElement(IfcOpeningElement value){
		this.RelatingOpeningElement=value;
	}

	public IfcElement getRelatedBuildingElement_of_IfcRelFillsElement() {
		return RelatedBuildingElement_of_IfcRelFillsElement;
	}

	public void setRelatedBuildingElement_of_IfcRelFillsElement(IfcElement value){
		this.RelatedBuildingElement_of_IfcRelFillsElement=value;
	}

}
