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

public class IfcWorkControl extends IfcControl 
{
 // The property attributes
 String creationDate;
 List<IfcPerson> creators = new IfcSet<IfcPerson>();
 String purpose;
 String duration;
 String totalFloat;
 String startTime;
 String finishTime;


 // Getters and setters of properties

 public String getCreationDate() {
   return creationDate;
 }
 public void setCreationDate(String value){
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

 public String getDuration() {
   return duration;
 }
 public void setDuration(String value){
   this.duration=value;

 }

 public String getTotalFloat() {
   return totalFloat;
 }
 public void setTotalFloat(String value){
   this.totalFloat=value;

 }

 public String getStartTime() {
   return startTime;
 }
 public void setStartTime(String value){
   this.startTime=value;

 }

 public String getFinishTime() {
   return finishTime;
 }
 public void setFinishTime(String value){
   this.finishTime=value;

 }

}
