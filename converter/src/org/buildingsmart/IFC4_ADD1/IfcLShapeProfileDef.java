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

public class IfcLShapeProfileDef extends IfcParameterizedProfileDef 
{
 // The property attributes
 Double depth;
 Double width;
 Double thickness;
 Double filletRadius;
 Double edgeRadius;
 Long legSlope;


 // Getters and setters of properties

 public Double getDepth() {
   return depth;
 }
 public void setDepth(String txt){
   Double value = i.toDouble(txt);
   this.depth=value;

 }

 public Double getWidth() {
   return width;
 }
 public void setWidth(String txt){
   Double value = i.toDouble(txt);
   this.width=value;

 }

 public Double getThickness() {
   return thickness;
 }
 public void setThickness(String txt){
   Double value = i.toDouble(txt);
   this.thickness=value;

 }

 public Double getFilletRadius() {
   return filletRadius;
 }
 public void setFilletRadius(String txt){
   Double value = i.toDouble(txt);
   this.filletRadius=value;

 }

 public Double getEdgeRadius() {
   return edgeRadius;
 }
 public void setEdgeRadius(String txt){
   Double value = i.toDouble(txt);
   this.edgeRadius=value;

 }

 public Long getLegSlope() {
   return legSlope;
 }
 public void setLegSlope(String txt){
   Long value = i.toLong(txt);
   this.legSlope=value;

 }

}
