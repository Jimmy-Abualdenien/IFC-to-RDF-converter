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

public class IfcOrganization extends Thing implements IfcActorSelect, IfcObjectReferenceSelect
{
 // The property attributes
 String id;
 String name;
 String description;
 List<IfcActorRole> roles = new IfcList<IfcActorRole>();
 List<IfcAddress> addresses = new IfcList<IfcAddress>();
 // The inverse attributes

 InverseLinksList<IfcOrganizationRelationship> isRelatedBy= new InverseLinksList<IfcOrganizationRelationship>();
 InverseLinksList<IfcOrganizationRelationship> relates= new InverseLinksList<IfcOrganizationRelationship>();
 InverseLinksList<IfcPersonAndOrganization> engages= new InverseLinksList<IfcPersonAndOrganization>();


 // Getters and setters of properties

 public String getId() {
   return id;
 }
 public void setId(String value){
   this.id=value;

 }

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

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

 public InverseLinksList<IfcOrganizationRelationship> getIsRelatedBy() {
   return isRelatedBy;

 }
 public void setIsRelatedBy(IfcOrganizationRelationship value){
   this.isRelatedBy.add(value);

 }

 public InverseLinksList<IfcOrganizationRelationship> getRelates() {
   return relates;

 }
 public void setRelates(IfcOrganizationRelationship value){
   this.relates.add(value);

 }

 public InverseLinksList<IfcPersonAndOrganization> getEngages() {
   return engages;

 }
 public void setEngages(IfcPersonAndOrganization value){
   this.engages.add(value);

 }

}
