package fi.ni.ifc2x3;
import fi.ni.InverseLinksList;
import fi.ni.ifc2x3.interfaces.IfcStructuralActivityAssignmentSelect;

/*
 * IFC Java class
The GNU Affero General Public License

Copyright (C) 2014  Jyrki Oraskari

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

public class IfcElement extends IfcProduct implements IfcStructuralActivityAssignmentSelect
{
 // The property attributes
 String tag;
 // The inverse attributes

 InverseLinksList<IfcRelConnectsStructuralElement> hasStructuralMember= new InverseLinksList<IfcRelConnectsStructuralElement>();
 InverseLinksList<IfcRelFillsElement> fillsVoids= new InverseLinksList<IfcRelFillsElement>();
 InverseLinksList<IfcRelConnectsElements> connectedTo= new InverseLinksList<IfcRelConnectsElements>();
 InverseLinksList<IfcRelCoversBldgElements> hasCoverings= new InverseLinksList<IfcRelCoversBldgElements>();
 InverseLinksList<IfcRelProjectsElement> hasProjections= new InverseLinksList<IfcRelProjectsElement>();
 InverseLinksList<IfcRelReferencedInSpatialStructure> referencedInStructures= new InverseLinksList<IfcRelReferencedInSpatialStructure>();
 InverseLinksList<IfcRelConnectsPortToElement> hasPorts= new InverseLinksList<IfcRelConnectsPortToElement>();
 InverseLinksList<IfcRelVoidsElement> hasOpenings= new InverseLinksList<IfcRelVoidsElement>();
 InverseLinksList<IfcRelConnectsWithRealizingElements> isConnectionRealization= new InverseLinksList<IfcRelConnectsWithRealizingElements>();
 InverseLinksList<IfcRelSpaceBoundary> providesBoundaries= new InverseLinksList<IfcRelSpaceBoundary>();
 InverseLinksList<IfcRelConnectsElements> connectedFrom= new InverseLinksList<IfcRelConnectsElements>();
 InverseLinksList<IfcRelContainedInSpatialStructure> containedInStructure= new InverseLinksList<IfcRelContainedInSpatialStructure>();


 // Getters and setters of properties

 public String getTag() {
   return tag;
 }
 public void setTag(String value){
   this.tag=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelConnectsStructuralElement> getHasStructuralMember() {
   return hasStructuralMember;

 }
 public void setHasStructuralMember(IfcRelConnectsStructuralElement value){
   this.hasStructuralMember.add(value);

 }

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

 public InverseLinksList<IfcRelCoversBldgElements> getHasCoverings() {
   return hasCoverings;

 }
 public void setHasCoverings(IfcRelCoversBldgElements value){
   this.hasCoverings.add(value);

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

 public InverseLinksList<IfcRelConnectsPortToElement> getHasPorts() {
   return hasPorts;

 }
 public void setHasPorts(IfcRelConnectsPortToElement value){
   this.hasPorts.add(value);

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

}
