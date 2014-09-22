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

public class IfcStructuralLoadTemperature extends IfcStructuralLoadStatic 
{
 // The property attributes
 Double deltaT_Constant;
 Double deltaT_Y;
 Double deltaT_Z;


 // Getters and setters of properties

 public Double getDeltaT_Constant() {
   return deltaT_Constant;
 }
 public void setDeltaT_Constant(String txt){
   Double value = i.toDouble(txt);
   this.deltaT_Constant=value;

 }

 public Double getDeltaT_Y() {
   return deltaT_Y;
 }
 public void setDeltaT_Y(String txt){
   Double value = i.toDouble(txt);
   this.deltaT_Y=value;

 }

 public Double getDeltaT_Z() {
   return deltaT_Z;
 }
 public void setDeltaT_Z(String txt){
   Double value = i.toDouble(txt);
   this.deltaT_Z=value;

 }

}
