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

public class IfcProductsOfCombustionProperties extends IfcMaterialProperties 
{
 // The property attributes
 Double specificHeatCapacity;
 Double n20Content;
 Double cOContent;
 Double cO2Content;


 // Getters and setters of properties

 public Double getSpecificHeatCapacity() {
   return specificHeatCapacity;
 }
 public void setSpecificHeatCapacity(String txt){
   Double value = i.toDouble(txt);
   this.specificHeatCapacity=value;

 }

 public Double getN20Content() {
   return n20Content;
 }
 public void setN20Content(String txt){
   Double value = i.toDouble(txt);
   this.n20Content=value;

 }

 public Double getCOContent() {
   return cOContent;
 }
 public void setCOContent(String txt){
   Double value = i.toDouble(txt);
   this.cOContent=value;

 }

 public Double getCO2Content() {
   return cO2Content;
 }
 public void setCO2Content(String txt){
   Double value = i.toDouble(txt);
   this.cO2Content=value;

 }

}
