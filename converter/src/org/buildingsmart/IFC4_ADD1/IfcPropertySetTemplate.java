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

public class IfcPropertySetTemplate extends IfcPropertyTemplateDefinition 
{
	// The property attributes
	private IfcPropertySetTemplateTypeEnum TemplateType_of_IfcPropertySetTemplate;
	private IfcIdentifier ApplicableEntity;
	private List<IfcPropertyTemplate> HasPropertyTemplates_of_IfcPropertySetTemplate = new ArrayList<IfcPropertyTemplate>();
	// The inverse attributes
	private List<IfcRelDefinesByTemplate> Defines= new ArrayList<IfcRelDefinesByTemplate>();


	// Getters and setters of properties
	public IfcPropertySetTemplateTypeEnum getTemplateType_of_IfcPropertySetTemplate() {
		return TemplateType_of_IfcPropertySetTemplate;
	}

	public void setTemplateType_of_IfcPropertySetTemplate(IfcPropertySetTemplateTypeEnum value){
		this.TemplateType_of_IfcPropertySetTemplate=value;
	}

	public IfcIdentifier getApplicableEntity() {
		return ApplicableEntity;
	}

	public void setApplicableEntity(IfcIdentifier value){
		this.ApplicableEntity=value;
	}

	public List<IfcPropertyTemplate> getHasPropertyTemplates_of_IfcPropertySetTemplate() {
		return HasPropertyTemplates_of_IfcPropertySetTemplate;
	}

	public void setHasPropertyTemplates_of_IfcPropertySetTemplate(IfcPropertyTemplate value){
		this.HasPropertyTemplates_of_IfcPropertySetTemplate.add(value);
	}

	// Getters and setters of inverse values

	public List<IfcRelDefinesByTemplate> getDefines() {
		return Defines;
	}

	public void setDefines(IfcRelDefinesByTemplate value){
		this.Defines.add(value);
	}

}
