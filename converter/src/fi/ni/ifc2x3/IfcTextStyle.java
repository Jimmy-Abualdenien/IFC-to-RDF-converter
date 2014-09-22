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

public class IfcTextStyle extends IfcPresentationStyle implements IfcPresentationStyleSelect
{
 // The property attributes
IfcCharacterStyleSelect textCharacterAppearance;
IfcTextStyleSelect textStyle;
IfcTextFontSelect textFontStyle;


 // Getters and setters of properties

 public IfcCharacterStyleSelect getTextCharacterAppearance() {
   return textCharacterAppearance;
 }
 public void setTextCharacterAppearance(IfcCharacterStyleSelect value){
   this.textCharacterAppearance=value;

 }

 public IfcTextStyleSelect getTextStyle() {
   return textStyle;
 }
 public void setTextStyle(IfcTextStyleSelect value){
   this.textStyle=value;

 }

 public IfcTextFontSelect getTextFontStyle() {
   return textFontStyle;
 }
 public void setTextFontStyle(IfcTextFontSelect value){
   this.textFontStyle=value;

 }

}
