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

public class IfcLightSourceGoniometric extends IfcLightSource 
{
 // The property attributes
 IfcAxis2Placement3D   position;
 IfcColourRgb   colourAppearance;
 Double colourTemperature;
 Double luminousFlux;
 String lightEmissionSource;
IfcLightDistributionDataSourceSelect lightDistributionDataSource;


 // Getters and setters of properties

 public IfcAxis2Placement3D getPosition() {
   return position;

 }
 public void setPosition(IfcAxis2Placement3D value){
   this.position=value;

 }

 public IfcColourRgb getColourAppearance() {
   return colourAppearance;

 }
 public void setColourAppearance(IfcColourRgb value){
   this.colourAppearance=value;

 }

 public Double getColourTemperature() {
   return colourTemperature;
 }
 public void setColourTemperature(String txt){
   Double value = i.toDouble(txt);
   this.colourTemperature=value;

 }

 public Double getLuminousFlux() {
   return luminousFlux;
 }
 public void setLuminousFlux(String txt){
   Double value = i.toDouble(txt);
   this.luminousFlux=value;

 }

 public String getLightEmissionSource() {
   return lightEmissionSource;
 }
 public void setLightEmissionSource(String value){
   this.lightEmissionSource=value;

 }

 public IfcLightDistributionDataSourceSelect getLightDistributionDataSource() {
   return lightDistributionDataSource;
 }
 public void setLightDistributionDataSource(IfcLightDistributionDataSourceSelect value){
   this.lightDistributionDataSource=value;

 }

}
