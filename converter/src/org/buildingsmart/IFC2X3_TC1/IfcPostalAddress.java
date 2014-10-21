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

public class IfcPostalAddress extends IfcAddress 
{
	// The property attributes
	private IfcLabel InternalLocation;
	private List<IfcLabel> AddressLines = new ArrayList<IfcLabel>();
	private IfcLabel PostalBox;
	private IfcLabel Town;
	private IfcLabel Region;
	private IfcLabel PostalCode;
	private IfcLabel Country;


	// Getters and setters of properties
	public IfcLabel getInternalLocation() {
		return InternalLocation;
	}

	public void setInternalLocation(IfcLabel value){
		this.InternalLocation=value;
	}

	public List<IfcLabel> getAddressLines() {
		return AddressLines;
	}

	public void setAddressLines(IfcLabel value){
		this.AddressLines.add(value);
	}

	public IfcLabel getPostalBox() {
		return PostalBox;
	}

	public void setPostalBox(IfcLabel value){
		this.PostalBox=value;
	}

	public IfcLabel getTown() {
		return Town;
	}

	public void setTown(IfcLabel value){
		this.Town=value;
	}

	public IfcLabel getRegion() {
		return Region;
	}

	public void setRegion(IfcLabel value){
		this.Region=value;
	}

	public IfcLabel getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(IfcLabel value){
		this.PostalCode=value;
	}

	public IfcLabel getCountry() {
		return Country;
	}

	public void setCountry(IfcLabel value){
		this.Country=value;
	}

}
