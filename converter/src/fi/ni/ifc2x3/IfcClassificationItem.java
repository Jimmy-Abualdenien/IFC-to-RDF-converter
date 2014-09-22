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

public class IfcClassificationItem extends Thing 
{
 // The property attributes
 IfcClassificationNotationFacet   notation;
 IfcClassification   itemOf;
 String title;
 // The inverse attributes

 InverseLinksList<IfcClassificationItemRelationship> isClassifiedItemIn= new InverseLinksList<IfcClassificationItemRelationship>();
 InverseLinksList<IfcClassificationItemRelationship> isClassifyingItemIn= new InverseLinksList<IfcClassificationItemRelationship>();


 // Getters and setters of properties

 public IfcClassificationNotationFacet getNotation() {
   return notation;

 }
 public void setNotation(IfcClassificationNotationFacet value){
   this.notation=value;

 }

 public IfcClassification getItemOf() {
   return itemOf;

 }
 public void setItemOf(IfcClassification value){
   this.itemOf=value;

 }

 public String getTitle() {
   return title;
 }
 public void setTitle(String value){
   this.title=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcClassificationItemRelationship> getIsClassifiedItemIn() {
   return isClassifiedItemIn;

 }
 public void setIsClassifiedItemIn(IfcClassificationItemRelationship value){
   this.isClassifiedItemIn.add(value);

 }

 public InverseLinksList<IfcClassificationItemRelationship> getIsClassifyingItemIn() {
   return isClassifyingItemIn;

 }
 public void setIsClassifyingItemIn(IfcClassificationItemRelationship value){
   this.isClassifyingItemIn.add(value);

 }

}
