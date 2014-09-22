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

public class IfcObjectDefinition extends IfcRoot implements IfcDefinitionSelect
{
 // The inverse attributes

 InverseLinksList<IfcRelAssigns> hasAssignments= new InverseLinksList<IfcRelAssigns>();
 InverseLinksList<IfcRelNests> nests= new InverseLinksList<IfcRelNests>();
 InverseLinksList<IfcRelNests> isNestedBy= new InverseLinksList<IfcRelNests>();
 InverseLinksList<IfcRelDeclares> hasContext= new InverseLinksList<IfcRelDeclares>();
 InverseLinksList<IfcRelAggregates> isDecomposedBy= new InverseLinksList<IfcRelAggregates>();
 InverseLinksList<IfcRelAggregates> decomposes= new InverseLinksList<IfcRelAggregates>();
 InverseLinksList<IfcRelAssociates> hasAssociations= new InverseLinksList<IfcRelAssociates>();


 // Getters and setters of inverse values

 public InverseLinksList<IfcRelAssigns> getHasAssignments() {
   return hasAssignments;

 }
 public void setHasAssignments(IfcRelAssigns value){
   this.hasAssignments.add(value);

 }

 public InverseLinksList<IfcRelNests> getNests() {
   return nests;

 }
 public void setNests(IfcRelNests value){
   this.nests.add(value);

 }

 public InverseLinksList<IfcRelNests> getIsNestedBy() {
   return isNestedBy;

 }
 public void setIsNestedBy(IfcRelNests value){
   this.isNestedBy.add(value);

 }

 public InverseLinksList<IfcRelDeclares> getHasContext() {
   return hasContext;

 }
 public void setHasContext(IfcRelDeclares value){
   this.hasContext.add(value);

 }

 public InverseLinksList<IfcRelAggregates> getIsDecomposedBy() {
   return isDecomposedBy;

 }
 public void setIsDecomposedBy(IfcRelAggregates value){
   this.isDecomposedBy.add(value);

 }

 public InverseLinksList<IfcRelAggregates> getDecomposes() {
   return decomposes;

 }
 public void setDecomposes(IfcRelAggregates value){
   this.decomposes.add(value);

 }

 public InverseLinksList<IfcRelAssociates> getHasAssociations() {
   return hasAssociations;

 }
 public void setHasAssociations(IfcRelAssociates value){
   this.hasAssociations.add(value);

 }

}
