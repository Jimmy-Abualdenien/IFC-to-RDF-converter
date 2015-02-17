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

public class IfcReinforcingMesh extends IfcReinforcingElement 
{
 // The property attributes
 Double meshLength;
 Double meshWidth;
 Double longitudinalBarNominalDiameter;
 Double transverseBarNominalDiameter;
 Double longitudinalBarCrossSectionArea;
 Double transverseBarCrossSectionArea;
 Double longitudinalBarSpacing;
 Double transverseBarSpacing;


 // Getters and setters of properties

 public Double getMeshLength() {
   return meshLength;
 }
 public void setMeshLength(String txt){
   Double value = i.toDouble(txt);
   this.meshLength=value;

 }

 public Double getMeshWidth() {
   return meshWidth;
 }
 public void setMeshWidth(String txt){
   Double value = i.toDouble(txt);
   this.meshWidth=value;

 }

 public Double getLongitudinalBarNominalDiameter() {
   return longitudinalBarNominalDiameter;
 }
 public void setLongitudinalBarNominalDiameter(String txt){
   Double value = i.toDouble(txt);
   this.longitudinalBarNominalDiameter=value;

 }

 public Double getTransverseBarNominalDiameter() {
   return transverseBarNominalDiameter;
 }
 public void setTransverseBarNominalDiameter(String txt){
   Double value = i.toDouble(txt);
   this.transverseBarNominalDiameter=value;

 }

 public Double getLongitudinalBarCrossSectionArea() {
   return longitudinalBarCrossSectionArea;
 }
 public void setLongitudinalBarCrossSectionArea(String txt){
   Double value = i.toDouble(txt);
   this.longitudinalBarCrossSectionArea=value;

 }

 public Double getTransverseBarCrossSectionArea() {
   return transverseBarCrossSectionArea;
 }
 public void setTransverseBarCrossSectionArea(String txt){
   Double value = i.toDouble(txt);
   this.transverseBarCrossSectionArea=value;

 }

 public Double getLongitudinalBarSpacing() {
   return longitudinalBarSpacing;
 }
 public void setLongitudinalBarSpacing(String txt){
   Double value = i.toDouble(txt);
   this.longitudinalBarSpacing=value;

 }

 public Double getTransverseBarSpacing() {
   return transverseBarSpacing;
 }
 public void setTransverseBarSpacing(String txt){
   Double value = i.toDouble(txt);
   this.transverseBarSpacing=value;

 }

}
