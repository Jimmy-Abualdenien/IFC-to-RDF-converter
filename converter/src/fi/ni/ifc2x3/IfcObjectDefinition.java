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

public class IfcObjectDefinition extends IfcRoot 
{
 // The inverse attributes

 InverseLinksList<IfcRelAssigns> hasAssignments= new InverseLinksList<IfcRelAssigns>();
 InverseLinksList<IfcRelDecomposes> isDecomposedBy= new InverseLinksList<IfcRelDecomposes>();
 InverseLinksList<IfcRelDecomposes> decomposes= new InverseLinksList<IfcRelDecomposes>();
 InverseLinksList<IfcRelAssociates> hasAssociations= new InverseLinksList<IfcRelAssociates>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcRelAssigns> getHasAssignments() {
   return hasAssignments;

 }
 public void setHasAssignments(IfcRelAssigns value){
   this.hasAssignments.add(value);

 }

 public InverseLinksList<IfcRelDecomposes> getIsDecomposedBy() {
   return isDecomposedBy;

 }
 public void setIsDecomposedBy(IfcRelDecomposes value){
   this.isDecomposedBy.add(value);

 }

 public InverseLinksList<IfcRelDecomposes> getDecomposes() {
   return decomposes;

 }
 public void setDecomposes(IfcRelDecomposes value){
   this.decomposes.add(value);

 }

 public InverseLinksList<IfcRelAssociates> getHasAssociations() {
   return hasAssociations;

 }
 public void setHasAssociations(IfcRelAssociates value){
   this.hasAssociations.add(value);

 }

}
