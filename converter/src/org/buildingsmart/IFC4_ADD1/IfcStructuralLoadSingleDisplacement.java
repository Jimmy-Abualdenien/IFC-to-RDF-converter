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

public class IfcStructuralLoadSingleDisplacement extends IfcStructuralLoadStatic 
{
 // The property attributes
 Double displacementX;
 Double displacementY;
 Double displacementZ;
 Long rotationalDisplacementRX;
 Long rotationalDisplacementRY;
 Long rotationalDisplacementRZ;


 // Getters and setters of properties

 public Double getDisplacementX() {
   return displacementX;
 }
 public void setDisplacementX(String txt){
   Double value = i.toDouble(txt);
   this.displacementX=value;

 }

 public Double getDisplacementY() {
   return displacementY;
 }
 public void setDisplacementY(String txt){
   Double value = i.toDouble(txt);
   this.displacementY=value;

 }

 public Double getDisplacementZ() {
   return displacementZ;
 }
 public void setDisplacementZ(String txt){
   Double value = i.toDouble(txt);
   this.displacementZ=value;

 }

 public Long getRotationalDisplacementRX() {
   return rotationalDisplacementRX;
 }
 public void setRotationalDisplacementRX(String txt){
   Long value = i.toLong(txt);
   this.rotationalDisplacementRX=value;

 }

 public Long getRotationalDisplacementRY() {
   return rotationalDisplacementRY;
 }
 public void setRotationalDisplacementRY(String txt){
   Long value = i.toLong(txt);
   this.rotationalDisplacementRY=value;

 }

 public Long getRotationalDisplacementRZ() {
   return rotationalDisplacementRZ;
 }
 public void setRotationalDisplacementRZ(String txt){
   Long value = i.toLong(txt);
   this.rotationalDisplacementRZ=value;

 }

}
