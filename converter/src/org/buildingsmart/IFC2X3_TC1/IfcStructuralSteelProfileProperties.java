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

public class IfcStructuralSteelProfileProperties extends IfcStructuralProfileProperties 
{
	// The property attributes
	private IfcAreaMeasure ShearAreaZ;
	private IfcAreaMeasure ShearAreaY;
	private IfcPositiveRatioMeasure PlasticShapeFactorY;
	private IfcPositiveRatioMeasure PlasticShapeFactorZ;


	// Getters and setters of properties
	public IfcAreaMeasure getShearAreaZ() {
		return ShearAreaZ;
	}

	public void setShearAreaZ(IfcAreaMeasure value){
		this.ShearAreaZ=value;
	}

	public IfcAreaMeasure getShearAreaY() {
		return ShearAreaY;
	}

	public void setShearAreaY(IfcAreaMeasure value){
		this.ShearAreaY=value;
	}

	public IfcPositiveRatioMeasure getPlasticShapeFactorY() {
		return PlasticShapeFactorY;
	}

	public void setPlasticShapeFactorY(IfcPositiveRatioMeasure value){
		this.PlasticShapeFactorY=value;
	}

	public IfcPositiveRatioMeasure getPlasticShapeFactorZ() {
		return PlasticShapeFactorZ;
	}

	public void setPlasticShapeFactorZ(IfcPositiveRatioMeasure value){
		this.PlasticShapeFactorZ=value;
	}

}
