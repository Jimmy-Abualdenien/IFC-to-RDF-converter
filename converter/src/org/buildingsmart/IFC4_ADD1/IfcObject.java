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

public class IfcObject extends IfcObjectDefinition 
{
 // The property attributes
 String objectType;
 // The inverse attributes

 InverseLinksList<IfcRelDefinesByObject> isDeclaredBy= new InverseLinksList<IfcRelDefinesByObject>();
 InverseLinksList<IfcRelDefinesByObject> declares= new InverseLinksList<IfcRelDefinesByObject>();
 InverseLinksList<IfcRelDefinesByType> isTypedBy= new InverseLinksList<IfcRelDefinesByType>();
 InverseLinksList<IfcRelDefinesByProperties> isDefinedBy= new InverseLinksList<IfcRelDefinesByProperties>();


 // Getters and setters of properties

 public String getObjectType() {
   return objectType;
 }
 public void setObjectType(String value){
   this.objectType=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelDefinesByObject> getIsDeclaredBy() {
   return isDeclaredBy;

 }
 public void setIsDeclaredBy(IfcRelDefinesByObject value){
   this.isDeclaredBy.add(value);

 }

 public InverseLinksList<IfcRelDefinesByObject> getDeclares() {
   return declares;

 }
 public void setDeclares(IfcRelDefinesByObject value){
   this.declares.add(value);

 }

 public InverseLinksList<IfcRelDefinesByType> getIsTypedBy() {
   return isTypedBy;

 }
 public void setIsTypedBy(IfcRelDefinesByType value){
   this.isTypedBy.add(value);

 }

 public InverseLinksList<IfcRelDefinesByProperties> getIsDefinedBy() {
   return isDefinedBy;

 }
 public void setIsDefinedBy(IfcRelDefinesByProperties value){
   this.isDefinedBy.add(value);

 }

}
