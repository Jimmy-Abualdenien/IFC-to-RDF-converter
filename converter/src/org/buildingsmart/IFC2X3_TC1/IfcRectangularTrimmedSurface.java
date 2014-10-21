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

public class IfcRectangularTrimmedSurface extends IfcBoundedSurface 
{
	// The property attributes
	private IfcSurface BasisSurface_of_IfcRectangularTrimmedSurface;
	private IfcParameterValue U1;
	private IfcParameterValue V1;
	private IfcParameterValue U2;
	private IfcParameterValue V2;
	private Boolean Usense;
	private Boolean Vsense;


	// Getters and setters of properties
	public IfcSurface getBasisSurface_of_IfcRectangularTrimmedSurface() {
		return BasisSurface_of_IfcRectangularTrimmedSurface;
	}

	public void setBasisSurface_of_IfcRectangularTrimmedSurface(IfcSurface value){
		this.BasisSurface_of_IfcRectangularTrimmedSurface=value;
	}

	public IfcParameterValue getU1() {
		return U1;
	}

	public void setU1(IfcParameterValue value){
		this.U1=value;
	}

	public IfcParameterValue getV1() {
		return V1;
	}

	public void setV1(IfcParameterValue value){
		this.V1=value;
	}

	public IfcParameterValue getU2() {
		return U2;
	}

	public void setU2(IfcParameterValue value){
		this.U2=value;
	}

	public IfcParameterValue getV2() {
		return V2;
	}

	public void setV2(IfcParameterValue value){
		this.V2=value;
	}

	public Boolean getUsense() {
		return Usense;
	}

	public void setUsense(Boolean value){
		this.Usense=value;
	}

	public Boolean getVsense() {
		return Vsense;
	}

	public void setVsense(Boolean value){
		this.Vsense=value;
	}

}
