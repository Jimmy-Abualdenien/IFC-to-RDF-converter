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

public class IfcAppliedValueRelationship extends Thing 
{
	// The property attributes
	private IfcAppliedValue ComponentOfTotal;
	private List<IfcAppliedValue> Components = new ArrayList<IfcAppliedValue>();
	private IfcArithmeticOperatorEnum ArithmeticOperator;
	private IfcLabel Name_of_IfcAppliedValueRelationship;
	private IfcText Description_of_IfcAppliedValueRelationship;


	// Getters and setters of properties
	public IfcAppliedValue getComponentOfTotal() {
		return ComponentOfTotal;
	}

	public void setComponentOfTotal(IfcAppliedValue value){
		this.ComponentOfTotal=value;
	}

	public List<IfcAppliedValue> getComponents() {
		return Components;
	}

	public void setComponents(IfcAppliedValue value){
		this.Components.add(value);
	}

	public IfcArithmeticOperatorEnum getArithmeticOperator() {
		return ArithmeticOperator;
	}

	public void setArithmeticOperator(IfcArithmeticOperatorEnum value){
		this.ArithmeticOperator=value;
	}

	public IfcLabel getName_of_IfcAppliedValueRelationship() {
		return Name_of_IfcAppliedValueRelationship;
	}

	public void setName_of_IfcAppliedValueRelationship(IfcLabel value){
		this.Name_of_IfcAppliedValueRelationship=value;
	}

	public IfcText getDescription_of_IfcAppliedValueRelationship() {
		return Description_of_IfcAppliedValueRelationship;
	}

	public void setDescription_of_IfcAppliedValueRelationship(IfcText value){
		this.Description_of_IfcAppliedValueRelationship=value;
	}

}
