package fi.ni.ifc2x3;
import fi.ni.ifc2x3.interfaces.*;
import fi.ni.*;
import java.util.*;

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

public class IfcCalendarDate extends Thing implements IfcDateTimeSelect, IfcObjectReferenceSelect
{
 // The property attributes
 Long dayComponent;
 Long monthComponent;
 Long yearComponent;


 // Getters and setters of properties

 public Long getDayComponent() {
   return dayComponent;
 }
 public void setDayComponent(String txt){
   Long value = i.toLong(txt);
   this.dayComponent=value;

 }

 public Long getMonthComponent() {
   return monthComponent;
 }
 public void setMonthComponent(String txt){
   Long value = i.toLong(txt);
   this.monthComponent=value;

 }

 public Long getYearComponent() {
   return yearComponent;
 }
 public void setYearComponent(String txt){
   Long value = i.toLong(txt);
   this.yearComponent=value;

 }

}
