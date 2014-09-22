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

public class IfcConstraint extends Thing implements IfcResourceObjectSelect
{
 // The property attributes
 String name;
 String description;
 String constraintGrade;
 String constraintSource;
IfcActorSelect creatingActor;
 String creationTime;
 String userDefinedGrade;
 // The inverse attributes

 InverseLinksList<IfcExternalReferenceRelationship> hasExternalReferences= new InverseLinksList<IfcExternalReferenceRelationship>();
 InverseLinksList<IfcResourceConstraintRelationship> propertiesForConstraint= new InverseLinksList<IfcResourceConstraintRelationship>();


 // Getters and setters of properties

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

 public String getConstraintGrade() {
   return constraintGrade;
 }
 public void setConstraintGrade(String value){
   this.constraintGrade=value;

 }

 public String getConstraintSource() {
   return constraintSource;
 }
 public void setConstraintSource(String value){
   this.constraintSource=value;

 }

 public IfcActorSelect getCreatingActor() {
   return creatingActor;
 }
 public void setCreatingActor(IfcActorSelect value){
   this.creatingActor=value;

 }

 public String getCreationTime() {
   return creationTime;
 }
 public void setCreationTime(String value){
   this.creationTime=value;

 }

 public String getUserDefinedGrade() {
   return userDefinedGrade;
 }
 public void setUserDefinedGrade(String value){
   this.userDefinedGrade=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcExternalReferenceRelationship> getHasExternalReferences() {
   return hasExternalReferences;

 }
 public void setHasExternalReferences(IfcExternalReferenceRelationship value){
   this.hasExternalReferences.add(value);

 }

 public InverseLinksList<IfcResourceConstraintRelationship> getPropertiesForConstraint() {
   return propertiesForConstraint;

 }
 public void setPropertiesForConstraint(IfcResourceConstraintRelationship value){
   this.propertiesForConstraint.add(value);

 }

}
