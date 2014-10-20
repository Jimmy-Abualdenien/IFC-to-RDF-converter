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

public class IfcWorkControl extends IfcControl 
{
	// The property attributes
	private IfcDateTime CreationDate_of_IfcWorkControl;
	private List<IfcPerson> Creators = new ArrayList<IfcPerson>();
	private IfcLabel Purpose_of_IfcWorkControl;
	private IfcDuration Duration;
	private IfcDuration TotalFloat_of_IfcWorkControl;
	private IfcDateTime StartTime_of_IfcWorkControl;
	private IfcDateTime FinishTime;


	// Getters and setters of properties
	public IfcDateTime getCreationDate_of_IfcWorkControl() {
		return CreationDate_of_IfcWorkControl;
	}

	public void setCreationDate_of_IfcWorkControl(IfcDateTime value){
		this.CreationDate_of_IfcWorkControl=value;
	}

	public List<IfcPerson> getCreators() {
		return Creators;
	}

	public void setCreators(IfcPerson value){
		this.Creators.add(value);
	}

	public IfcLabel getPurpose_of_IfcWorkControl() {
		return Purpose_of_IfcWorkControl;
	}

	public void setPurpose_of_IfcWorkControl(IfcLabel value){
		this.Purpose_of_IfcWorkControl=value;
	}

	public IfcDuration getDuration() {
		return Duration;
	}

	public void setDuration(IfcDuration value){
		this.Duration=value;
	}

	public IfcDuration getTotalFloat_of_IfcWorkControl() {
		return TotalFloat_of_IfcWorkControl;
	}

	public void setTotalFloat_of_IfcWorkControl(IfcDuration value){
		this.TotalFloat_of_IfcWorkControl=value;
	}

	public IfcDateTime getStartTime_of_IfcWorkControl() {
		return StartTime_of_IfcWorkControl;
	}

	public void setStartTime_of_IfcWorkControl(IfcDateTime value){
		this.StartTime_of_IfcWorkControl=value;
	}

	public IfcDateTime getFinishTime() {
		return FinishTime;
	}

	public void setFinishTime(IfcDateTime value){
		this.FinishTime=value;
	}

}
