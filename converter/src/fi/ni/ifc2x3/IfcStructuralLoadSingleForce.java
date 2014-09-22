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

public class IfcStructuralLoadSingleForce extends IfcStructuralLoadStatic 
{
 // The property attributes
 Double forceX;
 Double forceY;
 Double forceZ;
 Double momentX;
 Double momentY;
 Double momentZ;


 // Getters and setters of properties

 public Double getForceX() {
   return forceX;
 }
 public void setForceX(String txt){
   Double value = i.toDouble(txt);
   this.forceX=value;

 }

 public Double getForceY() {
   return forceY;
 }
 public void setForceY(String txt){
   Double value = i.toDouble(txt);
   this.forceY=value;

 }

 public Double getForceZ() {
   return forceZ;
 }
 public void setForceZ(String txt){
   Double value = i.toDouble(txt);
   this.forceZ=value;

 }

 public Double getMomentX() {
   return momentX;
 }
 public void setMomentX(String txt){
   Double value = i.toDouble(txt);
   this.momentX=value;

 }

 public Double getMomentY() {
   return momentY;
 }
 public void setMomentY(String txt){
   Double value = i.toDouble(txt);
   this.momentY=value;

 }

 public Double getMomentZ() {
   return momentZ;
 }
 public void setMomentZ(String txt){
   Double value = i.toDouble(txt);
   this.momentZ=value;

 }

}
