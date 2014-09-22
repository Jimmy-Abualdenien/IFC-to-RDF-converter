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

public class IfcAsymmetricIShapeProfileDef extends IfcParameterizedProfileDef 
{
 // The property attributes
 Double bottomFlangeWidth;
 Double overallDepth;
 Double webThickness;
 Double bottomFlangeThickness;
 Double bottomFlangeFilletRadius;
 Double topFlangeWidth;
 Double topFlangeThickness;
 Double topFlangeFilletRadius;
 Double bottomFlangeEdgeRadius;
 Long bottomFlangeSlope;
 Double topFlangeEdgeRadius;
 Long topFlangeSlope;


 // Getters and setters of properties

 public Double getBottomFlangeWidth() {
   return bottomFlangeWidth;
 }
 public void setBottomFlangeWidth(String txt){
   Double value = i.toDouble(txt);
   this.bottomFlangeWidth=value;

 }

 public Double getOverallDepth() {
   return overallDepth;
 }
 public void setOverallDepth(String txt){
   Double value = i.toDouble(txt);
   this.overallDepth=value;

 }

 public Double getWebThickness() {
   return webThickness;
 }
 public void setWebThickness(String txt){
   Double value = i.toDouble(txt);
   this.webThickness=value;

 }

 public Double getBottomFlangeThickness() {
   return bottomFlangeThickness;
 }
 public void setBottomFlangeThickness(String txt){
   Double value = i.toDouble(txt);
   this.bottomFlangeThickness=value;

 }

 public Double getBottomFlangeFilletRadius() {
   return bottomFlangeFilletRadius;
 }
 public void setBottomFlangeFilletRadius(String txt){
   Double value = i.toDouble(txt);
   this.bottomFlangeFilletRadius=value;

 }

 public Double getTopFlangeWidth() {
   return topFlangeWidth;
 }
 public void setTopFlangeWidth(String txt){
   Double value = i.toDouble(txt);
   this.topFlangeWidth=value;

 }

 public Double getTopFlangeThickness() {
   return topFlangeThickness;
 }
 public void setTopFlangeThickness(String txt){
   Double value = i.toDouble(txt);
   this.topFlangeThickness=value;

 }

 public Double getTopFlangeFilletRadius() {
   return topFlangeFilletRadius;
 }
 public void setTopFlangeFilletRadius(String txt){
   Double value = i.toDouble(txt);
   this.topFlangeFilletRadius=value;

 }

 public Double getBottomFlangeEdgeRadius() {
   return bottomFlangeEdgeRadius;
 }
 public void setBottomFlangeEdgeRadius(String txt){
   Double value = i.toDouble(txt);
   this.bottomFlangeEdgeRadius=value;

 }

 public Long getBottomFlangeSlope() {
   return bottomFlangeSlope;
 }
 public void setBottomFlangeSlope(String txt){
   Long value = i.toLong(txt);
   this.bottomFlangeSlope=value;

 }

 public Double getTopFlangeEdgeRadius() {
   return topFlangeEdgeRadius;
 }
 public void setTopFlangeEdgeRadius(String txt){
   Double value = i.toDouble(txt);
   this.topFlangeEdgeRadius=value;

 }

 public Long getTopFlangeSlope() {
   return topFlangeSlope;
 }
 public void setTopFlangeSlope(String txt){
   Long value = i.toLong(txt);
   this.topFlangeSlope=value;

 }

}
