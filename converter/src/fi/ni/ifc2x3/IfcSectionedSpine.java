package fi.ni.ifc2x3;
import fi.ni.ifc2x3.interfaces.*;
import fi.ni.*;
import java.util.*;

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

public class IfcSectionedSpine extends IfcGeometricRepresentationItem 
{
 // The property attributes
 IfcCompositeCurve   spineCurve;
 List<IfcProfileDef> crossSections = new IfcList<IfcProfileDef>();
 List<IfcAxis2Placement3D> crossSectionPositions = new IfcList<IfcAxis2Placement3D>();


 // Getters and setters of properties

 public IfcCompositeCurve getSpineCurve() {
   return spineCurve;

 }
 public void setSpineCurve(IfcCompositeCurve value){
   this.spineCurve=value;

 }

 public List<IfcProfileDef> getCrossSections() {
   return crossSections;

 }
 public void setCrossSections(IfcProfileDef value){
   this.crossSections.add(value);

 }

 public List<IfcAxis2Placement3D> getCrossSectionPositions() {
   return crossSectionPositions;

 }
 public void setCrossSectionPositions(IfcAxis2Placement3D value){
   this.crossSectionPositions.add(value);

 }

}
