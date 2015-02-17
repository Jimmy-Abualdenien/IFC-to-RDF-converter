package fi.ni.ifc2x3;
import fi.ni.ifc2x3.interfaces.IfcFillStyleSelect;
import fi.ni.ifc2x3.interfaces.IfcHatchLineDistanceSelect;

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

public class IfcFillAreaStyleHatching extends IfcGeometricRepresentationItem implements IfcFillStyleSelect
{
 // The property attributes
 IfcCurveStyle   hatchLineAppearance;
IfcHatchLineDistanceSelect startOfNextHatchLine;
 IfcCartesianPoint   pointOfReferenceHatchLine;
 IfcCartesianPoint   patternStart;
 Double hatchLineAngle;


 // Getters and setters of properties

 public IfcCurveStyle getHatchLineAppearance() {
   return hatchLineAppearance;

 }
 public void setHatchLineAppearance(IfcCurveStyle value){
   this.hatchLineAppearance=value;

 }

 public IfcHatchLineDistanceSelect getStartOfNextHatchLine() {
   return startOfNextHatchLine;
 }
 public void setStartOfNextHatchLine(IfcHatchLineDistanceSelect value){
   this.startOfNextHatchLine=value;

 }

 public IfcCartesianPoint getPointOfReferenceHatchLine() {
   return pointOfReferenceHatchLine;

 }
 public void setPointOfReferenceHatchLine(IfcCartesianPoint value){
   this.pointOfReferenceHatchLine=value;

 }

 public IfcCartesianPoint getPatternStart() {
   return patternStart;

 }
 public void setPatternStart(IfcCartesianPoint value){
   this.patternStart=value;

 }

 public Double getHatchLineAngle() {
   return hatchLineAngle;
 }
 public void setHatchLineAngle(String txt){
   Double value = i.toDouble(txt);
   this.hatchLineAngle=value;

 }

}
