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

public class IfcCompositeCurveSegment extends IfcGeometricRepresentationItem 
{
	// The property attributes
	private IfcTransitionCode Transition;
	private Boolean SameSense_of_IfcCompositeCurveSegment;
	private IfcCurve ParentCurve;
 // The inverse attributes

	private List<IfcCompositeCurve> UsingCurves= new ArrayList<IfcCompositeCurve>();


	// Getters and setters of properties
	public IfcTransitionCode getTransition() {
		return Transition;
	}

	public void setTransition(IfcTransitionCode value){
		this.Transition=value;
	}

	public Boolean getSameSense_of_IfcCompositeCurveSegment() {
		return SameSense_of_IfcCompositeCurveSegment;
	}

	public void setSameSense_of_IfcCompositeCurveSegment(Boolean value){
		this.SameSense_of_IfcCompositeCurveSegment=value;
	}

	public IfcCurve getParentCurve() {
		return ParentCurve;
	}

	public void setParentCurve(IfcCurve value){
		this.ParentCurve=value;
	}

	// Getters and setters of inverse values

	public List<IfcCompositeCurve> getUsingCurves() {
		return UsingCurves;
	}

	public void setUsingCurves(IfcCompositeCurve value){
		this.UsingCurves.add(value);
	}

}
