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

public class IfcMechanicalFastenerType extends IfcElementComponentType 
{
	// The property attributes
	private IfcMechanicalFastenerTypeEnum PredefinedType_of_IfcMechanicalFastenerType;
	private IfcPositiveLengthMeasure NominalDiameter_of_IfcMechanicalFastenerType;
	private IfcPositiveLengthMeasure NominalLength_of_IfcMechanicalFastenerType;


	// Getters and setters of properties
	public IfcMechanicalFastenerTypeEnum getPredefinedType_of_IfcMechanicalFastenerType() {
		return PredefinedType_of_IfcMechanicalFastenerType;
	}

	public void setPredefinedType_of_IfcMechanicalFastenerType(IfcMechanicalFastenerTypeEnum value){
		this.PredefinedType_of_IfcMechanicalFastenerType=value;
	}

	public IfcPositiveLengthMeasure getNominalDiameter_of_IfcMechanicalFastenerType() {
		return NominalDiameter_of_IfcMechanicalFastenerType;
	}

	public void setNominalDiameter_of_IfcMechanicalFastenerType(IfcPositiveLengthMeasure value){
		this.NominalDiameter_of_IfcMechanicalFastenerType=value;
	}

	public IfcPositiveLengthMeasure getNominalLength_of_IfcMechanicalFastenerType() {
		return NominalLength_of_IfcMechanicalFastenerType;
	}

	public void setNominalLength_of_IfcMechanicalFastenerType(IfcPositiveLengthMeasure value){
		this.NominalLength_of_IfcMechanicalFastenerType=value;
	}

}
