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

public class IfcStructuralAnalysisModel extends IfcSystem 
{
 // The property attributes
 String predefinedType;
 IfcAxis2Placement3D   orientationOf2DPlane;
 List<IfcStructuralLoadGroup> loadedBy = new IfcSet<IfcStructuralLoadGroup>();
 List<IfcStructuralResultGroup> hasResults = new IfcSet<IfcStructuralResultGroup>();


 // Getters and setters of properties

 public String getPredefinedType() {
   return predefinedType;
 }
 public void setPredefinedType(String value){
   this.predefinedType=value;

 }

 public IfcAxis2Placement3D getOrientationOf2DPlane() {
   return orientationOf2DPlane;

 }
 public void setOrientationOf2DPlane(IfcAxis2Placement3D value){
   this.orientationOf2DPlane=value;

 }

 public List<IfcStructuralLoadGroup> getLoadedBy() {
   return loadedBy;

 }
 public void setLoadedBy(IfcStructuralLoadGroup value){
   this.loadedBy.add(value);

 }

 public List<IfcStructuralResultGroup> getHasResults() {
   return hasResults;

 }
 public void setHasResults(IfcStructuralResultGroup value){
   this.hasResults.add(value);

 }

}
