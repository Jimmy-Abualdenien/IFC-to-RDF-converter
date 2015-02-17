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

public class IfcTShapeProfileDef extends IfcParameterizedProfileDef 
{
 // The property attributes
 Double depth;
 Double flangeWidth;
 Double webThickness;
 Double flangeThickness;
 Double filletRadius;
 Double flangeEdgeRadius;
 Double webEdgeRadius;
 Double webSlope;
 Double flangeSlope;
 Double centreOfGravityInY;


 // Getters and setters of properties

 public Double getDepth() {
   return depth;
 }
 public void setDepth(String txt){
   Double value = i.toDouble(txt);
   this.depth=value;

 }

 public Double getFlangeWidth() {
   return flangeWidth;
 }
 public void setFlangeWidth(String txt){
   Double value = i.toDouble(txt);
   this.flangeWidth=value;

 }

 public Double getWebThickness() {
   return webThickness;
 }
 public void setWebThickness(String txt){
   Double value = i.toDouble(txt);
   this.webThickness=value;

 }

 public Double getFlangeThickness() {
   return flangeThickness;
 }
 public void setFlangeThickness(String txt){
   Double value = i.toDouble(txt);
   this.flangeThickness=value;

 }

 public Double getFilletRadius() {
   return filletRadius;
 }
 public void setFilletRadius(String txt){
   Double value = i.toDouble(txt);
   this.filletRadius=value;

 }

 public Double getFlangeEdgeRadius() {
   return flangeEdgeRadius;
 }
 public void setFlangeEdgeRadius(String txt){
   Double value = i.toDouble(txt);
   this.flangeEdgeRadius=value;

 }

 public Double getWebEdgeRadius() {
   return webEdgeRadius;
 }
 public void setWebEdgeRadius(String txt){
   Double value = i.toDouble(txt);
   this.webEdgeRadius=value;

 }

 public Double getWebSlope() {
   return webSlope;
 }
 public void setWebSlope(String txt){
   Double value = i.toDouble(txt);
   this.webSlope=value;

 }

 public Double getFlangeSlope() {
   return flangeSlope;
 }
 public void setFlangeSlope(String txt){
   Double value = i.toDouble(txt);
   this.flangeSlope=value;

 }

 public Double getCentreOfGravityInY() {
   return centreOfGravityInY;
 }
 public void setCentreOfGravityInY(String txt){
   Double value = i.toDouble(txt);
   this.centreOfGravityInY=value;

 }

}
