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

public class IfcPixelTexture extends IfcSurfaceTexture 
{
	// The property attributes
	private IfcInteger Width_of_IfcPixelTexture;
	private IfcInteger Height_of_IfcPixelTexture;
	private IfcInteger ColourComponents;
	private List<org.apache.axis2.databinding.types.xsd.HexBinary> Pixel = new ArrayList<org.apache.axis2.databinding.types.xsd.HexBinary>();


	// Getters and setters of properties
	public IfcInteger getWidth_of_IfcPixelTexture() {
		return Width_of_IfcPixelTexture;
	}

	public void setWidth_of_IfcPixelTexture(IfcInteger value){
		this.Width_of_IfcPixelTexture=value;
	}

	public IfcInteger getHeight_of_IfcPixelTexture() {
		return Height_of_IfcPixelTexture;
	}

	public void setHeight_of_IfcPixelTexture(IfcInteger value){
		this.Height_of_IfcPixelTexture=value;
	}

	public IfcInteger getColourComponents() {
		return ColourComponents;
	}

	public void setColourComponents(IfcInteger value){
		this.ColourComponents=value;
	}

	public List<org.apache.axis2.databinding.types.xsd.HexBinary> getPixel() {
		return Pixel;
	}

	public void setPixel(org.apache.axis2.databinding.types.xsd.HexBinary value){
		this.Pixel.add(value);
	}

}
