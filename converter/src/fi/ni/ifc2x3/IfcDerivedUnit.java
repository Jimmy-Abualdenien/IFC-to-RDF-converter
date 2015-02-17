package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcSet;
import fi.ni.Thing;
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

public class IfcDerivedUnit extends Thing implements IfcUnit
{
 // The property attributes
 List<IfcDerivedUnitElement> elements = new IfcSet<IfcDerivedUnitElement>();
 String unitType;
 String userDefinedType;


 // Getters and setters of properties

 public List<IfcDerivedUnitElement> getElements() {
   return elements;

 }
 public void setElements(IfcDerivedUnitElement value){
   this.elements.add(value);

 }

 public String getUnitType() {
   return unitType;
 }
 public void setUnitType(String value){
   this.unitType=value;

 }

 public String getUserDefinedType() {
   return userDefinedType;
 }
 public void setUserDefinedType(String value){
   this.userDefinedType=value;

 }

}
