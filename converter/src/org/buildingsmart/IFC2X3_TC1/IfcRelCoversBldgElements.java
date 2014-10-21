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

public class IfcRelCoversBldgElements extends IfcRelConnects 
{
	// The property attributes
	private IfcElement RelatingBuildingElement_of_IfcRelCoversBldgElements;
	private List<IfcCovering> RelatedCoverings_of_IfcRelCoversBldgElements = new ArrayList<IfcCovering>();


	// Getters and setters of properties
	public IfcElement getRelatingBuildingElement_of_IfcRelCoversBldgElements() {
		return RelatingBuildingElement_of_IfcRelCoversBldgElements;
	}

	public void setRelatingBuildingElement_of_IfcRelCoversBldgElements(IfcElement value){
		this.RelatingBuildingElement_of_IfcRelCoversBldgElements=value;
	}

	public List<IfcCovering> getRelatedCoverings_of_IfcRelCoversBldgElements() {
		return RelatedCoverings_of_IfcRelCoversBldgElements;
	}

	public void setRelatedCoverings_of_IfcRelCoversBldgElements(IfcCovering value){
		this.RelatedCoverings_of_IfcRelCoversBldgElements.add(value);
	}

}
