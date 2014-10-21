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

public class IfcStructuralAnalysisModel extends IfcSystem 
{
	// The property attributes
	private IfcAnalysisModelTypeEnum PredefinedType_of_IfcStructuralAnalysisModel;
	private IfcAxis2Placement3D OrientationOf2DPlane;
	private List<IfcStructuralLoadGroup> LoadedBy = new ArrayList<IfcStructuralLoadGroup>();
	private List<IfcStructuralResultGroup> HasResults = new ArrayList<IfcStructuralResultGroup>();


	// Getters and setters of properties
	public IfcAnalysisModelTypeEnum getPredefinedType_of_IfcStructuralAnalysisModel() {
		return PredefinedType_of_IfcStructuralAnalysisModel;
	}

	public void setPredefinedType_of_IfcStructuralAnalysisModel(IfcAnalysisModelTypeEnum value){
		this.PredefinedType_of_IfcStructuralAnalysisModel=value;
	}

	public IfcAxis2Placement3D getOrientationOf2DPlane() {
		return OrientationOf2DPlane;
	}

	public void setOrientationOf2DPlane(IfcAxis2Placement3D value){
		this.OrientationOf2DPlane=value;
	}

	public List<IfcStructuralLoadGroup> getLoadedBy() {
		return LoadedBy;
	}

	public void setLoadedBy(IfcStructuralLoadGroup value){
		this.LoadedBy.add(value);
	}

	public List<IfcStructuralResultGroup> getHasResults() {
		return HasResults;
	}

	public void setHasResults(IfcStructuralResultGroup value){
		this.HasResults.add(value);
	}

}
