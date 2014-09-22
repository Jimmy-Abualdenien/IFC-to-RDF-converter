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

public class IfcProperty extends Thing 
{
 // The property attributes
 String name;
 String description;
 // The inverse attributes

 InverseLinksList<IfcPropertyDependencyRelationship> propertyForDependance= new InverseLinksList<IfcPropertyDependencyRelationship>();
 InverseLinksList<IfcPropertyDependencyRelationship> propertyDependsOn= new InverseLinksList<IfcPropertyDependencyRelationship>();
 InverseLinksList<IfcComplexProperty> partOfComplex= new InverseLinksList<IfcComplexProperty>();


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

 // Getters and setters of inverse values

 public InverseLinksList<IfcPropertyDependencyRelationship> getPropertyForDependance() {
   return propertyForDependance;

 }
 public void setPropertyForDependance(IfcPropertyDependencyRelationship value){
   this.propertyForDependance.add(value);

 }

 public InverseLinksList<IfcPropertyDependencyRelationship> getPropertyDependsOn() {
   return propertyDependsOn;

 }
 public void setPropertyDependsOn(IfcPropertyDependencyRelationship value){
   this.propertyDependsOn.add(value);

 }

 public InverseLinksList<IfcComplexProperty> getPartOfComplex() {
   return partOfComplex;

 }
 public void setPartOfComplex(IfcComplexProperty value){
   this.partOfComplex.add(value);

 }

}
