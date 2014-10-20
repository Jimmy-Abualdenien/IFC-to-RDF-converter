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

public class IfcCostSchedule extends IfcControl 
{
	// The property attributes
	private IfcCostScheduleTypeEnum PredefinedType_of_IfcCostSchedule;
	private IfcLabel Status_of_IfcCostSchedule;
	private IfcDateTime SubmittedOn;
	private IfcDateTime UpdateDate;


	// Getters and setters of properties
	public IfcCostScheduleTypeEnum getPredefinedType_of_IfcCostSchedule() {
		return PredefinedType_of_IfcCostSchedule;
	}

	public void setPredefinedType_of_IfcCostSchedule(IfcCostScheduleTypeEnum value){
		this.PredefinedType_of_IfcCostSchedule=value;
	}

	public IfcLabel getStatus_of_IfcCostSchedule() {
		return Status_of_IfcCostSchedule;
	}

	public void setStatus_of_IfcCostSchedule(IfcLabel value){
		this.Status_of_IfcCostSchedule=value;
	}

	public IfcDateTime getSubmittedOn() {
		return SubmittedOn;
	}

	public void setSubmittedOn(IfcDateTime value){
		this.SubmittedOn=value;
	}

	public IfcDateTime getUpdateDate() {
		return UpdateDate;
	}

	public void setUpdateDate(IfcDateTime value){
		this.UpdateDate=value;
	}

}
