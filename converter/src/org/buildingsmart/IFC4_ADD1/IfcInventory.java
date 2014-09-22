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

public class IfcInventory extends IfcGroup 
{
 // The property attributes
 String predefinedType;
IfcActorSelect jurisdiction;
 List<IfcPerson> responsiblePersons = new IfcSet<IfcPerson>();
 String lastUpdateDate;
 IfcCostValue   currentValue;
 IfcCostValue   originalValue;


 // Getters and setters of properties

 public String getPredefinedType() {
   return predefinedType;
 }
 public void setPredefinedType(String value){
   this.predefinedType=value;

 }

 public IfcActorSelect getJurisdiction() {
   return jurisdiction;
 }
 public void setJurisdiction(IfcActorSelect value){
   this.jurisdiction=value;

 }

 public List<IfcPerson> getResponsiblePersons() {
   return responsiblePersons;

 }
 public void setResponsiblePersons(IfcPerson value){
   this.responsiblePersons.add(value);

 }

 public String getLastUpdateDate() {
   return lastUpdateDate;
 }
 public void setLastUpdateDate(String value){
   this.lastUpdateDate=value;

 }

 public IfcCostValue getCurrentValue() {
   return currentValue;

 }
 public void setCurrentValue(IfcCostValue value){
   this.currentValue=value;

 }

 public IfcCostValue getOriginalValue() {
   return originalValue;

 }
 public void setOriginalValue(IfcCostValue value){
   this.originalValue=value;

 }

}
