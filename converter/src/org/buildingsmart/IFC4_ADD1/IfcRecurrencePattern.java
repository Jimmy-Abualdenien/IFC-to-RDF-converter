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

public class IfcRecurrencePattern extends Thing 
{
	// The property attributes
	private IfcRecurrenceTypeEnum RecurrenceType;
	private List<IfcDayInMonthNumber> DayComponent = new ArrayList<IfcDayInMonthNumber>();
	private List<IfcDayInWeekNumber> WeekdayComponent = new ArrayList<IfcDayInWeekNumber>();
	private List<IfcMonthInYearNumber> MonthComponent = new ArrayList<IfcMonthInYearNumber>();
	private IfcInteger Position_of_IfcRecurrencePattern;
	private IfcInteger Interval;
	private IfcInteger Occurrences;
	private List<IfcTimePeriod> TimePeriods = new ArrayList<IfcTimePeriod>();


	// Getters and setters of properties
	public IfcRecurrenceTypeEnum getRecurrenceType() {
		return RecurrenceType;
	}

	public void setRecurrenceType(IfcRecurrenceTypeEnum value){
		this.RecurrenceType=value;
	}

	public List<IfcDayInMonthNumber> getDayComponent() {
		return DayComponent;
	}

	public void setDayComponent(IfcDayInMonthNumber value){
		this.DayComponent.add(value);
	}

	public List<IfcDayInWeekNumber> getWeekdayComponent() {
		return WeekdayComponent;
	}

	public void setWeekdayComponent(IfcDayInWeekNumber value){
		this.WeekdayComponent.add(value);
	}

	public List<IfcMonthInYearNumber> getMonthComponent() {
		return MonthComponent;
	}

	public void setMonthComponent(IfcMonthInYearNumber value){
		this.MonthComponent.add(value);
	}

	public IfcInteger getPosition_of_IfcRecurrencePattern() {
		return Position_of_IfcRecurrencePattern;
	}

	public void setPosition_of_IfcRecurrencePattern(IfcInteger value){
		this.Position_of_IfcRecurrencePattern=value;
	}

	public IfcInteger getInterval() {
		return Interval;
	}

	public void setInterval(IfcInteger value){
		this.Interval=value;
	}

	public IfcInteger getOccurrences() {
		return Occurrences;
	}

	public void setOccurrences(IfcInteger value){
		this.Occurrences=value;
	}

	public List<IfcTimePeriod> getTimePeriods() {
		return TimePeriods;
	}

	public void setTimePeriods(IfcTimePeriod value){
		this.TimePeriods.add(value);
	}

}
