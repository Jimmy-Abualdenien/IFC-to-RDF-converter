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

public class IfcMechanicalMaterialProperties extends IfcMaterialProperties 
{
 // The property attributes
 Double dynamicViscosity;
 Double youngModulus;
 Double shearModulus;
 Double poissonRatio;
 Double thermalExpansionCoefficient;


 // Getters and setters of properties

 public Double getDynamicViscosity() {
   return dynamicViscosity;
 }
 public void setDynamicViscosity(String txt){
   Double value = i.toDouble(txt);
   this.dynamicViscosity=value;

 }

 public Double getYoungModulus() {
   return youngModulus;
 }
 public void setYoungModulus(String txt){
   Double value = i.toDouble(txt);
   this.youngModulus=value;

 }

 public Double getShearModulus() {
   return shearModulus;
 }
 public void setShearModulus(String txt){
   Double value = i.toDouble(txt);
   this.shearModulus=value;

 }

 public Double getPoissonRatio() {
   return poissonRatio;
 }
 public void setPoissonRatio(String txt){
   Double value = i.toDouble(txt);
   this.poissonRatio=value;

 }

 public Double getThermalExpansionCoefficient() {
   return thermalExpansionCoefficient;
 }
 public void setThermalExpansionCoefficient(String txt){
   Double value = i.toDouble(txt);
   this.thermalExpansionCoefficient=value;

 }

}
