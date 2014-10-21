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

public class IfcLightSource extends IfcGeometricRepresentationItem 
{
	// The property attributes
	private IfcLabel Name_of_IfcLightSource;
	private IfcColourRgb LightColour;
	private IfcNormalisedRatioMeasure AmbientIntensity;
	private IfcNormalisedRatioMeasure Intensity;


	// Getters and setters of properties
	public IfcLabel getName_of_IfcLightSource() {
		return Name_of_IfcLightSource;
	}

	public void setName_of_IfcLightSource(IfcLabel value){
		this.Name_of_IfcLightSource=value;
	}

	public IfcColourRgb getLightColour() {
		return LightColour;
	}

	public void setLightColour(IfcColourRgb value){
		this.LightColour=value;
	}

	public IfcNormalisedRatioMeasure getAmbientIntensity() {
		return AmbientIntensity;
	}

	public void setAmbientIntensity(IfcNormalisedRatioMeasure value){
		this.AmbientIntensity=value;
	}

	public IfcNormalisedRatioMeasure getIntensity() {
		return Intensity;
	}

	public void setIntensity(IfcNormalisedRatioMeasure value){
		this.Intensity=value;
	}

}
