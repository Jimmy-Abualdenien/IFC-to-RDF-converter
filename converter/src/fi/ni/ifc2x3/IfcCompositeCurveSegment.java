package fi.ni.ifc2x3;

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

public class IfcCompositeCurveSegment extends IfcGeometricRepresentationItem 
{
 // The property attributes
 String transition;
 String sameSense;
 IfcCurve   parentCurve;


 // Getters and setters of properties

 public String getTransition() {
   return transition;
 }
 public void setTransition(String value){
   this.transition=value;

 }

 public String getSameSense() {
   return sameSense;
 }
 public void setSameSense(String value){
   this.sameSense=value;

 }

 public IfcCurve getParentCurve() {
   return parentCurve;

 }
 public void setParentCurve(IfcCurve value){
   this.parentCurve=value;

 }

}
