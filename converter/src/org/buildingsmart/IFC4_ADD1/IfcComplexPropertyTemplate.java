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

public class IfcComplexPropertyTemplate extends IfcPropertyTemplate 
{
	// The property attributes
	private IfcLabel UsageName_of_IfcComplexPropertyTemplate;
	private IfcComplexPropertyTemplateTypeEnum TemplateType_of_IfcComplexPropertyTemplate;
	private List<IfcPropertyTemplate> HasPropertyTemplates_of_IfcComplexPropertyTemplate = new ArrayList<IfcPropertyTemplate>();


	// Getters and setters of properties
	public IfcLabel getUsageName_of_IfcComplexPropertyTemplate() {
		return UsageName_of_IfcComplexPropertyTemplate;
	}

	public void setUsageName_of_IfcComplexPropertyTemplate(IfcLabel value){
		this.UsageName_of_IfcComplexPropertyTemplate=value;
	}

	public IfcComplexPropertyTemplateTypeEnum getTemplateType_of_IfcComplexPropertyTemplate() {
		return TemplateType_of_IfcComplexPropertyTemplate;
	}

	public void setTemplateType_of_IfcComplexPropertyTemplate(IfcComplexPropertyTemplateTypeEnum value){
		this.TemplateType_of_IfcComplexPropertyTemplate=value;
	}

	public List<IfcPropertyTemplate> getHasPropertyTemplates_of_IfcComplexPropertyTemplate() {
		return HasPropertyTemplates_of_IfcComplexPropertyTemplate;
	}

	public void setHasPropertyTemplates_of_IfcComplexPropertyTemplate(IfcPropertyTemplate value){
		this.HasPropertyTemplates_of_IfcComplexPropertyTemplate.add(value);
	}

}
