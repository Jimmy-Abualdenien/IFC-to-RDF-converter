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

public class IfcRoot extends Thing 
{
	// The property attributes
	private IfcGloballyUniqueId GlobalId;
	private IfcOwnerHistory OwnerHistory;
	private IfcLabel Name_of_IfcRoot;
	private IfcText Description_of_IfcRoot;


	// Getters and setters of properties
	public IfcGloballyUniqueId getGlobalId() {
		return GlobalId;
	}

	public void setGlobalId(IfcGloballyUniqueId value){
		this.GlobalId=value;
	}

	public IfcOwnerHistory getOwnerHistory() {
		return OwnerHistory;
	}

	public void setOwnerHistory(IfcOwnerHistory value){
		this.OwnerHistory=value;
	}

	public IfcLabel getName_of_IfcRoot() {
		return Name_of_IfcRoot;
	}

	public void setName_of_IfcRoot(IfcLabel value){
		this.Name_of_IfcRoot=value;
	}

	public IfcText getDescription_of_IfcRoot() {
		return Description_of_IfcRoot;
	}

	public void setDescription_of_IfcRoot(IfcText value){
		this.Description_of_IfcRoot=value;
	}

}
