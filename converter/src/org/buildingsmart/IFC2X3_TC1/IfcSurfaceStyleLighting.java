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

public class IfcSurfaceStyleLighting extends Thing implements IfcSurfaceStyleElementSelect
{
	// The property attributes
	private IfcColourRgb DiffuseTransmissionColour_of_IfcSurfaceStyleLighting;
	private IfcColourRgb DiffuseReflectionColour;
	private IfcColourRgb TransmissionColour_of_IfcSurfaceStyleLighting;
	private IfcColourRgb ReflectanceColour;


	// Getters and setters of properties
	public IfcColourRgb getDiffuseTransmissionColour_of_IfcSurfaceStyleLighting() {
		return DiffuseTransmissionColour_of_IfcSurfaceStyleLighting;
	}

	public void setDiffuseTransmissionColour_of_IfcSurfaceStyleLighting(IfcColourRgb value){
		this.DiffuseTransmissionColour_of_IfcSurfaceStyleLighting=value;
	}

	public IfcColourRgb getDiffuseReflectionColour() {
		return DiffuseReflectionColour;
	}

	public void setDiffuseReflectionColour(IfcColourRgb value){
		this.DiffuseReflectionColour=value;
	}

	public IfcColourRgb getTransmissionColour_of_IfcSurfaceStyleLighting() {
		return TransmissionColour_of_IfcSurfaceStyleLighting;
	}

	public void setTransmissionColour_of_IfcSurfaceStyleLighting(IfcColourRgb value){
		this.TransmissionColour_of_IfcSurfaceStyleLighting=value;
	}

	public IfcColourRgb getReflectanceColour() {
		return ReflectanceColour;
	}

	public void setReflectanceColour(IfcColourRgb value){
		this.ReflectanceColour=value;
	}

}
