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

public class IfcStairFlight extends IfcBuildingElement 
{
	// The property attributes
	private IfcInteger NumberOfRisers;
	private IfcInteger NumberOfTreads;
	private IfcPositiveLengthMeasure RiserHeight;
	private IfcPositiveLengthMeasure TreadLength;
	private IfcStairFlightTypeEnum PredefinedType_of_IfcStairFlight;


	// Getters and setters of properties
	public IfcInteger getNumberOfRisers() {
		return NumberOfRisers;
	}

	public void setNumberOfRisers(IfcInteger value){
		this.NumberOfRisers=value;
	}

	public IfcInteger getNumberOfTreads() {
		return NumberOfTreads;
	}

	public void setNumberOfTreads(IfcInteger value){
		this.NumberOfTreads=value;
	}

	public IfcPositiveLengthMeasure getRiserHeight() {
		return RiserHeight;
	}

	public void setRiserHeight(IfcPositiveLengthMeasure value){
		this.RiserHeight=value;
	}

	public IfcPositiveLengthMeasure getTreadLength() {
		return TreadLength;
	}

	public void setTreadLength(IfcPositiveLengthMeasure value){
		this.TreadLength=value;
	}

	public IfcStairFlightTypeEnum getPredefinedType_of_IfcStairFlight() {
		return PredefinedType_of_IfcStairFlight;
	}

	public void setPredefinedType_of_IfcStairFlight(IfcStairFlightTypeEnum value){
		this.PredefinedType_of_IfcStairFlight=value;
	}

}
