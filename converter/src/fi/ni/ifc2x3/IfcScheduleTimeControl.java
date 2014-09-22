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

public class IfcScheduleTimeControl extends IfcControl 
{
 // The property attributes
IfcDateTimeSelect actualStart;
IfcDateTimeSelect earlyStart;
IfcDateTimeSelect lateStart;
IfcDateTimeSelect scheduleStart;
IfcDateTimeSelect actualFinish;
IfcDateTimeSelect earlyFinish;
IfcDateTimeSelect lateFinish;
IfcDateTimeSelect scheduleFinish;
 Double scheduleDuration;
 Double actualDuration;
 Double remainingTime;
 Double freeFloat;
 Double totalFloat;
 String isCritical;
IfcDateTimeSelect statusTime;
 Double startFloat;
 Double finishFloat;
 Double completion;
 // The inverse attributes

 InverseLinksList<IfcRelAssignsTasks> scheduleTimeControlAssigned= new InverseLinksList<IfcRelAssignsTasks>();


 // Getters and setters of properties

 public IfcDateTimeSelect getActualStart() {
   return actualStart;
 }
 public void setActualStart(IfcDateTimeSelect value){
   this.actualStart=value;

 }

 public IfcDateTimeSelect getEarlyStart() {
   return earlyStart;
 }
 public void setEarlyStart(IfcDateTimeSelect value){
   this.earlyStart=value;

 }

 public IfcDateTimeSelect getLateStart() {
   return lateStart;
 }
 public void setLateStart(IfcDateTimeSelect value){
   this.lateStart=value;

 }

 public IfcDateTimeSelect getScheduleStart() {
   return scheduleStart;
 }
 public void setScheduleStart(IfcDateTimeSelect value){
   this.scheduleStart=value;

 }

 public IfcDateTimeSelect getActualFinish() {
   return actualFinish;
 }
 public void setActualFinish(IfcDateTimeSelect value){
   this.actualFinish=value;

 }

 public IfcDateTimeSelect getEarlyFinish() {
   return earlyFinish;
 }
 public void setEarlyFinish(IfcDateTimeSelect value){
   this.earlyFinish=value;

 }

 public IfcDateTimeSelect getLateFinish() {
   return lateFinish;
 }
 public void setLateFinish(IfcDateTimeSelect value){
   this.lateFinish=value;

 }

 public IfcDateTimeSelect getScheduleFinish() {
   return scheduleFinish;
 }
 public void setScheduleFinish(IfcDateTimeSelect value){
   this.scheduleFinish=value;

 }

 public Double getScheduleDuration() {
   return scheduleDuration;
 }
 public void setScheduleDuration(String txt){
   Double value = i.toDouble(txt);
   this.scheduleDuration=value;

 }

 public Double getActualDuration() {
   return actualDuration;
 }
 public void setActualDuration(String txt){
   Double value = i.toDouble(txt);
   this.actualDuration=value;

 }

 public Double getRemainingTime() {
   return remainingTime;
 }
 public void setRemainingTime(String txt){
   Double value = i.toDouble(txt);
   this.remainingTime=value;

 }

 public Double getFreeFloat() {
   return freeFloat;
 }
 public void setFreeFloat(String txt){
   Double value = i.toDouble(txt);
   this.freeFloat=value;

 }

 public Double getTotalFloat() {
   return totalFloat;
 }
 public void setTotalFloat(String txt){
   Double value = i.toDouble(txt);
   this.totalFloat=value;

 }

 public String getIsCritical() {
   return isCritical;
 }
 public void setIsCritical(String value){
   this.isCritical=value;

 }

 public IfcDateTimeSelect getStatusTime() {
   return statusTime;
 }
 public void setStatusTime(IfcDateTimeSelect value){
   this.statusTime=value;

 }

 public Double getStartFloat() {
   return startFloat;
 }
 public void setStartFloat(String txt){
   Double value = i.toDouble(txt);
   this.startFloat=value;

 }

 public Double getFinishFloat() {
   return finishFloat;
 }
 public void setFinishFloat(String txt){
   Double value = i.toDouble(txt);
   this.finishFloat=value;

 }

 public Double getCompletion() {
   return completion;
 }
 public void setCompletion(String txt){
   Double value = i.toDouble(txt);
   this.completion=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelAssignsTasks> getScheduleTimeControlAssigned() {
   return scheduleTimeControlAssigned;

 }
 public void setScheduleTimeControlAssigned(IfcRelAssignsTasks value){
   this.scheduleTimeControlAssigned.add(value);

 }

}
