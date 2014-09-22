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

public class IfcMechanicalConcreteMaterialProperties extends IfcMechanicalMaterialProperties 
{
 // The property attributes
 Double compressiveStrength;
 Double maxAggregateSize;
 String admixturesDescription;
 String workability;
 Double protectivePoreRatio;
 String waterImpermeability;


 // Getters and setters of properties

 public Double getCompressiveStrength() {
   return compressiveStrength;
 }
 public void setCompressiveStrength(String txt){
   Double value = i.toDouble(txt);
   this.compressiveStrength=value;

 }

 public Double getMaxAggregateSize() {
   return maxAggregateSize;
 }
 public void setMaxAggregateSize(String txt){
   Double value = i.toDouble(txt);
   this.maxAggregateSize=value;

 }

 public String getAdmixturesDescription() {
   return admixturesDescription;
 }
 public void setAdmixturesDescription(String value){
   this.admixturesDescription=value;

 }

 public String getWorkability() {
   return workability;
 }
 public void setWorkability(String value){
   this.workability=value;

 }

 public Double getProtectivePoreRatio() {
   return protectivePoreRatio;
 }
 public void setProtectivePoreRatio(String txt){
   Double value = i.toDouble(txt);
   this.protectivePoreRatio=value;

 }

 public String getWaterImpermeability() {
   return waterImpermeability;
 }
 public void setWaterImpermeability(String value){
   this.waterImpermeability=value;

 }

}
