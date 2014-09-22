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

public class IfcTessellatedFaceSet extends IfcTessellatedItem 
{
 // The property attributes
 IfcCartesianPointList3D   coordinates;
 List<Double> normals = new IfcList<Double>();
 String closed;
 // The inverse attributes

 InverseLinksList<IfcIndexedColourMap> hasColours= new InverseLinksList<IfcIndexedColourMap>();
 InverseLinksList<IfcIndexedTextureMap> hasTextures= new InverseLinksList<IfcIndexedTextureMap>();


 // Getters and setters of properties

 public IfcCartesianPointList3D getCoordinates() {
   return coordinates;

 }
 public void setCoordinates(IfcCartesianPointList3D value){
   this.coordinates=value;

 }

 public List<Double> getNormals() {
   return normals;
 }
 public void setNormals(String txt){
   List<Double> value = i.toDoubleList(txt);
   this.normals=value;

 }

 public String getClosed() {
   return closed;
 }
 public void setClosed(String value){
   this.closed=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcIndexedColourMap> getHasColours() {
   return hasColours;

 }
 public void setHasColours(IfcIndexedColourMap value){
   this.hasColours.add(value);

 }

 public InverseLinksList<IfcIndexedTextureMap> getHasTextures() {
   return hasTextures;

 }
 public void setHasTextures(IfcIndexedTextureMap value){
   this.hasTextures.add(value);

 }

}
