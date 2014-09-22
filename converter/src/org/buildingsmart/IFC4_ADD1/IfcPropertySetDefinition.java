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

public class IfcPropertySetDefinition extends IfcPropertyDefinition implements IfcPropertySetDefinitionSelect
{
 // The inverse attributes

 InverseLinksList<IfcTypeObject> definesType= new InverseLinksList<IfcTypeObject>();
 InverseLinksList<IfcRelDefinesByTemplate> isDefinedBy= new InverseLinksList<IfcRelDefinesByTemplate>();
 InverseLinksList<IfcRelDefinesByProperties> definesOccurrence= new InverseLinksList<IfcRelDefinesByProperties>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcTypeObject> getDefinesType() {
   return definesType;

 }
 public void setDefinesType(IfcTypeObject value){
   this.definesType.add(value);

 }

 public InverseLinksList<IfcRelDefinesByTemplate> getIsDefinedBy() {
   return isDefinedBy;

 }
 public void setIsDefinedBy(IfcRelDefinesByTemplate value){
   this.isDefinedBy.add(value);

 }

 public InverseLinksList<IfcRelDefinesByProperties> getDefinesOccurrence() {
   return definesOccurrence;

 }
 public void setDefinesOccurrence(IfcRelDefinesByProperties value){
   this.definesOccurrence.add(value);

 }

}
