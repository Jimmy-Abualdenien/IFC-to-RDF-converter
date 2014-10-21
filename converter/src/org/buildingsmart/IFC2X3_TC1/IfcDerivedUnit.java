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

public class IfcDerivedUnit extends Thing implements IfcUnit
{
	// The property attributes
	private List<IfcDerivedUnitElement> Elements_of_IfcDerivedUnit = new ArrayList<IfcDerivedUnitElement>();
	private IfcDerivedUnitEnum UnitType_of_IfcDerivedUnit;
	private IfcLabel UserDefinedType;


	// Getters and setters of properties
	public List<IfcDerivedUnitElement> getElements_of_IfcDerivedUnit() {
		return Elements_of_IfcDerivedUnit;
	}

	public void setElements_of_IfcDerivedUnit(IfcDerivedUnitElement value){
		this.Elements_of_IfcDerivedUnit.add(value);
	}

	public IfcDerivedUnitEnum getUnitType_of_IfcDerivedUnit() {
		return UnitType_of_IfcDerivedUnit;
	}

	public void setUnitType_of_IfcDerivedUnit(IfcDerivedUnitEnum value){
		this.UnitType_of_IfcDerivedUnit=value;
	}

	public IfcLabel getUserDefinedType() {
		return UserDefinedType;
	}

	public void setUserDefinedType(IfcLabel value){
		this.UserDefinedType=value;
	}

}
