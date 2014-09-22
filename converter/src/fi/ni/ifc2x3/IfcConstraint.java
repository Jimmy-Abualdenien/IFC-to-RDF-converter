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

public class IfcConstraint extends Thing 
{
 // The property attributes
 String name;
 String description;
 String constraintGrade;
 String constraintSource;
IfcActorSelect creatingActor;
IfcDateTimeSelect creationTime;
 String userDefinedGrade;
 // The inverse attributes

 InverseLinksList<IfcConstraintClassificationRelationship> classifiedAs= new InverseLinksList<IfcConstraintClassificationRelationship>();
 InverseLinksList<IfcConstraintRelationship> relatesConstraints= new InverseLinksList<IfcConstraintRelationship>();
 InverseLinksList<IfcConstraintRelationship> isRelatedWith= new InverseLinksList<IfcConstraintRelationship>();
 InverseLinksList<IfcPropertyConstraintRelationship> propertiesForConstraint= new InverseLinksList<IfcPropertyConstraintRelationship>();
 InverseLinksList<IfcConstraintAggregationRelationship> aggregates= new InverseLinksList<IfcConstraintAggregationRelationship>();
 InverseLinksList<IfcConstraintAggregationRelationship> isAggregatedIn= new InverseLinksList<IfcConstraintAggregationRelationship>();


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

 public IfcDateTimeSelect getCreationTime() {
   return creationTime;
 }
 public void setCreationTime(IfcDateTimeSelect value){
   this.creationTime=value;

 }

 public String getUserDefinedGrade() {
   return userDefinedGrade;
 }
 public void setUserDefinedGrade(String value){
   this.userDefinedGrade=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcConstraintClassificationRelationship> getClassifiedAs() {
   return classifiedAs;

 }
 public void setClassifiedAs(IfcConstraintClassificationRelationship value){
   this.classifiedAs.add(value);

 }

 public InverseLinksList<IfcConstraintRelationship> getRelatesConstraints() {
   return relatesConstraints;

 }
 public void setRelatesConstraints(IfcConstraintRelationship value){
   this.relatesConstraints.add(value);

 }

 public InverseLinksList<IfcConstraintRelationship> getIsRelatedWith() {
   return isRelatedWith;

 }
 public void setIsRelatedWith(IfcConstraintRelationship value){
   this.isRelatedWith.add(value);

 }

 public InverseLinksList<IfcPropertyConstraintRelationship> getPropertiesForConstraint() {
   return propertiesForConstraint;

 }
 public void setPropertiesForConstraint(IfcPropertyConstraintRelationship value){
   this.propertiesForConstraint.add(value);

 }

 public InverseLinksList<IfcConstraintAggregationRelationship> getAggregates() {
   return aggregates;

 }
 public void setAggregates(IfcConstraintAggregationRelationship value){
   this.aggregates.add(value);

 }

 public InverseLinksList<IfcConstraintAggregationRelationship> getIsAggregatedIn() {
   return isAggregatedIn;

 }
 public void setIsAggregatedIn(IfcConstraintAggregationRelationship value){
   this.isAggregatedIn.add(value);

 }

}
