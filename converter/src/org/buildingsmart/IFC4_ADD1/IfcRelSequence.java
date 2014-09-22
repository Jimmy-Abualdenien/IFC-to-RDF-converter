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

public class IfcRelSequence extends IfcRelConnects 
{
 // The property attributes
 IfcProcess   relatingProcess;
 IfcProcess   relatedProcess;
 IfcLagTime   timeLag;
 String sequenceType;
 String userDefinedSequenceType;


 // Getters and setters of properties

 public IfcProcess getRelatingProcess() {
   return relatingProcess;

 }
 public void setRelatingProcess(IfcProcess value){
   this.relatingProcess=value;

 }

 public IfcProcess getRelatedProcess() {
   return relatedProcess;

 }
 public void setRelatedProcess(IfcProcess value){
   this.relatedProcess=value;

 }

 public IfcLagTime getTimeLag() {
   return timeLag;

 }
 public void setTimeLag(IfcLagTime value){
   this.timeLag=value;

 }

 public String getSequenceType() {
   return sequenceType;
 }
 public void setSequenceType(String value){
   this.sequenceType=value;

 }

 public String getUserDefinedSequenceType() {
   return userDefinedSequenceType;
 }
 public void setUserDefinedSequenceType(String value){
   this.userDefinedSequenceType=value;

 }

}
