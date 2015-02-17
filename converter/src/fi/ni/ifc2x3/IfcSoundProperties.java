package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcList;

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

public class IfcSoundProperties extends IfcPropertySetDefinition 
{
 // The property attributes
 String isAttenuating;
 String soundScale;
 List<IfcSoundValue> soundValues = new IfcList<IfcSoundValue>();


 // Getters and setters of properties

 public String getIsAttenuating() {
   return isAttenuating;
 }
 public void setIsAttenuating(String value){
   this.isAttenuating=value;

 }

 public String getSoundScale() {
   return soundScale;
 }
 public void setSoundScale(String value){
   this.soundScale=value;

 }

 public List<IfcSoundValue> getSoundValues() {
   return soundValues;

 }
 public void setSoundValues(IfcSoundValue value){
   this.soundValues.add(value);

 }

}
