package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcSet;
import fi.ni.Thing;
import fi.ni.ifc2x3.interfaces.IfcLibrarySelect;

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

public class IfcLibraryInformation extends Thing implements IfcLibrarySelect
{
 // The property attributes
 String name;
 String version;
 IfcOrganization   publisher;
 IfcCalendarDate   versionDate;
 List<IfcLibraryReference> libraryReference = new IfcSet<IfcLibraryReference>();


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public String getVersion() {
   return version;
 }
 public void setVersion(String value){
   this.version=value;

 }

 public IfcOrganization getPublisher() {
   return publisher;

 }
 public void setPublisher(IfcOrganization value){
   this.publisher=value;

 }

 public IfcCalendarDate getVersionDate() {
   return versionDate;

 }
 public void setVersionDate(IfcCalendarDate value){
   this.versionDate=value;

 }

 public List<IfcLibraryReference> getLibraryReference() {
   return libraryReference;

 }
 public void setLibraryReference(IfcLibraryReference value){
   this.libraryReference.add(value);

 }

}
