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

public class IfcTextStyleTextModel extends Thing implements IfcTextStyleSelect
{
 // The property attributes
 String textIndent;
 String textAlign;
 String textDecoration;
 String letterSpacing;
 String wordSpacing;
 String textTransform;
 String lineHeight;


 // Getters and setters of properties

 public String getTextIndent() {
   return textIndent;
 }
 public void setTextIndent(String value){
   this.textIndent=value;

 }

 public String getTextAlign() {
   return textAlign;
 }
 public void setTextAlign(String value){
   this.textAlign=value;

 }

 public String getTextDecoration() {
   return textDecoration;
 }
 public void setTextDecoration(String value){
   this.textDecoration=value;

 }

 public String getLetterSpacing() {
   return letterSpacing;
 }
 public void setLetterSpacing(String value){
   this.letterSpacing=value;

 }

 public String getWordSpacing() {
   return wordSpacing;
 }
 public void setWordSpacing(String value){
   this.wordSpacing=value;

 }

 public String getTextTransform() {
   return textTransform;
 }
 public void setTextTransform(String value){
   this.textTransform=value;

 }

 public String getLineHeight() {
   return lineHeight;
 }
 public void setLineHeight(String value){
   this.lineHeight=value;

 }

}
