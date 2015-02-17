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

public class IfcRibPlateProfileProperties extends IfcProfileProperties 
{
 // The property attributes
 Double thickness;
 Double ribHeight;
 Double ribWidth;
 Double ribSpacing;
 String direction;


 // Getters and setters of properties

 public Double getThickness() {
   return thickness;
 }
 public void setThickness(String txt){
   Double value = i.toDouble(txt);
   this.thickness=value;

 }

 public Double getRibHeight() {
   return ribHeight;
 }
 public void setRibHeight(String txt){
   Double value = i.toDouble(txt);
   this.ribHeight=value;

 }

 public Double getRibWidth() {
   return ribWidth;
 }
 public void setRibWidth(String txt){
   Double value = i.toDouble(txt);
   this.ribWidth=value;

 }

 public Double getRibSpacing() {
   return ribSpacing;
 }
 public void setRibSpacing(String txt){
   Double value = i.toDouble(txt);
   this.ribSpacing=value;

 }

 public String getDirection() {
   return direction;
 }
 public void setDirection(String value){
   this.direction=value;

 }

}
