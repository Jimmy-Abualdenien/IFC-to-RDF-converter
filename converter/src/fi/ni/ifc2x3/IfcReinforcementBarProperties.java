package fi.ni.ifc2x3;
import fi.ni.Thing;

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

public class IfcReinforcementBarProperties extends Thing 
{
 // The property attributes
 Double totalCrossSectionArea;
 String steelGrade;
 String barSurface;
 Double effectiveDepth;
 Double nominalBarDiameter;
 String barCount;


 // Getters and setters of properties

 public Double getTotalCrossSectionArea() {
   return totalCrossSectionArea;
 }
 public void setTotalCrossSectionArea(String txt){
   Double value = i.toDouble(txt);
   this.totalCrossSectionArea=value;

 }

 public String getSteelGrade() {
   return steelGrade;
 }
 public void setSteelGrade(String value){
   this.steelGrade=value;

 }

 public String getBarSurface() {
   return barSurface;
 }
 public void setBarSurface(String value){
   this.barSurface=value;

 }

 public Double getEffectiveDepth() {
   return effectiveDepth;
 }
 public void setEffectiveDepth(String txt){
   Double value = i.toDouble(txt);
   this.effectiveDepth=value;

 }

 public Double getNominalBarDiameter() {
   return nominalBarDiameter;
 }
 public void setNominalBarDiameter(String txt){
   Double value = i.toDouble(txt);
   this.nominalBarDiameter=value;

 }

 public String getBarCount() {
   return barCount;
 }
 public void setBarCount(String value){
   this.barCount=value;

 }

}
