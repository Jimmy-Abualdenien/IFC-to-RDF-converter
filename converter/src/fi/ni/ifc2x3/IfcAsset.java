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

public class IfcAsset extends IfcGroup 
{
 // The property attributes
 String assetID;
 IfcCostValue   originalValue;
 IfcCostValue   currentValue;
 IfcCostValue   totalReplacementCost;
IfcActorSelect owner;
IfcActorSelect user;
 IfcPerson   responsiblePerson;
 IfcCalendarDate   incorporationDate;
 IfcCostValue   depreciatedValue;


 // Getters and setters of properties

 public String getAssetID() {
   return assetID;
 }
 public void setAssetID(String value){
   this.assetID=value;

 }

 public IfcCostValue getOriginalValue() {
   return originalValue;

 }
 public void setOriginalValue(IfcCostValue value){
   this.originalValue=value;

 }

 public IfcCostValue getCurrentValue() {
   return currentValue;

 }
 public void setCurrentValue(IfcCostValue value){
   this.currentValue=value;

 }

 public IfcCostValue getTotalReplacementCost() {
   return totalReplacementCost;

 }
 public void setTotalReplacementCost(IfcCostValue value){
   this.totalReplacementCost=value;

 }

 public IfcActorSelect getOwner() {
   return owner;
 }
 public void setOwner(IfcActorSelect value){
   this.owner=value;

 }

 public IfcActorSelect getUser() {
   return user;
 }
 public void setUser(IfcActorSelect value){
   this.user=value;

 }

 public IfcPerson getResponsiblePerson() {
   return responsiblePerson;

 }
 public void setResponsiblePerson(IfcPerson value){
   this.responsiblePerson=value;

 }

 public IfcCalendarDate getIncorporationDate() {
   return incorporationDate;

 }
 public void setIncorporationDate(IfcCalendarDate value){
   this.incorporationDate=value;

 }

 public IfcCostValue getDepreciatedValue() {
   return depreciatedValue;

 }
 public void setDepreciatedValue(IfcCostValue value){
   this.depreciatedValue=value;

 }

}
