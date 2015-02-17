package fi.ni.ifc2x3;
import fi.ni.InverseLinksList;
import fi.ni.Thing;
import fi.ni.ifc2x3.interfaces.IfcDateTimeSelect;

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

public class IfcApproval extends Thing 
{
 // The property attributes
 String description;
IfcDateTimeSelect approvalDateTime;
 String approvalStatus;
 String approvalLevel;
 String approvalQualifier;
 String name;
 String identifier;
 // The inverse attributes

 InverseLinksList<IfcApprovalActorRelationship> actors= new InverseLinksList<IfcApprovalActorRelationship>();
 InverseLinksList<IfcApprovalRelationship> isRelatedWith= new InverseLinksList<IfcApprovalRelationship>();
 InverseLinksList<IfcApprovalRelationship> relates= new InverseLinksList<IfcApprovalRelationship>();


 // Getters and setters of properties

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

 public IfcDateTimeSelect getApprovalDateTime() {
   return approvalDateTime;
 }
 public void setApprovalDateTime(IfcDateTimeSelect value){
   this.approvalDateTime=value;

 }

 public String getApprovalStatus() {
   return approvalStatus;
 }
 public void setApprovalStatus(String value){
   this.approvalStatus=value;

 }

 public String getApprovalLevel() {
   return approvalLevel;
 }
 public void setApprovalLevel(String value){
   this.approvalLevel=value;

 }

 public String getApprovalQualifier() {
   return approvalQualifier;
 }
 public void setApprovalQualifier(String value){
   this.approvalQualifier=value;

 }

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public String getIdentifier() {
   return identifier;
 }
 public void setIdentifier(String value){
   this.identifier=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcApprovalActorRelationship> getActors() {
   return actors;

 }
 public void setActors(IfcApprovalActorRelationship value){
   this.actors.add(value);

 }

 public InverseLinksList<IfcApprovalRelationship> getIsRelatedWith() {
   return isRelatedWith;

 }
 public void setIsRelatedWith(IfcApprovalRelationship value){
   this.isRelatedWith.add(value);

 }

 public InverseLinksList<IfcApprovalRelationship> getRelates() {
   return relates;

 }
 public void setRelates(IfcApprovalRelationship value){
   this.relates.add(value);

 }

}
