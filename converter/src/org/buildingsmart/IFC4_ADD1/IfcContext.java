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

public class IfcContext extends IfcObjectDefinition 
{
 // The property attributes
 String objectType;
 String longName;
 String phase;
 List<IfcRepresentationContext> representationContexts = new IfcSet<IfcRepresentationContext>();
 IfcUnitAssignment   unitsInContext;
 // The inverse attributes

 InverseLinksList<IfcRelDefinesByProperties> isDefinedBy= new InverseLinksList<IfcRelDefinesByProperties>();
 InverseLinksList<IfcRelDeclares> declares= new InverseLinksList<IfcRelDeclares>();


 // Getters and setters of properties

 public String getObjectType() {
   return objectType;
 }
 public void setObjectType(String value){
   this.objectType=value;

 }

 public String getLongName() {
   return longName;
 }
 public void setLongName(String value){
   this.longName=value;

 }

 public String getPhase() {
   return phase;
 }
 public void setPhase(String value){
   this.phase=value;

 }

 public List<IfcRepresentationContext> getRepresentationContexts() {
   return representationContexts;

 }
 public void setRepresentationContexts(IfcRepresentationContext value){
   this.representationContexts.add(value);

 }

 public IfcUnitAssignment getUnitsInContext() {
   return unitsInContext;

 }
 public void setUnitsInContext(IfcUnitAssignment value){
   this.unitsInContext=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelDefinesByProperties> getIsDefinedBy() {
   return isDefinedBy;

 }
 public void setIsDefinedBy(IfcRelDefinesByProperties value){
   this.isDefinedBy.add(value);

 }

 public InverseLinksList<IfcRelDeclares> getDeclares() {
   return declares;

 }
 public void setDeclares(IfcRelDeclares value){
   this.declares.add(value);

 }

}
