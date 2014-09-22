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

public class IfcApproval extends Thing implements IfcResourceObjectSelect
{
 // The property attributes
 String identifier;
 String name;
 String description;
 String timeOfApproval;
 String status;
 String level;
 String qualifier;
IfcActorSelect requestingApproval;
IfcActorSelect givingApproval;
 // The inverse attributes

 InverseLinksList<IfcExternalReferenceRelationship> hasExternalReferences= new InverseLinksList<IfcExternalReferenceRelationship>();
 InverseLinksList<IfcRelAssociatesApproval> approvedObjects= new InverseLinksList<IfcRelAssociatesApproval>();
 InverseLinksList<IfcResourceApprovalRelationship> approvedResources= new InverseLinksList<IfcResourceApprovalRelationship>();
 InverseLinksList<IfcApprovalRelationship> isRelatedWith= new InverseLinksList<IfcApprovalRelationship>();
 InverseLinksList<IfcApprovalRelationship> relates= new InverseLinksList<IfcApprovalRelationship>();


 // Getters and setters of properties

 public String getIdentifier() {
   return identifier;
 }
 public void setIdentifier(String value){
   this.identifier=value;

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

 public String getTimeOfApproval() {
   return timeOfApproval;
 }
 public void setTimeOfApproval(String value){
   this.timeOfApproval=value;

 }

 public String getStatus() {
   return status;
 }
 public void setStatus(String value){
   this.status=value;

 }

 public String getLevel() {
   return level;
 }
 public void setLevel(String value){
   this.level=value;

 }

 public String getQualifier() {
   return qualifier;
 }
 public void setQualifier(String value){
   this.qualifier=value;

 }

 public IfcActorSelect getRequestingApproval() {
   return requestingApproval;
 }
 public void setRequestingApproval(IfcActorSelect value){
   this.requestingApproval=value;

 }

 public IfcActorSelect getGivingApproval() {
   return givingApproval;
 }
 public void setGivingApproval(IfcActorSelect value){
   this.givingApproval=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcExternalReferenceRelationship> getHasExternalReferences() {
   return hasExternalReferences;

 }
 public void setHasExternalReferences(IfcExternalReferenceRelationship value){
   this.hasExternalReferences.add(value);

 }

 public InverseLinksList<IfcRelAssociatesApproval> getApprovedObjects() {
   return approvedObjects;

 }
 public void setApprovedObjects(IfcRelAssociatesApproval value){
   this.approvedObjects.add(value);

 }

 public InverseLinksList<IfcResourceApprovalRelationship> getApprovedResources() {
   return approvedResources;

 }
 public void setApprovedResources(IfcResourceApprovalRelationship value){
   this.approvedResources.add(value);

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
