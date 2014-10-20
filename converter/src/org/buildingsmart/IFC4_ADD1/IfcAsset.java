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

public class IfcAsset extends IfcGroup 
{
	// The property attributes
	private IfcIdentifier Identification_of_IfcAsset;
	private IfcCostValue OriginalValue_of_IfcAsset;
	private IfcCostValue CurrentValue_of_IfcAsset;
	private IfcCostValue TotalReplacementCost;
	private IfcActorSelect Owner;
	private IfcActorSelect User;
	private IfcPerson ResponsiblePerson;
	private IfcDate IncorporationDate;
	private IfcCostValue DepreciatedValue;


	// Getters and setters of properties
	public IfcIdentifier getIdentification_of_IfcAsset() {
		return Identification_of_IfcAsset;
	}

	public void setIdentification_of_IfcAsset(IfcIdentifier value){
		this.Identification_of_IfcAsset=value;
	}

	public IfcCostValue getOriginalValue_of_IfcAsset() {
		return OriginalValue_of_IfcAsset;
	}

	public void setOriginalValue_of_IfcAsset(IfcCostValue value){
		this.OriginalValue_of_IfcAsset=value;
	}

	public IfcCostValue getCurrentValue_of_IfcAsset() {
		return CurrentValue_of_IfcAsset;
	}

	public void setCurrentValue_of_IfcAsset(IfcCostValue value){
		this.CurrentValue_of_IfcAsset=value;
	}

	public IfcCostValue getTotalReplacementCost() {
		return TotalReplacementCost;
	}

	public void setTotalReplacementCost(IfcCostValue value){
		this.TotalReplacementCost=value;
	}

	public IfcActorSelect getOwner() {
		return Owner;
	}

	public void setOwner(IfcActorSelect value){
		this.Owner=value;
	}

	public IfcActorSelect getUser() {
		return User;
	}

	public void setUser(IfcActorSelect value){
		this.User=value;
	}

	public IfcPerson getResponsiblePerson() {
		return ResponsiblePerson;
	}

	public void setResponsiblePerson(IfcPerson value){
		this.ResponsiblePerson=value;
	}

	public IfcDate getIncorporationDate() {
		return IncorporationDate;
	}

	public void setIncorporationDate(IfcDate value){
		this.IncorporationDate=value;
	}

	public IfcCostValue getDepreciatedValue() {
		return DepreciatedValue;
	}

	public void setDepreciatedValue(IfcCostValue value){
		this.DepreciatedValue=value;
	}

}
