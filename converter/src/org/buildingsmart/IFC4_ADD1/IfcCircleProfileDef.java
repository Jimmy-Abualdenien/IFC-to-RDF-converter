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

public class IfcCircleProfileDef extends IfcParameterizedProfileDef 
{
	// The property attributes
	private IfcPositiveLengthMeasure Radius_of_IfcCircleProfileDef;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getRadius_of_IfcCircleProfileDef() {
		return Radius_of_IfcCircleProfileDef;
	}

	public void setRadius_of_IfcCircleProfileDef(IfcPositiveLengthMeasure value){
		this.Radius_of_IfcCircleProfileDef=value;
	}

}
