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

public class IfcRelProjectsElement extends IfcRelDecomposes 
{
	// The property attributes
	private IfcElement RelatingElement_of_IfcRelProjectsElement;
	private IfcFeatureElementAddition RelatedFeatureElement;


	// Getters and setters of properties
	public IfcElement getRelatingElement_of_IfcRelProjectsElement() {
		return RelatingElement_of_IfcRelProjectsElement;
	}

	public void setRelatingElement_of_IfcRelProjectsElement(IfcElement value){
		this.RelatingElement_of_IfcRelProjectsElement=value;
	}

	public IfcFeatureElementAddition getRelatedFeatureElement() {
		return RelatedFeatureElement;
	}

	public void setRelatedFeatureElement(IfcFeatureElementAddition value){
		this.RelatedFeatureElement=value;
	}

}
