package fi.ni.ifc2x3;
import fi.ni.InverseLinksList;
import fi.ni.Thing;
import fi.ni.ifc2x3.interfaces.IfcDateTimeSelect;
import fi.ni.ifc2x3.interfaces.IfcMetricValueSelect;
import fi.ni.ifc2x3.interfaces.IfcObjectReferenceSelect;
import fi.ni.ifc2x3.interfaces.IfcUnit;

/*
 * IFC Java class
The GNU Affero General Public License

Copyright (C) 2014  Jyrki Oraskari

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

public class IfcTimeSeries extends Thing implements IfcMetricValueSelect, IfcObjectReferenceSelect
{
 // The property attributes
 String name;
 String description;
IfcDateTimeSelect startTime;
IfcDateTimeSelect endTime;
 String timeSeriesDataType;
 String dataOrigin;
 String userDefinedDataOrigin;
IfcUnit unit;
 // The inverse attributes

 InverseLinksList<IfcTimeSeriesReferenceRelationship> documentedBy= new InverseLinksList<IfcTimeSeriesReferenceRelationship>();


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

 public IfcDateTimeSelect getStartTime() {
   return startTime;
 }
 public void setStartTime(IfcDateTimeSelect value){
   this.startTime=value;

 }

 public IfcDateTimeSelect getEndTime() {
   return endTime;
 }
 public void setEndTime(IfcDateTimeSelect value){
   this.endTime=value;

 }

 public String getTimeSeriesDataType() {
   return timeSeriesDataType;
 }
 public void setTimeSeriesDataType(String value){
   this.timeSeriesDataType=value;

 }

 public String getDataOrigin() {
   return dataOrigin;
 }
 public void setDataOrigin(String value){
   this.dataOrigin=value;

 }

 public String getUserDefinedDataOrigin() {
   return userDefinedDataOrigin;
 }
 public void setUserDefinedDataOrigin(String value){
   this.userDefinedDataOrigin=value;

 }

 public IfcUnit getUnit() {
   return unit;
 }
 public void setUnit(IfcUnit value){
   this.unit=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcTimeSeriesReferenceRelationship> getDocumentedBy() {
   return documentedBy;

 }
 public void setDocumentedBy(IfcTimeSeriesReferenceRelationship value){
   this.documentedBy.add(value);

 }

}
