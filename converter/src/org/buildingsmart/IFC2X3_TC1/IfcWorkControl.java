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

public class IfcWorkControl extends IfcControl 
{
	// The property attributes
	private IfcIdentifier Identifier_of_IfcWorkControl;
	private IfcDateTimeSelect CreationDate_of_IfcWorkControl;
	private List<IfcPerson> Creators = new ArrayList<IfcPerson>();
	private IfcLabel Purpose_of_IfcWorkControl;
	private IfcTimeMeasure Duration;
	private IfcTimeMeasure TotalFloat_of_IfcWorkControl;
	private IfcDateTimeSelect StartTime_of_IfcWorkControl;
	private IfcDateTimeSelect FinishTime;
	private IfcWorkControlTypeEnum WorkControlType;
	private IfcLabel UserDefinedControlType;


	// Getters and setters of properties
	public IfcIdentifier getIdentifier_of_IfcWorkControl() {
		return Identifier_of_IfcWorkControl;
	}

	public void setIdentifier_of_IfcWorkControl(IfcIdentifier value){
		this.Identifier_of_IfcWorkControl=value;
	}

	public IfcDateTimeSelect getCreationDate_of_IfcWorkControl() {
		return CreationDate_of_IfcWorkControl;
	}

	public void setCreationDate_of_IfcWorkControl(IfcDateTimeSelect value){
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

	public IfcTimeMeasure getDuration() {
		return Duration;
	}

	public void setDuration(IfcTimeMeasure value){
		this.Duration=value;
	}

	public IfcTimeMeasure getTotalFloat_of_IfcWorkControl() {
		return TotalFloat_of_IfcWorkControl;
	}

	public void setTotalFloat_of_IfcWorkControl(IfcTimeMeasure value){
		this.TotalFloat_of_IfcWorkControl=value;
	}

	public IfcDateTimeSelect getStartTime_of_IfcWorkControl() {
		return StartTime_of_IfcWorkControl;
	}

	public void setStartTime_of_IfcWorkControl(IfcDateTimeSelect value){
		this.StartTime_of_IfcWorkControl=value;
	}

	public IfcDateTimeSelect getFinishTime() {
		return FinishTime;
	}

	public void setFinishTime(IfcDateTimeSelect value){
		this.FinishTime=value;
	}

	public IfcWorkControlTypeEnum getWorkControlType() {
		return WorkControlType;
	}

	public void setWorkControlType(IfcWorkControlTypeEnum value){
		this.WorkControlType=value;
	}

	public IfcLabel getUserDefinedControlType() {
		return UserDefinedControlType;
	}

	public void setUserDefinedControlType(IfcLabel value){
		this.UserDefinedControlType=value;
	}

}
