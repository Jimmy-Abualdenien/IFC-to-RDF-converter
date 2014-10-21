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

public class IfcPropertyTableValue extends IfcSimpleProperty 
{
	// The property attributes
	private List<IfcValue> DefiningValues = new ArrayList<IfcValue>();
	private List<IfcValue> DefinedValues = new ArrayList<IfcValue>();
	private IfcText Expression_of_IfcPropertyTableValue;
	private IfcUnit DefiningUnit;
	private IfcUnit DefinedUnit;


	// Getters and setters of properties
	public List<IfcValue> getDefiningValues() {
		return DefiningValues;
	}

	public void setDefiningValues(IfcValue value){
		this.DefiningValues.add(value);
	}

	public List<IfcValue> getDefinedValues() {
		return DefinedValues;
	}

	public void setDefinedValues(IfcValue value){
		this.DefinedValues.add(value);
	}

	public IfcText getExpression_of_IfcPropertyTableValue() {
		return Expression_of_IfcPropertyTableValue;
	}

	public void setExpression_of_IfcPropertyTableValue(IfcText value){
		this.Expression_of_IfcPropertyTableValue=value;
	}

	public IfcUnit getDefiningUnit() {
		return DefiningUnit;
	}

	public void setDefiningUnit(IfcUnit value){
		this.DefiningUnit=value;
	}

	public IfcUnit getDefinedUnit() {
		return DefinedUnit;
	}

	public void setDefinedUnit(IfcUnit value){
		this.DefinedUnit=value;
	}

}
