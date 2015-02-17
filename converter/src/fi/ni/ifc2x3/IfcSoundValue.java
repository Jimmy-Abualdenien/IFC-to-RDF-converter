package fi.ni.ifc2x3;

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

public class IfcSoundValue extends IfcPropertySetDefinition 
{
 // The property attributes
 IfcTimeSeries   soundLevelTimeSeries;
 Double frequency;
 String soundLevelSingleValue;


 // Getters and setters of properties

 public IfcTimeSeries getSoundLevelTimeSeries() {
   return soundLevelTimeSeries;

 }
 public void setSoundLevelTimeSeries(IfcTimeSeries value){
   this.soundLevelTimeSeries=value;

 }

 public Double getFrequency() {
   return frequency;
 }
 public void setFrequency(String txt){
   Double value = i.toDouble(txt);
   this.frequency=value;

 }

 public String getSoundLevelSingleValue() {
   return soundLevelSingleValue;
 }
 public void setSoundLevelSingleValue(String value){
   this.soundLevelSingleValue=value;

 }

}
