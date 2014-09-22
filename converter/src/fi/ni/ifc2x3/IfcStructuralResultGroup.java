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

public class IfcStructuralResultGroup extends IfcGroup 
{
 // The property attributes
 String theoryType;
 IfcStructuralLoadGroup   resultForLoadGroup;
 String isLinear;
 // The inverse attributes

 InverseLinksList<IfcStructuralAnalysisModel> resultGroupFor= new InverseLinksList<IfcStructuralAnalysisModel>();


 // Getters and setters of properties

 public String getTheoryType() {
   return theoryType;
 }
 public void setTheoryType(String value){
   this.theoryType=value;

 }

 public IfcStructuralLoadGroup getResultForLoadGroup() {
   return resultForLoadGroup;

 }
 public void setResultForLoadGroup(IfcStructuralLoadGroup value){
   this.resultForLoadGroup=value;

 }

 public String getIsLinear() {
   return isLinear;
 }
 public void setIsLinear(String value){
   this.isLinear=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcStructuralAnalysisModel> getResultGroupFor() {
   return resultGroupFor;

 }
 public void setResultGroupFor(IfcStructuralAnalysisModel value){
   this.resultGroupFor.add(value);

 }

}
