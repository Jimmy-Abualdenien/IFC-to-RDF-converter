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

public class IfcRelInterferesElements extends IfcRelConnects 
{
	// The property attributes
	private IfcElement RelatingElement_of_IfcRelInterferesElements;
	private IfcElement RelatedElement_of_IfcRelInterferesElements;
	private IfcConnectionGeometry InterferenceGeometry;
	private IfcIdentifier InterferenceType;
	private Boolean ImpliedOrder;


	// Getters and setters of properties
	public IfcElement getRelatingElement_of_IfcRelInterferesElements() {
		return RelatingElement_of_IfcRelInterferesElements;
	}

	public void setRelatingElement_of_IfcRelInterferesElements(IfcElement value){
		this.RelatingElement_of_IfcRelInterferesElements=value;
	}

	public IfcElement getRelatedElement_of_IfcRelInterferesElements() {
		return RelatedElement_of_IfcRelInterferesElements;
	}

	public void setRelatedElement_of_IfcRelInterferesElements(IfcElement value){
		this.RelatedElement_of_IfcRelInterferesElements=value;
	}

	public IfcConnectionGeometry getInterferenceGeometry() {
		return InterferenceGeometry;
	}

	public void setInterferenceGeometry(IfcConnectionGeometry value){
		this.InterferenceGeometry=value;
	}

	public IfcIdentifier getInterferenceType() {
		return InterferenceType;
	}

	public void setInterferenceType(IfcIdentifier value){
		this.InterferenceType=value;
	}

	public Boolean getImpliedOrder() {
		return ImpliedOrder;
	}

	public void setImpliedOrder(Boolean value){
		this.ImpliedOrder=value;
	}

}
