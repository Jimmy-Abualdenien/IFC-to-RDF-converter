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

public class IfcDoorType extends IfcBuildingElementType 
{
	// The property attributes
	private IfcDoorTypeEnum PredefinedType_of_IfcDoorType;
	private IfcDoorTypeOperationEnum OperationType_of_IfcDoorType;
	private IfcBoolean ParameterTakesPrecedence_of_IfcDoorType;
	private IfcLabel UserDefinedOperationType_of_IfcDoorType;


	// Getters and setters of properties
	public IfcDoorTypeEnum getPredefinedType_of_IfcDoorType() {
		return PredefinedType_of_IfcDoorType;
	}

	public void setPredefinedType_of_IfcDoorType(IfcDoorTypeEnum value){
		this.PredefinedType_of_IfcDoorType=value;
	}

	public IfcDoorTypeOperationEnum getOperationType_of_IfcDoorType() {
		return OperationType_of_IfcDoorType;
	}

	public void setOperationType_of_IfcDoorType(IfcDoorTypeOperationEnum value){
		this.OperationType_of_IfcDoorType=value;
	}

	public IfcBoolean getParameterTakesPrecedence_of_IfcDoorType() {
		return ParameterTakesPrecedence_of_IfcDoorType;
	}

	public void setParameterTakesPrecedence_of_IfcDoorType(IfcBoolean value){
		this.ParameterTakesPrecedence_of_IfcDoorType=value;
	}

	public IfcLabel getUserDefinedOperationType_of_IfcDoorType() {
		return UserDefinedOperationType_of_IfcDoorType;
	}

	public void setUserDefinedOperationType_of_IfcDoorType(IfcLabel value){
		this.UserDefinedOperationType_of_IfcDoorType=value;
	}

}
