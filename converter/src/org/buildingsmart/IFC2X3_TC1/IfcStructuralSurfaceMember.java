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

public class IfcStructuralSurfaceMember extends IfcStructuralMember 
{
	// The property attributes
	private IfcStructuralSurfaceTypeEnum PredefinedType_of_IfcStructuralSurfaceMember;
	private IfcPositiveLengthMeasure Thickness_of_IfcStructuralSurfaceMember;


	// Getters and setters of properties
	public IfcStructuralSurfaceTypeEnum getPredefinedType_of_IfcStructuralSurfaceMember() {
		return PredefinedType_of_IfcStructuralSurfaceMember;
	}

	public void setPredefinedType_of_IfcStructuralSurfaceMember(IfcStructuralSurfaceTypeEnum value){
		this.PredefinedType_of_IfcStructuralSurfaceMember=value;
	}

	public IfcPositiveLengthMeasure getThickness_of_IfcStructuralSurfaceMember() {
		return Thickness_of_IfcStructuralSurfaceMember;
	}

	public void setThickness_of_IfcStructuralSurfaceMember(IfcPositiveLengthMeasure value){
		this.Thickness_of_IfcStructuralSurfaceMember=value;
	}

}
