package fi.ni.ifc2x3;
import fi.ni.InverseLinksList;
import fi.ni.Thing;

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

public class IfcGridAxis extends Thing 
{
 // The property attributes
 String axisTag;
 IfcCurve   axisCurve;
 String sameSense;
 // The inverse attributes

 InverseLinksList<IfcGrid> partOfW= new InverseLinksList<IfcGrid>();
 InverseLinksList<IfcGrid> partOfV= new InverseLinksList<IfcGrid>();
 InverseLinksList<IfcGrid> partOfU= new InverseLinksList<IfcGrid>();
 InverseLinksList<IfcVirtualGridIntersection> hasIntersections= new InverseLinksList<IfcVirtualGridIntersection>();


 // Getters and setters of properties

 public String getAxisTag() {
   return axisTag;
 }
 public void setAxisTag(String value){
   this.axisTag=value;

 }

 public IfcCurve getAxisCurve() {
   return axisCurve;

 }
 public void setAxisCurve(IfcCurve value){
   this.axisCurve=value;

 }

 public String getSameSense() {
   return sameSense;
 }
 public void setSameSense(String value){
   this.sameSense=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcGrid> getPartOfW() {
   return partOfW;

 }
 public void setPartOfW(IfcGrid value){
   this.partOfW.add(value);

 }

 public InverseLinksList<IfcGrid> getPartOfV() {
   return partOfV;

 }
 public void setPartOfV(IfcGrid value){
   this.partOfV.add(value);

 }

 public InverseLinksList<IfcGrid> getPartOfU() {
   return partOfU;

 }
 public void setPartOfU(IfcGrid value){
   this.partOfU.add(value);

 }

 public InverseLinksList<IfcVirtualGridIntersection> getHasIntersections() {
   return hasIntersections;

 }
 public void setHasIntersections(IfcVirtualGridIntersection value){
   this.hasIntersections.add(value);

 }

}
