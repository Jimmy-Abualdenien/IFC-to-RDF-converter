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

public class IfcGridAxis extends Thing 
{
	// The property attributes
	private IfcLabel AxisTag;
	private IfcCurve AxisCurve;
	private IfcBoolean SameSense_of_IfcGridAxis;
 // The inverse attributes

	private List<IfcGrid> PartOfW= new ArrayList<IfcGrid>();
	private List<IfcGrid> PartOfV= new ArrayList<IfcGrid>();
	private List<IfcGrid> PartOfU= new ArrayList<IfcGrid>();
	private List<IfcVirtualGridIntersection> HasIntersections= new ArrayList<IfcVirtualGridIntersection>();


	// Getters and setters of properties
	public IfcLabel getAxisTag() {
		return AxisTag;
	}

	public void setAxisTag(IfcLabel value){
		this.AxisTag=value;
	}

	public IfcCurve getAxisCurve() {
		return AxisCurve;
	}

	public void setAxisCurve(IfcCurve value){
		this.AxisCurve=value;
	}

	public IfcBoolean getSameSense_of_IfcGridAxis() {
		return SameSense_of_IfcGridAxis;
	}

	public void setSameSense_of_IfcGridAxis(IfcBoolean value){
		this.SameSense_of_IfcGridAxis=value;
	}

	// Getters and setters of inverse values

	public List<IfcGrid> getPartOfW() {
		return PartOfW;
	}

	public void setPartOfW(IfcGrid value){
		this.PartOfW.add(value);
	}

	public List<IfcGrid> getPartOfV() {
		return PartOfV;
	}

	public void setPartOfV(IfcGrid value){
		this.PartOfV.add(value);
	}

	public List<IfcGrid> getPartOfU() {
		return PartOfU;
	}

	public void setPartOfU(IfcGrid value){
		this.PartOfU.add(value);
	}

	public List<IfcVirtualGridIntersection> getHasIntersections() {
		return HasIntersections;
	}

	public void setHasIntersections(IfcVirtualGridIntersection value){
		this.HasIntersections.add(value);
	}

}
