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

public class IfcClassification extends Thing 
{
 // The property attributes
 String source;
 String edition;
 IfcCalendarDate   editionDate;
 String name;
 // The inverse attributes

 InverseLinksList<IfcClassificationItem> contains= new InverseLinksList<IfcClassificationItem>();


 // Getters and setters of properties

 public String getSource() {
   return source;
 }
 public void setSource(String value){
   this.source=value;

 }

 public String getEdition() {
   return edition;
 }
 public void setEdition(String value){
   this.edition=value;

 }

 public IfcCalendarDate getEditionDate() {
   return editionDate;

 }
 public void setEditionDate(IfcCalendarDate value){
   this.editionDate=value;

 }

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcClassificationItem> getContains() {
   return contains;

 }
 public void setContains(IfcClassificationItem value){
   this.contains.add(value);

 }

}
