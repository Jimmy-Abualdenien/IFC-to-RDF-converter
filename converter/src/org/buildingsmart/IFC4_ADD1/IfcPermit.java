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

public class IfcPermit extends IfcControl 
{
	// The property attributes
	private IfcPermitTypeEnum PredefinedType_of_IfcPermit;
	private IfcLabel Status_of_IfcPermit;
	private IfcText LongDescription_of_IfcPermit;


	// Getters and setters of properties
	public IfcPermitTypeEnum getPredefinedType_of_IfcPermit() {
		return PredefinedType_of_IfcPermit;
	}

	public void setPredefinedType_of_IfcPermit(IfcPermitTypeEnum value){
		this.PredefinedType_of_IfcPermit=value;
	}

	public IfcLabel getStatus_of_IfcPermit() {
		return Status_of_IfcPermit;
	}

	public void setStatus_of_IfcPermit(IfcLabel value){
		this.Status_of_IfcPermit=value;
	}

	public IfcText getLongDescription_of_IfcPermit() {
		return LongDescription_of_IfcPermit;
	}

	public void setLongDescription_of_IfcPermit(IfcText value){
		this.LongDescription_of_IfcPermit=value;
	}

}
