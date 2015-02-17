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

public class IfcLightSource extends IfcGeometricRepresentationItem 
{
 // The property attributes
 String name;
 IfcColourRgb   lightColour;
 Double ambientIntensity;
 Double intensity;


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public IfcColourRgb getLightColour() {
   return lightColour;

 }
 public void setLightColour(IfcColourRgb value){
   this.lightColour=value;

 }

 public Double getAmbientIntensity() {
   return ambientIntensity;
 }
 public void setAmbientIntensity(String txt){
   Double value = i.toDouble(txt);
   this.ambientIntensity=value;

 }

 public Double getIntensity() {
   return intensity;
 }
 public void setIntensity(String txt){
   Double value = i.toDouble(txt);
   this.intensity=value;

 }

}
