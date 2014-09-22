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

public class IfcStructuralLoadLinearForce extends IfcStructuralLoadStatic 
{
 // The property attributes
 Double linearForceX;
 Double linearForceY;
 Double linearForceZ;
 Double linearMomentX;
 Double linearMomentY;
 Double linearMomentZ;


 // Getters and setters of properties

 public Double getLinearForceX() {
   return linearForceX;
 }
 public void setLinearForceX(String txt){
   Double value = i.toDouble(txt);
   this.linearForceX=value;

 }

 public Double getLinearForceY() {
   return linearForceY;
 }
 public void setLinearForceY(String txt){
   Double value = i.toDouble(txt);
   this.linearForceY=value;

 }

 public Double getLinearForceZ() {
   return linearForceZ;
 }
 public void setLinearForceZ(String txt){
   Double value = i.toDouble(txt);
   this.linearForceZ=value;

 }

 public Double getLinearMomentX() {
   return linearMomentX;
 }
 public void setLinearMomentX(String txt){
   Double value = i.toDouble(txt);
   this.linearMomentX=value;

 }

 public Double getLinearMomentY() {
   return linearMomentY;
 }
 public void setLinearMomentY(String txt){
   Double value = i.toDouble(txt);
   this.linearMomentY=value;

 }

 public Double getLinearMomentZ() {
   return linearMomentZ;
 }
 public void setLinearMomentZ(String txt){
   Double value = i.toDouble(txt);
   this.linearMomentZ=value;

 }

}
