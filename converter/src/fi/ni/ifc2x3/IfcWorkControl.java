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

public class IfcWorkControl extends IfcControl 
{
 // The property attributes
 String identifier;
IfcDateTimeSelect creationDate;
 List<IfcPerson> creators = new IfcSet<IfcPerson>();
 String purpose;
 Double duration;
 Double totalFloat;
IfcDateTimeSelect startTime;
IfcDateTimeSelect finishTime;
 String workControlType;
 String userDefinedControlType;


 // Getters and setters of properties

 public String getIdentifier() {
   return identifier;
 }
 public void setIdentifier(String value){
   this.identifier=value;

 }

 public IfcDateTimeSelect getCreationDate() {
   return creationDate;
 }
 public void setCreationDate(IfcDateTimeSelect value){
   this.creationDate=value;

 }

 public List<IfcPerson> getCreators() {
   return creators;

 }
 public void setCreators(IfcPerson value){
   this.creators.add(value);

 }

 public String getPurpose() {
   return purpose;
 }
 public void setPurpose(String value){
   this.purpose=value;

 }

 public Double getDuration() {
   return duration;
 }
 public void setDuration(String txt){
   Double value = i.toDouble(txt);
   this.duration=value;

 }

 public Double getTotalFloat() {
   return totalFloat;
 }
 public void setTotalFloat(String txt){
   Double value = i.toDouble(txt);
   this.totalFloat=value;

 }

 public IfcDateTimeSelect getStartTime() {
   return startTime;
 }
 public void setStartTime(IfcDateTimeSelect value){
   this.startTime=value;

 }

 public IfcDateTimeSelect getFinishTime() {
   return finishTime;
 }
 public void setFinishTime(IfcDateTimeSelect value){
   this.finishTime=value;

 }

 public String getWorkControlType() {
   return workControlType;
 }
 public void setWorkControlType(String value){
   this.workControlType=value;

 }

 public String getUserDefinedControlType() {
   return userDefinedControlType;
 }
 public void setUserDefinedControlType(String value){
   this.userDefinedControlType=value;

 }

}
