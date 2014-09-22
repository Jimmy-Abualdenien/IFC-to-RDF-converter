package org.buildingsmart.IFC4_ADD1;
import org.buildingsmart.IFC4_ADD1.interfaces.*;
import org.buildingsmart.*;
import java.util.*;

/*
 * IFC Java class
The MIT License (MIT)

 * @author Jyrki Oraskari
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

public class IfcTaskTime extends IfcSchedulingTime 
{
 // The property attributes
 String durationType;
 String scheduleDuration;
 String scheduleStart;
 String scheduleFinish;
 String earlyStart;
 String earlyFinish;
 String lateStart;
 String lateFinish;
 String freeFloat;
 String totalFloat;
 String isCritical;
 String statusTime;
 String actualDuration;
 String actualStart;
 String actualFinish;
 String remainingTime;
 Double completion;


 // Getters and setters of properties

 public String getDurationType() {
   return durationType;
 }
 public void setDurationType(String value){
   this.durationType=value;

 }

 public String getScheduleDuration() {
   return scheduleDuration;
 }
 public void setScheduleDuration(String value){
   this.scheduleDuration=value;

 }

 public String getScheduleStart() {
   return scheduleStart;
 }
 public void setScheduleStart(String value){
   this.scheduleStart=value;

 }

 public String getScheduleFinish() {
   return scheduleFinish;
 }
 public void setScheduleFinish(String value){
   this.scheduleFinish=value;

 }

 public String getEarlyStart() {
   return earlyStart;
 }
 public void setEarlyStart(String value){
   this.earlyStart=value;

 }

 public String getEarlyFinish() {
   return earlyFinish;
 }
 public void setEarlyFinish(String value){
   this.earlyFinish=value;

 }

 public String getLateStart() {
   return lateStart;
 }
 public void setLateStart(String value){
   this.lateStart=value;

 }

 public String getLateFinish() {
   return lateFinish;
 }
 public void setLateFinish(String value){
   this.lateFinish=value;

 }

 public String getFreeFloat() {
   return freeFloat;
 }
 public void setFreeFloat(String value){
   this.freeFloat=value;

 }

 public String getTotalFloat() {
   return totalFloat;
 }
 public void setTotalFloat(String value){
   this.totalFloat=value;

 }

 public String getIsCritical() {
   return isCritical;
 }
 public void setIsCritical(String value){
   this.isCritical=value;

 }

 public String getStatusTime() {
   return statusTime;
 }
 public void setStatusTime(String value){
   this.statusTime=value;

 }

 public String getActualDuration() {
   return actualDuration;
 }
 public void setActualDuration(String value){
   this.actualDuration=value;

 }

 public String getActualStart() {
   return actualStart;
 }
 public void setActualStart(String value){
   this.actualStart=value;

 }

 public String getActualFinish() {
   return actualFinish;
 }
 public void setActualFinish(String value){
   this.actualFinish=value;

 }

 public String getRemainingTime() {
   return remainingTime;
 }
 public void setRemainingTime(String value){
   this.remainingTime=value;

 }

 public Double getCompletion() {
   return completion;
 }
 public void setCompletion(String txt){
   Double value = i.toDouble(txt);
   this.completion=value;

 }

}
