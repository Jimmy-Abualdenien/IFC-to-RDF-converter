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

public class IfcBuilding extends IfcSpatialStructureElement 
{
 // The property attributes
 Double elevationOfRefHeight;
 Double elevationOfTerrain;
 IfcPostalAddress   buildingAddress;


 // Getters and setters of properties

 public Double getElevationOfRefHeight() {
   return elevationOfRefHeight;
 }
 public void setElevationOfRefHeight(String txt){
   Double value = i.toDouble(txt);
   this.elevationOfRefHeight=value;

 }

 public Double getElevationOfTerrain() {
   return elevationOfTerrain;
 }
 public void setElevationOfTerrain(String txt){
   Double value = i.toDouble(txt);
   this.elevationOfTerrain=value;

 }

 public IfcPostalAddress getBuildingAddress() {
   return buildingAddress;

 }
 public void setBuildingAddress(IfcPostalAddress value){
   this.buildingAddress=value;

 }

}
