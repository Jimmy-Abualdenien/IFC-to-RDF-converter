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

public class IfcTimeSeries extends Thing implements IfcObjectReferenceSelect, IfcResourceObjectSelect, IfcMetricValueSelect
{
	// The property attributes
	private IfcLabel Name_of_IfcTimeSeries;
	private IfcText Description_of_IfcTimeSeries;
	private IfcDateTime StartTime_of_IfcTimeSeries;
	private IfcDateTime EndTime_of_IfcTimeSeries;
	private IfcTimeSeriesDataTypeEnum TimeSeriesDataType;
	private IfcDataOriginEnum DataOrigin_of_IfcTimeSeries;
	private IfcLabel UserDefinedDataOrigin_of_IfcTimeSeries;
	private IfcUnit Unit_of_IfcTimeSeries;
 // The inverse attributes

	private List<IfcExternalReferenceRelationship> HasExternalReference= new ArrayList<IfcExternalReferenceRelationship>();


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

	public IfcDateTime getStartTime_of_IfcTimeSeries() {
		return StartTime_of_IfcTimeSeries;
	}

	public void setStartTime_of_IfcTimeSeries(IfcDateTime value){
		this.StartTime_of_IfcTimeSeries=value;
	}

	public IfcDateTime getEndTime_of_IfcTimeSeries() {
		return EndTime_of_IfcTimeSeries;
	}

	public void setEndTime_of_IfcTimeSeries(IfcDateTime value){
		this.EndTime_of_IfcTimeSeries=value;
	}

	public IfcTimeSeriesDataTypeEnum getTimeSeriesDataType() {
		return TimeSeriesDataType;
	}

	public void setTimeSeriesDataType(IfcTimeSeriesDataTypeEnum value){
		this.TimeSeriesDataType=value;
	}

	public IfcDataOriginEnum getDataOrigin_of_IfcTimeSeries() {
		return DataOrigin_of_IfcTimeSeries;
	}

	public void setDataOrigin_of_IfcTimeSeries(IfcDataOriginEnum value){
		this.DataOrigin_of_IfcTimeSeries=value;
	}

	public IfcLabel getUserDefinedDataOrigin_of_IfcTimeSeries() {
		return UserDefinedDataOrigin_of_IfcTimeSeries;
	}

	public void setUserDefinedDataOrigin_of_IfcTimeSeries(IfcLabel value){
		this.UserDefinedDataOrigin_of_IfcTimeSeries=value;
	}

	public IfcUnit getUnit_of_IfcTimeSeries() {
		return Unit_of_IfcTimeSeries;
	}

	public void setUnit_of_IfcTimeSeries(IfcUnit value){
		this.Unit_of_IfcTimeSeries=value;
	}

	// Getters and setters of inverse values

	public List<IfcExternalReferenceRelationship> getHasExternalReference() {
		return HasExternalReference;
	}

	public void setHasExternalReference(IfcExternalReferenceRelationship value){
		this.HasExternalReference.add(value);
	}

}
