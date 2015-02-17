package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcList;
import fi.ni.ifc2x3.interfaces.IfcDateTimeSelect;

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

public class IfcTimeSeriesSchedule extends IfcControl 
{
 // The property attributes
 List<IfcDateTimeSelect> applicableDates = new IfcList<IfcDateTimeSelect>();
 String timeSeriesScheduleType;
 IfcTimeSeries   timeSeries;


 // Getters and setters of properties

 public List<IfcDateTimeSelect> getApplicableDates() {
   return applicableDates;
 }
 public void setApplicableDates(IfcDateTimeSelect value){
   this.applicableDates.add(value);

 }

 public String getTimeSeriesScheduleType() {
   return timeSeriesScheduleType;
 }
 public void setTimeSeriesScheduleType(String value){
   this.timeSeriesScheduleType=value;

 }

 public IfcTimeSeries getTimeSeries() {
   return timeSeries;

 }
 public void setTimeSeries(IfcTimeSeries value){
   this.timeSeries=value;

 }

}
