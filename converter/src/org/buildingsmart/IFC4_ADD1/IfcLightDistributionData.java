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

public class IfcLightDistributionData extends Thing 
{
 // The property attributes
 Long mainPlaneAngle;
 List<Long> secondaryPlaneAngle = new IfcList<Long>();
 List<Double> luminousIntensity = new IfcList<Double>();


 // Getters and setters of properties

 public Long getMainPlaneAngle() {
   return mainPlaneAngle;
 }
 public void setMainPlaneAngle(String txt){
   Long value = i.toLong(txt);
   this.mainPlaneAngle=value;

 }

 public List<Long> getSecondaryPlaneAngle() {
   return secondaryPlaneAngle;
 }
 public void setSecondaryPlaneAngle(String txt){
   List<Long> value = i.toLongList(txt);
   this.secondaryPlaneAngle=value;

 }

 public List<Double> getLuminousIntensity() {
   return luminousIntensity;
 }
 public void setLuminousIntensity(String txt){
   List<Double> value = i.toDoubleList(txt);
   this.luminousIntensity=value;

 }

}
