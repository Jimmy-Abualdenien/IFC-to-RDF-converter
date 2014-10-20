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

public class IfcTask extends IfcProcess 
{
	// The property attributes
	private IfcLabel Status_of_IfcTask;
	private IfcLabel WorkMethod_of_IfcTask;
	private IfcBoolean IsMilestone;
	private IfcInteger Priority_of_IfcTask;
	private IfcTaskTime TaskTime;
	private IfcTaskTypeEnum PredefinedType_of_IfcTask;


	// Getters and setters of properties
	public IfcLabel getStatus_of_IfcTask() {
		return Status_of_IfcTask;
	}

	public void setStatus_of_IfcTask(IfcLabel value){
		this.Status_of_IfcTask=value;
	}

	public IfcLabel getWorkMethod_of_IfcTask() {
		return WorkMethod_of_IfcTask;
	}

	public void setWorkMethod_of_IfcTask(IfcLabel value){
		this.WorkMethod_of_IfcTask=value;
	}

	public IfcBoolean getIsMilestone() {
		return IsMilestone;
	}

	public void setIsMilestone(IfcBoolean value){
		this.IsMilestone=value;
	}

	public IfcInteger getPriority_of_IfcTask() {
		return Priority_of_IfcTask;
	}

	public void setPriority_of_IfcTask(IfcInteger value){
		this.Priority_of_IfcTask=value;
	}

	public IfcTaskTime getTaskTime() {
		return TaskTime;
	}

	public void setTaskTime(IfcTaskTime value){
		this.TaskTime=value;
	}

	public IfcTaskTypeEnum getPredefinedType_of_IfcTask() {
		return PredefinedType_of_IfcTask;
	}

	public void setPredefinedType_of_IfcTask(IfcTaskTypeEnum value){
		this.PredefinedType_of_IfcTask=value;
	}

}
