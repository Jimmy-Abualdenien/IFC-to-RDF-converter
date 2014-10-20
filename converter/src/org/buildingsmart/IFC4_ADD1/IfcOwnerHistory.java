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

public class IfcOwnerHistory extends Thing 
{
	// The property attributes
	private IfcPersonAndOrganization OwningUser;
	private IfcApplication OwningApplication;
	private IfcStateEnum State;
	private IfcChangeActionEnum ChangeAction;
	private IfcTimeStamp LastModifiedDate;
	private IfcPersonAndOrganization LastModifyingUser;
	private IfcApplication LastModifyingApplication;
	private IfcTimeStamp CreationDate_of_IfcOwnerHistory;


	// Getters and setters of properties
	public IfcPersonAndOrganization getOwningUser() {
		return OwningUser;
	}

	public void setOwningUser(IfcPersonAndOrganization value){
		this.OwningUser=value;
	}

	public IfcApplication getOwningApplication() {
		return OwningApplication;
	}

	public void setOwningApplication(IfcApplication value){
		this.OwningApplication=value;
	}

	public IfcStateEnum getState() {
		return State;
	}

	public void setState(IfcStateEnum value){
		this.State=value;
	}

	public IfcChangeActionEnum getChangeAction() {
		return ChangeAction;
	}

	public void setChangeAction(IfcChangeActionEnum value){
		this.ChangeAction=value;
	}

	public IfcTimeStamp getLastModifiedDate() {
		return LastModifiedDate;
	}

	public void setLastModifiedDate(IfcTimeStamp value){
		this.LastModifiedDate=value;
	}

	public IfcPersonAndOrganization getLastModifyingUser() {
		return LastModifyingUser;
	}

	public void setLastModifyingUser(IfcPersonAndOrganization value){
		this.LastModifyingUser=value;
	}

	public IfcApplication getLastModifyingApplication() {
		return LastModifyingApplication;
	}

	public void setLastModifyingApplication(IfcApplication value){
		this.LastModifyingApplication=value;
	}

	public IfcTimeStamp getCreationDate_of_IfcOwnerHistory() {
		return CreationDate_of_IfcOwnerHistory;
	}

	public void setCreationDate_of_IfcOwnerHistory(IfcTimeStamp value){
		this.CreationDate_of_IfcOwnerHistory=value;
	}

}
