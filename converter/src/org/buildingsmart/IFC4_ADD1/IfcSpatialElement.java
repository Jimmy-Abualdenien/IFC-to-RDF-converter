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

public class IfcSpatialElement extends IfcProduct 
{
 // The property attributes
 String longName;
 // The inverse attributes

 InverseLinksList<IfcRelContainedInSpatialStructure> containsElements= new InverseLinksList<IfcRelContainedInSpatialStructure>();
 InverseLinksList<IfcRelServicesBuildings> servicedBySystems= new InverseLinksList<IfcRelServicesBuildings>();
 InverseLinksList<IfcRelReferencedInSpatialStructure> referencesElements= new InverseLinksList<IfcRelReferencedInSpatialStructure>();


 // Getters and setters of properties

 public String getLongName() {
   return longName;
 }
 public void setLongName(String value){
   this.longName=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelContainedInSpatialStructure> getContainsElements() {
   return containsElements;

 }
 public void setContainsElements(IfcRelContainedInSpatialStructure value){
   this.containsElements.add(value);

 }

 public InverseLinksList<IfcRelServicesBuildings> getServicedBySystems() {
   return servicedBySystems;

 }
 public void setServicedBySystems(IfcRelServicesBuildings value){
   this.servicedBySystems.add(value);

 }

 public InverseLinksList<IfcRelReferencedInSpatialStructure> getReferencesElements() {
   return referencesElements;

 }
 public void setReferencesElements(IfcRelReferencedInSpatialStructure value){
   this.referencesElements.add(value);

 }

}
