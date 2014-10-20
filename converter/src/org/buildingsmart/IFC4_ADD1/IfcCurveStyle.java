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

public class IfcCurveStyle extends IfcPresentationStyle implements IfcPresentationStyleSelect
{
	// The property attributes
	private IfcCurveFontOrScaledCurveFontSelect CurveFont_of_IfcCurveStyle;
	private IfcSizeSelect CurveWidth;
	private IfcColour CurveColour;
	private IfcBoolean ModelOrDraughting_of_IfcCurveStyle;


	// Getters and setters of properties
	public IfcCurveFontOrScaledCurveFontSelect getCurveFont_of_IfcCurveStyle() {
		return CurveFont_of_IfcCurveStyle;
	}

	public void setCurveFont_of_IfcCurveStyle(IfcCurveFontOrScaledCurveFontSelect value){
		this.CurveFont_of_IfcCurveStyle=value;
	}

	public IfcSizeSelect getCurveWidth() {
		return CurveWidth;
	}

	public void setCurveWidth(IfcSizeSelect value){
		this.CurveWidth=value;
	}

	public IfcColour getCurveColour() {
		return CurveColour;
	}

	public void setCurveColour(IfcColour value){
		this.CurveColour=value;
	}

	public IfcBoolean getModelOrDraughting_of_IfcCurveStyle() {
		return ModelOrDraughting_of_IfcCurveStyle;
	}

	public void setModelOrDraughting_of_IfcCurveStyle(IfcBoolean value){
		this.ModelOrDraughting_of_IfcCurveStyle=value;
	}

}
