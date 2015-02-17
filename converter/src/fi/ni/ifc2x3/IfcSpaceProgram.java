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

public class IfcSpaceProgram extends IfcControl 
{
 // The property attributes
 String spaceProgramIdentifier;
 Double maxRequiredArea;
 Double minRequiredArea;
 IfcSpatialStructureElement   requestedLocation;
 Double standardRequiredArea;
 // The inverse attributes

 InverseLinksList<IfcRelInteractionRequirements> hasInteractionReqsFrom= new InverseLinksList<IfcRelInteractionRequirements>();
 InverseLinksList<IfcRelInteractionRequirements> hasInteractionReqsTo= new InverseLinksList<IfcRelInteractionRequirements>();


 // Getters and setters of properties

 public String getSpaceProgramIdentifier() {
   return spaceProgramIdentifier;
 }
 public void setSpaceProgramIdentifier(String value){
   this.spaceProgramIdentifier=value;

 }

 public Double getMaxRequiredArea() {
   return maxRequiredArea;
 }
 public void setMaxRequiredArea(String txt){
   Double value = i.toDouble(txt);
   this.maxRequiredArea=value;

 }

 public Double getMinRequiredArea() {
   return minRequiredArea;
 }
 public void setMinRequiredArea(String txt){
   Double value = i.toDouble(txt);
   this.minRequiredArea=value;

 }

 public IfcSpatialStructureElement getRequestedLocation() {
   return requestedLocation;

 }
 public void setRequestedLocation(IfcSpatialStructureElement value){
   this.requestedLocation=value;

 }

 public Double getStandardRequiredArea() {
   return standardRequiredArea;
 }
 public void setStandardRequiredArea(String txt){
   Double value = i.toDouble(txt);
   this.standardRequiredArea=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelInteractionRequirements> getHasInteractionReqsFrom() {
   return hasInteractionReqsFrom;

 }
 public void setHasInteractionReqsFrom(IfcRelInteractionRequirements value){
   this.hasInteractionReqsFrom.add(value);

 }

 public InverseLinksList<IfcRelInteractionRequirements> getHasInteractionReqsTo() {
   return hasInteractionReqsTo;

 }
 public void setHasInteractionReqsTo(IfcRelInteractionRequirements value){
   this.hasInteractionReqsTo.add(value);

 }

}
