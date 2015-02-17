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

public class IfcFailureConnectionCondition extends IfcStructuralConnectionCondition 
{
 // The property attributes
 Double tensionFailureX;
 Double tensionFailureY;
 Double tensionFailureZ;
 Double compressionFailureX;
 Double compressionFailureY;
 Double compressionFailureZ;


 // Getters and setters of properties

 public Double getTensionFailureX() {
   return tensionFailureX;
 }
 public void setTensionFailureX(String txt){
   Double value = i.toDouble(txt);
   this.tensionFailureX=value;

 }

 public Double getTensionFailureY() {
   return tensionFailureY;
 }
 public void setTensionFailureY(String txt){
   Double value = i.toDouble(txt);
   this.tensionFailureY=value;

 }

 public Double getTensionFailureZ() {
   return tensionFailureZ;
 }
 public void setTensionFailureZ(String txt){
   Double value = i.toDouble(txt);
   this.tensionFailureZ=value;

 }

 public Double getCompressionFailureX() {
   return compressionFailureX;
 }
 public void setCompressionFailureX(String txt){
   Double value = i.toDouble(txt);
   this.compressionFailureX=value;

 }

 public Double getCompressionFailureY() {
   return compressionFailureY;
 }
 public void setCompressionFailureY(String txt){
   Double value = i.toDouble(txt);
   this.compressionFailureY=value;

 }

 public Double getCompressionFailureZ() {
   return compressionFailureZ;
 }
 public void setCompressionFailureZ(String txt){
   Double value = i.toDouble(txt);
   this.compressionFailureZ=value;

 }

}
