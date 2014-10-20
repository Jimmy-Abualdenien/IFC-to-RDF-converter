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

public class IfcPermeableCoveringProperties extends IfcPreDefinedPropertySet 
{
	// The property attributes
	private IfcPermeableCoveringOperationEnum OperationType_of_IfcPermeableCoveringProperties;
	private IfcWindowPanelPositionEnum PanelPosition_of_IfcPermeableCoveringProperties;
	private IfcPositiveLengthMeasure FrameDepth_of_IfcPermeableCoveringProperties;
	private IfcPositiveLengthMeasure FrameThickness_of_IfcPermeableCoveringProperties;
	private IfcShapeAspect ShapeAspectStyle_of_IfcPermeableCoveringProperties;


	// Getters and setters of properties
	public IfcPermeableCoveringOperationEnum getOperationType_of_IfcPermeableCoveringProperties() {
		return OperationType_of_IfcPermeableCoveringProperties;
	}

	public void setOperationType_of_IfcPermeableCoveringProperties(IfcPermeableCoveringOperationEnum value){
		this.OperationType_of_IfcPermeableCoveringProperties=value;
	}

	public IfcWindowPanelPositionEnum getPanelPosition_of_IfcPermeableCoveringProperties() {
		return PanelPosition_of_IfcPermeableCoveringProperties;
	}

	public void setPanelPosition_of_IfcPermeableCoveringProperties(IfcWindowPanelPositionEnum value){
		this.PanelPosition_of_IfcPermeableCoveringProperties=value;
	}

	public IfcPositiveLengthMeasure getFrameDepth_of_IfcPermeableCoveringProperties() {
		return FrameDepth_of_IfcPermeableCoveringProperties;
	}

	public void setFrameDepth_of_IfcPermeableCoveringProperties(IfcPositiveLengthMeasure value){
		this.FrameDepth_of_IfcPermeableCoveringProperties=value;
	}

	public IfcPositiveLengthMeasure getFrameThickness_of_IfcPermeableCoveringProperties() {
		return FrameThickness_of_IfcPermeableCoveringProperties;
	}

	public void setFrameThickness_of_IfcPermeableCoveringProperties(IfcPositiveLengthMeasure value){
		this.FrameThickness_of_IfcPermeableCoveringProperties=value;
	}

	public IfcShapeAspect getShapeAspectStyle_of_IfcPermeableCoveringProperties() {
		return ShapeAspectStyle_of_IfcPermeableCoveringProperties;
	}

	public void setShapeAspectStyle_of_IfcPermeableCoveringProperties(IfcShapeAspect value){
		this.ShapeAspectStyle_of_IfcPermeableCoveringProperties=value;
	}

}
