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

public class IfcHygroscopicMaterialProperties extends IfcMaterialProperties 
{
 // The property attributes
 Double upperVaporResistanceFactor;
 Double lowerVaporResistanceFactor;
 Double isothermalMoistureCapacity;
 Double vaporPermeability;
 Double moistureDiffusivity;


 // Getters and setters of properties

 public Double getUpperVaporResistanceFactor() {
   return upperVaporResistanceFactor;
 }
 public void setUpperVaporResistanceFactor(String txt){
   Double value = i.toDouble(txt);
   this.upperVaporResistanceFactor=value;

 }

 public Double getLowerVaporResistanceFactor() {
   return lowerVaporResistanceFactor;
 }
 public void setLowerVaporResistanceFactor(String txt){
   Double value = i.toDouble(txt);
   this.lowerVaporResistanceFactor=value;

 }

 public Double getIsothermalMoistureCapacity() {
   return isothermalMoistureCapacity;
 }
 public void setIsothermalMoistureCapacity(String txt){
   Double value = i.toDouble(txt);
   this.isothermalMoistureCapacity=value;

 }

 public Double getVaporPermeability() {
   return vaporPermeability;
 }
 public void setVaporPermeability(String txt){
   Double value = i.toDouble(txt);
   this.vaporPermeability=value;

 }

 public Double getMoistureDiffusivity() {
   return moistureDiffusivity;
 }
 public void setMoistureDiffusivity(String txt){
   Double value = i.toDouble(txt);
   this.moistureDiffusivity=value;

 }

}
