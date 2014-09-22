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

public class IfcStyledItem extends IfcRepresentationItem 
{
 // The property attributes
 IfcRepresentationItem   item;
 List<IfcPresentationStyleAssignment> styles = new IfcSet<IfcPresentationStyleAssignment>();
 String name;


 // Getters and setters of properties

 public IfcRepresentationItem getItem() {
   return item;

 }
 public void setItem(IfcRepresentationItem value){
   this.item=value;

 }

 public List<IfcPresentationStyleAssignment> getStyles() {
   return styles;

 }
 public void setStyles(IfcPresentationStyleAssignment value){
   this.styles.add(value);

 }

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

}
