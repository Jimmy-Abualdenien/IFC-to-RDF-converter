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

public class IfcPhysicalComplexQuantity extends IfcPhysicalQuantity 
{
 // The property attributes
 List<IfcPhysicalQuantity> hasQuantities = new IfcSet<IfcPhysicalQuantity>();
 String discrimination;
 String quality;
 String usage;


 // Getters and setters of properties

 public List<IfcPhysicalQuantity> getHasQuantities() {
   return hasQuantities;

 }
 public void setHasQuantities(IfcPhysicalQuantity value){
   this.hasQuantities.add(value);

 }

 public String getDiscrimination() {
   return discrimination;
 }
 public void setDiscrimination(String value){
   this.discrimination=value;

 }

 public String getQuality() {
   return quality;
 }
 public void setQuality(String value){
   this.quality=value;

 }

 public String getUsage() {
   return usage;
 }
 public void setUsage(String value){
   this.usage=value;

 }

}
