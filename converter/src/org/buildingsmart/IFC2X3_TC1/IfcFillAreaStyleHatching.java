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

public class IfcFillAreaStyleHatching extends IfcGeometricRepresentationItem implements IfcFillStyleSelect
{
	// The property attributes
	private IfcCurveStyle HatchLineAppearance;
	private IfcHatchLineDistanceSelect StartOfNextHatchLine;
	private IfcCartesianPoint PointOfReferenceHatchLine;
	private IfcCartesianPoint PatternStart;
	private IfcPlaneAngleMeasure HatchLineAngle;


	// Getters and setters of properties
	public IfcCurveStyle getHatchLineAppearance() {
		return HatchLineAppearance;
	}

	public void setHatchLineAppearance(IfcCurveStyle value){
		this.HatchLineAppearance=value;
	}

	public IfcHatchLineDistanceSelect getStartOfNextHatchLine() {
		return StartOfNextHatchLine;
	}

	public void setStartOfNextHatchLine(IfcHatchLineDistanceSelect value){
		this.StartOfNextHatchLine=value;
	}

	public IfcCartesianPoint getPointOfReferenceHatchLine() {
		return PointOfReferenceHatchLine;
	}

	public void setPointOfReferenceHatchLine(IfcCartesianPoint value){
		this.PointOfReferenceHatchLine=value;
	}

	public IfcCartesianPoint getPatternStart() {
		return PatternStart;
	}

	public void setPatternStart(IfcCartesianPoint value){
		this.PatternStart=value;
	}

	public IfcPlaneAngleMeasure getHatchLineAngle() {
		return HatchLineAngle;
	}

	public void setHatchLineAngle(IfcPlaneAngleMeasure value){
		this.HatchLineAngle=value;
	}

}
