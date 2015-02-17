package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcSet;

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

public class IfcMechanicalSteelMaterialProperties extends IfcMechanicalMaterialProperties 
{
 // The property attributes
 Double yieldStress;
 Double ultimateStress;
 Double ultimateStrain;
 Double hardeningModule;
 Double proportionalStress;
 Double plasticStrain;
 List<IfcRelaxation> relaxations = new IfcSet<IfcRelaxation>();


 // Getters and setters of properties

 public Double getYieldStress() {
   return yieldStress;
 }
 public void setYieldStress(String txt){
   Double value = i.toDouble(txt);
   this.yieldStress=value;

 }

 public Double getUltimateStress() {
   return ultimateStress;
 }
 public void setUltimateStress(String txt){
   Double value = i.toDouble(txt);
   this.ultimateStress=value;

 }

 public Double getUltimateStrain() {
   return ultimateStrain;
 }
 public void setUltimateStrain(String txt){
   Double value = i.toDouble(txt);
   this.ultimateStrain=value;

 }

 public Double getHardeningModule() {
   return hardeningModule;
 }
 public void setHardeningModule(String txt){
   Double value = i.toDouble(txt);
   this.hardeningModule=value;

 }

 public Double getProportionalStress() {
   return proportionalStress;
 }
 public void setProportionalStress(String txt){
   Double value = i.toDouble(txt);
   this.proportionalStress=value;

 }

 public Double getPlasticStrain() {
   return plasticStrain;
 }
 public void setPlasticStrain(String txt){
   Double value = i.toDouble(txt);
   this.plasticStrain=value;

 }

 public List<IfcRelaxation> getRelaxations() {
   return relaxations;

 }
 public void setRelaxations(IfcRelaxation value){
   this.relaxations.add(value);

 }

}
