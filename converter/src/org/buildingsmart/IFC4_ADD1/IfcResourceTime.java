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

public class IfcResourceTime extends IfcSchedulingTime 
{
	// The property attributes
	private IfcDuration ScheduleWork;
	private IfcPositiveRatioMeasure ScheduleUsage;
	private IfcDateTime ScheduleStart_of_IfcResourceTime;
	private IfcDateTime ScheduleFinish_of_IfcResourceTime;
	private IfcLabel ScheduleContour;
	private IfcDuration LevelingDelay;
	private IfcBoolean IsOverAllocated;
	private IfcDateTime StatusTime_of_IfcResourceTime;
	private IfcDuration ActualWork;
	private IfcPositiveRatioMeasure ActualUsage;
	private IfcDateTime ActualStart_of_IfcResourceTime;
	private IfcDateTime ActualFinish_of_IfcResourceTime;
	private IfcDuration RemainingWork;
	private IfcPositiveRatioMeasure RemainingUsage;
	private IfcPositiveRatioMeasure Completion_of_IfcResourceTime;


	// Getters and setters of properties
	public IfcDuration getScheduleWork() {
		return ScheduleWork;
	}

	public void setScheduleWork(IfcDuration value){
		this.ScheduleWork=value;
	}

	public IfcPositiveRatioMeasure getScheduleUsage() {
		return ScheduleUsage;
	}

	public void setScheduleUsage(IfcPositiveRatioMeasure value){
		this.ScheduleUsage=value;
	}

	public IfcDateTime getScheduleStart_of_IfcResourceTime() {
		return ScheduleStart_of_IfcResourceTime;
	}

	public void setScheduleStart_of_IfcResourceTime(IfcDateTime value){
		this.ScheduleStart_of_IfcResourceTime=value;
	}

	public IfcDateTime getScheduleFinish_of_IfcResourceTime() {
		return ScheduleFinish_of_IfcResourceTime;
	}

	public void setScheduleFinish_of_IfcResourceTime(IfcDateTime value){
		this.ScheduleFinish_of_IfcResourceTime=value;
	}

	public IfcLabel getScheduleContour() {
		return ScheduleContour;
	}

	public void setScheduleContour(IfcLabel value){
		this.ScheduleContour=value;
	}

	public IfcDuration getLevelingDelay() {
		return LevelingDelay;
	}

	public void setLevelingDelay(IfcDuration value){
		this.LevelingDelay=value;
	}

	public IfcBoolean getIsOverAllocated() {
		return IsOverAllocated;
	}

	public void setIsOverAllocated(IfcBoolean value){
		this.IsOverAllocated=value;
	}

	public IfcDateTime getStatusTime_of_IfcResourceTime() {
		return StatusTime_of_IfcResourceTime;
	}

	public void setStatusTime_of_IfcResourceTime(IfcDateTime value){
		this.StatusTime_of_IfcResourceTime=value;
	}

	public IfcDuration getActualWork() {
		return ActualWork;
	}

	public void setActualWork(IfcDuration value){
		this.ActualWork=value;
	}

	public IfcPositiveRatioMeasure getActualUsage() {
		return ActualUsage;
	}

	public void setActualUsage(IfcPositiveRatioMeasure value){
		this.ActualUsage=value;
	}

	public IfcDateTime getActualStart_of_IfcResourceTime() {
		return ActualStart_of_IfcResourceTime;
	}

	public void setActualStart_of_IfcResourceTime(IfcDateTime value){
		this.ActualStart_of_IfcResourceTime=value;
	}

	public IfcDateTime getActualFinish_of_IfcResourceTime() {
		return ActualFinish_of_IfcResourceTime;
	}

	public void setActualFinish_of_IfcResourceTime(IfcDateTime value){
		this.ActualFinish_of_IfcResourceTime=value;
	}

	public IfcDuration getRemainingWork() {
		return RemainingWork;
	}

	public void setRemainingWork(IfcDuration value){
		this.RemainingWork=value;
	}

	public IfcPositiveRatioMeasure getRemainingUsage() {
		return RemainingUsage;
	}

	public void setRemainingUsage(IfcPositiveRatioMeasure value){
		this.RemainingUsage=value;
	}

	public IfcPositiveRatioMeasure getCompletion_of_IfcResourceTime() {
		return Completion_of_IfcResourceTime;
	}

	public void setCompletion_of_IfcResourceTime(IfcPositiveRatioMeasure value){
		this.Completion_of_IfcResourceTime=value;
	}

}
