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

public class IfcTextStyleFontModel extends IfcPreDefinedTextFont 
{
	// The property attributes
	private List<IfcTextFontName> FontFamily = new ArrayList<IfcTextFontName>();
	private IfcFontStyle FontStyle;
	private IfcFontVariant FontVariant;
	private IfcFontWeight FontWeight;
	private IfcSizeSelect FontSize;


	// Getters and setters of properties
	public List<IfcTextFontName> getFontFamily() {
		return FontFamily;
	}

	public void setFontFamily(IfcTextFontName value){
		this.FontFamily.add(value);
	}

	public IfcFontStyle getFontStyle() {
		return FontStyle;
	}

	public void setFontStyle(IfcFontStyle value){
		this.FontStyle=value;
	}

	public IfcFontVariant getFontVariant() {
		return FontVariant;
	}

	public void setFontVariant(IfcFontVariant value){
		this.FontVariant=value;
	}

	public IfcFontWeight getFontWeight() {
		return FontWeight;
	}

	public void setFontWeight(IfcFontWeight value){
		this.FontWeight=value;
	}

	public IfcSizeSelect getFontSize() {
		return FontSize;
	}

	public void setFontSize(IfcSizeSelect value){
		this.FontSize=value;
	}

}
