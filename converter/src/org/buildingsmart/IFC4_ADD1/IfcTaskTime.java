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

public class IfcTaskTime extends IfcSchedulingTime 
{
	// The property attributes
	private IfcTaskDurationEnum DurationType_of_IfcTaskTime;
	private IfcDuration ScheduleDuration;
	private IfcDateTime ScheduleStart_of_IfcTaskTime;
	private IfcDateTime ScheduleFinish_of_IfcTaskTime;
	private IfcDateTime EarlyStart;
	private IfcDateTime EarlyFinish;
	private IfcDateTime LateStart;
	private IfcDateTime LateFinish;
	private IfcDuration FreeFloat;
	private IfcDuration TotalFloat_of_IfcTaskTime;
	private IfcBoolean IsCritical;
	private IfcDateTime StatusTime_of_IfcTaskTime;
	private IfcDuration ActualDuration;
	private IfcDateTime ActualStart_of_IfcTaskTime;
	private IfcDateTime ActualFinish_of_IfcTaskTime;
	private IfcDuration RemainingTime;
	private IfcPositiveRatioMeasure Completion_of_IfcTaskTime;


	// Getters and setters of properties
	public IfcTaskDurationEnum getDurationType_of_IfcTaskTime() {
		return DurationType_of_IfcTaskTime;
	}

	public void setDurationType_of_IfcTaskTime(IfcTaskDurationEnum value){
		this.DurationType_of_IfcTaskTime=value;
	}

	public IfcDuration getScheduleDuration() {
		return ScheduleDuration;
	}

	public void setScheduleDuration(IfcDuration value){
		this.ScheduleDuration=value;
	}

	public IfcDateTime getScheduleStart_of_IfcTaskTime() {
		return ScheduleStart_of_IfcTaskTime;
	}

	public void setScheduleStart_of_IfcTaskTime(IfcDateTime value){
		this.ScheduleStart_of_IfcTaskTime=value;
	}

	public IfcDateTime getScheduleFinish_of_IfcTaskTime() {
		return ScheduleFinish_of_IfcTaskTime;
	}

	public void setScheduleFinish_of_IfcTaskTime(IfcDateTime value){
		this.ScheduleFinish_of_IfcTaskTime=value;
	}

	public IfcDateTime getEarlyStart() {
		return EarlyStart;
	}

	public void setEarlyStart(IfcDateTime value){
		this.EarlyStart=value;
	}

	public IfcDateTime getEarlyFinish() {
		return EarlyFinish;
	}

	public void setEarlyFinish(IfcDateTime value){
		this.EarlyFinish=value;
	}

	public IfcDateTime getLateStart() {
		return LateStart;
	}

	public void setLateStart(IfcDateTime value){
		this.LateStart=value;
	}

	public IfcDateTime getLateFinish() {
		return LateFinish;
	}

	public void setLateFinish(IfcDateTime value){
		this.LateFinish=value;
	}

	public IfcDuration getFreeFloat() {
		return FreeFloat;
	}

	public void setFreeFloat(IfcDuration value){
		this.FreeFloat=value;
	}

	public IfcDuration getTotalFloat_of_IfcTaskTime() {
		return TotalFloat_of_IfcTaskTime;
	}

	public void setTotalFloat_of_IfcTaskTime(IfcDuration value){
		this.TotalFloat_of_IfcTaskTime=value;
	}

	public IfcBoolean getIsCritical() {
		return IsCritical;
	}

	public void setIsCritical(IfcBoolean value){
		this.IsCritical=value;
	}

	public IfcDateTime getStatusTime_of_IfcTaskTime() {
		return StatusTime_of_IfcTaskTime;
	}

	public void setStatusTime_of_IfcTaskTime(IfcDateTime value){
		this.StatusTime_of_IfcTaskTime=value;
	}

	public IfcDuration getActualDuration() {
		return ActualDuration;
	}

	public void setActualDuration(IfcDuration value){
		this.ActualDuration=value;
	}

	public IfcDateTime getActualStart_of_IfcTaskTime() {
		return ActualStart_of_IfcTaskTime;
	}

	public void setActualStart_of_IfcTaskTime(IfcDateTime value){
		this.ActualStart_of_IfcTaskTime=value;
	}

	public IfcDateTime getActualFinish_of_IfcTaskTime() {
		return ActualFinish_of_IfcTaskTime;
	}

	public void setActualFinish_of_IfcTaskTime(IfcDateTime value){
		this.ActualFinish_of_IfcTaskTime=value;
	}

	public IfcDuration getRemainingTime() {
		return RemainingTime;
	}

	public void setRemainingTime(IfcDuration value){
		this.RemainingTime=value;
	}

	public IfcPositiveRatioMeasure getCompletion_of_IfcTaskTime() {
		return Completion_of_IfcTaskTime;
	}

	public void setCompletion_of_IfcTaskTime(IfcPositiveRatioMeasure value){
		this.Completion_of_IfcTaskTime=value;
	}

}
