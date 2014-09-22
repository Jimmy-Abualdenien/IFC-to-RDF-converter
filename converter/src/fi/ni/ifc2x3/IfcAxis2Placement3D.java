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

public class IfcAxis2Placement3D extends IfcPlacement implements IfcAxis2Placement
{
 // The property attributes
 IfcDirection   axis;
 IfcDirection   refDirection;


 // Getters and setters of properties

 public IfcDirection getAxis() {
   return axis;

 }
 public void setAxis(IfcDirection value){
   this.axis=value;

 }

 public IfcDirection getRefDirection() {
   return refDirection;

 }
 public void setRefDirection(IfcDirection value){
   this.refDirection=value;

 }

}
