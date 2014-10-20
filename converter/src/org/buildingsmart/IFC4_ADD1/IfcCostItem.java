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

public class IfcCostItem extends IfcControl 
{
	// The property attributes
	private IfcCostItemTypeEnum PredefinedType_of_IfcCostItem;
	private List<IfcCostValue> CostValues = new ArrayList<IfcCostValue>();
	private List<IfcPhysicalQuantity> CostQuantities = new ArrayList<IfcPhysicalQuantity>();


	// Getters and setters of properties
	public IfcCostItemTypeEnum getPredefinedType_of_IfcCostItem() {
		return PredefinedType_of_IfcCostItem;
	}

	public void setPredefinedType_of_IfcCostItem(IfcCostItemTypeEnum value){
		this.PredefinedType_of_IfcCostItem=value;
	}

	public List<IfcCostValue> getCostValues() {
		return CostValues;
	}

	public void setCostValues(IfcCostValue value){
		this.CostValues.add(value);
	}

	public List<IfcPhysicalQuantity> getCostQuantities() {
		return CostQuantities;
	}

	public void setCostQuantities(IfcPhysicalQuantity value){
		this.CostQuantities.add(value);
	}

}
