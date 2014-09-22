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

public class IfcBSplineSurface extends IfcBoundedSurface 
{
 // The property attributes
 Long uDegree;
 Long vDegree;
 List<IfcCartesianPoint> controlPointsList = new IfcList<IfcCartesianPoint>();
 String surfaceForm;
 String uClosed;
 String vClosed;
 String selfIntersect;


 // Getters and setters of properties

 public Long getUDegree() {
   return uDegree;
 }
 public void setUDegree(String txt){
   Long value = i.toLong(txt);
   this.uDegree=value;

 }

 public Long getVDegree() {
   return vDegree;
 }
 public void setVDegree(String txt){
   Long value = i.toLong(txt);
   this.vDegree=value;

 }

 public List<IfcCartesianPoint> getControlPointsList() {
   return controlPointsList;

 }
 public void setControlPointsList(IfcCartesianPoint value){
   this.controlPointsList.add(value);

 }

 public String getSurfaceForm() {
   return surfaceForm;
 }
 public void setSurfaceForm(String value){
   this.surfaceForm=value;

 }

 public String getUClosed() {
   return uClosed;
 }
 public void setUClosed(String value){
   this.uClosed=value;

 }

 public String getVClosed() {
   return vClosed;
 }
 public void setVClosed(String value){
   this.vClosed=value;

 }

 public String getSelfIntersect() {
   return selfIntersect;
 }
 public void setSelfIntersect(String value){
   this.selfIntersect=value;

 }

}
