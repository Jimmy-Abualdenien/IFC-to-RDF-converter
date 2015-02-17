package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcSet;

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

public class IfcComplexProperty extends IfcProperty 
{
 // The property attributes
 String usageName;
 List<IfcProperty> hasProperties = new IfcSet<IfcProperty>();


 // Getters and setters of properties

 public String getUsageName() {
   return usageName;
 }
 public void setUsageName(String value){
   this.usageName=value;

 }

 public List<IfcProperty> getHasProperties() {
   return hasProperties;

 }
 public void setHasProperties(IfcProperty value){
   this.hasProperties.add(value);

 }

}
