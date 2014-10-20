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

public class IfcRectangleProfileDef extends IfcParameterizedProfileDef 
{
	// The property attributes
	private IfcPositiveLengthMeasure XDim_of_IfcRectangleProfileDef;
	private IfcPositiveLengthMeasure YDim_of_IfcRectangleProfileDef;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getXDim_of_IfcRectangleProfileDef() {
		return XDim_of_IfcRectangleProfileDef;
	}

	public void setXDim_of_IfcRectangleProfileDef(IfcPositiveLengthMeasure value){
		this.XDim_of_IfcRectangleProfileDef=value;
	}

	public IfcPositiveLengthMeasure getYDim_of_IfcRectangleProfileDef() {
		return YDim_of_IfcRectangleProfileDef;
	}

	public void setYDim_of_IfcRectangleProfileDef(IfcPositiveLengthMeasure value){
		this.YDim_of_IfcRectangleProfileDef=value;
	}

}
