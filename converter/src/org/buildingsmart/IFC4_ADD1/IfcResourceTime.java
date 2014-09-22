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

public class IfcResourceTime extends IfcSchedulingTime 
{
 // The property attributes
 String scheduleWork;
 Double scheduleUsage;
 String scheduleStart;
 String scheduleFinish;
 String scheduleContour;
 String levelingDelay;
 String isOverAllocated;
 String statusTime;
 String actualWork;
 Double actualUsage;
 String actualStart;
 String actualFinish;
 String remainingWork;
 Double remainingUsage;
 Double completion;


 // Getters and setters of properties

 public String getScheduleWork() {
   return scheduleWork;
 }
 public void setScheduleWork(String value){
   this.scheduleWork=value;

 }

 public Double getScheduleUsage() {
   return scheduleUsage;
 }
 public void setScheduleUsage(String txt){
   Double value = i.toDouble(txt);
   this.scheduleUsage=value;

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

 public String getScheduleContour() {
   return scheduleContour;
 }
 public void setScheduleContour(String value){
   this.scheduleContour=value;

 }

 public String getLevelingDelay() {
   return levelingDelay;
 }
 public void setLevelingDelay(String value){
   this.levelingDelay=value;

 }

 public String getIsOverAllocated() {
   return isOverAllocated;
 }
 public void setIsOverAllocated(String value){
   this.isOverAllocated=value;

 }

 public String getStatusTime() {
   return statusTime;
 }
 public void setStatusTime(String value){
   this.statusTime=value;

 }

 public String getActualWork() {
   return actualWork;
 }
 public void setActualWork(String value){
   this.actualWork=value;

 }

 public Double getActualUsage() {
   return actualUsage;
 }
 public void setActualUsage(String txt){
   Double value = i.toDouble(txt);
   this.actualUsage=value;

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

 public String getRemainingWork() {
   return remainingWork;
 }
 public void setRemainingWork(String value){
   this.remainingWork=value;

 }

 public Double getRemainingUsage() {
   return remainingUsage;
 }
 public void setRemainingUsage(String txt){
   Double value = i.toDouble(txt);
   this.remainingUsage=value;

 }

 public Double getCompletion() {
   return completion;
 }
 public void setCompletion(String txt){
   Double value = i.toDouble(txt);
   this.completion=value;

 }

}
