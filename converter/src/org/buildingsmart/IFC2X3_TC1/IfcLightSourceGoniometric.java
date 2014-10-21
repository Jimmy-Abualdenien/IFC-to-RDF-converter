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

public class IfcLightSourceGoniometric extends IfcLightSource 
{
	// The property attributes
	private IfcAxis2Placement3D Position_of_IfcLightSourceGoniometric;
	private IfcColourRgb ColourAppearance;
	private IfcThermodynamicTemperatureMeasure ColourTemperature;
	private IfcLuminousFluxMeasure LuminousFlux;
	private IfcLightEmissionSourceEnum LightEmissionSource;
	private IfcLightDistributionDataSourceSelect LightDistributionDataSource;


	// Getters and setters of properties
	public IfcAxis2Placement3D getPosition_of_IfcLightSourceGoniometric() {
		return Position_of_IfcLightSourceGoniometric;
	}

	public void setPosition_of_IfcLightSourceGoniometric(IfcAxis2Placement3D value){
		this.Position_of_IfcLightSourceGoniometric=value;
	}

	public IfcColourRgb getColourAppearance() {
		return ColourAppearance;
	}

	public void setColourAppearance(IfcColourRgb value){
		this.ColourAppearance=value;
	}

	public IfcThermodynamicTemperatureMeasure getColourTemperature() {
		return ColourTemperature;
	}

	public void setColourTemperature(IfcThermodynamicTemperatureMeasure value){
		this.ColourTemperature=value;
	}

	public IfcLuminousFluxMeasure getLuminousFlux() {
		return LuminousFlux;
	}

	public void setLuminousFlux(IfcLuminousFluxMeasure value){
		this.LuminousFlux=value;
	}

	public IfcLightEmissionSourceEnum getLightEmissionSource() {
		return LightEmissionSource;
	}

	public void setLightEmissionSource(IfcLightEmissionSourceEnum value){
		this.LightEmissionSource=value;
	}

	public IfcLightDistributionDataSourceSelect getLightDistributionDataSource() {
		return LightDistributionDataSource;
	}

	public void setLightDistributionDataSource(IfcLightDistributionDataSourceSelect value){
		this.LightDistributionDataSource=value;
	}

}
