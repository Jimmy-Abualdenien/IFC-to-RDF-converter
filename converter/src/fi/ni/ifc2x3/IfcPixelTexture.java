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

public class IfcPixelTexture extends IfcSurfaceTexture 
{
 // The property attributes
 Long width;
 Long height;
 Long colourComponents;
 List<String> pixel = new IfcList<String>();


 // Getters and setters of properties

 public Long getWidth() {
   return width;
 }
 public void setWidth(String txt){
   Long value = i.toLong(txt);
   this.width=value;

 }

 public Long getHeight() {
   return height;
 }
 public void setHeight(String txt){
   Long value = i.toLong(txt);
   this.height=value;

 }

 public Long getColourComponents() {
   return colourComponents;
 }
 public void setColourComponents(String txt){
   Long value = i.toLong(txt);
   this.colourComponents=value;

 }

 public List<String> getPixel() {
   return pixel;
 }
 public void setPixel(String value){
   this.pixel.add(value);

 }

}
