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

public class IfcDoorLiningProperties extends IfcPropertySetDefinition 
{
 // The property attributes
 Double liningDepth;
 Double liningThickness;
 Double thresholdDepth;
 Double thresholdThickness;
 Double transomThickness;
 Double transomOffset;
 Double liningOffset;
 Double thresholdOffset;
 Double casingThickness;
 Double casingDepth;
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

 public Double getThresholdDepth() {
   return thresholdDepth;
 }
 public void setThresholdDepth(String txt){
   Double value = i.toDouble(txt);
   this.thresholdDepth=value;

 }

 public Double getThresholdThickness() {
   return thresholdThickness;
 }
 public void setThresholdThickness(String txt){
   Double value = i.toDouble(txt);
   this.thresholdThickness=value;

 }

 public Double getTransomThickness() {
   return transomThickness;
 }
 public void setTransomThickness(String txt){
   Double value = i.toDouble(txt);
   this.transomThickness=value;

 }

 public Double getTransomOffset() {
   return transomOffset;
 }
 public void setTransomOffset(String txt){
   Double value = i.toDouble(txt);
   this.transomOffset=value;

 }

 public Double getLiningOffset() {
   return liningOffset;
 }
 public void setLiningOffset(String txt){
   Double value = i.toDouble(txt);
   this.liningOffset=value;

 }

 public Double getThresholdOffset() {
   return thresholdOffset;
 }
 public void setThresholdOffset(String txt){
   Double value = i.toDouble(txt);
   this.thresholdOffset=value;

 }

 public Double getCasingThickness() {
   return casingThickness;
 }
 public void setCasingThickness(String txt){
   Double value = i.toDouble(txt);
   this.casingThickness=value;

 }

 public Double getCasingDepth() {
   return casingDepth;
 }
 public void setCasingDepth(String txt){
   Double value = i.toDouble(txt);
   this.casingDepth=value;

 }

 public IfcShapeAspect getShapeAspectStyle() {
   return shapeAspectStyle;

 }
 public void setShapeAspectStyle(IfcShapeAspect value){
   this.shapeAspectStyle=value;

 }

}
