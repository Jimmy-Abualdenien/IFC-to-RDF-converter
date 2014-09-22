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

public class IfcSurfaceStyleRendering extends IfcSurfaceStyleShading 
{
 // The property attributes
 Double transparency;
IfcColourOrFactor diffuseColour;
IfcColourOrFactor transmissionColour;
IfcColourOrFactor diffuseTransmissionColour;
IfcColourOrFactor reflectionColour;
IfcColourOrFactor specularColour;
 String specularHighlight;
 String reflectanceMethod;


 // Getters and setters of properties

 public Double getTransparency() {
   return transparency;
 }
 public void setTransparency(String txt){
   Double value = i.toDouble(txt);
   this.transparency=value;

 }

 public IfcColourOrFactor getDiffuseColour() {
   return diffuseColour;
 }
 public void setDiffuseColour(IfcColourOrFactor value){
   this.diffuseColour=value;

 }

 public IfcColourOrFactor getTransmissionColour() {
   return transmissionColour;
 }
 public void setTransmissionColour(IfcColourOrFactor value){
   this.transmissionColour=value;

 }

 public IfcColourOrFactor getDiffuseTransmissionColour() {
   return diffuseTransmissionColour;
 }
 public void setDiffuseTransmissionColour(IfcColourOrFactor value){
   this.diffuseTransmissionColour=value;

 }

 public IfcColourOrFactor getReflectionColour() {
   return reflectionColour;
 }
 public void setReflectionColour(IfcColourOrFactor value){
   this.reflectionColour=value;

 }

 public IfcColourOrFactor getSpecularColour() {
   return specularColour;
 }
 public void setSpecularColour(IfcColourOrFactor value){
   this.specularColour=value;

 }

 public String getSpecularHighlight() {
   return specularHighlight;
 }
 public void setSpecularHighlight(String value){
   this.specularHighlight=value;

 }

 public String getReflectanceMethod() {
   return reflectanceMethod;
 }
 public void setReflectanceMethod(String value){
   this.reflectanceMethod=value;

 }

}
