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

public class IfcAppliedValue extends Thing implements IfcObjectReferenceSelect
{
 // The property attributes
 String name;
 String description;
IfcAppliedValueSelect appliedValue;
 IfcMeasureWithUnit   unitBasis;
IfcDateTimeSelect applicableDate;
IfcDateTimeSelect fixedUntilDate;
 // The inverse attributes

 InverseLinksList<IfcReferencesValueDocument> valuesReferenced= new InverseLinksList<IfcReferencesValueDocument>();
 InverseLinksList<IfcAppliedValueRelationship> valueOfComponents= new InverseLinksList<IfcAppliedValueRelationship>();
 InverseLinksList<IfcAppliedValueRelationship> isComponentIn= new InverseLinksList<IfcAppliedValueRelationship>();


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

 public IfcAppliedValueSelect getAppliedValue() {
   return appliedValue;
 }
 public void setAppliedValue(IfcAppliedValueSelect value){
   this.appliedValue=value;

 }

 public IfcMeasureWithUnit getUnitBasis() {
   return unitBasis;

 }
 public void setUnitBasis(IfcMeasureWithUnit value){
   this.unitBasis=value;

 }

 public IfcDateTimeSelect getApplicableDate() {
   return applicableDate;
 }
 public void setApplicableDate(IfcDateTimeSelect value){
   this.applicableDate=value;

 }

 public IfcDateTimeSelect getFixedUntilDate() {
   return fixedUntilDate;
 }
 public void setFixedUntilDate(IfcDateTimeSelect value){
   this.fixedUntilDate=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcReferencesValueDocument> getValuesReferenced() {
   return valuesReferenced;

 }
 public void setValuesReferenced(IfcReferencesValueDocument value){
   this.valuesReferenced.add(value);

 }

 public InverseLinksList<IfcAppliedValueRelationship> getValueOfComponents() {
   return valueOfComponents;

 }
 public void setValueOfComponents(IfcAppliedValueRelationship value){
   this.valueOfComponents.add(value);

 }

 public InverseLinksList<IfcAppliedValueRelationship> getIsComponentIn() {
   return isComponentIn;

 }
 public void setIsComponentIn(IfcAppliedValueRelationship value){
   this.isComponentIn.add(value);

 }

}
