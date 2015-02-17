package fi.ni.ifc2x3;
import fi.ni.ifc2x3.interfaces.IfcColourOrFactor;

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

public class IfcColourRgb extends IfcColourSpecification implements IfcColourOrFactor
{
 // The property attributes
 Double red;
 Double green;
 Double blue;


 // Getters and setters of properties

 public Double getRed() {
   return red;
 }
 public void setRed(String txt){
   Double value = i.toDouble(txt);
   this.red=value;

 }

 public Double getGreen() {
   return green;
 }
 public void setGreen(String txt){
   Double value = i.toDouble(txt);
   this.green=value;

 }

 public Double getBlue() {
   return blue;
 }
 public void setBlue(String txt){
   Double value = i.toDouble(txt);
   this.blue=value;

 }

}
