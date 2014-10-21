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

public class IfcTimeSeries extends Thing implements IfcMetricValueSelect, IfcObjectReferenceSelect
{
	// The property attributes
	private IfcLabel Name_of_IfcTimeSeries;
	private IfcText Description_of_IfcTimeSeries;
	private IfcDateTimeSelect StartTime_of_IfcTimeSeries;
	private IfcDateTimeSelect EndTime;
	private IfcTimeSeriesDataTypeEnum TimeSeriesDataType;
	private IfcDataOriginEnum DataOrigin;
	private IfcLabel UserDefinedDataOrigin;
	private IfcUnit Unit_of_IfcTimeSeries;
 // The inverse attributes

	private List<IfcTimeSeriesReferenceRelationship> DocumentedBy= new ArrayList<IfcTimeSeriesReferenceRelationship>();


	// Getters and setters of properties
	public IfcLabel getName_of_IfcTimeSeries() {
		return Name_of_IfcTimeSeries;
	}

	public void setName_of_IfcTimeSeries(IfcLabel value){
		this.Name_of_IfcTimeSeries=value;
	}

	public IfcText getDescription_of_IfcTimeSeries() {
		return Description_of_IfcTimeSeries;
	}

	public void setDescription_of_IfcTimeSeries(IfcText value){
		this.Description_of_IfcTimeSeries=value;
	}

	public IfcDateTimeSelect getStartTime_of_IfcTimeSeries() {
		return StartTime_of_IfcTimeSeries;
	}

	public void setStartTime_of_IfcTimeSeries(IfcDateTimeSelect value){
		this.StartTime_of_IfcTimeSeries=value;
	}

	public IfcDateTimeSelect getEndTime() {
		return EndTime;
	}

	public void setEndTime(IfcDateTimeSelect value){
		this.EndTime=value;
	}

	public IfcTimeSeriesDataTypeEnum getTimeSeriesDataType() {
		return TimeSeriesDataType;
	}

	public void setTimeSeriesDataType(IfcTimeSeriesDataTypeEnum value){
		this.TimeSeriesDataType=value;
	}

	public IfcDataOriginEnum getDataOrigin() {
		return DataOrigin;
	}

	public void setDataOrigin(IfcDataOriginEnum value){
		this.DataOrigin=value;
	}

	public IfcLabel getUserDefinedDataOrigin() {
		return UserDefinedDataOrigin;
	}

	public void setUserDefinedDataOrigin(IfcLabel value){
		this.UserDefinedDataOrigin=value;
	}

	public IfcUnit getUnit_of_IfcTimeSeries() {
		return Unit_of_IfcTimeSeries;
	}

	public void setUnit_of_IfcTimeSeries(IfcUnit value){
		this.Unit_of_IfcTimeSeries=value;
	}

	// Getters and setters of inverse values

	public List<IfcTimeSeriesReferenceRelationship> getDocumentedBy() {
		return DocumentedBy;
	}

	public void setDocumentedBy(IfcTimeSeriesReferenceRelationship value){
		this.DocumentedBy.add(value);
	}

}
