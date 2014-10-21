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

public class IfcShapeAspect extends Thing 
{
	// The property attributes
	private List<IfcShapeModel> ShapeRepresentations = new ArrayList<IfcShapeModel>();
	private IfcLabel Name_of_IfcShapeAspect;
	private IfcText Description_of_IfcShapeAspect;
	private Boolean ProductDefinitional;
	private IfcProductDefinitionShape PartOfProductDefinitionShape;


	// Getters and setters of properties
	public List<IfcShapeModel> getShapeRepresentations() {
		return ShapeRepresentations;
	}

	public void setShapeRepresentations(IfcShapeModel value){
		this.ShapeRepresentations.add(value);
	}

	public IfcLabel getName_of_IfcShapeAspect() {
		return Name_of_IfcShapeAspect;
	}

	public void setName_of_IfcShapeAspect(IfcLabel value){
		this.Name_of_IfcShapeAspect=value;
	}

	public IfcText getDescription_of_IfcShapeAspect() {
		return Description_of_IfcShapeAspect;
	}

	public void setDescription_of_IfcShapeAspect(IfcText value){
		this.Description_of_IfcShapeAspect=value;
	}

	public Boolean getProductDefinitional() {
		return ProductDefinitional;
	}

	public void setProductDefinitional(Boolean value){
		this.ProductDefinitional=value;
	}

	public IfcProductDefinitionShape getPartOfProductDefinitionShape() {
		return PartOfProductDefinitionShape;
	}

	public void setPartOfProductDefinitionShape(IfcProductDefinitionShape value){
		this.PartOfProductDefinitionShape=value;
	}

}
