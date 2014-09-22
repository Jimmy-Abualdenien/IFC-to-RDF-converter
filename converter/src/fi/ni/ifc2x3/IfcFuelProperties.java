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

public class IfcFuelProperties extends IfcMaterialProperties 
{
 // The property attributes
 Double combustionTemperature;
 Double carbonContent;
 Double lowerHeatingValue;
 Double higherHeatingValue;


 // Getters and setters of properties

 public Double getCombustionTemperature() {
   return combustionTemperature;
 }
 public void setCombustionTemperature(String txt){
   Double value = i.toDouble(txt);
   this.combustionTemperature=value;

 }

 public Double getCarbonContent() {
   return carbonContent;
 }
 public void setCarbonContent(String txt){
   Double value = i.toDouble(txt);
   this.carbonContent=value;

 }

 public Double getLowerHeatingValue() {
   return lowerHeatingValue;
 }
 public void setLowerHeatingValue(String txt){
   Double value = i.toDouble(txt);
   this.lowerHeatingValue=value;

 }

 public Double getHigherHeatingValue() {
   return higherHeatingValue;
 }
 public void setHigherHeatingValue(String txt){
   Double value = i.toDouble(txt);
   this.higherHeatingValue=value;

 }

}
