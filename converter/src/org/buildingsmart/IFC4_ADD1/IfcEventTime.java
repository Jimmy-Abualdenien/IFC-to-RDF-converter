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

public class IfcEventTime extends IfcSchedulingTime 
{
	// The property attributes
	private IfcDateTime ActualDate;
	private IfcDateTime EarlyDate;
	private IfcDateTime LateDate;
	private IfcDateTime ScheduleDate;


	// Getters and setters of properties
	public IfcDateTime getActualDate() {
		return ActualDate;
	}

	public void setActualDate(IfcDateTime value){
		this.ActualDate=value;
	}

	public IfcDateTime getEarlyDate() {
		return EarlyDate;
	}

	public void setEarlyDate(IfcDateTime value){
		this.EarlyDate=value;
	}

	public IfcDateTime getLateDate() {
		return LateDate;
	}

	public void setLateDate(IfcDateTime value){
		this.LateDate=value;
	}

	public IfcDateTime getScheduleDate() {
		return ScheduleDate;
	}

	public void setScheduleDate(IfcDateTime value){
		this.ScheduleDate=value;
	}

}
