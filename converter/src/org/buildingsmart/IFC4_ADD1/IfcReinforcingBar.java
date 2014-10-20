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

public class IfcReinforcingBar extends IfcReinforcingElement 
{
	// The property attributes
	private IfcPositiveLengthMeasure NominalDiameter_of_IfcReinforcingBar;
	private IfcAreaMeasure CrossSectionArea_of_IfcReinforcingBar;
	private IfcPositiveLengthMeasure BarLength_of_IfcReinforcingBar;
	private IfcReinforcingBarTypeEnum PredefinedType_of_IfcReinforcingBar;
	private IfcReinforcingBarSurfaceEnum BarSurface_of_IfcReinforcingBar;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getNominalDiameter_of_IfcReinforcingBar() {
		return NominalDiameter_of_IfcReinforcingBar;
	}

	public void setNominalDiameter_of_IfcReinforcingBar(IfcPositiveLengthMeasure value){
		this.NominalDiameter_of_IfcReinforcingBar=value;
	}

	public IfcAreaMeasure getCrossSectionArea_of_IfcReinforcingBar() {
		return CrossSectionArea_of_IfcReinforcingBar;
	}

	public void setCrossSectionArea_of_IfcReinforcingBar(IfcAreaMeasure value){
		this.CrossSectionArea_of_IfcReinforcingBar=value;
	}

	public IfcPositiveLengthMeasure getBarLength_of_IfcReinforcingBar() {
		return BarLength_of_IfcReinforcingBar;
	}

	public void setBarLength_of_IfcReinforcingBar(IfcPositiveLengthMeasure value){
		this.BarLength_of_IfcReinforcingBar=value;
	}

	public IfcReinforcingBarTypeEnum getPredefinedType_of_IfcReinforcingBar() {
		return PredefinedType_of_IfcReinforcingBar;
	}

	public void setPredefinedType_of_IfcReinforcingBar(IfcReinforcingBarTypeEnum value){
		this.PredefinedType_of_IfcReinforcingBar=value;
	}

	public IfcReinforcingBarSurfaceEnum getBarSurface_of_IfcReinforcingBar() {
		return BarSurface_of_IfcReinforcingBar;
	}

	public void setBarSurface_of_IfcReinforcingBar(IfcReinforcingBarSurfaceEnum value){
		this.BarSurface_of_IfcReinforcingBar=value;
	}

}
