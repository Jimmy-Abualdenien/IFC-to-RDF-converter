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

public class IfcBSplineSurfaceWithKnots extends IfcBSplineSurface 
{
	// The property attributes
	private List<IfcInteger> UMultiplicities = new ArrayList<IfcInteger>();
	private List<IfcInteger> VMultiplicities = new ArrayList<IfcInteger>();
	private List<IfcParameterValue> UKnots = new ArrayList<IfcParameterValue>();
	private List<IfcParameterValue> VKnots = new ArrayList<IfcParameterValue>();
	private IfcKnotType KnotSpec_of_IfcBSplineSurfaceWithKnots;


	// Getters and setters of properties
	public List<IfcInteger> getUMultiplicities() {
		return UMultiplicities;
	}

	public void setUMultiplicities(IfcInteger value){
		this.UMultiplicities.add(value);
	}

	public List<IfcInteger> getVMultiplicities() {
		return VMultiplicities;
	}

	public void setVMultiplicities(IfcInteger value){
		this.VMultiplicities.add(value);
	}

	public List<IfcParameterValue> getUKnots() {
		return UKnots;
	}

	public void setUKnots(IfcParameterValue value){
		this.UKnots.add(value);
	}

	public List<IfcParameterValue> getVKnots() {
		return VKnots;
	}

	public void setVKnots(IfcParameterValue value){
		this.VKnots.add(value);
	}

	public IfcKnotType getKnotSpec_of_IfcBSplineSurfaceWithKnots() {
		return KnotSpec_of_IfcBSplineSurfaceWithKnots;
	}

	public void setKnotSpec_of_IfcBSplineSurfaceWithKnots(IfcKnotType value){
		this.KnotSpec_of_IfcBSplineSurfaceWithKnots=value;
	}

}
