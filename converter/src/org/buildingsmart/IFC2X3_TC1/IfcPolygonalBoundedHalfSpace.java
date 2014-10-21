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

public class IfcPolygonalBoundedHalfSpace extends IfcHalfSpaceSolid 
{
	// The property attributes
	private IfcAxis2Placement3D Position_of_IfcPolygonalBoundedHalfSpace;
	private IfcBoundedCurve PolygonalBoundary;


	// Getters and setters of properties
	public IfcAxis2Placement3D getPosition_of_IfcPolygonalBoundedHalfSpace() {
		return Position_of_IfcPolygonalBoundedHalfSpace;
	}

	public void setPosition_of_IfcPolygonalBoundedHalfSpace(IfcAxis2Placement3D value){
		this.Position_of_IfcPolygonalBoundedHalfSpace=value;
	}

	public IfcBoundedCurve getPolygonalBoundary() {
		return PolygonalBoundary;
	}

	public void setPolygonalBoundary(IfcBoundedCurve value){
		this.PolygonalBoundary=value;
	}

}
