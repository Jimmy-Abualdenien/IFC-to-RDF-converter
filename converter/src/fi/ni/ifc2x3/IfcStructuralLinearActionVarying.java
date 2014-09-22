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

public class IfcStructuralLinearActionVarying extends IfcStructuralLinearAction 
{
 // The property attributes
 IfcShapeAspect   varyingAppliedLoadLocation;
 List<IfcStructuralLoad> subsequentAppliedLoads = new IfcList<IfcStructuralLoad>();


 // Getters and setters of properties

 public IfcShapeAspect getVaryingAppliedLoadLocation() {
   return varyingAppliedLoadLocation;

 }
 public void setVaryingAppliedLoadLocation(IfcShapeAspect value){
   this.varyingAppliedLoadLocation=value;

 }

 public List<IfcStructuralLoad> getSubsequentAppliedLoads() {
   return subsequentAppliedLoads;

 }
 public void setSubsequentAppliedLoads(IfcStructuralLoad value){
   this.subsequentAppliedLoads.add(value);

 }

}
