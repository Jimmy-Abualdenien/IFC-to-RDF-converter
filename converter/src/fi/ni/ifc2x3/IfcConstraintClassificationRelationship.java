package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcSet;
import fi.ni.Thing;
import fi.ni.ifc2x3.interfaces.IfcClassificationNotationSelect;

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

public class IfcConstraintClassificationRelationship extends Thing 
{
 // The property attributes
 IfcConstraint   classifiedConstraint;
 List<IfcClassificationNotationSelect> relatedClassifications = new IfcSet<IfcClassificationNotationSelect>();


 // Getters and setters of properties

 public IfcConstraint getClassifiedConstraint() {
   return classifiedConstraint;

 }
 public void setClassifiedConstraint(IfcConstraint value){
   this.classifiedConstraint=value;

 }

 public List<IfcClassificationNotationSelect> getRelatedClassifications() {
   return relatedClassifications;
 }
 public void setRelatedClassifications(IfcClassificationNotationSelect value){
   this.relatedClassifications.add(value);

 }

}
