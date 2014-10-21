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

public class IfcObjective extends IfcConstraint 
{
	// The property attributes
	private IfcMetric BenchmarkValues;
	private IfcMetric ResultValues;
	private IfcObjectiveEnum ObjectiveQualifier;
	private IfcLabel UserDefinedQualifier;


	// Getters and setters of properties
	public IfcMetric getBenchmarkValues() {
		return BenchmarkValues;
	}

	public void setBenchmarkValues(IfcMetric value){
		this.BenchmarkValues=value;
	}

	public IfcMetric getResultValues() {
		return ResultValues;
	}

	public void setResultValues(IfcMetric value){
		this.ResultValues=value;
	}

	public IfcObjectiveEnum getObjectiveQualifier() {
		return ObjectiveQualifier;
	}

	public void setObjectiveQualifier(IfcObjectiveEnum value){
		this.ObjectiveQualifier=value;
	}

	public IfcLabel getUserDefinedQualifier() {
		return UserDefinedQualifier;
	}

	public void setUserDefinedQualifier(IfcLabel value){
		this.UserDefinedQualifier=value;
	}

}
