package fi.ni.ifc2x3;
import fi.ni.Thing;

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

public class IfcApplication extends Thing 
{
 // The property attributes
 IfcOrganization   applicationDeveloper;
 String version;
 String applicationFullName;
 String applicationIdentifier;


 // Getters and setters of properties

 public IfcOrganization getApplicationDeveloper() {
   return applicationDeveloper;

 }
 public void setApplicationDeveloper(IfcOrganization value){
   this.applicationDeveloper=value;

 }

 public String getVersion() {
   return version;
 }
 public void setVersion(String value){
   this.version=value;

 }

 public String getApplicationFullName() {
   return applicationFullName;
 }
 public void setApplicationFullName(String value){
   this.applicationFullName=value;

 }

 public String getApplicationIdentifier() {
   return applicationIdentifier;
 }
 public void setApplicationIdentifier(String value){
   this.applicationIdentifier=value;

 }

}
