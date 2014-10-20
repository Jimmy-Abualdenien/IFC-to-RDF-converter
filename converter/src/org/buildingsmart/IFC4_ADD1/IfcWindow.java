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

public class IfcWindow extends IfcBuildingElement 
{
	// The property attributes
	private IfcPositiveLengthMeasure OverallHeight_of_IfcWindow;
	private IfcPositiveLengthMeasure OverallWidth_of_IfcWindow;
	private IfcWindowTypeEnum PredefinedType_of_IfcWindow;
	private IfcWindowTypePartitioningEnum PartitioningType_of_IfcWindow;
	private IfcLabel UserDefinedPartitioningType_of_IfcWindow;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getOverallHeight_of_IfcWindow() {
		return OverallHeight_of_IfcWindow;
	}

	public void setOverallHeight_of_IfcWindow(IfcPositiveLengthMeasure value){
		this.OverallHeight_of_IfcWindow=value;
	}

	public IfcPositiveLengthMeasure getOverallWidth_of_IfcWindow() {
		return OverallWidth_of_IfcWindow;
	}

	public void setOverallWidth_of_IfcWindow(IfcPositiveLengthMeasure value){
		this.OverallWidth_of_IfcWindow=value;
	}

	public IfcWindowTypeEnum getPredefinedType_of_IfcWindow() {
		return PredefinedType_of_IfcWindow;
	}

	public void setPredefinedType_of_IfcWindow(IfcWindowTypeEnum value){
		this.PredefinedType_of_IfcWindow=value;
	}

	public IfcWindowTypePartitioningEnum getPartitioningType_of_IfcWindow() {
		return PartitioningType_of_IfcWindow;
	}

	public void setPartitioningType_of_IfcWindow(IfcWindowTypePartitioningEnum value){
		this.PartitioningType_of_IfcWindow=value;
	}

	public IfcLabel getUserDefinedPartitioningType_of_IfcWindow() {
		return UserDefinedPartitioningType_of_IfcWindow;
	}

	public void setUserDefinedPartitioningType_of_IfcWindow(IfcLabel value){
		this.UserDefinedPartitioningType_of_IfcWindow=value;
	}

}
