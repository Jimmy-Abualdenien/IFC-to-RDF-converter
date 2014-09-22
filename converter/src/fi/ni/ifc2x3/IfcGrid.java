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

public class IfcGrid extends IfcProduct 
{
 // The property attributes
 List<IfcGridAxis> uAxes = new IfcList<IfcGridAxis>();
 List<IfcGridAxis> vAxes = new IfcList<IfcGridAxis>();
 List<IfcGridAxis> wAxes = new IfcList<IfcGridAxis>();
 // The inverse attributes

 InverseLinksList<IfcRelContainedInSpatialStructure> containedInStructure= new InverseLinksList<IfcRelContainedInSpatialStructure>();


 // Getters and setters of properties

 public List<IfcGridAxis> getUAxes() {
   return uAxes;

 }
 public void setUAxes(IfcGridAxis value){
   this.uAxes.add(value);

 }

 public List<IfcGridAxis> getVAxes() {
   return vAxes;

 }
 public void setVAxes(IfcGridAxis value){
   this.vAxes.add(value);

 }

 public List<IfcGridAxis> getWAxes() {
   return wAxes;

 }
 public void setWAxes(IfcGridAxis value){
   this.wAxes.add(value);

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelContainedInSpatialStructure> getContainedInStructure() {
   return containedInStructure;

 }
 public void setContainedInStructure(IfcRelContainedInSpatialStructure value){
   this.containedInStructure.add(value);

 }

}
