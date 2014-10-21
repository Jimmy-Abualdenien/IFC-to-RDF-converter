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

public class IfcBoundingBox extends IfcGeometricRepresentationItem 
{
	// The property attributes
	private IfcCartesianPoint Corner;
	private IfcPositiveLengthMeasure XDim_of_IfcBoundingBox;
	private IfcPositiveLengthMeasure YDim_of_IfcBoundingBox;
	private IfcPositiveLengthMeasure ZDim;


	// Getters and setters of properties
	public IfcCartesianPoint getCorner() {
		return Corner;
	}

	public void setCorner(IfcCartesianPoint value){
		this.Corner=value;
	}

	public IfcPositiveLengthMeasure getXDim_of_IfcBoundingBox() {
		return XDim_of_IfcBoundingBox;
	}

	public void setXDim_of_IfcBoundingBox(IfcPositiveLengthMeasure value){
		this.XDim_of_IfcBoundingBox=value;
	}

	public IfcPositiveLengthMeasure getYDim_of_IfcBoundingBox() {
		return YDim_of_IfcBoundingBox;
	}

	public void setYDim_of_IfcBoundingBox(IfcPositiveLengthMeasure value){
		this.YDim_of_IfcBoundingBox=value;
	}

	public IfcPositiveLengthMeasure getZDim() {
		return ZDim;
	}

	public void setZDim(IfcPositiveLengthMeasure value){
		this.ZDim=value;
	}

}
