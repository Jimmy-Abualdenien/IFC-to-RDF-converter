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

public class IfcLightSourcePositional extends IfcLightSource 
{
	// The property attributes
	private IfcCartesianPoint Position_of_IfcLightSourcePositional;
	private IfcPositiveLengthMeasure Radius_of_IfcLightSourcePositional;
	private IfcReal ConstantAttenuation;
	private IfcReal DistanceAttenuation;
	private IfcReal QuadricAttenuation;


	// Getters and setters of properties
	public IfcCartesianPoint getPosition_of_IfcLightSourcePositional() {
		return Position_of_IfcLightSourcePositional;
	}

	public void setPosition_of_IfcLightSourcePositional(IfcCartesianPoint value){
		this.Position_of_IfcLightSourcePositional=value;
	}

	public IfcPositiveLengthMeasure getRadius_of_IfcLightSourcePositional() {
		return Radius_of_IfcLightSourcePositional;
	}

	public void setRadius_of_IfcLightSourcePositional(IfcPositiveLengthMeasure value){
		this.Radius_of_IfcLightSourcePositional=value;
	}

	public IfcReal getConstantAttenuation() {
		return ConstantAttenuation;
	}

	public void setConstantAttenuation(IfcReal value){
		this.ConstantAttenuation=value;
	}

	public IfcReal getDistanceAttenuation() {
		return DistanceAttenuation;
	}

	public void setDistanceAttenuation(IfcReal value){
		this.DistanceAttenuation=value;
	}

	public IfcReal getQuadricAttenuation() {
		return QuadricAttenuation;
	}

	public void setQuadricAttenuation(IfcReal value){
		this.QuadricAttenuation=value;
	}

}
