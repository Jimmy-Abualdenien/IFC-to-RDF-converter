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

public class IfcGeometricRepresentationContext extends IfcRepresentationContext 
{
	// The property attributes
	private IfcDimensionCount CoordinateSpaceDimension;
	private Double Precision;
	private IfcAxis2Placement WorldCoordinateSystem;
	private IfcDirection TrueNorth;
 // The inverse attributes

	private List<IfcGeometricRepresentationSubContext> HasSubContexts= new ArrayList<IfcGeometricRepresentationSubContext>();


	// Getters and setters of properties
	public IfcDimensionCount getCoordinateSpaceDimension() {
		return CoordinateSpaceDimension;
	}

	public void setCoordinateSpaceDimension(IfcDimensionCount value){
		this.CoordinateSpaceDimension=value;
	}

	public Double getPrecision() {
		return Precision;
	}

	public void setPrecision(Double value){
		this.Precision=value;
	}

	public IfcAxis2Placement getWorldCoordinateSystem() {
		return WorldCoordinateSystem;
	}

	public void setWorldCoordinateSystem(IfcAxis2Placement value){
		this.WorldCoordinateSystem=value;
	}

	public IfcDirection getTrueNorth() {
		return TrueNorth;
	}

	public void setTrueNorth(IfcDirection value){
		this.TrueNorth=value;
	}

	// Getters and setters of inverse values

	public List<IfcGeometricRepresentationSubContext> getHasSubContexts() {
		return HasSubContexts;
	}

	public void setHasSubContexts(IfcGeometricRepresentationSubContext value){
		this.HasSubContexts.add(value);
	}

}
