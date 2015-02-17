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

public class IfcBoundaryNodeCondition extends IfcBoundaryCondition 
{
 // The property attributes
 Double linearStiffnessX;
 Double linearStiffnessY;
 Double linearStiffnessZ;
 Double rotationalStiffnessX;
 Double rotationalStiffnessY;
 Double rotationalStiffnessZ;


 // Getters and setters of properties

 public Double getLinearStiffnessX() {
   return linearStiffnessX;
 }
 public void setLinearStiffnessX(String txt){
   Double value = i.toDouble(txt);
   this.linearStiffnessX=value;

 }

 public Double getLinearStiffnessY() {
   return linearStiffnessY;
 }
 public void setLinearStiffnessY(String txt){
   Double value = i.toDouble(txt);
   this.linearStiffnessY=value;

 }

 public Double getLinearStiffnessZ() {
   return linearStiffnessZ;
 }
 public void setLinearStiffnessZ(String txt){
   Double value = i.toDouble(txt);
   this.linearStiffnessZ=value;

 }

 public Double getRotationalStiffnessX() {
   return rotationalStiffnessX;
 }
 public void setRotationalStiffnessX(String txt){
   Double value = i.toDouble(txt);
   this.rotationalStiffnessX=value;

 }

 public Double getRotationalStiffnessY() {
   return rotationalStiffnessY;
 }
 public void setRotationalStiffnessY(String txt){
   Double value = i.toDouble(txt);
   this.rotationalStiffnessY=value;

 }

 public Double getRotationalStiffnessZ() {
   return rotationalStiffnessZ;
 }
 public void setRotationalStiffnessZ(String txt){
   Double value = i.toDouble(txt);
   this.rotationalStiffnessZ=value;

 }

}
