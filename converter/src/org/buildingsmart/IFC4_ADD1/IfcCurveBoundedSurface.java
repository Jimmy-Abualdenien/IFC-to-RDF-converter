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

public class IfcCurveBoundedSurface extends IfcBoundedSurface 
{
	// The property attributes
	private IfcSurface BasisSurface_of_IfcCurveBoundedSurface;
	private List<IfcBoundaryCurve> Boundaries = new ArrayList<IfcBoundaryCurve>();
	private IfcBoolean ImplicitOuter;


	// Getters and setters of properties
	public IfcSurface getBasisSurface_of_IfcCurveBoundedSurface() {
		return BasisSurface_of_IfcCurveBoundedSurface;
	}

	public void setBasisSurface_of_IfcCurveBoundedSurface(IfcSurface value){
		this.BasisSurface_of_IfcCurveBoundedSurface=value;
	}

	public List<IfcBoundaryCurve> getBoundaries() {
		return Boundaries;
	}

	public void setBoundaries(IfcBoundaryCurve value){
		this.Boundaries.add(value);
	}

	public IfcBoolean getImplicitOuter() {
		return ImplicitOuter;
	}

	public void setImplicitOuter(IfcBoolean value){
		this.ImplicitOuter=value;
	}

}
