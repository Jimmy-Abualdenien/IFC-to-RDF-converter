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

public class IfcTask extends IfcProcess 
{
 // The property attributes
 String taskId;
 String status;
 String workMethod;
 String isMilestone;
 Long priority;


 // Getters and setters of properties

 public String getTaskId() {
   return taskId;
 }
 public void setTaskId(String value){
   this.taskId=value;

 }

 public String getStatus() {
   return status;
 }
 public void setStatus(String value){
   this.status=value;

 }

 public String getWorkMethod() {
   return workMethod;
 }
 public void setWorkMethod(String value){
   this.workMethod=value;

 }

 public String getIsMilestone() {
   return isMilestone;
 }
 public void setIsMilestone(String value){
   this.isMilestone=value;

 }

 public Long getPriority() {
   return priority;
 }
 public void setPriority(String txt){
   Long value = i.toLong(txt);
   this.priority=value;

 }

}
