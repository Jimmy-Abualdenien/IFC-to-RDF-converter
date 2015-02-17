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

public class IfcStructuralLoadSingleDisplacement extends IfcStructuralLoadStatic 
{
 // The property attributes
 Double displacementX;
 Double displacementY;
 Double displacementZ;
 Double rotationalDisplacementRX;
 Double rotationalDisplacementRY;
 Double rotationalDisplacementRZ;


 // Getters and setters of properties

 public Double getDisplacementX() {
   return displacementX;
 }
 public void setDisplacementX(String txt){
   Double value = i.toDouble(txt);
   this.displacementX=value;

 }

 public Double getDisplacementY() {
   return displacementY;
 }
 public void setDisplacementY(String txt){
   Double value = i.toDouble(txt);
   this.displacementY=value;

 }

 public Double getDisplacementZ() {
   return displacementZ;
 }
 public void setDisplacementZ(String txt){
   Double value = i.toDouble(txt);
   this.displacementZ=value;

 }

 public Double getRotationalDisplacementRX() {
   return rotationalDisplacementRX;
 }
 public void setRotationalDisplacementRX(String txt){
   Double value = i.toDouble(txt);
   this.rotationalDisplacementRX=value;

 }

 public Double getRotationalDisplacementRY() {
   return rotationalDisplacementRY;
 }
 public void setRotationalDisplacementRY(String txt){
   Double value = i.toDouble(txt);
   this.rotationalDisplacementRY=value;

 }

 public Double getRotationalDisplacementRZ() {
   return rotationalDisplacementRZ;
 }
 public void setRotationalDisplacementRZ(String txt){
   Double value = i.toDouble(txt);
   this.rotationalDisplacementRZ=value;

 }

}
