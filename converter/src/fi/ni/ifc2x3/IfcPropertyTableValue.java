package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcList;
import fi.ni.ifc2x3.interfaces.IfcUnit;

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

public class IfcPropertyTableValue extends IfcSimpleProperty 
{
 // The property attributes
 List<String> definingValues = new IfcList<String>();
 List<String> definedValues = new IfcList<String>();
 String expression;
IfcUnit definingUnit;
IfcUnit definedUnit;


 // Getters and setters of properties

 public List<String> getDefiningValues() {
   return definingValues;
 }
 public void setDefiningValues(String value){
   this.definingValues.add(value);

 }

 public List<String> getDefinedValues() {
   return definedValues;
 }
 public void setDefinedValues(String value){
   this.definedValues.add(value);

 }

 public String getExpression() {
   return expression;
 }
 public void setExpression(String value){
   this.expression=value;

 }

 public IfcUnit getDefiningUnit() {
   return definingUnit;
 }
 public void setDefiningUnit(IfcUnit value){
   this.definingUnit=value;

 }

 public IfcUnit getDefinedUnit() {
   return definedUnit;
 }
 public void setDefinedUnit(IfcUnit value){
   this.definedUnit=value;

 }

}
