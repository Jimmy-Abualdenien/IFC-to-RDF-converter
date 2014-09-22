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

public class IfcBoundaryEdgeCondition extends IfcBoundaryCondition 
{
 // The property attributes
 Double linearStiffnessByLengthX;
 Double linearStiffnessByLengthY;
 Double linearStiffnessByLengthZ;
 Double rotationalStiffnessByLengthX;
 Double rotationalStiffnessByLengthY;
 Double rotationalStiffnessByLengthZ;


 // Getters and setters of properties

 public Double getLinearStiffnessByLengthX() {
   return linearStiffnessByLengthX;
 }
 public void setLinearStiffnessByLengthX(String txt){
   Double value = i.toDouble(txt);
   this.linearStiffnessByLengthX=value;

 }

 public Double getLinearStiffnessByLengthY() {
   return linearStiffnessByLengthY;
 }
 public void setLinearStiffnessByLengthY(String txt){
   Double value = i.toDouble(txt);
   this.linearStiffnessByLengthY=value;

 }

 public Double getLinearStiffnessByLengthZ() {
   return linearStiffnessByLengthZ;
 }
 public void setLinearStiffnessByLengthZ(String txt){
   Double value = i.toDouble(txt);
   this.linearStiffnessByLengthZ=value;

 }

 public Double getRotationalStiffnessByLengthX() {
   return rotationalStiffnessByLengthX;
 }
 public void setRotationalStiffnessByLengthX(String txt){
   Double value = i.toDouble(txt);
   this.rotationalStiffnessByLengthX=value;

 }

 public Double getRotationalStiffnessByLengthY() {
   return rotationalStiffnessByLengthY;
 }
 public void setRotationalStiffnessByLengthY(String txt){
   Double value = i.toDouble(txt);
   this.rotationalStiffnessByLengthY=value;

 }

 public Double getRotationalStiffnessByLengthZ() {
   return rotationalStiffnessByLengthZ;
 }
 public void setRotationalStiffnessByLengthZ(String txt){
   Double value = i.toDouble(txt);
   this.rotationalStiffnessByLengthZ=value;

 }

}
