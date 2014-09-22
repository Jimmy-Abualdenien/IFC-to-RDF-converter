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

public class IfcPropertyTableValue extends IfcSimpleProperty 
{
 // The property attributes
 List<IfcAppliedValueSelect> definingValues = new IfcList<IfcAppliedValueSelect>();
 List<IfcAppliedValueSelect> definedValues = new IfcList<IfcAppliedValueSelect>();
 String expression;
IfcUnit definingUnit;
IfcUnit definedUnit;
 String curveInterpolation;


 // Getters and setters of properties

 public List<IfcValue> getDefiningValues() {
   return definingValues;
 }
 public void setDefiningValues(IfcAppliedValueSelect value){
   this.definingValues.add(value);

 }

 public List<IfcValue> getDefinedValues() {
   return definedValues;
 }
 public void setDefinedValues(IfcAppliedValueSelect value){
   this.definedValues.add(value);

 }

 public String getExpression() {
   return expression;
 }
 public void setExpression(String value){
   this.expression=value;

 }

 public IfcUnit getDefiningUnit() {
   return definingUnit;
 }
 public void setDefiningUnit(IfcUnit value){
   this.definingUnit=value;

 }

 public IfcUnit getDefinedUnit() {
   return definedUnit;
 }
 public void setDefinedUnit(IfcUnit value){
   this.definedUnit=value;

 }

 public String getCurveInterpolation() {
   return curveInterpolation;
 }
 public void setCurveInterpolation(String value){
   this.curveInterpolation=value;

 }

}
