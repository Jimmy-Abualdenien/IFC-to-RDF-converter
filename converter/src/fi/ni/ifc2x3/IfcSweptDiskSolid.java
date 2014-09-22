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

public class IfcSweptDiskSolid extends IfcSolidModel 
{
 // The property attributes
 IfcCurve   directrix;
 Double radius;
 Double innerRadius;
 Double startParam;
 Double endParam;


 // Getters and setters of properties

 public IfcCurve getDirectrix() {
   return directrix;

 }
 public void setDirectrix(IfcCurve value){
   this.directrix=value;

 }

 public Double getRadius() {
   return radius;
 }
 public void setRadius(String txt){
   Double value = i.toDouble(txt);
   this.radius=value;

 }

 public Double getInnerRadius() {
   return innerRadius;
 }
 public void setInnerRadius(String txt){
   Double value = i.toDouble(txt);
   this.innerRadius=value;

 }

 public Double getStartParam() {
   return startParam;
 }
 public void setStartParam(String txt){
   Double value = i.toDouble(txt);
   this.startParam=value;

 }

 public Double getEndParam() {
   return endParam;
 }
 public void setEndParam(String txt){
   Double value = i.toDouble(txt);
   this.endParam=value;

 }

}
