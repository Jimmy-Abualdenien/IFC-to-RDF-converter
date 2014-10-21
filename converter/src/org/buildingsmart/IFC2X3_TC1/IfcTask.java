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

public class IfcTask extends IfcProcess 
{
	// The property attributes
	private IfcIdentifier TaskId;
	private IfcLabel Status_of_IfcTask;
	private IfcLabel WorkMethod;
	private Boolean IsMilestone;
	private Integer Priority;


	// Getters and setters of properties
	public IfcIdentifier getTaskId() {
		return TaskId;
	}

	public void setTaskId(IfcIdentifier value){
		this.TaskId=value;
	}

	public IfcLabel getStatus_of_IfcTask() {
		return Status_of_IfcTask;
	}

	public void setStatus_of_IfcTask(IfcLabel value){
		this.Status_of_IfcTask=value;
	}

	public IfcLabel getWorkMethod() {
		return WorkMethod;
	}

	public void setWorkMethod(IfcLabel value){
		this.WorkMethod=value;
	}

	public Boolean getIsMilestone() {
		return IsMilestone;
	}

	public void setIsMilestone(Boolean value){
		this.IsMilestone=value;
	}

	public Integer getPriority() {
		return Priority;
	}

	public void setPriority(Integer value){
		this.Priority=value;
	}

}
