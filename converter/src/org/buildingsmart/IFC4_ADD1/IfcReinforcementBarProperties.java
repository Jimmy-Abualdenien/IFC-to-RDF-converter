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

public class IfcReinforcementBarProperties extends IfcPreDefinedProperties 
{
	// The property attributes
	private IfcAreaMeasure TotalCrossSectionArea;
	private IfcLabel SteelGrade_of_IfcReinforcementBarProperties;
	private IfcReinforcingBarSurfaceEnum BarSurface_of_IfcReinforcementBarProperties;
	private IfcLengthMeasure EffectiveDepth;
	private IfcPositiveLengthMeasure NominalBarDiameter;
	private IfcCountMeasure BarCount;


	// Getters and setters of properties
	public IfcAreaMeasure getTotalCrossSectionArea() {
		return TotalCrossSectionArea;
	}

	public void setTotalCrossSectionArea(IfcAreaMeasure value){
		this.TotalCrossSectionArea=value;
	}

	public IfcLabel getSteelGrade_of_IfcReinforcementBarProperties() {
		return SteelGrade_of_IfcReinforcementBarProperties;
	}

	public void setSteelGrade_of_IfcReinforcementBarProperties(IfcLabel value){
		this.SteelGrade_of_IfcReinforcementBarProperties=value;
	}

	public IfcReinforcingBarSurfaceEnum getBarSurface_of_IfcReinforcementBarProperties() {
		return BarSurface_of_IfcReinforcementBarProperties;
	}

	public void setBarSurface_of_IfcReinforcementBarProperties(IfcReinforcingBarSurfaceEnum value){
		this.BarSurface_of_IfcReinforcementBarProperties=value;
	}

	public IfcLengthMeasure getEffectiveDepth() {
		return EffectiveDepth;
	}

	public void setEffectiveDepth(IfcLengthMeasure value){
		this.EffectiveDepth=value;
	}

	public IfcPositiveLengthMeasure getNominalBarDiameter() {
		return NominalBarDiameter;
	}

	public void setNominalBarDiameter(IfcPositiveLengthMeasure value){
		this.NominalBarDiameter=value;
	}

	public IfcCountMeasure getBarCount() {
		return BarCount;
	}

	public void setBarCount(IfcCountMeasure value){
		this.BarCount=value;
	}

}
