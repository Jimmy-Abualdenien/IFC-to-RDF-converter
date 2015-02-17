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

public class IfcInventory extends IfcGroup 
{
 // The property attributes
 String inventoryType;
IfcActorSelect jurisdiction;
 List<IfcPerson> responsiblePersons = new IfcSet<IfcPerson>();
 IfcCalendarDate   lastUpdateDate;
 IfcCostValue   currentValue;
 IfcCostValue   originalValue;


 // Getters and setters of properties

 public String getInventoryType() {
   return inventoryType;
 }
 public void setInventoryType(String value){
   this.inventoryType=value;

 }

 public IfcActorSelect getJurisdiction() {
   return jurisdiction;
 }
 public void setJurisdiction(IfcActorSelect value){
   this.jurisdiction=value;

 }

 public List<IfcPerson> getResponsiblePersons() {
   return responsiblePersons;

 }
 public void setResponsiblePersons(IfcPerson value){
   this.responsiblePersons.add(value);

 }

 public IfcCalendarDate getLastUpdateDate() {
   return lastUpdateDate;

 }
 public void setLastUpdateDate(IfcCalendarDate value){
   this.lastUpdateDate=value;

 }

 public IfcCostValue getCurrentValue() {
   return currentValue;

 }
 public void setCurrentValue(IfcCostValue value){
   this.currentValue=value;

 }

 public IfcCostValue getOriginalValue() {
   return originalValue;

 }
 public void setOriginalValue(IfcCostValue value){
   this.originalValue=value;

 }

}
