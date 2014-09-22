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

public class IfcSectionReinforcementProperties extends Thing 
{
 // The property attributes
 Double longitudinalStartPosition;
 Double longitudinalEndPosition;
 Double transversePosition;
 String reinforcementRole;
 IfcSectionProperties   sectionDefinition;
 List<IfcReinforcementBarProperties> crossSectionReinforcementDefinitions = new IfcSet<IfcReinforcementBarProperties>();


 // Getters and setters of properties

 public Double getLongitudinalStartPosition() {
   return longitudinalStartPosition;
 }
 public void setLongitudinalStartPosition(String txt){
   Double value = i.toDouble(txt);
   this.longitudinalStartPosition=value;

 }

 public Double getLongitudinalEndPosition() {
   return longitudinalEndPosition;
 }
 public void setLongitudinalEndPosition(String txt){
   Double value = i.toDouble(txt);
   this.longitudinalEndPosition=value;

 }

 public Double getTransversePosition() {
   return transversePosition;
 }
 public void setTransversePosition(String txt){
   Double value = i.toDouble(txt);
   this.transversePosition=value;

 }

 public String getReinforcementRole() {
   return reinforcementRole;
 }
 public void setReinforcementRole(String value){
   this.reinforcementRole=value;

 }

 public IfcSectionProperties getSectionDefinition() {
   return sectionDefinition;

 }
 public void setSectionDefinition(IfcSectionProperties value){
   this.sectionDefinition=value;

 }

 public List<IfcReinforcementBarProperties> getCrossSectionReinforcementDefinitions() {
   return crossSectionReinforcementDefinitions;

 }
 public void setCrossSectionReinforcementDefinitions(IfcReinforcementBarProperties value){
   this.crossSectionReinforcementDefinitions.add(value);

 }

}
