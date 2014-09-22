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

public class IfcElement extends IfcProduct implements IfcStructuralActivityAssignmentSelect
{
 // The property attributes
 String tag;
 // The inverse attributes

 InverseLinksList<IfcRelFillsElement> fillsVoids= new InverseLinksList<IfcRelFillsElement>();
 InverseLinksList<IfcRelConnectsElements> connectedTo= new InverseLinksList<IfcRelConnectsElements>();
 InverseLinksList<IfcRelInterferesElements> isInterferedByElements= new InverseLinksList<IfcRelInterferesElements>();
 InverseLinksList<IfcRelInterferesElements> interferesElements= new InverseLinksList<IfcRelInterferesElements>();
 InverseLinksList<IfcRelProjectsElement> hasProjections= new InverseLinksList<IfcRelProjectsElement>();
 InverseLinksList<IfcRelReferencedInSpatialStructure> referencedInStructures= new InverseLinksList<IfcRelReferencedInSpatialStructure>();
 InverseLinksList<IfcRelVoidsElement> hasOpenings= new InverseLinksList<IfcRelVoidsElement>();
 InverseLinksList<IfcRelConnectsWithRealizingElements> isConnectionRealization= new InverseLinksList<IfcRelConnectsWithRealizingElements>();
 InverseLinksList<IfcRelSpaceBoundary> providesBoundaries= new InverseLinksList<IfcRelSpaceBoundary>();
 InverseLinksList<IfcRelConnectsElements> connectedFrom= new InverseLinksList<IfcRelConnectsElements>();
 InverseLinksList<IfcRelContainedInSpatialStructure> containedInStructure= new InverseLinksList<IfcRelContainedInSpatialStructure>();
 InverseLinksList<IfcRelCoversBldgElements> hasCoverings= new InverseLinksList<IfcRelCoversBldgElements>();


 // Getters and setters of properties

 public String getTag() {
   return tag;
 }
 public void setTag(String value){
   this.tag=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelFillsElement> getFillsVoids() {
   return fillsVoids;

 }
 public void setFillsVoids(IfcRelFillsElement value){
   this.fillsVoids.add(value);

 }

 public InverseLinksList<IfcRelConnectsElements> getConnectedTo() {
   return connectedTo;

 }
 public void setConnectedTo(IfcRelConnectsElements value){
   this.connectedTo.add(value);

 }

 public InverseLinksList<IfcRelInterferesElements> getIsInterferedByElements() {
   return isInterferedByElements;

 }
 public void setIsInterferedByElements(IfcRelInterferesElements value){
   this.isInterferedByElements.add(value);

 }

 public InverseLinksList<IfcRelInterferesElements> getInterferesElements() {
   return interferesElements;

 }
 public void setInterferesElements(IfcRelInterferesElements value){
   this.interferesElements.add(value);

 }

 public InverseLinksList<IfcRelProjectsElement> getHasProjections() {
   return hasProjections;

 }
 public void setHasProjections(IfcRelProjectsElement value){
   this.hasProjections.add(value);

 }

 public InverseLinksList<IfcRelReferencedInSpatialStructure> getReferencedInStructures() {
   return referencedInStructures;

 }
 public void setReferencedInStructures(IfcRelReferencedInSpatialStructure value){
   this.referencedInStructures.add(value);

 }

 public InverseLinksList<IfcRelVoidsElement> getHasOpenings() {
   return hasOpenings;

 }
 public void setHasOpenings(IfcRelVoidsElement value){
   this.hasOpenings.add(value);

 }

 public InverseLinksList<IfcRelConnectsWithRealizingElements> getIsConnectionRealization() {
   return isConnectionRealization;

 }
 public void setIsConnectionRealization(IfcRelConnectsWithRealizingElements value){
   this.isConnectionRealization.add(value);

 }

 public InverseLinksList<IfcRelSpaceBoundary> getProvidesBoundaries() {
   return providesBoundaries;

 }
 public void setProvidesBoundaries(IfcRelSpaceBoundary value){
   this.providesBoundaries.add(value);

 }

 public InverseLinksList<IfcRelConnectsElements> getConnectedFrom() {
   return connectedFrom;

 }
 public void setConnectedFrom(IfcRelConnectsElements value){
   this.connectedFrom.add(value);

 }

 public InverseLinksList<IfcRelContainedInSpatialStructure> getContainedInStructure() {
   return containedInStructure;

 }
 public void setContainedInStructure(IfcRelContainedInSpatialStructure value){
   this.containedInStructure.add(value);

 }

 public InverseLinksList<IfcRelCoversBldgElements> getHasCoverings() {
   return hasCoverings;

 }
 public void setHasCoverings(IfcRelCoversBldgElements value){
   this.hasCoverings.add(value);

 }

}
