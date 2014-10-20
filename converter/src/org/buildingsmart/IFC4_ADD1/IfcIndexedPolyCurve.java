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

public class IfcIndexedPolyCurve extends IfcBoundedCurve 
{
	// The property attributes
	private IfcCartesianPointList Points_of_IfcIndexedPolyCurve;
	private List<IfcSegmentIndexSelect> Segments_of_IfcIndexedPolyCurve = new ArrayList<IfcSegmentIndexSelect>();
	private IfcBoolean SelfIntersect_of_IfcIndexedPolyCurve;


	// Getters and setters of properties
	public IfcCartesianPointList getPoints_of_IfcIndexedPolyCurve() {
		return Points_of_IfcIndexedPolyCurve;
	}

	public void setPoints_of_IfcIndexedPolyCurve(IfcCartesianPointList value){
		this.Points_of_IfcIndexedPolyCurve=value;
	}

	public List<IfcSegmentIndexSelect> getSegments_of_IfcIndexedPolyCurve() {
		return Segments_of_IfcIndexedPolyCurve;
	}

	public void setSegments_of_IfcIndexedPolyCurve(IfcSegmentIndexSelect value){
		this.Segments_of_IfcIndexedPolyCurve.add(value);
	}

	public IfcBoolean getSelfIntersect_of_IfcIndexedPolyCurve() {
		return SelfIntersect_of_IfcIndexedPolyCurve;
	}

	public void setSelfIntersect_of_IfcIndexedPolyCurve(IfcBoolean value){
		this.SelfIntersect_of_IfcIndexedPolyCurve=value;
	}

}
