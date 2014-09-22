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

public class IfcAppliedValue extends Thing implements IfcObjectReferenceSelect, IfcResourceObjectSelect, IfcMetricValueSelect
{
 // The property attributes
 String name;
 String description;
IfcAppliedValueSelect appliedValue;
 IfcMeasureWithUnit   unitBasis;
 String applicableDate;
 String fixedUntilDate;
 String category;
 String condition;
 String arithmeticOperator;
 List<IfcAppliedValue> components = new IfcList<IfcAppliedValue>();
 // The inverse attributes

 InverseLinksList<IfcExternalReferenceRelationship> hasExternalReference= new InverseLinksList<IfcExternalReferenceRelationship>();


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

 public IfcAppliedValueSelect getAppliedValue() {
   return appliedValue;
 }
 public void setAppliedValue(IfcAppliedValueSelect value){
   this.appliedValue=value;

 }

 public IfcMeasureWithUnit getUnitBasis() {
   return unitBasis;

 }
 public void setUnitBasis(IfcMeasureWithUnit value){
   this.unitBasis=value;

 }

 public String getApplicableDate() {
   return applicableDate;
 }
 public void setApplicableDate(String value){
   this.applicableDate=value;

 }

 public String getFixedUntilDate() {
   return fixedUntilDate;
 }
 public void setFixedUntilDate(String value){
   this.fixedUntilDate=value;

 }

 public String getCategory() {
   return category;
 }
 public void setCategory(String value){
   this.category=value;

 }

 public String getCondition() {
   return condition;
 }
 public void setCondition(String value){
   this.condition=value;

 }

 public String getArithmeticOperator() {
   return arithmeticOperator;
 }
 public void setArithmeticOperator(String value){
   this.arithmeticOperator=value;

 }

 public List<IfcAppliedValue> getComponents() {
   return components;

 }
 public void setComponents(IfcAppliedValue value){
   this.components.add(value);

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcExternalReferenceRelationship> getHasExternalReference() {
   return hasExternalReference;

 }
 public void setHasExternalReference(IfcExternalReferenceRelationship value){
   this.hasExternalReference.add(value);

 }

}
