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

public class IfcRelAssociates extends IfcRelationship 
{
 // The property attributes
 List<IfcRoot> relatedObjects = new IfcSet<IfcRoot>();


 // Getters and setters of properties

 public List<IfcRoot> getRelatedObjects() {
   return relatedObjects;

 }
 public void setRelatedObjects(IfcRoot value){
   this.relatedObjects.add(value);

 }

}
