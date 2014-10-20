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

public class IfcFixedReferenceSweptAreaSolid extends IfcSweptAreaSolid 
{
	// The property attributes
	private IfcCurve Directrix_of_IfcFixedReferenceSweptAreaSolid;
	private IfcParameterValue StartParam_of_IfcFixedReferenceSweptAreaSolid;
	private IfcParameterValue EndParam_of_IfcFixedReferenceSweptAreaSolid;
	private IfcDirection FixedReference;


	// Getters and setters of properties
	public IfcCurve getDirectrix_of_IfcFixedReferenceSweptAreaSolid() {
		return Directrix_of_IfcFixedReferenceSweptAreaSolid;
	}

	public void setDirectrix_of_IfcFixedReferenceSweptAreaSolid(IfcCurve value){
		this.Directrix_of_IfcFixedReferenceSweptAreaSolid=value;
	}

	public IfcParameterValue getStartParam_of_IfcFixedReferenceSweptAreaSolid() {
		return StartParam_of_IfcFixedReferenceSweptAreaSolid;
	}

	public void setStartParam_of_IfcFixedReferenceSweptAreaSolid(IfcParameterValue value){
		this.StartParam_of_IfcFixedReferenceSweptAreaSolid=value;
	}

	public IfcParameterValue getEndParam_of_IfcFixedReferenceSweptAreaSolid() {
		return EndParam_of_IfcFixedReferenceSweptAreaSolid;
	}

	public void setEndParam_of_IfcFixedReferenceSweptAreaSolid(IfcParameterValue value){
		this.EndParam_of_IfcFixedReferenceSweptAreaSolid=value;
	}

	public IfcDirection getFixedReference() {
		return FixedReference;
	}

	public void setFixedReference(IfcDirection value){
		this.FixedReference=value;
	}

}
