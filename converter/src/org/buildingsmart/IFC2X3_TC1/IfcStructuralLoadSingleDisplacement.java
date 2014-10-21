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

public class IfcStructuralLoadSingleDisplacement extends IfcStructuralLoadStatic 
{
	// The property attributes
	private IfcLengthMeasure DisplacementX;
	private IfcLengthMeasure DisplacementY;
	private IfcLengthMeasure DisplacementZ;
	private IfcPlaneAngleMeasure RotationalDisplacementRX;
	private IfcPlaneAngleMeasure RotationalDisplacementRY;
	private IfcPlaneAngleMeasure RotationalDisplacementRZ;


	// Getters and setters of properties
	public IfcLengthMeasure getDisplacementX() {
		return DisplacementX;
	}

	public void setDisplacementX(IfcLengthMeasure value){
		this.DisplacementX=value;
	}

	public IfcLengthMeasure getDisplacementY() {
		return DisplacementY;
	}

	public void setDisplacementY(IfcLengthMeasure value){
		this.DisplacementY=value;
	}

	public IfcLengthMeasure getDisplacementZ() {
		return DisplacementZ;
	}

	public void setDisplacementZ(IfcLengthMeasure value){
		this.DisplacementZ=value;
	}

	public IfcPlaneAngleMeasure getRotationalDisplacementRX() {
		return RotationalDisplacementRX;
	}

	public void setRotationalDisplacementRX(IfcPlaneAngleMeasure value){
		this.RotationalDisplacementRX=value;
	}

	public IfcPlaneAngleMeasure getRotationalDisplacementRY() {
		return RotationalDisplacementRY;
	}

	public void setRotationalDisplacementRY(IfcPlaneAngleMeasure value){
		this.RotationalDisplacementRY=value;
	}

	public IfcPlaneAngleMeasure getRotationalDisplacementRZ() {
		return RotationalDisplacementRZ;
	}

	public void setRotationalDisplacementRZ(IfcPlaneAngleMeasure value){
		this.RotationalDisplacementRZ=value;
	}

}
