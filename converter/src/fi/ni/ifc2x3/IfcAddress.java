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

public class IfcAddress extends Thing implements IfcObjectReferenceSelect
{
 // The property attributes
 String purpose;
 String description;
 String userDefinedPurpose;
 // The inverse attributes

 InverseLinksList<IfcPerson> ofPerson= new InverseLinksList<IfcPerson>();
 InverseLinksList<IfcOrganization> ofOrganization= new InverseLinksList<IfcOrganization>();


 // Getters and setters of properties

 public String getPurpose() {
   return purpose;
 }
 public void setPurpose(String value){
   this.purpose=value;

 }

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

 public String getUserDefinedPurpose() {
   return userDefinedPurpose;
 }
 public void setUserDefinedPurpose(String value){
   this.userDefinedPurpose=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcPerson> getOfPerson() {
   return ofPerson;

 }
 public void setOfPerson(IfcPerson value){
   this.ofPerson.add(value);

 }

 public InverseLinksList<IfcOrganization> getOfOrganization() {
   return ofOrganization;

 }
 public void setOfOrganization(IfcOrganization value){
   this.ofOrganization.add(value);

 }

}
