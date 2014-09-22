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

public class IfcRepresentation extends Thing implements IfcLayeredItem
{
 // The property attributes
 IfcRepresentationContext   contextOfItems;
 String representationIdentifier;
 String representationType;
 List<IfcRepresentationItem> items = new IfcSet<IfcRepresentationItem>();
 // The inverse attributes

 InverseLinksList<IfcRepresentationMap> representationMap= new InverseLinksList<IfcRepresentationMap>();
 InverseLinksList<IfcPresentationLayerAssignment> layerAssignments= new InverseLinksList<IfcPresentationLayerAssignment>();
 InverseLinksList<IfcProductRepresentation> ofProductRepresentation= new InverseLinksList<IfcProductRepresentation>();


 // Getters and setters of properties

 public IfcRepresentationContext getContextOfItems() {
   return contextOfItems;

 }
 public void setContextOfItems(IfcRepresentationContext value){
   this.contextOfItems=value;

 }

 public String getRepresentationIdentifier() {
   return representationIdentifier;
 }
 public void setRepresentationIdentifier(String value){
   this.representationIdentifier=value;

 }

 public String getRepresentationType() {
   return representationType;
 }
 public void setRepresentationType(String value){
   this.representationType=value;

 }

 public List<IfcRepresentationItem> getItems() {
   return items;

 }
 public void setItems(IfcRepresentationItem value){
   this.items.add(value);

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRepresentationMap> getRepresentationMap() {
   return representationMap;

 }
 public void setRepresentationMap(IfcRepresentationMap value){
   this.representationMap.add(value);

 }

 public InverseLinksList<IfcPresentationLayerAssignment> getLayerAssignments() {
   return layerAssignments;

 }
 public void setLayerAssignments(IfcPresentationLayerAssignment value){
   this.layerAssignments.add(value);

 }

 public InverseLinksList<IfcProductRepresentation> getOfProductRepresentation() {
   return ofProductRepresentation;

 }
 public void setOfProductRepresentation(IfcProductRepresentation value){
   this.ofProductRepresentation.add(value);

 }

}
