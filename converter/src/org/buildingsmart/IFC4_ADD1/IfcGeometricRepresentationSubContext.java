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

public class IfcGeometricRepresentationSubContext extends IfcGeometricRepresentationContext 
{
	// The property attributes
	private IfcGeometricRepresentationContext ParentContext;
	private IfcPositiveRatioMeasure TargetScale;
	private IfcGeometricProjectionEnum TargetView;
	private IfcLabel UserDefinedTargetView;


	// Getters and setters of properties
	public IfcGeometricRepresentationContext getParentContext() {
		return ParentContext;
	}

	public void setParentContext(IfcGeometricRepresentationContext value){
		this.ParentContext=value;
	}

	public IfcPositiveRatioMeasure getTargetScale() {
		return TargetScale;
	}

	public void setTargetScale(IfcPositiveRatioMeasure value){
		this.TargetScale=value;
	}

	public IfcGeometricProjectionEnum getTargetView() {
		return TargetView;
	}

	public void setTargetView(IfcGeometricProjectionEnum value){
		this.TargetView=value;
	}

	public IfcLabel getUserDefinedTargetView() {
		return UserDefinedTargetView;
	}

	public void setUserDefinedTargetView(IfcLabel value){
		this.UserDefinedTargetView=value;
	}

}
