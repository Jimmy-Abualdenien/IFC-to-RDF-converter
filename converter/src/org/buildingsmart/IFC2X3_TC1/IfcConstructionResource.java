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

public class IfcConstructionResource extends IfcResource 
{
	// The property attributes
	private IfcIdentifier ResourceIdentifier;
	private IfcLabel ResourceGroup;
	private IfcResourceConsumptionEnum ResourceConsumption;
	private IfcMeasureWithUnit BaseQuantity;


	// Getters and setters of properties
	public IfcIdentifier getResourceIdentifier() {
		return ResourceIdentifier;
	}

	public void setResourceIdentifier(IfcIdentifier value){
		this.ResourceIdentifier=value;
	}

	public IfcLabel getResourceGroup() {
		return ResourceGroup;
	}

	public void setResourceGroup(IfcLabel value){
		this.ResourceGroup=value;
	}

	public IfcResourceConsumptionEnum getResourceConsumption() {
		return ResourceConsumption;
	}

	public void setResourceConsumption(IfcResourceConsumptionEnum value){
		this.ResourceConsumption=value;
	}

	public IfcMeasureWithUnit getBaseQuantity() {
		return BaseQuantity;
	}

	public void setBaseQuantity(IfcMeasureWithUnit value){
		this.BaseQuantity=value;
	}

}
