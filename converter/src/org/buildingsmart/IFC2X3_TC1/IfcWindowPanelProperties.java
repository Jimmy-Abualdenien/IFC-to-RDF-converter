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

public class IfcWindowPanelProperties extends IfcPropertySetDefinition 
{
	// The property attributes
	private IfcWindowPanelOperationEnum OperationType_of_IfcWindowPanelProperties;
	private IfcWindowPanelPositionEnum PanelPosition_of_IfcWindowPanelProperties;
	private IfcPositiveLengthMeasure FrameDepth_of_IfcWindowPanelProperties;
	private IfcPositiveLengthMeasure FrameThickness_of_IfcWindowPanelProperties;
	private IfcShapeAspect ShapeAspectStyle_of_IfcWindowPanelProperties;


	// Getters and setters of properties
	public IfcWindowPanelOperationEnum getOperationType_of_IfcWindowPanelProperties() {
		return OperationType_of_IfcWindowPanelProperties;
	}

	public void setOperationType_of_IfcWindowPanelProperties(IfcWindowPanelOperationEnum value){
		this.OperationType_of_IfcWindowPanelProperties=value;
	}

	public IfcWindowPanelPositionEnum getPanelPosition_of_IfcWindowPanelProperties() {
		return PanelPosition_of_IfcWindowPanelProperties;
	}

	public void setPanelPosition_of_IfcWindowPanelProperties(IfcWindowPanelPositionEnum value){
		this.PanelPosition_of_IfcWindowPanelProperties=value;
	}

	public IfcPositiveLengthMeasure getFrameDepth_of_IfcWindowPanelProperties() {
		return FrameDepth_of_IfcWindowPanelProperties;
	}

	public void setFrameDepth_of_IfcWindowPanelProperties(IfcPositiveLengthMeasure value){
		this.FrameDepth_of_IfcWindowPanelProperties=value;
	}

	public IfcPositiveLengthMeasure getFrameThickness_of_IfcWindowPanelProperties() {
		return FrameThickness_of_IfcWindowPanelProperties;
	}

	public void setFrameThickness_of_IfcWindowPanelProperties(IfcPositiveLengthMeasure value){
		this.FrameThickness_of_IfcWindowPanelProperties=value;
	}

	public IfcShapeAspect getShapeAspectStyle_of_IfcWindowPanelProperties() {
		return ShapeAspectStyle_of_IfcWindowPanelProperties;
	}

	public void setShapeAspectStyle_of_IfcWindowPanelProperties(IfcShapeAspect value){
		this.ShapeAspectStyle_of_IfcWindowPanelProperties=value;
	}

}
