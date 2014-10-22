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

public class IfcPort extends IfcProduct 
{
	// The inverse attributes
	private List<IfcRelConnectsPortToElement> ContainedIn= new ArrayList<IfcRelConnectsPortToElement>();
	private List<IfcRelConnectsPorts> ConnectedFrom= new ArrayList<IfcRelConnectsPorts>();
	private List<IfcRelConnectsPorts> ConnectedTo= new ArrayList<IfcRelConnectsPorts>();


	// Getters and setters of inverse values

	public List<IfcRelConnectsPortToElement> getContainedIn() {
		return ContainedIn;
	}

	public void setContainedIn(IfcRelConnectsPortToElement value){
		this.ContainedIn.add(value);
	}

	public List<IfcRelConnectsPorts> getConnectedFrom() {
		return ConnectedFrom;
	}

	public void setConnectedFrom(IfcRelConnectsPorts value){
		this.ConnectedFrom.add(value);
	}

	public List<IfcRelConnectsPorts> getConnectedTo() {
		return ConnectedTo;
	}

	public void setConnectedTo(IfcRelConnectsPorts value){
		this.ConnectedTo.add(value);
	}

}
