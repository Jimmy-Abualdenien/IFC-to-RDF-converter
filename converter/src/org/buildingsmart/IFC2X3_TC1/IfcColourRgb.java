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

public class IfcColourRgb extends IfcColourSpecification implements IfcColourOrFactor
{
	// The property attributes
	private IfcNormalisedRatioMeasure Red;
	private IfcNormalisedRatioMeasure Green;
	private IfcNormalisedRatioMeasure Blue;


	// Getters and setters of properties
	public IfcNormalisedRatioMeasure getRed() {
		return Red;
	}

	public void setRed(IfcNormalisedRatioMeasure value){
		this.Red=value;
	}

	public IfcNormalisedRatioMeasure getGreen() {
		return Green;
	}

	public void setGreen(IfcNormalisedRatioMeasure value){
		this.Green=value;
	}

	public IfcNormalisedRatioMeasure getBlue() {
		return Blue;
	}

	public void setBlue(IfcNormalisedRatioMeasure value){
		this.Blue=value;
	}

}
