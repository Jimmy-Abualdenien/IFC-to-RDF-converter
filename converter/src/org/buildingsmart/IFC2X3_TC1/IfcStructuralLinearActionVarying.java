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

public class IfcStructuralLinearActionVarying extends IfcStructuralLinearAction 
{
	// The property attributes
	private IfcShapeAspect VaryingAppliedLoadLocation_of_IfcStructuralLinearActionVarying;
	private List<IfcStructuralLoad> SubsequentAppliedLoads_of_IfcStructuralLinearActionVarying = new ArrayList<IfcStructuralLoad>();


	// Getters and setters of properties
	public IfcShapeAspect getVaryingAppliedLoadLocation_of_IfcStructuralLinearActionVarying() {
		return VaryingAppliedLoadLocation_of_IfcStructuralLinearActionVarying;
	}

	public void setVaryingAppliedLoadLocation_of_IfcStructuralLinearActionVarying(IfcShapeAspect value){
		this.VaryingAppliedLoadLocation_of_IfcStructuralLinearActionVarying=value;
	}

	public List<IfcStructuralLoad> getSubsequentAppliedLoads_of_IfcStructuralLinearActionVarying() {
		return SubsequentAppliedLoads_of_IfcStructuralLinearActionVarying;
	}

	public void setSubsequentAppliedLoads_of_IfcStructuralLinearActionVarying(IfcStructuralLoad value){
		this.SubsequentAppliedLoads_of_IfcStructuralLinearActionVarying.add(value);
	}

}
