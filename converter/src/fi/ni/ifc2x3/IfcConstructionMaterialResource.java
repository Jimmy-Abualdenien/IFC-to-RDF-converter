package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcSet;
import fi.ni.ifc2x3.interfaces.IfcActorSelect;

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

public class IfcConstructionMaterialResource extends IfcConstructionResource 
{
 // The property attributes
 List<IfcActorSelect> suppliers = new IfcSet<IfcActorSelect>();
 Double usageRatio;


 // Getters and setters of properties

 public List<IfcActorSelect> getSuppliers() {
   return suppliers;
 }
 public void setSuppliers(IfcActorSelect value){
   this.suppliers.add(value);

 }

 public Double getUsageRatio() {
   return usageRatio;
 }
 public void setUsageRatio(String txt){
   Double value = i.toDouble(txt);
   this.usageRatio=value;

 }

}
