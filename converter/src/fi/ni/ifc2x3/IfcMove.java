package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcList;

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

public class IfcMove extends IfcTask 
{
 // The property attributes
 IfcSpatialStructureElement   moveFrom;
 IfcSpatialStructureElement   moveTo;
 List<String> punchList = new IfcList<String>();


 // Getters and setters of properties

 public IfcSpatialStructureElement getMoveFrom() {
   return moveFrom;

 }
 public void setMoveFrom(IfcSpatialStructureElement value){
   this.moveFrom=value;

 }

 public IfcSpatialStructureElement getMoveTo() {
   return moveTo;

 }
 public void setMoveTo(IfcSpatialStructureElement value){
   this.moveTo=value;

 }

 public List<String> getPunchList() {
   return punchList;
 }
 public void setPunchList(String value){
   this.punchList.add(value);

 }

}
