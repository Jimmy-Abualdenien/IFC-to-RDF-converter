package fi.ni.ifc2x3;
import fi.ni.ifc2x3.interfaces.IfcColour;
import fi.ni.ifc2x3.interfaces.IfcCurveFontOrScaledCurveFontSelect;
import fi.ni.ifc2x3.interfaces.IfcPresentationStyleSelect;

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

public class IfcCurveStyle extends IfcPresentationStyle implements IfcPresentationStyleSelect
{
 // The property attributes
IfcCurveFontOrScaledCurveFontSelect curveFont;
 String curveWidth;
IfcColour curveColour;


 // Getters and setters of properties

 public IfcCurveFontOrScaledCurveFontSelect getCurveFont() {
   return curveFont;
 }
 public void setCurveFont(IfcCurveFontOrScaledCurveFontSelect value){
   this.curveFont=value;

 }

 public String getCurveWidth() {
   return curveWidth;
 }
 public void setCurveWidth(String value){
   this.curveWidth=value;

 }

 public IfcColour getCurveColour() {
   return curveColour;
 }
 public void setCurveColour(IfcColour value){
   this.curveColour=value;

 }

}
