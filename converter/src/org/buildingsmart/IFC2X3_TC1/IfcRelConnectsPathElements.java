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

public class IfcRelConnectsPathElements extends IfcRelConnectsElements 
{
	// The property attributes
	private List<Integer> RelatingPriorities = new ArrayList<Integer>();
	private List<Integer> RelatedPriorities = new ArrayList<Integer>();
	private IfcConnectionTypeEnum RelatedConnectionType;
	private IfcConnectionTypeEnum RelatingConnectionType;


	// Getters and setters of properties
	public List<Integer> getRelatingPriorities() {
		return RelatingPriorities;
	}

	public void setRelatingPriorities(Integer value){
		this.RelatingPriorities.add(value);
	}

	public List<Integer> getRelatedPriorities() {
		return RelatedPriorities;
	}

	public void setRelatedPriorities(Integer value){
		this.RelatedPriorities.add(value);
	}

	public IfcConnectionTypeEnum getRelatedConnectionType() {
		return RelatedConnectionType;
	}

	public void setRelatedConnectionType(IfcConnectionTypeEnum value){
		this.RelatedConnectionType=value;
	}

	public IfcConnectionTypeEnum getRelatingConnectionType() {
		return RelatingConnectionType;
	}

	public void setRelatingConnectionType(IfcConnectionTypeEnum value){
		this.RelatingConnectionType=value;
	}

}
