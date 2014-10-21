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

public class IfcTrimmedCurve extends IfcBoundedCurve 
{
	// The property attributes
	private IfcCurve BasisCurve_of_IfcTrimmedCurve;
	private List<IfcTrimmingSelect> Trim1 = new ArrayList<IfcTrimmingSelect>();
	private List<IfcTrimmingSelect> Trim2 = new ArrayList<IfcTrimmingSelect>();
	private Boolean SenseAgreement;
	private IfcTrimmingPreference MasterRepresentation;


	// Getters and setters of properties
	public IfcCurve getBasisCurve_of_IfcTrimmedCurve() {
		return BasisCurve_of_IfcTrimmedCurve;
	}

	public void setBasisCurve_of_IfcTrimmedCurve(IfcCurve value){
		this.BasisCurve_of_IfcTrimmedCurve=value;
	}

	public List<IfcTrimmingSelect> getTrim1() {
		return Trim1;
	}

	public void setTrim1(IfcTrimmingSelect value){
		this.Trim1.add(value);
	}

	public List<IfcTrimmingSelect> getTrim2() {
		return Trim2;
	}

	public void setTrim2(IfcTrimmingSelect value){
		this.Trim2.add(value);
	}

	public Boolean getSenseAgreement() {
		return SenseAgreement;
	}

	public void setSenseAgreement(Boolean value){
		this.SenseAgreement=value;
	}

	public IfcTrimmingPreference getMasterRepresentation() {
		return MasterRepresentation;
	}

	public void setMasterRepresentation(IfcTrimmingPreference value){
		this.MasterRepresentation=value;
	}

}
