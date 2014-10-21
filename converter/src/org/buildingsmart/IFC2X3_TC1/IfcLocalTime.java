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

public class IfcLocalTime extends Thing implements IfcDateTimeSelect, IfcObjectReferenceSelect
{
	// The property attributes
	private IfcHourInDay HourComponent;
	private IfcMinuteInHour MinuteComponent;
	private IfcSecondInMinute SecondComponent;
	private IfcCoordinatedUniversalTimeOffset Zone;
	private IfcDaylightSavingHour DaylightSavingOffset;


	// Getters and setters of properties
	public IfcHourInDay getHourComponent() {
		return HourComponent;
	}

	public void setHourComponent(IfcHourInDay value){
		this.HourComponent=value;
	}

	public IfcMinuteInHour getMinuteComponent() {
		return MinuteComponent;
	}

	public void setMinuteComponent(IfcMinuteInHour value){
		this.MinuteComponent=value;
	}

	public IfcSecondInMinute getSecondComponent() {
		return SecondComponent;
	}

	public void setSecondComponent(IfcSecondInMinute value){
		this.SecondComponent=value;
	}

	public IfcCoordinatedUniversalTimeOffset getZone() {
		return Zone;
	}

	public void setZone(IfcCoordinatedUniversalTimeOffset value){
		this.Zone=value;
	}

	public IfcDaylightSavingHour getDaylightSavingOffset() {
		return DaylightSavingOffset;
	}

	public void setDaylightSavingOffset(IfcDaylightSavingHour value){
		this.DaylightSavingOffset=value;
	}

}
