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

public class IfcThermalMaterialProperties extends IfcMaterialProperties 
{
 // The property attributes
 Double specificHeatCapacity;
 Double boilingPoint;
 Double freezingPoint;
 Double thermalConductivity;


 // Getters and setters of properties

 public Double getSpecificHeatCapacity() {
   return specificHeatCapacity;
 }
 public void setSpecificHeatCapacity(String txt){
   Double value = i.toDouble(txt);
   this.specificHeatCapacity=value;

 }

 public Double getBoilingPoint() {
   return boilingPoint;
 }
 public void setBoilingPoint(String txt){
   Double value = i.toDouble(txt);
   this.boilingPoint=value;

 }

 public Double getFreezingPoint() {
   return freezingPoint;
 }
 public void setFreezingPoint(String txt){
   Double value = i.toDouble(txt);
   this.freezingPoint=value;

 }

 public Double getThermalConductivity() {
   return thermalConductivity;
 }
 public void setThermalConductivity(String txt){
   Double value = i.toDouble(txt);
   this.thermalConductivity=value;

 }

}
