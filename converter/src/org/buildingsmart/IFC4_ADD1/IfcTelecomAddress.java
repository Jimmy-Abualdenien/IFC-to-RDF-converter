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

public class IfcTelecomAddress extends IfcAddress 
{
	// The property attributes
	private List<IfcLabel> TelephoneNumbers = new ArrayList<IfcLabel>();
	private List<IfcLabel> FacsimileNumbers = new ArrayList<IfcLabel>();
	private IfcLabel PagerNumber;
	private List<IfcLabel> ElectronicMailAddresses = new ArrayList<IfcLabel>();
	private IfcURIReference WWWHomePageURL;
	private List<IfcURIReference> MessagingIDs = new ArrayList<IfcURIReference>();


	// Getters and setters of properties
	public List<IfcLabel> getTelephoneNumbers() {
		return TelephoneNumbers;
	}

	public void setTelephoneNumbers(IfcLabel value){
		this.TelephoneNumbers.add(value);
	}

	public List<IfcLabel> getFacsimileNumbers() {
		return FacsimileNumbers;
	}

	public void setFacsimileNumbers(IfcLabel value){
		this.FacsimileNumbers.add(value);
	}

	public IfcLabel getPagerNumber() {
		return PagerNumber;
	}

	public void setPagerNumber(IfcLabel value){
		this.PagerNumber=value;
	}

	public List<IfcLabel> getElectronicMailAddresses() {
		return ElectronicMailAddresses;
	}

	public void setElectronicMailAddresses(IfcLabel value){
		this.ElectronicMailAddresses.add(value);
	}

	public IfcURIReference getWWWHomePageURL() {
		return WWWHomePageURL;
	}

	public void setWWWHomePageURL(IfcURIReference value){
		this.WWWHomePageURL=value;
	}

	public List<IfcURIReference> getMessagingIDs() {
		return MessagingIDs;
	}

	public void setMessagingIDs(IfcURIReference value){
		this.MessagingIDs.add(value);
	}

}
