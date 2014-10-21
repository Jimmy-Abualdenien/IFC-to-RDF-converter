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

public class IfcCostSchedule extends IfcControl 
{
	// The property attributes
	private IfcActorSelect SubmittedBy;
	private IfcActorSelect PreparedBy;
	private IfcDateTimeSelect SubmittedOn;
	private IfcLabel Status_of_IfcCostSchedule;
	private List<IfcActorSelect> TargetUsers = new ArrayList<IfcActorSelect>();
	private IfcDateTimeSelect UpdateDate;
	private IfcIdentifier ID_of_IfcCostSchedule;
	private IfcCostScheduleTypeEnum PredefinedType_of_IfcCostSchedule;


	// Getters and setters of properties
	public IfcActorSelect getSubmittedBy() {
		return SubmittedBy;
	}

	public void setSubmittedBy(IfcActorSelect value){
		this.SubmittedBy=value;
	}

	public IfcActorSelect getPreparedBy() {
		return PreparedBy;
	}

	public void setPreparedBy(IfcActorSelect value){
		this.PreparedBy=value;
	}

	public IfcDateTimeSelect getSubmittedOn() {
		return SubmittedOn;
	}

	public void setSubmittedOn(IfcDateTimeSelect value){
		this.SubmittedOn=value;
	}

	public IfcLabel getStatus_of_IfcCostSchedule() {
		return Status_of_IfcCostSchedule;
	}

	public void setStatus_of_IfcCostSchedule(IfcLabel value){
		this.Status_of_IfcCostSchedule=value;
	}

	public List<IfcActorSelect> getTargetUsers() {
		return TargetUsers;
	}

	public void setTargetUsers(IfcActorSelect value){
		this.TargetUsers.add(value);
	}

	public IfcDateTimeSelect getUpdateDate() {
		return UpdateDate;
	}

	public void setUpdateDate(IfcDateTimeSelect value){
		this.UpdateDate=value;
	}

	public IfcIdentifier getID_of_IfcCostSchedule() {
		return ID_of_IfcCostSchedule;
	}

	public void setID_of_IfcCostSchedule(IfcIdentifier value){
		this.ID_of_IfcCostSchedule=value;
	}

	public IfcCostScheduleTypeEnum getPredefinedType_of_IfcCostSchedule() {
		return PredefinedType_of_IfcCostSchedule;
	}

	public void setPredefinedType_of_IfcCostSchedule(IfcCostScheduleTypeEnum value){
		this.PredefinedType_of_IfcCostSchedule=value;
	}

}
