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

public class IfcBSplineCurve extends IfcBoundedCurve 
{
	// The property attributes
	private Integer Degree;
	private List<IfcCartesianPoint> ControlPointsList = new ArrayList<IfcCartesianPoint>();
	private IfcBSplineCurveForm CurveForm;
	private Boolean ClosedCurve;
	private Boolean SelfIntersect_of_IfcBSplineCurve;


	// Getters and setters of properties
	public Integer getDegree() {
		return Degree;
	}

	public void setDegree(Integer value){
		this.Degree=value;
	}

	public List<IfcCartesianPoint> getControlPointsList() {
		return ControlPointsList;
	}

	public void setControlPointsList(IfcCartesianPoint value){
		this.ControlPointsList.add(value);
	}

	public IfcBSplineCurveForm getCurveForm() {
		return CurveForm;
	}

	public void setCurveForm(IfcBSplineCurveForm value){
		this.CurveForm=value;
	}

	public Boolean getClosedCurve() {
		return ClosedCurve;
	}

	public void setClosedCurve(Boolean value){
		this.ClosedCurve=value;
	}

	public Boolean getSelfIntersect_of_IfcBSplineCurve() {
		return SelfIntersect_of_IfcBSplineCurve;
	}

	public void setSelfIntersect_of_IfcBSplineCurve(Boolean value){
		this.SelfIntersect_of_IfcBSplineCurve=value;
	}

}
