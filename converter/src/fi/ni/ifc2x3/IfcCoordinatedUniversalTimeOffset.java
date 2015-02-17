package fi.ni.ifc2x3;
import fi.ni.Thing;

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

public class IfcCoordinatedUniversalTimeOffset extends Thing 
{
 // The property attributes
 Long hourOffset;
 Long minuteOffset;
 String sense;


 // Getters and setters of properties

 public Long getHourOffset() {
   return hourOffset;
 }
 public void setHourOffset(String txt){
   Long value = i.toLong(txt);
   this.hourOffset=value;

 }

 public Long getMinuteOffset() {
   return minuteOffset;
 }
 public void setMinuteOffset(String txt){
   Long value = i.toLong(txt);
   this.minuteOffset=value;

 }

 public String getSense() {
   return sense;
 }
 public void setSense(String value){
   this.sense=value;

 }

}
