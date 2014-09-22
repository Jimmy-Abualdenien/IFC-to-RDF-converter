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

public class IfcReinforcingBar extends IfcReinforcingElement 
{
 // The property attributes
 Double nominalDiameter;
 Double crossSectionArea;
 Double barLength;
 String barRole;
 String barSurface;


 // Getters and setters of properties

 public Double getNominalDiameter() {
   return nominalDiameter;
 }
 public void setNominalDiameter(String txt){
   Double value = i.toDouble(txt);
   this.nominalDiameter=value;

 }

 public Double getCrossSectionArea() {
   return crossSectionArea;
 }
 public void setCrossSectionArea(String txt){
   Double value = i.toDouble(txt);
   this.crossSectionArea=value;

 }

 public Double getBarLength() {
   return barLength;
 }
 public void setBarLength(String txt){
   Double value = i.toDouble(txt);
   this.barLength=value;

 }

 public String getBarRole() {
   return barRole;
 }
 public void setBarRole(String value){
   this.barRole=value;

 }

 public String getBarSurface() {
   return barSurface;
 }
 public void setBarSurface(String value){
   this.barSurface=value;

 }

}
