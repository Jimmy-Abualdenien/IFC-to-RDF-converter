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

public class IfcCurveStyleFontAndScaling extends IfcPresentationItem implements IfcCurveFontOrScaledCurveFontSelect
{
	// The property attributes
	private IfcLabel Name_of_IfcCurveStyleFontAndScaling;
	private IfcCurveStyleFontSelect CurveFont_of_IfcCurveStyleFontAndScaling;
	private IfcPositiveRatioMeasure CurveFontScaling;


	// Getters and setters of properties
	public IfcLabel getName_of_IfcCurveStyleFontAndScaling() {
		return Name_of_IfcCurveStyleFontAndScaling;
	}

	public void setName_of_IfcCurveStyleFontAndScaling(IfcLabel value){
		this.Name_of_IfcCurveStyleFontAndScaling=value;
	}

	public IfcCurveStyleFontSelect getCurveFont_of_IfcCurveStyleFontAndScaling() {
		return CurveFont_of_IfcCurveStyleFontAndScaling;
	}

	public void setCurveFont_of_IfcCurveStyleFontAndScaling(IfcCurveStyleFontSelect value){
		this.CurveFont_of_IfcCurveStyleFontAndScaling=value;
	}

	public IfcPositiveRatioMeasure getCurveFontScaling() {
		return CurveFontScaling;
	}

	public void setCurveFontScaling(IfcPositiveRatioMeasure value){
		this.CurveFontScaling=value;
	}

}
