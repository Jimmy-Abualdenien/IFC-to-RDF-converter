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

public class IfcSIUnit extends IfcNamedUnit 
{
	// The property attributes
	private IfcSIPrefix Prefix;
	private IfcSIUnitName Name_of_IfcSIUnit;


	// Getters and setters of properties
	public IfcSIPrefix getPrefix() {
		return Prefix;
	}

	public void setPrefix(IfcSIPrefix value){
		this.Prefix=value;
	}

	public IfcSIUnitName getName_of_IfcSIUnit() {
		return Name_of_IfcSIUnit;
	}

	public void setName_of_IfcSIUnit(IfcSIUnitName value){
		this.Name_of_IfcSIUnit=value;
	}

}
