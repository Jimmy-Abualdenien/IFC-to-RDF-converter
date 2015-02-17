package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcSet;

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

public class IfcAnnotationFillArea extends IfcGeometricRepresentationItem 
{
 // The property attributes
 IfcCurve   outerBoundary;
 List<IfcCurve> innerBoundaries = new IfcSet<IfcCurve>();


 // Getters and setters of properties

 public IfcCurve getOuterBoundary() {
   return outerBoundary;

 }
 public void setOuterBoundary(IfcCurve value){
   this.outerBoundary=value;

 }

 public List<IfcCurve> getInnerBoundaries() {
   return innerBoundaries;

 }
 public void setInnerBoundaries(IfcCurve value){
   this.innerBoundaries.add(value);

 }

}
