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

public class IfcReinforcingBarType extends IfcReinforcingElementType 
{
	// The property attributes
	private IfcReinforcingBarTypeEnum PredefinedType_of_IfcReinforcingBarType;
	private IfcPositiveLengthMeasure NominalDiameter_of_IfcReinforcingBarType;
	private IfcAreaMeasure CrossSectionArea_of_IfcReinforcingBarType;
	private IfcPositiveLengthMeasure BarLength_of_IfcReinforcingBarType;
	private IfcReinforcingBarSurfaceEnum BarSurface_of_IfcReinforcingBarType;
	private IfcLabel BendingShapeCode_of_IfcReinforcingBarType;
	private List<IfcBendingParameterSelect> BendingParameters_of_IfcReinforcingBarType = new ArrayList<IfcBendingParameterSelect>();


	// Getters and setters of properties
	public IfcReinforcingBarTypeEnum getPredefinedType_of_IfcReinforcingBarType() {
		return PredefinedType_of_IfcReinforcingBarType;
	}

	public void setPredefinedType_of_IfcReinforcingBarType(IfcReinforcingBarTypeEnum value){
		this.PredefinedType_of_IfcReinforcingBarType=value;
	}

	public IfcPositiveLengthMeasure getNominalDiameter_of_IfcReinforcingBarType() {
		return NominalDiameter_of_IfcReinforcingBarType;
	}

	public void setNominalDiameter_of_IfcReinforcingBarType(IfcPositiveLengthMeasure value){
		this.NominalDiameter_of_IfcReinforcingBarType=value;
	}

	public IfcAreaMeasure getCrossSectionArea_of_IfcReinforcingBarType() {
		return CrossSectionArea_of_IfcReinforcingBarType;
	}

	public void setCrossSectionArea_of_IfcReinforcingBarType(IfcAreaMeasure value){
		this.CrossSectionArea_of_IfcReinforcingBarType=value;
	}

	public IfcPositiveLengthMeasure getBarLength_of_IfcReinforcingBarType() {
		return BarLength_of_IfcReinforcingBarType;
	}

	public void setBarLength_of_IfcReinforcingBarType(IfcPositiveLengthMeasure value){
		this.BarLength_of_IfcReinforcingBarType=value;
	}

	public IfcReinforcingBarSurfaceEnum getBarSurface_of_IfcReinforcingBarType() {
		return BarSurface_of_IfcReinforcingBarType;
	}

	public void setBarSurface_of_IfcReinforcingBarType(IfcReinforcingBarSurfaceEnum value){
		this.BarSurface_of_IfcReinforcingBarType=value;
	}

	public IfcLabel getBendingShapeCode_of_IfcReinforcingBarType() {
		return BendingShapeCode_of_IfcReinforcingBarType;
	}

	public void setBendingShapeCode_of_IfcReinforcingBarType(IfcLabel value){
		this.BendingShapeCode_of_IfcReinforcingBarType=value;
	}

	public List<IfcBendingParameterSelect> getBendingParameters_of_IfcReinforcingBarType() {
		return BendingParameters_of_IfcReinforcingBarType;
	}

	public void setBendingParameters_of_IfcReinforcingBarType(IfcBendingParameterSelect value){
		this.BendingParameters_of_IfcReinforcingBarType.add(value);
	}

}
