package fi.ni.ifc2x3;
import fi.ni.Thing;
import fi.ni.ifc2x3.interfaces.IfcDateTimeSelect;
import fi.ni.ifc2x3.interfaces.IfcObjectReferenceSelect;

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

public class IfcLocalTime extends Thing implements IfcDateTimeSelect, IfcObjectReferenceSelect
{
 // The property attributes
 Long hourComponent;
 Long minuteComponent;
 Double secondComponent;
 IfcCoordinatedUniversalTimeOffset   zone;
 Long daylightSavingOffset;


 // Getters and setters of properties

 public Long getHourComponent() {
   return hourComponent;
 }
 public void setHourComponent(String txt){
   Long value = i.toLong(txt);
   this.hourComponent=value;

 }

 public Long getMinuteComponent() {
   return minuteComponent;
 }
 public void setMinuteComponent(String txt){
   Long value = i.toLong(txt);
   this.minuteComponent=value;

 }

 public Double getSecondComponent() {
   return secondComponent;
 }
 public void setSecondComponent(String txt){
   Double value = i.toDouble(txt);
   this.secondComponent=value;

 }

 public IfcCoordinatedUniversalTimeOffset getZone() {
   return zone;

 }
 public void setZone(IfcCoordinatedUniversalTimeOffset value){
   this.zone=value;

 }

 public Long getDaylightSavingOffset() {
   return daylightSavingOffset;
 }
 public void setDaylightSavingOffset(String txt){
   Long value = i.toLong(txt);
   this.daylightSavingOffset=value;

 }

}
