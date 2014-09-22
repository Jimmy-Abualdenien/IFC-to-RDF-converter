package org.buildingsmart.IFC4_ADD1;
import org.buildingsmart.IFC4_ADD1.interfaces.*;
import org.buildingsmart.*;
import java.util.*;

/*
 * IFC Java class
The MIT License (MIT)

 * @author Jyrki Oraskari
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

public class IfcSurfaceTexture extends IfcPresentationItem 
{
 // The property attributes
 String repeatS;
 String repeatT;
 String mode;
 IfcCartesianTransformationOperator2D   textureTransform;
 List<String> parameter = new IfcList<String>();
 // The inverse attributes

 InverseLinksList<IfcTextureCoordinate> isMappedBy= new InverseLinksList<IfcTextureCoordinate>();
 InverseLinksList<IfcSurfaceStyleWithTextures> usedInStyles= new InverseLinksList<IfcSurfaceStyleWithTextures>();


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

 public String getMode() {
   return mode;
 }
 public void setMode(String value){
   this.mode=value;

 }

 public IfcCartesianTransformationOperator2D getTextureTransform() {
   return textureTransform;

 }
 public void setTextureTransform(IfcCartesianTransformationOperator2D value){
   this.textureTransform=value;

 }

 public List<String> getParameter() {
   return parameter;
 }
 public void setParameter(String value){
   this.parameter.add(value);

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcTextureCoordinate> getIsMappedBy() {
   return isMappedBy;

 }
 public void setIsMappedBy(IfcTextureCoordinate value){
   this.isMappedBy.add(value);

 }

 public InverseLinksList<IfcSurfaceStyleWithTextures> getUsedInStyles() {
   return usedInStyles;

 }
 public void setUsedInStyles(IfcSurfaceStyleWithTextures value){
   this.usedInStyles.add(value);

 }

}
