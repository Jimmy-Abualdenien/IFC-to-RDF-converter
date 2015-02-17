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

public class IfcGeneralProfileProperties extends IfcProfileProperties 
{
 // The property attributes
 Double physicalWeight;
 Double perimeter;
 Double minimumPlateThickness;
 Double maximumPlateThickness;
 Double crossSectionArea;


 // Getters and setters of properties

 public Double getPhysicalWeight() {
   return physicalWeight;
 }
 public void setPhysicalWeight(String txt){
   Double value = i.toDouble(txt);
   this.physicalWeight=value;

 }

 public Double getPerimeter() {
   return perimeter;
 }
 public void setPerimeter(String txt){
   Double value = i.toDouble(txt);
   this.perimeter=value;

 }

 public Double getMinimumPlateThickness() {
   return minimumPlateThickness;
 }
 public void setMinimumPlateThickness(String txt){
   Double value = i.toDouble(txt);
   this.minimumPlateThickness=value;

 }

 public Double getMaximumPlateThickness() {
   return maximumPlateThickness;
 }
 public void setMaximumPlateThickness(String txt){
   Double value = i.toDouble(txt);
   this.maximumPlateThickness=value;

 }

 public Double getCrossSectionArea() {
   return crossSectionArea;
 }
 public void setCrossSectionArea(String txt){
   Double value = i.toDouble(txt);
   this.crossSectionArea=value;

 }

}
