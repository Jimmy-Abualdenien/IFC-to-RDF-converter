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

public class IfcSpatialStructureElement extends IfcProduct 
{
 // The property attributes
 String longName;
 String compositionType;
 // The inverse attributes

 InverseLinksList<IfcRelReferencedInSpatialStructure> referencesElements= new InverseLinksList<IfcRelReferencedInSpatialStructure>();
 InverseLinksList<IfcRelServicesBuildings> servicedBySystems= new InverseLinksList<IfcRelServicesBuildings>();
 InverseLinksList<IfcRelContainedInSpatialStructure> containsElements= new InverseLinksList<IfcRelContainedInSpatialStructure>();


 // Getters and setters of properties

 public String getLongName() {
   return longName;
 }
 public void setLongName(String value){
   this.longName=value;

 }

 public String getCompositionType() {
   return compositionType;
 }
 public void setCompositionType(String value){
   this.compositionType=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelReferencedInSpatialStructure> getReferencesElements() {
   return referencesElements;

 }
 public void setReferencesElements(IfcRelReferencedInSpatialStructure value){
   this.referencesElements.add(value);

 }

 public InverseLinksList<IfcRelServicesBuildings> getServicedBySystems() {
   return servicedBySystems;

 }
 public void setServicedBySystems(IfcRelServicesBuildings value){
   this.servicedBySystems.add(value);

 }

 public InverseLinksList<IfcRelContainedInSpatialStructure> getContainsElements() {
   return containsElements;

 }
 public void setContainsElements(IfcRelContainedInSpatialStructure value){
   this.containsElements.add(value);

 }

}
