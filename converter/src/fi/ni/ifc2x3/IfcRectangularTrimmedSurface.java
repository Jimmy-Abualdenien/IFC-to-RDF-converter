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

public class IfcRectangularTrimmedSurface extends IfcBoundedSurface 
{
 // The property attributes
 IfcSurface   basisSurface;
 Double u1;
 Double v1;
 Double u2;
 Double v2;
 String usense;
 String vsense;


 // Getters and setters of properties

 public IfcSurface getBasisSurface() {
   return basisSurface;

 }
 public void setBasisSurface(IfcSurface value){
   this.basisSurface=value;

 }

 public Double getU1() {
   return u1;
 }
 public void setU1(String txt){
   Double value = i.toDouble(txt);
   this.u1=value;

 }

 public Double getV1() {
   return v1;
 }
 public void setV1(String txt){
   Double value = i.toDouble(txt);
   this.v1=value;

 }

 public Double getU2() {
   return u2;
 }
 public void setU2(String txt){
   Double value = i.toDouble(txt);
   this.u2=value;

 }

 public Double getV2() {
   return v2;
 }
 public void setV2(String txt){
   Double value = i.toDouble(txt);
   this.v2=value;

 }

 public String getUsense() {
   return usense;
 }
 public void setUsense(String value){
   this.usense=value;

 }

 public String getVsense() {
   return vsense;
 }
 public void setVsense(String value){
   this.vsense=value;

 }

}
