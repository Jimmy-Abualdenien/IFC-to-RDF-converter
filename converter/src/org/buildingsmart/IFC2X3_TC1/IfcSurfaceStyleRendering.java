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

public class IfcSurfaceStyleRendering extends IfcSurfaceStyleShading 
{
	// The property attributes
	private IfcNormalisedRatioMeasure Transparency;
	private IfcColourOrFactor DiffuseColour;
	private IfcColourOrFactor TransmissionColour_of_IfcSurfaceStyleRendering;
	private IfcColourOrFactor DiffuseTransmissionColour_of_IfcSurfaceStyleRendering;
	private IfcColourOrFactor ReflectionColour;
	private IfcColourOrFactor SpecularColour;
	private IfcSpecularHighlightSelect SpecularHighlight;
	private IfcReflectanceMethodEnum ReflectanceMethod;


	// Getters and setters of properties
	public IfcNormalisedRatioMeasure getTransparency() {
		return Transparency;
	}

	public void setTransparency(IfcNormalisedRatioMeasure value){
		this.Transparency=value;
	}

	public IfcColourOrFactor getDiffuseColour() {
		return DiffuseColour;
	}

	public void setDiffuseColour(IfcColourOrFactor value){
		this.DiffuseColour=value;
	}

	public IfcColourOrFactor getTransmissionColour_of_IfcSurfaceStyleRendering() {
		return TransmissionColour_of_IfcSurfaceStyleRendering;
	}

	public void setTransmissionColour_of_IfcSurfaceStyleRendering(IfcColourOrFactor value){
		this.TransmissionColour_of_IfcSurfaceStyleRendering=value;
	}

	public IfcColourOrFactor getDiffuseTransmissionColour_of_IfcSurfaceStyleRendering() {
		return DiffuseTransmissionColour_of_IfcSurfaceStyleRendering;
	}

	public void setDiffuseTransmissionColour_of_IfcSurfaceStyleRendering(IfcColourOrFactor value){
		this.DiffuseTransmissionColour_of_IfcSurfaceStyleRendering=value;
	}

	public IfcColourOrFactor getReflectionColour() {
		return ReflectionColour;
	}

	public void setReflectionColour(IfcColourOrFactor value){
		this.ReflectionColour=value;
	}

	public IfcColourOrFactor getSpecularColour() {
		return SpecularColour;
	}

	public void setSpecularColour(IfcColourOrFactor value){
		this.SpecularColour=value;
	}

	public IfcSpecularHighlightSelect getSpecularHighlight() {
		return SpecularHighlight;
	}

	public void setSpecularHighlight(IfcSpecularHighlightSelect value){
		this.SpecularHighlight=value;
	}

	public IfcReflectanceMethodEnum getReflectanceMethod() {
		return ReflectanceMethod;
	}

	public void setReflectanceMethod(IfcReflectanceMethodEnum value){
		this.ReflectanceMethod=value;
	}

}
