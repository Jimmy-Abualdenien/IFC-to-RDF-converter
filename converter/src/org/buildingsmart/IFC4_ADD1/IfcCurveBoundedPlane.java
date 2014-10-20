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

public class IfcCurveBoundedPlane extends IfcBoundedSurface 
{
	// The property attributes
	private IfcPlane BasisSurface_of_IfcCurveBoundedPlane;
	private IfcCurve OuterBoundary_of_IfcCurveBoundedPlane;
	private List<IfcCurve> InnerBoundaries_of_IfcCurveBoundedPlane = new ArrayList<IfcCurve>();


	// Getters and setters of properties
	public IfcPlane getBasisSurface_of_IfcCurveBoundedPlane() {
		return BasisSurface_of_IfcCurveBoundedPlane;
	}

	public void setBasisSurface_of_IfcCurveBoundedPlane(IfcPlane value){
		this.BasisSurface_of_IfcCurveBoundedPlane=value;
	}

	public IfcCurve getOuterBoundary_of_IfcCurveBoundedPlane() {
		return OuterBoundary_of_IfcCurveBoundedPlane;
	}

	public void setOuterBoundary_of_IfcCurveBoundedPlane(IfcCurve value){
		this.OuterBoundary_of_IfcCurveBoundedPlane=value;
	}

	public List<IfcCurve> getInnerBoundaries_of_IfcCurveBoundedPlane() {
		return InnerBoundaries_of_IfcCurveBoundedPlane;
	}

	public void setInnerBoundaries_of_IfcCurveBoundedPlane(IfcCurve value){
		this.InnerBoundaries_of_IfcCurveBoundedPlane.add(value);
	}

}
