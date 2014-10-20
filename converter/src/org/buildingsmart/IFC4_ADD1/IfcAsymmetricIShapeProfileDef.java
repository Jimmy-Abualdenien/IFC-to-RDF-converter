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

public class IfcAsymmetricIShapeProfileDef extends IfcParameterizedProfileDef 
{
	// The property attributes
	private IfcPositiveLengthMeasure BottomFlangeWidth;
	private IfcPositiveLengthMeasure OverallDepth_of_IfcAsymmetricIShapeProfileDef;
	private IfcPositiveLengthMeasure WebThickness_of_IfcAsymmetricIShapeProfileDef;
	private IfcPositiveLengthMeasure BottomFlangeThickness;
	private IfcNonNegativeLengthMeasure BottomFlangeFilletRadius;
	private IfcPositiveLengthMeasure TopFlangeWidth;
	private IfcPositiveLengthMeasure TopFlangeThickness;
	private IfcNonNegativeLengthMeasure TopFlangeFilletRadius;
	private IfcNonNegativeLengthMeasure BottomFlangeEdgeRadius;
	private IfcPlaneAngleMeasure BottomFlangeSlope;
	private IfcNonNegativeLengthMeasure TopFlangeEdgeRadius;
	private IfcPlaneAngleMeasure TopFlangeSlope;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getBottomFlangeWidth() {
		return BottomFlangeWidth;
	}

	public void setBottomFlangeWidth(IfcPositiveLengthMeasure value){
		this.BottomFlangeWidth=value;
	}

	public IfcPositiveLengthMeasure getOverallDepth_of_IfcAsymmetricIShapeProfileDef() {
		return OverallDepth_of_IfcAsymmetricIShapeProfileDef;
	}

	public void setOverallDepth_of_IfcAsymmetricIShapeProfileDef(IfcPositiveLengthMeasure value){
		this.OverallDepth_of_IfcAsymmetricIShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getWebThickness_of_IfcAsymmetricIShapeProfileDef() {
		return WebThickness_of_IfcAsymmetricIShapeProfileDef;
	}

	public void setWebThickness_of_IfcAsymmetricIShapeProfileDef(IfcPositiveLengthMeasure value){
		this.WebThickness_of_IfcAsymmetricIShapeProfileDef=value;
	}

	public IfcPositiveLengthMeasure getBottomFlangeThickness() {
		return BottomFlangeThickness;
	}

	public void setBottomFlangeThickness(IfcPositiveLengthMeasure value){
		this.BottomFlangeThickness=value;
	}

	public IfcNonNegativeLengthMeasure getBottomFlangeFilletRadius() {
		return BottomFlangeFilletRadius;
	}

	public void setBottomFlangeFilletRadius(IfcNonNegativeLengthMeasure value){
		this.BottomFlangeFilletRadius=value;
	}

	public IfcPositiveLengthMeasure getTopFlangeWidth() {
		return TopFlangeWidth;
	}

	public void setTopFlangeWidth(IfcPositiveLengthMeasure value){
		this.TopFlangeWidth=value;
	}

	public IfcPositiveLengthMeasure getTopFlangeThickness() {
		return TopFlangeThickness;
	}

	public void setTopFlangeThickness(IfcPositiveLengthMeasure value){
		this.TopFlangeThickness=value;
	}

	public IfcNonNegativeLengthMeasure getTopFlangeFilletRadius() {
		return TopFlangeFilletRadius;
	}

	public void setTopFlangeFilletRadius(IfcNonNegativeLengthMeasure value){
		this.TopFlangeFilletRadius=value;
	}

	public IfcNonNegativeLengthMeasure getBottomFlangeEdgeRadius() {
		return BottomFlangeEdgeRadius;
	}

	public void setBottomFlangeEdgeRadius(IfcNonNegativeLengthMeasure value){
		this.BottomFlangeEdgeRadius=value;
	}

	public IfcPlaneAngleMeasure getBottomFlangeSlope() {
		return BottomFlangeSlope;
	}

	public void setBottomFlangeSlope(IfcPlaneAngleMeasure value){
		this.BottomFlangeSlope=value;
	}

	public IfcNonNegativeLengthMeasure getTopFlangeEdgeRadius() {
		return TopFlangeEdgeRadius;
	}

	public void setTopFlangeEdgeRadius(IfcNonNegativeLengthMeasure value){
		this.TopFlangeEdgeRadius=value;
	}

	public IfcPlaneAngleMeasure getTopFlangeSlope() {
		return TopFlangeSlope;
	}

	public void setTopFlangeSlope(IfcPlaneAngleMeasure value){
		this.TopFlangeSlope=value;
	}

}
