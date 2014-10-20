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

public class IfcBSplineSurface extends IfcBoundedSurface 
{
	// The property attributes
	private IfcInteger UDegree;
	private IfcInteger VDegree;
	private List<List<IfcCartesianPoint>> ControlPointsList_of_IfcBSplineSurface = new ArrayList<List<IfcCartesianPoint>>();
	private IfcBSplineSurfaceForm SurfaceForm;
	private IfcLogical UClosed;
	private IfcLogical VClosed;
	private IfcLogical SelfIntersect_of_IfcBSplineSurface;


	// Getters and setters of properties
	public IfcInteger getUDegree() {
		return UDegree;
	}

	public void setUDegree(IfcInteger value){
		this.UDegree=value;
	}

	public IfcInteger getVDegree() {
		return VDegree;
	}

	public void setVDegree(IfcInteger value){
		this.VDegree=value;
	}

	public List<List<IfcCartesianPoint>>  getControlPointsList_of_IfcBSplineSurface() {
		return ControlPointsList_of_IfcBSplineSurface;
	}

	public void setControlPointsList_of_IfcBSplineSurface(List<IfcCartesianPoint> value){
		this.ControlPointsList_of_IfcBSplineSurface.add(value);
	}

	public IfcBSplineSurfaceForm getSurfaceForm() {
		return SurfaceForm;
	}

	public void setSurfaceForm(IfcBSplineSurfaceForm value){
		this.SurfaceForm=value;
	}

	public IfcLogical getUClosed() {
		return UClosed;
	}

	public void setUClosed(IfcLogical value){
		this.UClosed=value;
	}

	public IfcLogical getVClosed() {
		return VClosed;
	}

	public void setVClosed(IfcLogical value){
		this.VClosed=value;
	}

	public IfcLogical getSelfIntersect_of_IfcBSplineSurface() {
		return SelfIntersect_of_IfcBSplineSurface;
	}

	public void setSelfIntersect_of_IfcBSplineSurface(IfcLogical value){
		this.SelfIntersect_of_IfcBSplineSurface=value;
	}

}
