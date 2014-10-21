package org.buildingsmart.IFC2X3_TC1;
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

public class IfcRibPlateProfileProperties extends IfcProfileProperties 
{
	// The property attributes
	private IfcPositiveLengthMeasure Thickness_of_IfcRibPlateProfileProperties;
	private IfcPositiveLengthMeasure RibHeight;
	private IfcPositiveLengthMeasure RibWidth;
	private IfcPositiveLengthMeasure RibSpacing;
	private IfcRibPlateDirectionEnum Direction;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getThickness_of_IfcRibPlateProfileProperties() {
		return Thickness_of_IfcRibPlateProfileProperties;
	}

	public void setThickness_of_IfcRibPlateProfileProperties(IfcPositiveLengthMeasure value){
		this.Thickness_of_IfcRibPlateProfileProperties=value;
	}

	public IfcPositiveLengthMeasure getRibHeight() {
		return RibHeight;
	}

	public void setRibHeight(IfcPositiveLengthMeasure value){
		this.RibHeight=value;
	}

	public IfcPositiveLengthMeasure getRibWidth() {
		return RibWidth;
	}

	public void setRibWidth(IfcPositiveLengthMeasure value){
		this.RibWidth=value;
	}

	public IfcPositiveLengthMeasure getRibSpacing() {
		return RibSpacing;
	}

	public void setRibSpacing(IfcPositiveLengthMeasure value){
		this.RibSpacing=value;
	}

	public IfcRibPlateDirectionEnum getDirection() {
		return Direction;
	}

	public void setDirection(IfcRibPlateDirectionEnum value){
		this.Direction=value;
	}

}
