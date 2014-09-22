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

public class IfcDraughtingCallout extends IfcGeometricRepresentationItem 
{
 // The property attributes
 List<IfcDraughtingCalloutElement> contents = new IfcSet<IfcDraughtingCalloutElement>();
 // The inverse attributes

 InverseLinksList<IfcDraughtingCalloutRelationship> isRelatedFromCallout= new InverseLinksList<IfcDraughtingCalloutRelationship>();
 InverseLinksList<IfcDraughtingCalloutRelationship> isRelatedToCallout= new InverseLinksList<IfcDraughtingCalloutRelationship>();


 // Getters and setters of properties

 public List<IfcDraughtingCalloutElement> getContents() {
   return contents;
 }
 public void setContents(IfcDraughtingCalloutElement value){
   this.contents.add(value);

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcDraughtingCalloutRelationship> getIsRelatedFromCallout() {
   return isRelatedFromCallout;

 }
 public void setIsRelatedFromCallout(IfcDraughtingCalloutRelationship value){
   this.isRelatedFromCallout.add(value);

 }

 public InverseLinksList<IfcDraughtingCalloutRelationship> getIsRelatedToCallout() {
   return isRelatedToCallout;

 }
 public void setIsRelatedToCallout(IfcDraughtingCalloutRelationship value){
   this.isRelatedToCallout.add(value);

 }

}
