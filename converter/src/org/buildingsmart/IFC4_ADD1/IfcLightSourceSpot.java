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

public class IfcLightSourceSpot extends IfcLightSourcePositional 
{
	// The property attributes
	private IfcDirection Orientation_of_IfcLightSourceSpot;
	private IfcReal ConcentrationExponent;
	private IfcPositivePlaneAngleMeasure SpreadAngle;
	private IfcPositivePlaneAngleMeasure BeamWidthAngle;


	// Getters and setters of properties
	public IfcDirection getOrientation_of_IfcLightSourceSpot() {
		return Orientation_of_IfcLightSourceSpot;
	}

	public void setOrientation_of_IfcLightSourceSpot(IfcDirection value){
		this.Orientation_of_IfcLightSourceSpot=value;
	}

	public IfcReal getConcentrationExponent() {
		return ConcentrationExponent;
	}

	public void setConcentrationExponent(IfcReal value){
		this.ConcentrationExponent=value;
	}

	public IfcPositivePlaneAngleMeasure getSpreadAngle() {
		return SpreadAngle;
	}

	public void setSpreadAngle(IfcPositivePlaneAngleMeasure value){
		this.SpreadAngle=value;
	}

	public IfcPositivePlaneAngleMeasure getBeamWidthAngle() {
		return BeamWidthAngle;
	}

	public void setBeamWidthAngle(IfcPositivePlaneAngleMeasure value){
		this.BeamWidthAngle=value;
	}

}
