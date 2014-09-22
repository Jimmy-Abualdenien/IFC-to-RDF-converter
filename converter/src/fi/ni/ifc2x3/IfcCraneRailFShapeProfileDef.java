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

public class IfcCraneRailFShapeProfileDef extends IfcParameterizedProfileDef 
{
 // The property attributes
 Double overallHeight;
 Double headWidth;
 Double radius;
 Double headDepth2;
 Double headDepth3;
 Double webThickness;
 Double baseDepth1;
 Double baseDepth2;
 Double centreOfGravityInY;


 // Getters and setters of properties

 public Double getOverallHeight() {
   return overallHeight;
 }
 public void setOverallHeight(String txt){
   Double value = i.toDouble(txt);
   this.overallHeight=value;

 }

 public Double getHeadWidth() {
   return headWidth;
 }
 public void setHeadWidth(String txt){
   Double value = i.toDouble(txt);
   this.headWidth=value;

 }

 public Double getRadius() {
   return radius;
 }
 public void setRadius(String txt){
   Double value = i.toDouble(txt);
   this.radius=value;

 }

 public Double getHeadDepth2() {
   return headDepth2;
 }
 public void setHeadDepth2(String txt){
   Double value = i.toDouble(txt);
   this.headDepth2=value;

 }

 public Double getHeadDepth3() {
   return headDepth3;
 }
 public void setHeadDepth3(String txt){
   Double value = i.toDouble(txt);
   this.headDepth3=value;

 }

 public Double getWebThickness() {
   return webThickness;
 }
 public void setWebThickness(String txt){
   Double value = i.toDouble(txt);
   this.webThickness=value;

 }

 public Double getBaseDepth1() {
   return baseDepth1;
 }
 public void setBaseDepth1(String txt){
   Double value = i.toDouble(txt);
   this.baseDepth1=value;

 }

 public Double getBaseDepth2() {
   return baseDepth2;
 }
 public void setBaseDepth2(String txt){
   Double value = i.toDouble(txt);
   this.baseDepth2=value;

 }

 public Double getCentreOfGravityInY() {
   return centreOfGravityInY;
 }
 public void setCentreOfGravityInY(String txt){
   Double value = i.toDouble(txt);
   this.centreOfGravityInY=value;

 }

}
