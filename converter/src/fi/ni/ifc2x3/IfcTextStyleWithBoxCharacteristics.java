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

public class IfcTextStyleWithBoxCharacteristics extends Thing implements IfcTextStyleSelect
{
 // The property attributes
 Double boxHeight;
 Double boxWidth;
 Double boxSlantAngle;
 Double boxRotateAngle;
 String characterSpacing;


 // Getters and setters of properties

 public Double getBoxHeight() {
   return boxHeight;
 }
 public void setBoxHeight(String txt){
   Double value = i.toDouble(txt);
   this.boxHeight=value;

 }

 public Double getBoxWidth() {
   return boxWidth;
 }
 public void setBoxWidth(String txt){
   Double value = i.toDouble(txt);
   this.boxWidth=value;

 }

 public Double getBoxSlantAngle() {
   return boxSlantAngle;
 }
 public void setBoxSlantAngle(String txt){
   Double value = i.toDouble(txt);
   this.boxSlantAngle=value;

 }

 public Double getBoxRotateAngle() {
   return boxRotateAngle;
 }
 public void setBoxRotateAngle(String txt){
   Double value = i.toDouble(txt);
   this.boxRotateAngle=value;

 }

 public String getCharacterSpacing() {
   return characterSpacing;
 }
 public void setCharacterSpacing(String value){
   this.characterSpacing=value;

 }

}
