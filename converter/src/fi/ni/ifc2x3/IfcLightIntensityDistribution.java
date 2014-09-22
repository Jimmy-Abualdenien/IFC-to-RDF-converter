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

public class IfcLightIntensityDistribution extends Thing implements IfcLightDistributionDataSourceSelect
{
 // The property attributes
 String lightDistributionCurve;
 List<IfcLightDistributionData> distributionData = new IfcList<IfcLightDistributionData>();


 // Getters and setters of properties

 public String getLightDistributionCurve() {
   return lightDistributionCurve;
 }
 public void setLightDistributionCurve(String value){
   this.lightDistributionCurve=value;

 }

 public List<IfcLightDistributionData> getDistributionData() {
   return distributionData;

 }
 public void setDistributionData(IfcLightDistributionData value){
   this.distributionData.add(value);

 }

}
