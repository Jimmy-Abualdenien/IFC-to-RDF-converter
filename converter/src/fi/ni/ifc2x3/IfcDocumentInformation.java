package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcSet;
import fi.ni.InverseLinksList;
import fi.ni.Thing;
import fi.ni.ifc2x3.interfaces.IfcActorSelect;
import fi.ni.ifc2x3.interfaces.IfcDocumentSelect;

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

public class IfcDocumentInformation extends Thing implements IfcDocumentSelect
{
 // The property attributes
 String documentId;
 String name;
 String description;
 List<IfcDocumentReference> documentReferences = new IfcSet<IfcDocumentReference>();
 String purpose;
 String intendedUse;
 String scope;
 String revision;
IfcActorSelect documentOwner;
 List<IfcActorSelect> editors = new IfcSet<IfcActorSelect>();
 IfcDateAndTime   creationTime;
 IfcDateAndTime   lastRevisionTime;
 IfcDocumentElectronicFormat   electronicFormat;
 IfcCalendarDate   validFrom;
 IfcCalendarDate   validUntil;
 String confidentiality;
 String status;
 // The inverse attributes

 InverseLinksList<IfcDocumentInformationRelationship> isPointedTo= new InverseLinksList<IfcDocumentInformationRelationship>();
 InverseLinksList<IfcDocumentInformationRelationship> isPointer= new InverseLinksList<IfcDocumentInformationRelationship>();


 // Getters and setters of properties

 public String getDocumentId() {
   return documentId;
 }
 public void setDocumentId(String value){
   this.documentId=value;

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

 public List<IfcDocumentReference> getDocumentReferences() {
   return documentReferences;

 }
 public void setDocumentReferences(IfcDocumentReference value){
   this.documentReferences.add(value);

 }

 public String getPurpose() {
   return purpose;
 }
 public void setPurpose(String value){
   this.purpose=value;

 }

 public String getIntendedUse() {
   return intendedUse;
 }
 public void setIntendedUse(String value){
   this.intendedUse=value;

 }

 public String getScope() {
   return scope;
 }
 public void setScope(String value){
   this.scope=value;

 }

 public String getRevision() {
   return revision;
 }
 public void setRevision(String value){
   this.revision=value;

 }

 public IfcActorSelect getDocumentOwner() {
   return documentOwner;
 }
 public void setDocumentOwner(IfcActorSelect value){
   this.documentOwner=value;

 }

 public List<IfcActorSelect> getEditors() {
   return editors;
 }
 public void setEditors(IfcActorSelect value){
   this.editors.add(value);

 }

 public IfcDateAndTime getCreationTime() {
   return creationTime;

 }
 public void setCreationTime(IfcDateAndTime value){
   this.creationTime=value;

 }

 public IfcDateAndTime getLastRevisionTime() {
   return lastRevisionTime;

 }
 public void setLastRevisionTime(IfcDateAndTime value){
   this.lastRevisionTime=value;

 }

 public IfcDocumentElectronicFormat getElectronicFormat() {
   return electronicFormat;

 }
 public void setElectronicFormat(IfcDocumentElectronicFormat value){
   this.electronicFormat=value;

 }

 public IfcCalendarDate getValidFrom() {
   return validFrom;

 }
 public void setValidFrom(IfcCalendarDate value){
   this.validFrom=value;

 }

 public IfcCalendarDate getValidUntil() {
   return validUntil;

 }
 public void setValidUntil(IfcCalendarDate value){
   this.validUntil=value;

 }

 public String getConfidentiality() {
   return confidentiality;
 }
 public void setConfidentiality(String value){
   this.confidentiality=value;

 }

 public String getStatus() {
   return status;
 }
 public void setStatus(String value){
   this.status=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcDocumentInformationRelationship> getIsPointedTo() {
   return isPointedTo;

 }
 public void setIsPointedTo(IfcDocumentInformationRelationship value){
   this.isPointedTo.add(value);

 }

 public InverseLinksList<IfcDocumentInformationRelationship> getIsPointer() {
   return isPointer;

 }
 public void setIsPointer(IfcDocumentInformationRelationship value){
   this.isPointer.add(value);

 }

}
