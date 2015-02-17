package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcList;
import fi.ni.InverseLinksList;
import fi.ni.Thing;
import fi.ni.ifc2x3.interfaces.IfcActorSelect;
import fi.ni.ifc2x3.interfaces.IfcObjectReferenceSelect;

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

public class IfcPerson extends Thing implements IfcActorSelect, IfcObjectReferenceSelect
{
 // The property attributes
 String id;
 String familyName;
 String givenName;
 List<String> middleNames = new IfcList<String>();
 List<String> prefixTitles = new IfcList<String>();
 List<String> suffixTitles = new IfcList<String>();
 List<IfcActorRole> roles = new IfcList<IfcActorRole>();
 List<IfcAddress> addresses = new IfcList<IfcAddress>();
 // The inverse attributes

 InverseLinksList<IfcPersonAndOrganization> engagedIn= new InverseLinksList<IfcPersonAndOrganization>();


 // Getters and setters of properties

 public String getId() {
   return id;
 }
 public void setId(String value){
   this.id=value;

 }

 public String getFamilyName() {
   return familyName;
 }
 public void setFamilyName(String value){
   this.familyName=value;

 }

 public String getGivenName() {
   return givenName;
 }
 public void setGivenName(String value){
   this.givenName=value;

 }

 public List<String> getMiddleNames() {
   return middleNames;
 }
 public void setMiddleNames(String value){
   this.middleNames.add(value);

 }

 public List<String> getPrefixTitles() {
   return prefixTitles;
 }
 public void setPrefixTitles(String value){
   this.prefixTitles.add(value);

 }

 public List<String> getSuffixTitles() {
   return suffixTitles;
 }
 public void setSuffixTitles(String value){
   this.suffixTitles.add(value);

 }

 public List<IfcActorRole> getRoles() {
   return roles;

 }
 public void setRoles(IfcActorRole value){
   this.roles.add(value);

 }

 public List<IfcAddress> getAddresses() {
   return addresses;

 }
 public void setAddresses(IfcAddress value){
   this.addresses.add(value);

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcPersonAndOrganization> getEngagedIn() {
   return engagedIn;

 }
 public void setEngagedIn(IfcPersonAndOrganization value){
   this.engagedIn.add(value);

 }

}
