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

public class IfcObject extends IfcObjectDefinition 
{
	// The property attributes
	private IfcLabel ObjectType_of_IfcObject;
	// The inverse attributes
	private List<IfcRelDefinesByObject> IsDeclaredBy= new ArrayList<IfcRelDefinesByObject>();
	private List<IfcRelDefinesByObject> Declares= new ArrayList<IfcRelDefinesByObject>();
	private List<IfcRelDefinesByType> IsTypedBy= new ArrayList<IfcRelDefinesByType>();
	private List<IfcRelDefinesByProperties> IsDefinedBy= new ArrayList<IfcRelDefinesByProperties>();


	// Getters and setters of properties
	public IfcLabel getObjectType_of_IfcObject() {
		return ObjectType_of_IfcObject;
	}

	public void setObjectType_of_IfcObject(IfcLabel value){
		this.ObjectType_of_IfcObject=value;
	}

	// Getters and setters of inverse values

	public List<IfcRelDefinesByObject> getIsDeclaredBy() {
		return IsDeclaredBy;
	}

	public void setIsDeclaredBy(IfcRelDefinesByObject value){
		this.IsDeclaredBy.add(value);
	}

	public List<IfcRelDefinesByObject> getDeclares() {
		return Declares;
	}

	public void setDeclares(IfcRelDefinesByObject value){
		this.Declares.add(value);
	}

	public List<IfcRelDefinesByType> getIsTypedBy() {
		return IsTypedBy;
	}

	public void setIsTypedBy(IfcRelDefinesByType value){
		this.IsTypedBy.add(value);
	}

	public List<IfcRelDefinesByProperties> getIsDefinedBy() {
		return IsDefinedBy;
	}

	public void setIsDefinedBy(IfcRelDefinesByProperties value){
		this.IsDefinedBy.add(value);
	}

}
