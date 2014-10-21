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

public class IfcCartesianTransformationOperator extends IfcGeometricRepresentationItem 
{
	// The property attributes
	private IfcDirection Axis1;
	private IfcDirection Axis2;
	private IfcCartesianPoint LocalOrigin;
	private Double Scale;


	// Getters and setters of properties
	public IfcDirection getAxis1() {
		return Axis1;
	}

	public void setAxis1(IfcDirection value){
		this.Axis1=value;
	}

	public IfcDirection getAxis2() {
		return Axis2;
	}

	public void setAxis2(IfcDirection value){
		this.Axis2=value;
	}

	public IfcCartesianPoint getLocalOrigin() {
		return LocalOrigin;
	}

	public void setLocalOrigin(IfcCartesianPoint value){
		this.LocalOrigin=value;
	}

	public Double getScale() {
		return Scale;
	}

	public void setScale(Double value){
		this.Scale=value;
	}

}
