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

public class IfcRelConnectsStructuralMember extends IfcRelConnects 
{
	// The property attributes
	private IfcStructuralMember RelatingStructuralMember;
	private IfcStructuralConnection RelatedStructuralConnection;
	private IfcBoundaryCondition AppliedCondition_of_IfcRelConnectsStructuralMember;
	private IfcStructuralConnectionCondition AdditionalConditions;
	private IfcLengthMeasure SupportedLength;
	private IfcAxis2Placement3D ConditionCoordinateSystem_of_IfcRelConnectsStructuralMember;


	// Getters and setters of properties
	public IfcStructuralMember getRelatingStructuralMember() {
		return RelatingStructuralMember;
	}

	public void setRelatingStructuralMember(IfcStructuralMember value){
		this.RelatingStructuralMember=value;
	}

	public IfcStructuralConnection getRelatedStructuralConnection() {
		return RelatedStructuralConnection;
	}

	public void setRelatedStructuralConnection(IfcStructuralConnection value){
		this.RelatedStructuralConnection=value;
	}

	public IfcBoundaryCondition getAppliedCondition_of_IfcRelConnectsStructuralMember() {
		return AppliedCondition_of_IfcRelConnectsStructuralMember;
	}

	public void setAppliedCondition_of_IfcRelConnectsStructuralMember(IfcBoundaryCondition value){
		this.AppliedCondition_of_IfcRelConnectsStructuralMember=value;
	}

	public IfcStructuralConnectionCondition getAdditionalConditions() {
		return AdditionalConditions;
	}

	public void setAdditionalConditions(IfcStructuralConnectionCondition value){
		this.AdditionalConditions=value;
	}

	public IfcLengthMeasure getSupportedLength() {
		return SupportedLength;
	}

	public void setSupportedLength(IfcLengthMeasure value){
		this.SupportedLength=value;
	}

	public IfcAxis2Placement3D getConditionCoordinateSystem_of_IfcRelConnectsStructuralMember() {
		return ConditionCoordinateSystem_of_IfcRelConnectsStructuralMember;
	}

	public void setConditionCoordinateSystem_of_IfcRelConnectsStructuralMember(IfcAxis2Placement3D value){
		this.ConditionCoordinateSystem_of_IfcRelConnectsStructuralMember=value;
	}

}
