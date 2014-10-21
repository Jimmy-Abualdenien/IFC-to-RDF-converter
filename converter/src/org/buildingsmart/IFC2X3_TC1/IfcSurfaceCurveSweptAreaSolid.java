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

public class IfcSurfaceCurveSweptAreaSolid extends IfcSweptAreaSolid 
{
	// The property attributes
	private IfcCurve Directrix_of_IfcSurfaceCurveSweptAreaSolid;
	private IfcParameterValue StartParam_of_IfcSurfaceCurveSweptAreaSolid;
	private IfcParameterValue EndParam_of_IfcSurfaceCurveSweptAreaSolid;
	private IfcSurface ReferenceSurface;


	// Getters and setters of properties
	public IfcCurve getDirectrix_of_IfcSurfaceCurveSweptAreaSolid() {
		return Directrix_of_IfcSurfaceCurveSweptAreaSolid;
	}

	public void setDirectrix_of_IfcSurfaceCurveSweptAreaSolid(IfcCurve value){
		this.Directrix_of_IfcSurfaceCurveSweptAreaSolid=value;
	}

	public IfcParameterValue getStartParam_of_IfcSurfaceCurveSweptAreaSolid() {
		return StartParam_of_IfcSurfaceCurveSweptAreaSolid;
	}

	public void setStartParam_of_IfcSurfaceCurveSweptAreaSolid(IfcParameterValue value){
		this.StartParam_of_IfcSurfaceCurveSweptAreaSolid=value;
	}

	public IfcParameterValue getEndParam_of_IfcSurfaceCurveSweptAreaSolid() {
		return EndParam_of_IfcSurfaceCurveSweptAreaSolid;
	}

	public void setEndParam_of_IfcSurfaceCurveSweptAreaSolid(IfcParameterValue value){
		this.EndParam_of_IfcSurfaceCurveSweptAreaSolid=value;
	}

	public IfcSurface getReferenceSurface() {
		return ReferenceSurface;
	}

	public void setReferenceSurface(IfcSurface value){
		this.ReferenceSurface=value;
	}

}
