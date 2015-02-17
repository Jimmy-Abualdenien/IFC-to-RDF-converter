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

public class IfcWaterProperties extends IfcMaterialProperties 
{
 // The property attributes
 String isPotable;
 Double hardness;
 Double alkalinityConcentration;
 Double acidityConcentration;
 Double impuritiesContent;
 Double pHLevel;
 Double dissolvedSolidsContent;


 // Getters and setters of properties

 public String getIsPotable() {
   return isPotable;
 }
 public void setIsPotable(String value){
   this.isPotable=value;

 }

 public Double getHardness() {
   return hardness;
 }
 public void setHardness(String txt){
   Double value = i.toDouble(txt);
   this.hardness=value;

 }

 public Double getAlkalinityConcentration() {
   return alkalinityConcentration;
 }
 public void setAlkalinityConcentration(String txt){
   Double value = i.toDouble(txt);
   this.alkalinityConcentration=value;

 }

 public Double getAcidityConcentration() {
   return acidityConcentration;
 }
 public void setAcidityConcentration(String txt){
   Double value = i.toDouble(txt);
   this.acidityConcentration=value;

 }

 public Double getImpuritiesContent() {
   return impuritiesContent;
 }
 public void setImpuritiesContent(String txt){
   Double value = i.toDouble(txt);
   this.impuritiesContent=value;

 }

 public Double getPHLevel() {
   return pHLevel;
 }
 public void setPHLevel(String txt){
   Double value = i.toDouble(txt);
   this.pHLevel=value;

 }

 public Double getDissolvedSolidsContent() {
   return dissolvedSolidsContent;
 }
 public void setDissolvedSolidsContent(String txt){
   Double value = i.toDouble(txt);
   this.dissolvedSolidsContent=value;

 }

}
