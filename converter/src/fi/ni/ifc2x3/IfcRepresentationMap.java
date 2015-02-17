package fi.ni.ifc2x3;
import fi.ni.InverseLinksList;
import fi.ni.Thing;
import fi.ni.ifc2x3.interfaces.IfcAxis2Placement;

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

public class IfcRepresentationMap extends Thing 
{
 // The property attributes
IfcAxis2Placement mappingOrigin;
 IfcRepresentation   mappedRepresentation;
 // The inverse attributes

 InverseLinksList<IfcMappedItem> mapUsage= new InverseLinksList<IfcMappedItem>();


 // Getters and setters of properties

 public IfcAxis2Placement getMappingOrigin() {
   return mappingOrigin;
 }
 public void setMappingOrigin(IfcAxis2Placement value){
   this.mappingOrigin=value;

 }

 public IfcRepresentation getMappedRepresentation() {
   return mappedRepresentation;

 }
 public void setMappedRepresentation(IfcRepresentation value){
   this.mappedRepresentation=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcMappedItem> getMapUsage() {
   return mapUsage;

 }
 public void setMapUsage(IfcMappedItem value){
   this.mapUsage.add(value);

 }

}
