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

public class IfcDoorPanelProperties extends IfcPropertySetDefinition 
{
	// The property attributes
	private IfcPositiveLengthMeasure PanelDepth;
	private IfcDoorPanelOperationEnum PanelOperation;
	private IfcNormalisedRatioMeasure PanelWidth;
	private IfcDoorPanelPositionEnum PanelPosition_of_IfcDoorPanelProperties;
	private IfcShapeAspect ShapeAspectStyle_of_IfcDoorPanelProperties;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getPanelDepth() {
		return PanelDepth;
	}

	public void setPanelDepth(IfcPositiveLengthMeasure value){
		this.PanelDepth=value;
	}

	public IfcDoorPanelOperationEnum getPanelOperation() {
		return PanelOperation;
	}

	public void setPanelOperation(IfcDoorPanelOperationEnum value){
		this.PanelOperation=value;
	}

	public IfcNormalisedRatioMeasure getPanelWidth() {
		return PanelWidth;
	}

	public void setPanelWidth(IfcNormalisedRatioMeasure value){
		this.PanelWidth=value;
	}

	public IfcDoorPanelPositionEnum getPanelPosition_of_IfcDoorPanelProperties() {
		return PanelPosition_of_IfcDoorPanelProperties;
	}

	public void setPanelPosition_of_IfcDoorPanelProperties(IfcDoorPanelPositionEnum value){
		this.PanelPosition_of_IfcDoorPanelProperties=value;
	}

	public IfcShapeAspect getShapeAspectStyle_of_IfcDoorPanelProperties() {
		return ShapeAspectStyle_of_IfcDoorPanelProperties;
	}

	public void setShapeAspectStyle_of_IfcDoorPanelProperties(IfcShapeAspect value){
		this.ShapeAspectStyle_of_IfcDoorPanelProperties=value;
	}

}
