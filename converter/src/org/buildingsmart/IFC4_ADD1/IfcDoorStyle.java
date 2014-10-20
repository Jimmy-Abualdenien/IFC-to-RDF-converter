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

public class IfcDoorStyle extends IfcTypeProduct 
{
	// The property attributes
	private IfcDoorStyleOperationEnum OperationType_of_IfcDoorStyle;
	private IfcDoorStyleConstructionEnum ConstructionType_of_IfcDoorStyle;
	private IfcBoolean ParameterTakesPrecedence_of_IfcDoorStyle;
	private IfcBoolean Sizeable_of_IfcDoorStyle;


	// Getters and setters of properties
	public IfcDoorStyleOperationEnum getOperationType_of_IfcDoorStyle() {
		return OperationType_of_IfcDoorStyle;
	}

	public void setOperationType_of_IfcDoorStyle(IfcDoorStyleOperationEnum value){
		this.OperationType_of_IfcDoorStyle=value;
	}

	public IfcDoorStyleConstructionEnum getConstructionType_of_IfcDoorStyle() {
		return ConstructionType_of_IfcDoorStyle;
	}

	public void setConstructionType_of_IfcDoorStyle(IfcDoorStyleConstructionEnum value){
		this.ConstructionType_of_IfcDoorStyle=value;
	}

	public IfcBoolean getParameterTakesPrecedence_of_IfcDoorStyle() {
		return ParameterTakesPrecedence_of_IfcDoorStyle;
	}

	public void setParameterTakesPrecedence_of_IfcDoorStyle(IfcBoolean value){
		this.ParameterTakesPrecedence_of_IfcDoorStyle=value;
	}

	public IfcBoolean getSizeable_of_IfcDoorStyle() {
		return Sizeable_of_IfcDoorStyle;
	}

	public void setSizeable_of_IfcDoorStyle(IfcBoolean value){
		this.Sizeable_of_IfcDoorStyle=value;
	}

}
