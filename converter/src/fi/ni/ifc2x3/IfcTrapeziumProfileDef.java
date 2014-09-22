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

public class IfcTrapeziumProfileDef extends IfcParameterizedProfileDef 
{
 // The property attributes
 Double bottomXDim;
 Double topXDim;
 Double yDim;
 Double topXOffset;


 // Getters and setters of properties

 public Double getBottomXDim() {
   return bottomXDim;
 }
 public void setBottomXDim(String txt){
   Double value = i.toDouble(txt);
   this.bottomXDim=value;

 }

 public Double getTopXDim() {
   return topXDim;
 }
 public void setTopXDim(String txt){
   Double value = i.toDouble(txt);
   this.topXDim=value;

 }

 public Double getYDim() {
   return yDim;
 }
 public void setYDim(String txt){
   Double value = i.toDouble(txt);
   this.yDim=value;

 }

 public Double getTopXOffset() {
   return topXOffset;
 }
 public void setTopXOffset(String txt){
   Double value = i.toDouble(txt);
   this.topXOffset=value;

 }

}
