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

public class IfcStructuralResultGroup extends IfcGroup 
{
	// The property attributes
	private IfcAnalysisTheoryTypeEnum TheoryType;
	private IfcStructuralLoadGroup ResultForLoadGroup;
	private Boolean IsLinear;
 // The inverse attributes

	private List<IfcStructuralAnalysisModel> ResultGroupFor= new ArrayList<IfcStructuralAnalysisModel>();


	// Getters and setters of properties
	public IfcAnalysisTheoryTypeEnum getTheoryType() {
		return TheoryType;
	}

	public void setTheoryType(IfcAnalysisTheoryTypeEnum value){
		this.TheoryType=value;
	}

	public IfcStructuralLoadGroup getResultForLoadGroup() {
		return ResultForLoadGroup;
	}

	public void setResultForLoadGroup(IfcStructuralLoadGroup value){
		this.ResultForLoadGroup=value;
	}

	public Boolean getIsLinear() {
		return IsLinear;
	}

	public void setIsLinear(Boolean value){
		this.IsLinear=value;
	}

	// Getters and setters of inverse values

	public List<IfcStructuralAnalysisModel> getResultGroupFor() {
		return ResultGroupFor;
	}

	public void setResultGroupFor(IfcStructuralAnalysisModel value){
		this.ResultGroupFor.add(value);
	}

}
