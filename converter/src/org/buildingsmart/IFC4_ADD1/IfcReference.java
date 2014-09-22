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

public class IfcReference extends Thing implements IfcMetricValueSelect, IfcAppliedValueSelect
{
 // The property attributes
 String typeIdentifier;
 String attributeIdentifier;
 String instanceName;
 List<Long> listPositions = new IfcList<Long>();
 IfcReference   innerReference;


 // Getters and setters of properties

 public String getTypeIdentifier() {
   return typeIdentifier;
 }
 public void setTypeIdentifier(String value){
   this.typeIdentifier=value;

 }

 public String getAttributeIdentifier() {
   return attributeIdentifier;
 }
 public void setAttributeIdentifier(String value){
   this.attributeIdentifier=value;

 }

 public String getInstanceName() {
   return instanceName;
 }
 public void setInstanceName(String value){
   this.instanceName=value;

 }

 public List<Long> getListPositions() {
   return listPositions;
 }
 public void setListPositions(String txt){
   List<Long> value = i.toLongList(txt);
   this.listPositions=value;

 }

 public IfcReference getInnerReference() {
   return innerReference;

 }
 public void setInnerReference(IfcReference value){
   this.innerReference=value;

 }

}
