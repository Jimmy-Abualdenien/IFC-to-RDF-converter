package fi.ni.ifc2x3;

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

public class IfcWindowPanelProperties extends IfcPropertySetDefinition 
{
 // The property attributes
 String operationType;
 String panelPosition;
 Double frameDepth;
 Double frameThickness;
 IfcShapeAspect   shapeAspectStyle;


 // Getters and setters of properties

 public String getOperationType() {
   return operationType;
 }
 public void setOperationType(String value){
   this.operationType=value;

 }

 public String getPanelPosition() {
   return panelPosition;
 }
 public void setPanelPosition(String value){
   this.panelPosition=value;

 }

 public Double getFrameDepth() {
   return frameDepth;
 }
 public void setFrameDepth(String txt){
   Double value = i.toDouble(txt);
   this.frameDepth=value;

 }

 public Double getFrameThickness() {
   return frameThickness;
 }
 public void setFrameThickness(String txt){
   Double value = i.toDouble(txt);
   this.frameThickness=value;

 }

 public IfcShapeAspect getShapeAspectStyle() {
   return shapeAspectStyle;

 }
 public void setShapeAspectStyle(IfcShapeAspect value){
   this.shapeAspectStyle=value;

 }

}
