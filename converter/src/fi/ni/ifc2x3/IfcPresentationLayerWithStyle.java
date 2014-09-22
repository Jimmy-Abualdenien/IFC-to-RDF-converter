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

public class IfcPresentationLayerWithStyle extends IfcPresentationLayerAssignment 
{
 // The property attributes
 String layerOn;
 String layerFrozen;
 String layerBlocked;
 List<IfcPresentationStyleSelect> layerStyles = new IfcSet<IfcPresentationStyleSelect>();


 // Getters and setters of properties

 public String getLayerOn() {
   return layerOn;
 }
 public void setLayerOn(String value){
   this.layerOn=value;

 }

 public String getLayerFrozen() {
   return layerFrozen;
 }
 public void setLayerFrozen(String value){
   this.layerFrozen=value;

 }

 public String getLayerBlocked() {
   return layerBlocked;
 }
 public void setLayerBlocked(String value){
   this.layerBlocked=value;

 }

 public List<IfcPresentationStyleSelect> getLayerStyles() {
   return layerStyles;
 }
 public void setLayerStyles(IfcPresentationStyleSelect value){
   this.layerStyles.add(value);

 }

}
