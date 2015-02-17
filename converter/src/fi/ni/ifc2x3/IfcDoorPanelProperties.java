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

public class IfcDoorPanelProperties extends IfcPropertySetDefinition 
{
 // The property attributes
 Double panelDepth;
 String panelOperation;
 Double panelWidth;
 String panelPosition;
 IfcShapeAspect   shapeAspectStyle;


 // Getters and setters of properties

 public Double getPanelDepth() {
   return panelDepth;
 }
 public void setPanelDepth(String txt){
   Double value = i.toDouble(txt);
   this.panelDepth=value;

 }

 public String getPanelOperation() {
   return panelOperation;
 }
 public void setPanelOperation(String value){
   this.panelOperation=value;

 }

 public Double getPanelWidth() {
   return panelWidth;
 }
 public void setPanelWidth(String txt){
   Double value = i.toDouble(txt);
   this.panelWidth=value;

 }

 public String getPanelPosition() {
   return panelPosition;
 }
 public void setPanelPosition(String value){
   this.panelPosition=value;

 }

 public IfcShapeAspect getShapeAspectStyle() {
   return shapeAspectStyle;

 }
 public void setShapeAspectStyle(IfcShapeAspect value){
   this.shapeAspectStyle=value;

 }

}
