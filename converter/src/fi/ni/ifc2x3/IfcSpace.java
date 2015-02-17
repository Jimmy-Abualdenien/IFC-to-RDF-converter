package fi.ni.ifc2x3;
import fi.ni.InverseLinksList;

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

public class IfcSpace extends IfcSpatialStructureElement 
{
 // The property attributes
 String interiorOrExteriorSpace;
 Double elevationWithFlooring;
 // The inverse attributes

 InverseLinksList<IfcRelCoversSpaces> hasCoverings= new InverseLinksList<IfcRelCoversSpaces>();
 InverseLinksList<IfcRelSpaceBoundary> boundedBy= new InverseLinksList<IfcRelSpaceBoundary>();


 // Getters and setters of properties

 public String getInteriorOrExteriorSpace() {
   return interiorOrExteriorSpace;
 }
 public void setInteriorOrExteriorSpace(String value){
   this.interiorOrExteriorSpace=value;

 }

 public Double getElevationWithFlooring() {
   return elevationWithFlooring;
 }
 public void setElevationWithFlooring(String txt){
   Double value = i.toDouble(txt);
   this.elevationWithFlooring=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelCoversSpaces> getHasCoverings() {
   return hasCoverings;

 }
 public void setHasCoverings(IfcRelCoversSpaces value){
   this.hasCoverings.add(value);

 }

 public InverseLinksList<IfcRelSpaceBoundary> getBoundedBy() {
   return boundedBy;

 }
 public void setBoundedBy(IfcRelSpaceBoundary value){
   this.boundedBy.add(value);

 }

}
