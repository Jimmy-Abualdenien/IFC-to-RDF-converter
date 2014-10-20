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

public class IfcInventory extends IfcGroup 
{
	// The property attributes
	private IfcInventoryTypeEnum PredefinedType_of_IfcInventory;
	private IfcActorSelect Jurisdiction;
	private List<IfcPerson> ResponsiblePersons = new ArrayList<IfcPerson>();
	private IfcDate LastUpdateDate;
	private IfcCostValue CurrentValue_of_IfcInventory;
	private IfcCostValue OriginalValue_of_IfcInventory;


	// Getters and setters of properties
	public IfcInventoryTypeEnum getPredefinedType_of_IfcInventory() {
		return PredefinedType_of_IfcInventory;
	}

	public void setPredefinedType_of_IfcInventory(IfcInventoryTypeEnum value){
		this.PredefinedType_of_IfcInventory=value;
	}

	public IfcActorSelect getJurisdiction() {
		return Jurisdiction;
	}

	public void setJurisdiction(IfcActorSelect value){
		this.Jurisdiction=value;
	}

	public List<IfcPerson> getResponsiblePersons() {
		return ResponsiblePersons;
	}

	public void setResponsiblePersons(IfcPerson value){
		this.ResponsiblePersons.add(value);
	}

	public IfcDate getLastUpdateDate() {
		return LastUpdateDate;
	}

	public void setLastUpdateDate(IfcDate value){
		this.LastUpdateDate=value;
	}

	public IfcCostValue getCurrentValue_of_IfcInventory() {
		return CurrentValue_of_IfcInventory;
	}

	public void setCurrentValue_of_IfcInventory(IfcCostValue value){
		this.CurrentValue_of_IfcInventory=value;
	}

	public IfcCostValue getOriginalValue_of_IfcInventory() {
		return OriginalValue_of_IfcInventory;
	}

	public void setOriginalValue_of_IfcInventory(IfcCostValue value){
		this.OriginalValue_of_IfcInventory=value;
	}

}
