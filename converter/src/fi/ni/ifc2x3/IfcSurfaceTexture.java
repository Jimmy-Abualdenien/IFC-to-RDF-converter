package fi.ni.ifc2x3;
import fi.ni.Thing;

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

public class IfcSurfaceTexture extends Thing 
{
 // The property attributes
 String repeatS;
 String repeatT;
 String textureType;
 IfcCartesianTransformationOperator2D   textureTransform;


 // Getters and setters of properties

 public String getRepeatS() {
   return repeatS;
 }
 public void setRepeatS(String value){
   this.repeatS=value;

 }

 public String getRepeatT() {
   return repeatT;
 }
 public void setRepeatT(String value){
   this.repeatT=value;

 }

 public String getTextureType() {
   return textureType;
 }
 public void setTextureType(String value){
   this.textureType=value;

 }

 public IfcCartesianTransformationOperator2D getTextureTransform() {
   return textureTransform;

 }
 public void setTextureTransform(IfcCartesianTransformationOperator2D value){
   this.textureTransform=value;

 }

}
