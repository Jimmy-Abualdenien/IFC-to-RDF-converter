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

public class IfcActionRequest extends IfcControl 
{
	// The property attributes
	private IfcActionRequestTypeEnum PredefinedType_of_IfcActionRequest;
	private IfcLabel Status_of_IfcActionRequest;
	private IfcText LongDescription_of_IfcActionRequest;


	// Getters and setters of properties
	public IfcActionRequestTypeEnum getPredefinedType_of_IfcActionRequest() {
		return PredefinedType_of_IfcActionRequest;
	}

	public void setPredefinedType_of_IfcActionRequest(IfcActionRequestTypeEnum value){
		this.PredefinedType_of_IfcActionRequest=value;
	}

	public IfcLabel getStatus_of_IfcActionRequest() {
		return Status_of_IfcActionRequest;
	}

	public void setStatus_of_IfcActionRequest(IfcLabel value){
		this.Status_of_IfcActionRequest=value;
	}

	public IfcText getLongDescription_of_IfcActionRequest() {
		return LongDescription_of_IfcActionRequest;
	}

	public void setLongDescription_of_IfcActionRequest(IfcText value){
		this.LongDescription_of_IfcActionRequest=value;
	}

}
