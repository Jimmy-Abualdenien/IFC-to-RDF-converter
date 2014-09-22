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

public class IfcStairFlight extends IfcBuildingElement 
{
 // The property attributes
 Long numberOfRiser;
 Long numberOfTreads;
 Double riserHeight;
 Double treadLength;


 // Getters and setters of properties

 public Long getNumberOfRiser() {
   return numberOfRiser;
 }
 public void setNumberOfRiser(String txt){
   Long value = i.toLong(txt);
   this.numberOfRiser=value;

 }

 public Long getNumberOfTreads() {
   return numberOfTreads;
 }
 public void setNumberOfTreads(String txt){
   Long value = i.toLong(txt);
   this.numberOfTreads=value;

 }

 public Double getRiserHeight() {
   return riserHeight;
 }
 public void setRiserHeight(String txt){
   Double value = i.toDouble(txt);
   this.riserHeight=value;

 }

 public Double getTreadLength() {
   return treadLength;
 }
 public void setTreadLength(String txt){
   Double value = i.toDouble(txt);
   this.treadLength=value;

 }

}
