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

public class IfcWindowLiningProperties extends IfcPropertySetDefinition 
{
 // The property attributes
 Double liningDepth;
 Double liningThickness;
 Double transomThickness;
 Double mullionThickness;
 Double firstTransomOffset;
 Double secondTransomOffset;
 Double firstMullionOffset;
 Double secondMullionOffset;
 IfcShapeAspect   shapeAspectStyle;


 // Getters and setters of properties

 public Double getLiningDepth() {
   return liningDepth;
 }
 public void setLiningDepth(String txt){
   Double value = i.toDouble(txt);
   this.liningDepth=value;

 }

 public Double getLiningThickness() {
   return liningThickness;
 }
 public void setLiningThickness(String txt){
   Double value = i.toDouble(txt);
   this.liningThickness=value;

 }

 public Double getTransomThickness() {
   return transomThickness;
 }
 public void setTransomThickness(String txt){
   Double value = i.toDouble(txt);
   this.transomThickness=value;

 }

 public Double getMullionThickness() {
   return mullionThickness;
 }
 public void setMullionThickness(String txt){
   Double value = i.toDouble(txt);
   this.mullionThickness=value;

 }

 public Double getFirstTransomOffset() {
   return firstTransomOffset;
 }
 public void setFirstTransomOffset(String txt){
   Double value = i.toDouble(txt);
   this.firstTransomOffset=value;

 }

 public Double getSecondTransomOffset() {
   return secondTransomOffset;
 }
 public void setSecondTransomOffset(String txt){
   Double value = i.toDouble(txt);
   this.secondTransomOffset=value;

 }

 public Double getFirstMullionOffset() {
   return firstMullionOffset;
 }
 public void setFirstMullionOffset(String txt){
   Double value = i.toDouble(txt);
   this.firstMullionOffset=value;

 }

 public Double getSecondMullionOffset() {
   return secondMullionOffset;
 }
 public void setSecondMullionOffset(String txt){
   Double value = i.toDouble(txt);
   this.secondMullionOffset=value;

 }

 public IfcShapeAspect getShapeAspectStyle() {
   return shapeAspectStyle;

 }
 public void setShapeAspectStyle(IfcShapeAspect value){
   this.shapeAspectStyle=value;

 }

}
