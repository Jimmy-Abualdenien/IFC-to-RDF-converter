package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcList;
import fi.ni.InverseLinksList;
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

public class IfcTableRow extends Thing 
{
 // The property attributes
 List<String> rowCells = new IfcList<String>();
 String isHeading;
 // The inverse attributes

 InverseLinksList<IfcTable> ofTable= new InverseLinksList<IfcTable>();


 // Getters and setters of properties

 public List<String> getRowCells() {
   return rowCells;
 }
 public void setRowCells(String value){
   this.rowCells.add(value);

 }

 public String getIsHeading() {
   return isHeading;
 }
 public void setIsHeading(String value){
   this.isHeading=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcTable> getOfTable() {
   return ofTable;

 }
 public void setOfTable(IfcTable value){
   this.ofTable.add(value);

 }

}
