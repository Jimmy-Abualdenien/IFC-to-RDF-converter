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

public class IfcStructuralLoadGroup extends IfcGroup 
{
 // The property attributes
 String predefinedType;
 String actionType;
 String actionSource;
 Double coefficient;
 String purpose;
 // The inverse attributes

 InverseLinksList<IfcStructuralResultGroup> sourceOfResultGroup= new InverseLinksList<IfcStructuralResultGroup>();
 InverseLinksList<IfcStructuralAnalysisModel> loadGroupFor= new InverseLinksList<IfcStructuralAnalysisModel>();


 // Getters and setters of properties

 public String getPredefinedType() {
   return predefinedType;
 }
 public void setPredefinedType(String value){
   this.predefinedType=value;

 }

 public String getActionType() {
   return actionType;
 }
 public void setActionType(String value){
   this.actionType=value;

 }

 public String getActionSource() {
   return actionSource;
 }
 public void setActionSource(String value){
   this.actionSource=value;

 }

 public Double getCoefficient() {
   return coefficient;
 }
 public void setCoefficient(String txt){
   Double value = i.toDouble(txt);
   this.coefficient=value;

 }

 public String getPurpose() {
   return purpose;
 }
 public void setPurpose(String value){
   this.purpose=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcStructuralResultGroup> getSourceOfResultGroup() {
   return sourceOfResultGroup;

 }
 public void setSourceOfResultGroup(IfcStructuralResultGroup value){
   this.sourceOfResultGroup.add(value);

 }

 public InverseLinksList<IfcStructuralAnalysisModel> getLoadGroupFor() {
   return loadGroupFor;

 }
 public void setLoadGroupFor(IfcStructuralAnalysisModel value){
   this.loadGroupFor.add(value);

 }

}
