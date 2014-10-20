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

public class IfcSimplePropertyTemplate extends IfcPropertyTemplate 
{
	// The property attributes
	private IfcSimplePropertyTemplateTypeEnum TemplateType_of_IfcSimplePropertyTemplate;
	private IfcLabel PrimaryMeasureType;
	private IfcLabel SecondaryMeasureType;
	private IfcPropertyEnumeration Enumerators;
	private IfcUnit PrimaryUnit;
	private IfcUnit SecondaryUnit;
	private IfcLabel Expression_of_IfcSimplePropertyTemplate;
	private IfcStateEnum AccessState;


	// Getters and setters of properties
	public IfcSimplePropertyTemplateTypeEnum getTemplateType_of_IfcSimplePropertyTemplate() {
		return TemplateType_of_IfcSimplePropertyTemplate;
	}

	public void setTemplateType_of_IfcSimplePropertyTemplate(IfcSimplePropertyTemplateTypeEnum value){
		this.TemplateType_of_IfcSimplePropertyTemplate=value;
	}

	public IfcLabel getPrimaryMeasureType() {
		return PrimaryMeasureType;
	}

	public void setPrimaryMeasureType(IfcLabel value){
		this.PrimaryMeasureType=value;
	}

	public IfcLabel getSecondaryMeasureType() {
		return SecondaryMeasureType;
	}

	public void setSecondaryMeasureType(IfcLabel value){
		this.SecondaryMeasureType=value;
	}

	public IfcPropertyEnumeration getEnumerators() {
		return Enumerators;
	}

	public void setEnumerators(IfcPropertyEnumeration value){
		this.Enumerators=value;
	}

	public IfcUnit getPrimaryUnit() {
		return PrimaryUnit;
	}

	public void setPrimaryUnit(IfcUnit value){
		this.PrimaryUnit=value;
	}

	public IfcUnit getSecondaryUnit() {
		return SecondaryUnit;
	}

	public void setSecondaryUnit(IfcUnit value){
		this.SecondaryUnit=value;
	}

	public IfcLabel getExpression_of_IfcSimplePropertyTemplate() {
		return Expression_of_IfcSimplePropertyTemplate;
	}

	public void setExpression_of_IfcSimplePropertyTemplate(IfcLabel value){
		this.Expression_of_IfcSimplePropertyTemplate=value;
	}

	public IfcStateEnum getAccessState() {
		return AccessState;
	}

	public void setAccessState(IfcStateEnum value){
		this.AccessState=value;
	}

}
