package fi.ni.ifc2x3;
import fi.ni.InverseLinksList;
import fi.ni.Thing;
import fi.ni.ifc2x3.interfaces.IfcMaterialSelect;
import fi.ni.ifc2x3.interfaces.IfcObjectReferenceSelect;

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

public class IfcMaterialLayer extends Thing implements IfcObjectReferenceSelect, IfcMaterialSelect
{
 // The property attributes
 IfcMaterial   material;
 Double layerThickness;
 String isVentilated;
 // The inverse attributes

 InverseLinksList<IfcMaterialLayerSet> toMaterialLayerSet= new InverseLinksList<IfcMaterialLayerSet>();


 // Getters and setters of properties

 public IfcMaterial getMaterial() {
   return material;

 }
 public void setMaterial(IfcMaterial value){
   this.material=value;

 }

 public Double getLayerThickness() {
   return layerThickness;
 }
 public void setLayerThickness(String txt){
   Double value = i.toDouble(txt);
   this.layerThickness=value;

 }

 public String getIsVentilated() {
   return isVentilated;
 }
 public void setIsVentilated(String value){
   this.isVentilated=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcMaterialLayerSet> getToMaterialLayerSet() {
   return toMaterialLayerSet;

 }
 public void setToMaterialLayerSet(IfcMaterialLayerSet value){
   this.toMaterialLayerSet.add(value);

 }

}
