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

public class IfcGrid extends IfcProduct 
{
	// The property attributes
	private List<IfcGridAxis> UAxes = new ArrayList<IfcGridAxis>();
	private List<IfcGridAxis> VAxes = new ArrayList<IfcGridAxis>();
	private List<IfcGridAxis> WAxes = new ArrayList<IfcGridAxis>();
	// The inverse attributes
	private List<IfcRelContainedInSpatialStructure> ContainedInStructure= new ArrayList<IfcRelContainedInSpatialStructure>();


	// Getters and setters of properties
	public List<IfcGridAxis> getUAxes() {
		return UAxes;
	}

	public void setUAxes(IfcGridAxis value){
		this.UAxes.add(value);
	}

	public List<IfcGridAxis> getVAxes() {
		return VAxes;
	}

	public void setVAxes(IfcGridAxis value){
		this.VAxes.add(value);
	}

	public List<IfcGridAxis> getWAxes() {
		return WAxes;
	}

	public void setWAxes(IfcGridAxis value){
		this.WAxes.add(value);
	}

	// Getters and setters of inverse values

	public List<IfcRelContainedInSpatialStructure> getContainedInStructure() {
		return ContainedInStructure;
	}

	public void setContainedInStructure(IfcRelContainedInSpatialStructure value){
		this.ContainedInStructure.add(value);
	}

}
