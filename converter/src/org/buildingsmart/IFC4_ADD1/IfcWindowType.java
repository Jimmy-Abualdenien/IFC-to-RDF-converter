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

public class IfcWindowType extends IfcBuildingElementType 
{
	// The property attributes
	private IfcWindowTypeEnum PredefinedType_of_IfcWindowType;
	private IfcWindowTypePartitioningEnum PartitioningType_of_IfcWindowType;
	private IfcBoolean ParameterTakesPrecedence_of_IfcWindowType;
	private IfcLabel UserDefinedPartitioningType_of_IfcWindowType;


	// Getters and setters of properties
	public IfcWindowTypeEnum getPredefinedType_of_IfcWindowType() {
		return PredefinedType_of_IfcWindowType;
	}

	public void setPredefinedType_of_IfcWindowType(IfcWindowTypeEnum value){
		this.PredefinedType_of_IfcWindowType=value;
	}

	public IfcWindowTypePartitioningEnum getPartitioningType_of_IfcWindowType() {
		return PartitioningType_of_IfcWindowType;
	}

	public void setPartitioningType_of_IfcWindowType(IfcWindowTypePartitioningEnum value){
		this.PartitioningType_of_IfcWindowType=value;
	}

	public IfcBoolean getParameterTakesPrecedence_of_IfcWindowType() {
		return ParameterTakesPrecedence_of_IfcWindowType;
	}

	public void setParameterTakesPrecedence_of_IfcWindowType(IfcBoolean value){
		this.ParameterTakesPrecedence_of_IfcWindowType=value;
	}

	public IfcLabel getUserDefinedPartitioningType_of_IfcWindowType() {
		return UserDefinedPartitioningType_of_IfcWindowType;
	}

	public void setUserDefinedPartitioningType_of_IfcWindowType(IfcLabel value){
		this.UserDefinedPartitioningType_of_IfcWindowType=value;
	}

}
