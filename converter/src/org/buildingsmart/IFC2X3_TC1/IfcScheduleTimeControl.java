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

public class IfcScheduleTimeControl extends IfcControl 
{
	// The property attributes
	private IfcDateTimeSelect ActualStart;
	private IfcDateTimeSelect EarlyStart;
	private IfcDateTimeSelect LateStart;
	private IfcDateTimeSelect ScheduleStart;
	private IfcDateTimeSelect ActualFinish;
	private IfcDateTimeSelect EarlyFinish;
	private IfcDateTimeSelect LateFinish;
	private IfcDateTimeSelect ScheduleFinish;
	private IfcTimeMeasure ScheduleDuration;
	private IfcTimeMeasure ActualDuration;
	private IfcTimeMeasure RemainingTime;
	private IfcTimeMeasure FreeFloat;
	private IfcTimeMeasure TotalFloat_of_IfcScheduleTimeControl;
	private Boolean IsCritical;
	private IfcDateTimeSelect StatusTime;
	private IfcTimeMeasure StartFloat;
	private IfcTimeMeasure FinishFloat;
	private IfcPositiveRatioMeasure Completion;
 // The inverse attributes

	private List<IfcRelAssignsTasks> ScheduleTimeControlAssigned= new ArrayList<IfcRelAssignsTasks>();


	// Getters and setters of properties
	public IfcDateTimeSelect getActualStart() {
		return ActualStart;
	}

	public void setActualStart(IfcDateTimeSelect value){
		this.ActualStart=value;
	}

	public IfcDateTimeSelect getEarlyStart() {
		return EarlyStart;
	}

	public void setEarlyStart(IfcDateTimeSelect value){
		this.EarlyStart=value;
	}

	public IfcDateTimeSelect getLateStart() {
		return LateStart;
	}

	public void setLateStart(IfcDateTimeSelect value){
		this.LateStart=value;
	}

	public IfcDateTimeSelect getScheduleStart() {
		return ScheduleStart;
	}

	public void setScheduleStart(IfcDateTimeSelect value){
		this.ScheduleStart=value;
	}

	public IfcDateTimeSelect getActualFinish() {
		return ActualFinish;
	}

	public void setActualFinish(IfcDateTimeSelect value){
		this.ActualFinish=value;
	}

	public IfcDateTimeSelect getEarlyFinish() {
		return EarlyFinish;
	}

	public void setEarlyFinish(IfcDateTimeSelect value){
		this.EarlyFinish=value;
	}

	public IfcDateTimeSelect getLateFinish() {
		return LateFinish;
	}

	public void setLateFinish(IfcDateTimeSelect value){
		this.LateFinish=value;
	}

	public IfcDateTimeSelect getScheduleFinish() {
		return ScheduleFinish;
	}

	public void setScheduleFinish(IfcDateTimeSelect value){
		this.ScheduleFinish=value;
	}

	public IfcTimeMeasure getScheduleDuration() {
		return ScheduleDuration;
	}

	public void setScheduleDuration(IfcTimeMeasure value){
		this.ScheduleDuration=value;
	}

	public IfcTimeMeasure getActualDuration() {
		return ActualDuration;
	}

	public void setActualDuration(IfcTimeMeasure value){
		this.ActualDuration=value;
	}

	public IfcTimeMeasure getRemainingTime() {
		return RemainingTime;
	}

	public void setRemainingTime(IfcTimeMeasure value){
		this.RemainingTime=value;
	}

	public IfcTimeMeasure getFreeFloat() {
		return FreeFloat;
	}

	public void setFreeFloat(IfcTimeMeasure value){
		this.FreeFloat=value;
	}

	public IfcTimeMeasure getTotalFloat_of_IfcScheduleTimeControl() {
		return TotalFloat_of_IfcScheduleTimeControl;
	}

	public void setTotalFloat_of_IfcScheduleTimeControl(IfcTimeMeasure value){
		this.TotalFloat_of_IfcScheduleTimeControl=value;
	}

	public Boolean getIsCritical() {
		return IsCritical;
	}

	public void setIsCritical(Boolean value){
		this.IsCritical=value;
	}

	public IfcDateTimeSelect getStatusTime() {
		return StatusTime;
	}

	public void setStatusTime(IfcDateTimeSelect value){
		this.StatusTime=value;
	}

	public IfcTimeMeasure getStartFloat() {
		return StartFloat;
	}

	public void setStartFloat(IfcTimeMeasure value){
		this.StartFloat=value;
	}

	public IfcTimeMeasure getFinishFloat() {
		return FinishFloat;
	}

	public void setFinishFloat(IfcTimeMeasure value){
		this.FinishFloat=value;
	}

	public IfcPositiveRatioMeasure getCompletion() {
		return Completion;
	}

	public void setCompletion(IfcPositiveRatioMeasure value){
		this.Completion=value;
	}

	// Getters and setters of inverse values

	public List<IfcRelAssignsTasks> getScheduleTimeControlAssigned() {
		return ScheduleTimeControlAssigned;
	}

	public void setScheduleTimeControlAssigned(IfcRelAssignsTasks value){
		this.ScheduleTimeControlAssigned.add(value);
	}

}
