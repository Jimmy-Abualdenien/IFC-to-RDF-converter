package fi.ni.ifc2x3;

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

public class IfcSpaceThermalLoadProperties extends IfcPropertySetDefinition 
{
 // The property attributes
 Double applicableValueRatio;
 String thermalLoadSource;
 String propertySource;
 String sourceDescription;
 Double maximumValue;
 Double minimumValue;
 IfcTimeSeries   thermalLoadTimeSeriesValues;
 String userDefinedThermalLoadSource;
 String userDefinedPropertySource;
 String thermalLoadType;


 // Getters and setters of properties

 public Double getApplicableValueRatio() {
   return applicableValueRatio;
 }
 public void setApplicableValueRatio(String txt){
   Double value = i.toDouble(txt);
   this.applicableValueRatio=value;

 }

 public String getThermalLoadSource() {
   return thermalLoadSource;
 }
 public void setThermalLoadSource(String value){
   this.thermalLoadSource=value;

 }

 public String getPropertySource() {
   return propertySource;
 }
 public void setPropertySource(String value){
   this.propertySource=value;

 }

 public String getSourceDescription() {
   return sourceDescription;
 }
 public void setSourceDescription(String value){
   this.sourceDescription=value;

 }

 public Double getMaximumValue() {
   return maximumValue;
 }
 public void setMaximumValue(String txt){
   Double value = i.toDouble(txt);
   this.maximumValue=value;

 }

 public Double getMinimumValue() {
   return minimumValue;
 }
 public void setMinimumValue(String txt){
   Double value = i.toDouble(txt);
   this.minimumValue=value;

 }

 public IfcTimeSeries getThermalLoadTimeSeriesValues() {
   return thermalLoadTimeSeriesValues;

 }
 public void setThermalLoadTimeSeriesValues(IfcTimeSeries value){
   this.thermalLoadTimeSeriesValues=value;

 }

 public String getUserDefinedThermalLoadSource() {
   return userDefinedThermalLoadSource;
 }
 public void setUserDefinedThermalLoadSource(String value){
   this.userDefinedThermalLoadSource=value;

 }

 public String getUserDefinedPropertySource() {
   return userDefinedPropertySource;
 }
 public void setUserDefinedPropertySource(String value){
   this.userDefinedPropertySource=value;

 }

 public String getThermalLoadType() {
   return thermalLoadType;
 }
 public void setThermalLoadType(String value){
   this.thermalLoadType=value;

 }

}
