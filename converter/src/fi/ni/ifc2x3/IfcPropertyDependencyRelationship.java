package fi.ni.ifc2x3;
import fi.ni.Thing;

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

public class IfcPropertyDependencyRelationship extends Thing 
{
 // The property attributes
 IfcProperty   dependingProperty;
 IfcProperty   dependantProperty;
 String name;
 String description;
 String expression;


 // Getters and setters of properties

 public IfcProperty getDependingProperty() {
   return dependingProperty;

 }
 public void setDependingProperty(IfcProperty value){
   this.dependingProperty=value;

 }

 public IfcProperty getDependantProperty() {
   return dependantProperty;

 }
 public void setDependantProperty(IfcProperty value){
   this.dependantProperty=value;

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

 public String getExpression() {
   return expression;
 }
 public void setExpression(String value){
   this.expression=value;

 }

}
