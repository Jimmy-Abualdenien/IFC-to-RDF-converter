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

public class IfcCurrencyRelationship extends Thing 
{
	// The property attributes
	private IfcMonetaryUnit RelatingMonetaryUnit;
	private IfcMonetaryUnit RelatedMonetaryUnit;
	private IfcPositiveRatioMeasure ExchangeRate;
	private IfcDateAndTime RateDateTime;
	private IfcLibraryInformation RateSource;


	// Getters and setters of properties
	public IfcMonetaryUnit getRelatingMonetaryUnit() {
		return RelatingMonetaryUnit;
	}

	public void setRelatingMonetaryUnit(IfcMonetaryUnit value){
		this.RelatingMonetaryUnit=value;
	}

	public IfcMonetaryUnit getRelatedMonetaryUnit() {
		return RelatedMonetaryUnit;
	}

	public void setRelatedMonetaryUnit(IfcMonetaryUnit value){
		this.RelatedMonetaryUnit=value;
	}

	public IfcPositiveRatioMeasure getExchangeRate() {
		return ExchangeRate;
	}

	public void setExchangeRate(IfcPositiveRatioMeasure value){
		this.ExchangeRate=value;
	}

	public IfcDateAndTime getRateDateTime() {
		return RateDateTime;
	}

	public void setRateDateTime(IfcDateAndTime value){
		this.RateDateTime=value;
	}

	public IfcLibraryInformation getRateSource() {
		return RateSource;
	}

	public void setRateSource(IfcLibraryInformation value){
		this.RateSource=value;
	}

}
