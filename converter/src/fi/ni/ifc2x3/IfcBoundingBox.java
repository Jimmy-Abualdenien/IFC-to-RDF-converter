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

public class IfcBoundingBox extends IfcGeometricRepresentationItem 
{
 // The property attributes
 IfcCartesianPoint   corner;
 Double xDim;
 Double yDim;
 Double zDim;


 // Getters and setters of properties

 public IfcCartesianPoint getCorner() {
   return corner;

 }
 public void setCorner(IfcCartesianPoint value){
   this.corner=value;

 }

 public Double getXDim() {
   return xDim;
 }
 public void setXDim(String txt){
   Double value = i.toDouble(txt);
   this.xDim=value;

 }

 public Double getYDim() {
   return yDim;
 }
 public void setYDim(String txt){
   Double value = i.toDouble(txt);
   this.yDim=value;

 }

 public Double getZDim() {
   return zDim;
 }
 public void setZDim(String txt){
   Double value = i.toDouble(txt);
   this.zDim=value;

 }

}
