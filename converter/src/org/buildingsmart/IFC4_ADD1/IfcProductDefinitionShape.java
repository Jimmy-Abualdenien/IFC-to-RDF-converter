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

public class IfcProductDefinitionShape extends IfcProductRepresentation implements IfcProductRepresentationSelect
{
 // The inverse attributes

	private List<IfcProduct> ShapeOfProduct= new ArrayList<IfcProduct>();
	private List<IfcShapeAspect> HasShapeAspects= new ArrayList<IfcShapeAspect>();


	// Getters and setters of inverse values

	public List<IfcProduct> getShapeOfProduct() {
		return ShapeOfProduct;
	}

	public void setShapeOfProduct(IfcProduct value){
		this.ShapeOfProduct.add(value);
	}

	public List<IfcShapeAspect> getHasShapeAspects() {
		return HasShapeAspects;
	}

	public void setHasShapeAspects(IfcShapeAspect value){
		this.HasShapeAspects.add(value);
	}

}
