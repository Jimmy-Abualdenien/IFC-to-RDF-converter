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

public class IfcMaterial extends IfcMaterialDefinition 
{
 // The property attributes
 String name;
 String description;
 String category;
 // The inverse attributes

 InverseLinksList<IfcMaterialDefinitionRepresentation> hasRepresentation= new InverseLinksList<IfcMaterialDefinitionRepresentation>();
 InverseLinksList<IfcMaterialRelationship> isRelatedWith= new InverseLinksList<IfcMaterialRelationship>();
 InverseLinksList<IfcMaterialRelationship> relatesTo= new InverseLinksList<IfcMaterialRelationship>();


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

 public String getCategory() {
   return category;
 }
 public void setCategory(String value){
   this.category=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcMaterialDefinitionRepresentation> getHasRepresentation() {
   return hasRepresentation;

 }
 public void setHasRepresentation(IfcMaterialDefinitionRepresentation value){
   this.hasRepresentation.add(value);

 }

 public InverseLinksList<IfcMaterialRelationship> getIsRelatedWith() {
   return isRelatedWith;

 }
 public void setIsRelatedWith(IfcMaterialRelationship value){
   this.isRelatedWith.add(value);

 }

 public InverseLinksList<IfcMaterialRelationship> getRelatesTo() {
   return relatesTo;

 }
 public void setRelatesTo(IfcMaterialRelationship value){
   this.relatesTo.add(value);

 }

}
