package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcSet;
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

public class IfcTypeObject extends IfcObjectDefinition 
{
 // The property attributes
 String applicableOccurrence;
 List<IfcPropertySetDefinition> hasPropertySets = new IfcSet<IfcPropertySetDefinition>();
 // The inverse attributes

 InverseLinksList<IfcRelDefinesByType> objectTypeOf= new InverseLinksList<IfcRelDefinesByType>();


 // Getters and setters of properties

 public String getApplicableOccurrence() {
   return applicableOccurrence;
 }
 public void setApplicableOccurrence(String value){
   this.applicableOccurrence=value;

 }

 public List<IfcPropertySetDefinition> getHasPropertySets() {
   return hasPropertySets;

 }
 public void setHasPropertySets(IfcPropertySetDefinition value){
   this.hasPropertySets.add(value);

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelDefinesByType> getObjectTypeOf() {
   return objectTypeOf;

 }
 public void setObjectTypeOf(IfcRelDefinesByType value){
   this.objectTypeOf.add(value);

 }

}
