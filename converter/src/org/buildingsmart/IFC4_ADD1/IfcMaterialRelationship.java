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

public class IfcMaterialRelationship extends IfcResourceLevelRelationship 
{
	// The property attributes
	private IfcMaterial RelatingMaterial_of_IfcMaterialRelationship;
	private List<IfcMaterial> RelatedMaterials = new ArrayList<IfcMaterial>();
	private IfcLabel Expression_of_IfcMaterialRelationship;


	// Getters and setters of properties
	public IfcMaterial getRelatingMaterial_of_IfcMaterialRelationship() {
		return RelatingMaterial_of_IfcMaterialRelationship;
	}

	public void setRelatingMaterial_of_IfcMaterialRelationship(IfcMaterial value){
		this.RelatingMaterial_of_IfcMaterialRelationship=value;
	}

	public List<IfcMaterial> getRelatedMaterials() {
		return RelatedMaterials;
	}

	public void setRelatedMaterials(IfcMaterial value){
		this.RelatedMaterials.add(value);
	}

	public IfcLabel getExpression_of_IfcMaterialRelationship() {
		return Expression_of_IfcMaterialRelationship;
	}

	public void setExpression_of_IfcMaterialRelationship(IfcLabel value){
		this.Expression_of_IfcMaterialRelationship=value;
	}

}
