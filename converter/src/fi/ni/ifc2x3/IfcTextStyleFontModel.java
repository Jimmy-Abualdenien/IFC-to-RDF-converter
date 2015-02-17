package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcList;

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

public class IfcTextStyleFontModel extends IfcPreDefinedTextFont 
{
 // The property attributes
 List<String> fontFamily = new IfcList<String>();
 String fontStyle;
 String fontVariant;
 String fontWeight;
 String fontSize;


 // Getters and setters of properties

 public List<String> getFontFamily() {
   return fontFamily;
 }
 public void setFontFamily(String value){
   this.fontFamily.add(value);

 }

 public String getFontStyle() {
   return fontStyle;
 }
 public void setFontStyle(String value){
   this.fontStyle=value;

 }

 public String getFontVariant() {
   return fontVariant;
 }
 public void setFontVariant(String value){
   this.fontVariant=value;

 }

 public String getFontWeight() {
   return fontWeight;
 }
 public void setFontWeight(String value){
   this.fontWeight=value;

 }

 public String getFontSize() {
   return fontSize;
 }
 public void setFontSize(String value){
   this.fontSize=value;

 }

}
