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

public class IfcTendonType extends IfcReinforcingElementType 
{
	// The property attributes
	private IfcTendonTypeEnum PredefinedType_of_IfcTendonType;
	private IfcPositiveLengthMeasure NominalDiameter_of_IfcTendonType;
	private IfcAreaMeasure CrossSectionArea_of_IfcTendonType;
	private IfcPositiveLengthMeasure SheethDiameter;


	// Getters and setters of properties
	public IfcTendonTypeEnum getPredefinedType_of_IfcTendonType() {
		return PredefinedType_of_IfcTendonType;
	}

	public void setPredefinedType_of_IfcTendonType(IfcTendonTypeEnum value){
		this.PredefinedType_of_IfcTendonType=value;
	}

	public IfcPositiveLengthMeasure getNominalDiameter_of_IfcTendonType() {
		return NominalDiameter_of_IfcTendonType;
	}

	public void setNominalDiameter_of_IfcTendonType(IfcPositiveLengthMeasure value){
		this.NominalDiameter_of_IfcTendonType=value;
	}

	public IfcAreaMeasure getCrossSectionArea_of_IfcTendonType() {
		return CrossSectionArea_of_IfcTendonType;
	}

	public void setCrossSectionArea_of_IfcTendonType(IfcAreaMeasure value){
		this.CrossSectionArea_of_IfcTendonType=value;
	}

	public IfcPositiveLengthMeasure getSheethDiameter() {
		return SheethDiameter;
	}

	public void setSheethDiameter(IfcPositiveLengthMeasure value){
		this.SheethDiameter=value;
	}

}
