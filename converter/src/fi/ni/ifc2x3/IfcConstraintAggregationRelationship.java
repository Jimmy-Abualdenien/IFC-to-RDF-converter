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

public class IfcConstraintAggregationRelationship extends Thing 
{
 // The property attributes
 String name;
 String description;
 IfcConstraint   relatingConstraint;
 List<IfcConstraint> relatedConstraints = new IfcList<IfcConstraint>();
 String logicalAggregator;


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

 public IfcConstraint getRelatingConstraint() {
   return relatingConstraint;

 }
 public void setRelatingConstraint(IfcConstraint value){
   this.relatingConstraint=value;

 }

 public List<IfcConstraint> getRelatedConstraints() {
   return relatedConstraints;

 }
 public void setRelatedConstraints(IfcConstraint value){
   this.relatedConstraints.add(value);

 }

 public String getLogicalAggregator() {
   return logicalAggregator;
 }
 public void setLogicalAggregator(String value){
   this.logicalAggregator=value;

 }

}
