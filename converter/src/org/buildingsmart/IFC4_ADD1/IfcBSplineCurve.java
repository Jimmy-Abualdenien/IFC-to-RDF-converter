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

public class IfcBSplineCurve extends IfcBoundedCurve 
{
	// The property attributes
	private IfcInteger Degree;
	private List<IfcCartesianPoint> ControlPointsList_of_IfcBSplineCurve = new ArrayList<IfcCartesianPoint>();
	private IfcBSplineCurveForm CurveForm;
	private IfcLogical ClosedCurve;
	private IfcLogical SelfIntersect_of_IfcBSplineCurve;


	// Getters and setters of properties
	public IfcInteger getDegree() {
		return Degree;
	}

	public void setDegree(IfcInteger value){
		this.Degree=value;
	}

	public List<IfcCartesianPoint> getControlPointsList_of_IfcBSplineCurve() {
		return ControlPointsList_of_IfcBSplineCurve;
	}

	public void setControlPointsList_of_IfcBSplineCurve(IfcCartesianPoint value){
		this.ControlPointsList_of_IfcBSplineCurve.add(value);
	}

	public IfcBSplineCurveForm getCurveForm() {
		return CurveForm;
	}

	public void setCurveForm(IfcBSplineCurveForm value){
		this.CurveForm=value;
	}

	public IfcLogical getClosedCurve() {
		return ClosedCurve;
	}

	public void setClosedCurve(IfcLogical value){
		this.ClosedCurve=value;
	}

	public IfcLogical getSelfIntersect_of_IfcBSplineCurve() {
		return SelfIntersect_of_IfcBSplineCurve;
	}

	public void setSelfIntersect_of_IfcBSplineCurve(IfcLogical value){
		this.SelfIntersect_of_IfcBSplineCurve=value;
	}

}
