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

public class IfcCovering extends IfcBuildingElement 
{
	// The property attributes
	private IfcCoveringTypeEnum PredefinedType_of_IfcCovering;
 // The inverse attributes

	private List<IfcRelCoversSpaces> CoversSpaces= new ArrayList<IfcRelCoversSpaces>();
	private List<IfcRelCoversBldgElements> Covers= new ArrayList<IfcRelCoversBldgElements>();


	// Getters and setters of properties
	public IfcCoveringTypeEnum getPredefinedType_of_IfcCovering() {
		return PredefinedType_of_IfcCovering;
	}

	public void setPredefinedType_of_IfcCovering(IfcCoveringTypeEnum value){
		this.PredefinedType_of_IfcCovering=value;
	}

	// Getters and setters of inverse values

	public List<IfcRelCoversSpaces> getCoversSpaces() {
		return CoversSpaces;
	}

	public void setCoversSpaces(IfcRelCoversSpaces value){
		this.CoversSpaces.add(value);
	}

	public List<IfcRelCoversBldgElements> getCovers() {
		return Covers;
	}

	public void setCovers(IfcRelCoversBldgElements value){
		this.Covers.add(value);
	}

}
