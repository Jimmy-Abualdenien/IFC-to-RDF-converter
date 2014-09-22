package org.buildingsmart.IFC4_ADD1;
import org.buildingsmart.IFC4_ADD1.interfaces.*;
import org.buildingsmart.*;
import java.util.*;

/*
 * IFC Java class
The MIT License (MIT)

 * @author Jyrki Oraskari
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

public class IfcDocumentInformation extends IfcExternalInformation implements IfcDocumentSelect
{
 // The property attributes
 String identification;
 String name;
 String description;
 String location;
 String purpose;
 String intendedUse;
 String scope;
 String revision;
IfcActorSelect documentOwner;
 List<IfcActorSelect> editors = new IfcSet<IfcActorSelect>();
 String creationTime;
 String lastRevisionTime;
 String electronicFormat;
 String validFrom;
 String validUntil;
 String confidentiality;
 String status;
 // The inverse attributes

 InverseLinksList<IfcRelAssociatesDocument> documentInfoForObjects= new InverseLinksList<IfcRelAssociatesDocument>();
 InverseLinksList<IfcDocumentReference> hasDocumentReferences= new InverseLinksList<IfcDocumentReference>();
 InverseLinksList<IfcDocumentInformationRelationship> isPointedTo= new InverseLinksList<IfcDocumentInformationRelationship>();
 InverseLinksList<IfcDocumentInformationRelationship> isPointer= new InverseLinksList<IfcDocumentInformationRelationship>();


 // Getters and setters of properties

 public String getIdentification() {
   return identification;
 }
 public void setIdentification(String value){
   this.identification=value;

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

 public String getLocation() {
   return location;
 }
 public void setLocation(String value){
   this.location=value;

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

 public String getCreationTime() {
   return creationTime;
 }
 public void setCreationTime(String value){
   this.creationTime=value;

 }

 public String getLastRevisionTime() {
   return lastRevisionTime;
 }
 public void setLastRevisionTime(String value){
   this.lastRevisionTime=value;

 }

 public String getElectronicFormat() {
   return electronicFormat;
 }
 public void setElectronicFormat(String value){
   this.electronicFormat=value;

 }

 public String getValidFrom() {
   return validFrom;
 }
 public void setValidFrom(String value){
   this.validFrom=value;

 }

 public String getValidUntil() {
   return validUntil;
 }
 public void setValidUntil(String value){
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

 public InverseLinksList<IfcRelAssociatesDocument> getDocumentInfoForObjects() {
   return documentInfoForObjects;

 }
 public void setDocumentInfoForObjects(IfcRelAssociatesDocument value){
   this.documentInfoForObjects.add(value);

 }

 public InverseLinksList<IfcDocumentReference> getHasDocumentReferences() {
   return hasDocumentReferences;

 }
 public void setHasDocumentReferences(IfcDocumentReference value){
   this.hasDocumentReferences.add(value);

 }

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
