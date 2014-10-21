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

public class IfcStructuralLoadGroup extends IfcGroup 
{
	// The property attributes
	private IfcLoadGroupTypeEnum PredefinedType_of_IfcStructuralLoadGroup;
	private IfcActionTypeEnum ActionType;
	private IfcActionSourceTypeEnum ActionSource;
	private IfcRatioMeasure Coefficient;
	private IfcLabel Purpose_of_IfcStructuralLoadGroup;
 // The inverse attributes

	private List<IfcStructuralResultGroup> SourceOfResultGroup= new ArrayList<IfcStructuralResultGroup>();
	private List<IfcStructuralAnalysisModel> LoadGroupFor= new ArrayList<IfcStructuralAnalysisModel>();


	// Getters and setters of properties
	public IfcLoadGroupTypeEnum getPredefinedType_of_IfcStructuralLoadGroup() {
		return PredefinedType_of_IfcStructuralLoadGroup;
	}

	public void setPredefinedType_of_IfcStructuralLoadGroup(IfcLoadGroupTypeEnum value){
		this.PredefinedType_of_IfcStructuralLoadGroup=value;
	}

	public IfcActionTypeEnum getActionType() {
		return ActionType;
	}

	public void setActionType(IfcActionTypeEnum value){
		this.ActionType=value;
	}

	public IfcActionSourceTypeEnum getActionSource() {
		return ActionSource;
	}

	public void setActionSource(IfcActionSourceTypeEnum value){
		this.ActionSource=value;
	}

	public IfcRatioMeasure getCoefficient() {
		return Coefficient;
	}

	public void setCoefficient(IfcRatioMeasure value){
		this.Coefficient=value;
	}

	public IfcLabel getPurpose_of_IfcStructuralLoadGroup() {
		return Purpose_of_IfcStructuralLoadGroup;
	}

	public void setPurpose_of_IfcStructuralLoadGroup(IfcLabel value){
		this.Purpose_of_IfcStructuralLoadGroup=value;
	}

	// Getters and setters of inverse values

	public List<IfcStructuralResultGroup> getSourceOfResultGroup() {
		return SourceOfResultGroup;
	}

	public void setSourceOfResultGroup(IfcStructuralResultGroup value){
		this.SourceOfResultGroup.add(value);
	}

	public List<IfcStructuralAnalysisModel> getLoadGroupFor() {
		return LoadGroupFor;
	}

	public void setLoadGroupFor(IfcStructuralAnalysisModel value){
		this.LoadGroupFor.add(value);
	}

}
