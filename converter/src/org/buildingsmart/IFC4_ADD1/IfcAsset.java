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

public class IfcAsset extends IfcGroup 
{
 // The property attributes
 String identification;
 IfcCostValue   originalValue;
 IfcCostValue   currentValue;
 IfcCostValue   totalReplacementCost;
IfcActorSelect owner;
IfcActorSelect user;
 IfcPerson   responsiblePerson;
 String incorporationDate;
 IfcCostValue   depreciatedValue;


 // Getters and setters of properties

 public String getIdentification() {
   return identification;
 }
 public void setIdentification(String value){
   this.identification=value;

 }

 public IfcCostValue getOriginalValue() {
   return originalValue;

 }
 public void setOriginalValue(IfcCostValue value){
   this.originalValue=value;

 }

 public IfcCostValue getCurrentValue() {
   return currentValue;

 }
 public void setCurrentValue(IfcCostValue value){
   this.currentValue=value;

 }

 public IfcCostValue getTotalReplacementCost() {
   return totalReplacementCost;

 }
 public void setTotalReplacementCost(IfcCostValue value){
   this.totalReplacementCost=value;

 }

 public IfcActorSelect getOwner() {
   return owner;
 }
 public void setOwner(IfcActorSelect value){
   this.owner=value;

 }

 public IfcActorSelect getUser() {
   return user;
 }
 public void setUser(IfcActorSelect value){
   this.user=value;

 }

 public IfcPerson getResponsiblePerson() {
   return responsiblePerson;

 }
 public void setResponsiblePerson(IfcPerson value){
   this.responsiblePerson=value;

 }

 public String getIncorporationDate() {
   return incorporationDate;
 }
 public void setIncorporationDate(String value){
   this.incorporationDate=value;

 }

 public IfcCostValue getDepreciatedValue() {
   return depreciatedValue;

 }
 public void setDepreciatedValue(IfcCostValue value){
   this.depreciatedValue=value;

 }

}
