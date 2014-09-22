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

public class IfcRecurrencePattern extends Thing 
{
 // The property attributes
 String recurrenceType;
 List<Long> dayComponent = new IfcSet<Long>();
 List<String> weekdayComponent = new IfcSet<String>();
 List<String> monthComponent = new IfcSet<String>();
 Long position;
 Long interval;
 Long occurrences;
 List<IfcTimePeriod> timePeriods = new IfcList<IfcTimePeriod>();


 // Getters and setters of properties

 public String getRecurrenceType() {
   return recurrenceType;
 }
 public void setRecurrenceType(String value){
   this.recurrenceType=value;

 }

 public List<Long> getDayComponent() {
   return dayComponent;
 }
 public void setDayComponent(String txt){
   List<Long> value = i.toLongList(txt);
   this.dayComponent=value;

 }

 public List<String> getWeekdayComponent() {
   return weekdayComponent;
 }
 public void setWeekdayComponent(String value){
   this.weekdayComponent.add(value);

 }

 public List<String> getMonthComponent() {
   return monthComponent;
 }
 public void setMonthComponent(String value){
   this.monthComponent.add(value);

 }

 public Long getPosition() {
   return position;
 }
 public void setPosition(String txt){
   Long value = i.toLong(txt);
   this.position=value;

 }

 public Long getInterval() {
   return interval;
 }
 public void setInterval(String txt){
   Long value = i.toLong(txt);
   this.interval=value;

 }

 public Long getOccurrences() {
   return occurrences;
 }
 public void setOccurrences(String txt){
   Long value = i.toLong(txt);
   this.occurrences=value;

 }

 public List<IfcTimePeriod> getTimePeriods() {
   return timePeriods;

 }
 public void setTimePeriods(IfcTimePeriod value){
   this.timePeriods.add(value);

 }

}
