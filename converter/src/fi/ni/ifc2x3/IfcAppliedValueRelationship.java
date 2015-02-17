package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcSet;
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

public class IfcAppliedValueRelationship extends Thing 
{
 // The property attributes
 IfcAppliedValue   componentOfTotal;
 List<IfcAppliedValue> components = new IfcSet<IfcAppliedValue>();
 String arithmeticOperator;
 String name;
 String description;


 // Getters and setters of properties

 public IfcAppliedValue getComponentOfTotal() {
   return componentOfTotal;

 }
 public void setComponentOfTotal(IfcAppliedValue value){
   this.componentOfTotal=value;

 }

 public List<IfcAppliedValue> getComponents() {
   return components;

 }
 public void setComponents(IfcAppliedValue value){
   this.components.add(value);

 }

 public String getArithmeticOperator() {
   return arithmeticOperator;
 }
 public void setArithmeticOperator(String value){
   this.arithmeticOperator=value;

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

}
