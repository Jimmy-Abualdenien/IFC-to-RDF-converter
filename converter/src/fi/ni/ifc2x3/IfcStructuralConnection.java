package fi.ni.ifc2x3;
import fi.ni.InverseLinksList;

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

public class IfcStructuralConnection extends IfcStructuralItem 
{
 // The property attributes
 IfcBoundaryCondition   appliedCondition;
 // The inverse attributes

 InverseLinksList<IfcRelConnectsStructuralMember> connectsStructuralMembers= new InverseLinksList<IfcRelConnectsStructuralMember>();


 // Getters and setters of properties

 public IfcBoundaryCondition getAppliedCondition() {
   return appliedCondition;

 }
 public void setAppliedCondition(IfcBoundaryCondition value){
   this.appliedCondition=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelConnectsStructuralMember> getConnectsStructuralMembers() {
   return connectsStructuralMembers;

 }
 public void setConnectsStructuralMembers(IfcRelConnectsStructuralMember value){
   this.connectsStructuralMembers.add(value);

 }

}
