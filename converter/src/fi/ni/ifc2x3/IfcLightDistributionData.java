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

public class IfcLightDistributionData extends Thing 
{
 // The property attributes
 Double mainPlaneAngle;
 List<Double> secondaryPlaneAngle = new IfcList<Double>();
 List<Double> luminousIntensity = new IfcList<Double>();


 // Getters and setters of properties

 public Double getMainPlaneAngle() {
   return mainPlaneAngle;
 }
 public void setMainPlaneAngle(String txt){
   Double value = i.toDouble(txt);
   this.mainPlaneAngle=value;

 }

 public List<Double> getSecondaryPlaneAngle() {
   return secondaryPlaneAngle;
 }
 public void setSecondaryPlaneAngle(String txt){
   List<Double> value = i.toDoubleList(txt);
   this.secondaryPlaneAngle=value;

 }

 public List<Double> getLuminousIntensity() {
   return luminousIntensity;
 }
 public void setLuminousIntensity(String txt){
   List<Double> value = i.toDoubleList(txt);
   this.luminousIntensity=value;

 }

}
