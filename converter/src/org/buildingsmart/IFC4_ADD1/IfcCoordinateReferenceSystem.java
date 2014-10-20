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

public class IfcCoordinateReferenceSystem extends Thing implements IfcCoordinateReferenceSystemSelect
{
	// The property attributes
	private IfcLabel Name_of_IfcCoordinateReferenceSystem;
	private IfcText Description_of_IfcCoordinateReferenceSystem;
	private IfcIdentifier GeodeticDatum;
	private IfcIdentifier VerticalDatum;
 // The inverse attributes

	private List<IfcCoordinateOperation> HasCoordinateOperation= new ArrayList<IfcCoordinateOperation>();


	// Getters and setters of properties
	public IfcLabel getName_of_IfcCoordinateReferenceSystem() {
		return Name_of_IfcCoordinateReferenceSystem;
	}

	public void setName_of_IfcCoordinateReferenceSystem(IfcLabel value){
		this.Name_of_IfcCoordinateReferenceSystem=value;
	}

	public IfcText getDescription_of_IfcCoordinateReferenceSystem() {
		return Description_of_IfcCoordinateReferenceSystem;
	}

	public void setDescription_of_IfcCoordinateReferenceSystem(IfcText value){
		this.Description_of_IfcCoordinateReferenceSystem=value;
	}

	public IfcIdentifier getGeodeticDatum() {
		return GeodeticDatum;
	}

	public void setGeodeticDatum(IfcIdentifier value){
		this.GeodeticDatum=value;
	}

	public IfcIdentifier getVerticalDatum() {
		return VerticalDatum;
	}

	public void setVerticalDatum(IfcIdentifier value){
		this.VerticalDatum=value;
	}

	// Getters and setters of inverse values

	public List<IfcCoordinateOperation> getHasCoordinateOperation() {
		return HasCoordinateOperation;
	}

	public void setHasCoordinateOperation(IfcCoordinateOperation value){
		this.HasCoordinateOperation.add(value);
	}

}
