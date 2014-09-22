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

public class IfcCostSchedule extends IfcControl 
{
 // The property attributes
IfcActorSelect submittedBy;
IfcActorSelect preparedBy;
IfcDateTimeSelect submittedOn;
 String status;
 List<IfcActorSelect> targetUsers = new IfcSet<IfcActorSelect>();
IfcDateTimeSelect updateDate;
 String iD;
 String predefinedType;


 // Getters and setters of properties

 public IfcActorSelect getSubmittedBy() {
   return submittedBy;
 }
 public void setSubmittedBy(IfcActorSelect value){
   this.submittedBy=value;

 }

 public IfcActorSelect getPreparedBy() {
   return preparedBy;
 }
 public void setPreparedBy(IfcActorSelect value){
   this.preparedBy=value;

 }

 public IfcDateTimeSelect getSubmittedOn() {
   return submittedOn;
 }
 public void setSubmittedOn(IfcDateTimeSelect value){
   this.submittedOn=value;

 }

 public String getStatus() {
   return status;
 }
 public void setStatus(String value){
   this.status=value;

 }

 public List<IfcActorSelect> getTargetUsers() {
   return targetUsers;
 }
 public void setTargetUsers(IfcActorSelect value){
   this.targetUsers.add(value);

 }

 public IfcDateTimeSelect getUpdateDate() {
   return updateDate;
 }
 public void setUpdateDate(IfcDateTimeSelect value){
   this.updateDate=value;

 }

 public String getID() {
   return iD;
 }
 public void setID(String value){
   this.iD=value;

 }

 public String getPredefinedType() {
   return predefinedType;
 }
 public void setPredefinedType(String value){
   this.predefinedType=value;

 }

}
