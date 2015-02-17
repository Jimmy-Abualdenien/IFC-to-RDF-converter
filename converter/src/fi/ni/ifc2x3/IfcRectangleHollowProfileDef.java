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

public class IfcRectangleHollowProfileDef extends IfcRectangleProfileDef 
{
 // The property attributes
 Double wallThickness;
 Double innerFilletRadius;
 Double outerFilletRadius;


 // Getters and setters of properties

 public Double getWallThickness() {
   return wallThickness;
 }
 public void setWallThickness(String txt){
   Double value = i.toDouble(txt);
   this.wallThickness=value;

 }

 public Double getInnerFilletRadius() {
   return innerFilletRadius;
 }
 public void setInnerFilletRadius(String txt){
   Double value = i.toDouble(txt);
   this.innerFilletRadius=value;

 }

 public Double getOuterFilletRadius() {
   return outerFilletRadius;
 }
 public void setOuterFilletRadius(String txt){
   Double value = i.toDouble(txt);
   this.outerFilletRadius=value;

 }

}
