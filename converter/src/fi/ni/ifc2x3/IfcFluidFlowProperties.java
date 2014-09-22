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

public class IfcFluidFlowProperties extends IfcPropertySetDefinition 
{
 // The property attributes
 String propertySource;
 IfcTimeSeries   flowConditionTimeSeries;
 IfcTimeSeries   velocityTimeSeries;
 IfcTimeSeries   flowrateTimeSeries;
 IfcMaterial   fluid;
 IfcTimeSeries   pressureTimeSeries;
 String userDefinedPropertySource;
 Double temperatureSingleValue;
 Double wetBulbTemperatureSingleValue;
 IfcTimeSeries   wetBulbTemperatureTimeSeries;
 IfcTimeSeries   temperatureTimeSeries;
 String flowrateSingleValue;
 Double flowConditionSingleValue;
 Double velocitySingleValue;
 Double pressureSingleValue;


 // Getters and setters of properties

 public String getPropertySource() {
   return propertySource;
 }
 public void setPropertySource(String value){
   this.propertySource=value;

 }

 public IfcTimeSeries getFlowConditionTimeSeries() {
   return flowConditionTimeSeries;

 }
 public void setFlowConditionTimeSeries(IfcTimeSeries value){
   this.flowConditionTimeSeries=value;

 }

 public IfcTimeSeries getVelocityTimeSeries() {
   return velocityTimeSeries;

 }
 public void setVelocityTimeSeries(IfcTimeSeries value){
   this.velocityTimeSeries=value;

 }

 public IfcTimeSeries getFlowrateTimeSeries() {
   return flowrateTimeSeries;

 }
 public void setFlowrateTimeSeries(IfcTimeSeries value){
   this.flowrateTimeSeries=value;

 }

 public IfcMaterial getFluid() {
   return fluid;

 }
 public void setFluid(IfcMaterial value){
   this.fluid=value;

 }

 public IfcTimeSeries getPressureTimeSeries() {
   return pressureTimeSeries;

 }
 public void setPressureTimeSeries(IfcTimeSeries value){
   this.pressureTimeSeries=value;

 }

 public String getUserDefinedPropertySource() {
   return userDefinedPropertySource;
 }
 public void setUserDefinedPropertySource(String value){
   this.userDefinedPropertySource=value;

 }

 public Double getTemperatureSingleValue() {
   return temperatureSingleValue;
 }
 public void setTemperatureSingleValue(String txt){
   Double value = i.toDouble(txt);
   this.temperatureSingleValue=value;

 }

 public Double getWetBulbTemperatureSingleValue() {
   return wetBulbTemperatureSingleValue;
 }
 public void setWetBulbTemperatureSingleValue(String txt){
   Double value = i.toDouble(txt);
   this.wetBulbTemperatureSingleValue=value;

 }

 public IfcTimeSeries getWetBulbTemperatureTimeSeries() {
   return wetBulbTemperatureTimeSeries;

 }
 public void setWetBulbTemperatureTimeSeries(IfcTimeSeries value){
   this.wetBulbTemperatureTimeSeries=value;

 }

 public IfcTimeSeries getTemperatureTimeSeries() {
   return temperatureTimeSeries;

 }
 public void setTemperatureTimeSeries(IfcTimeSeries value){
   this.temperatureTimeSeries=value;

 }

 public String getFlowrateSingleValue() {
   return flowrateSingleValue;
 }
 public void setFlowrateSingleValue(String value){
   this.flowrateSingleValue=value;

 }

 public Double getFlowConditionSingleValue() {
   return flowConditionSingleValue;
 }
 public void setFlowConditionSingleValue(String txt){
   Double value = i.toDouble(txt);
   this.flowConditionSingleValue=value;

 }

 public Double getVelocitySingleValue() {
   return velocitySingleValue;
 }
 public void setVelocitySingleValue(String txt){
   Double value = i.toDouble(txt);
   this.velocitySingleValue=value;

 }

 public Double getPressureSingleValue() {
   return pressureSingleValue;
 }
 public void setPressureSingleValue(String txt){
   Double value = i.toDouble(txt);
   this.pressureSingleValue=value;

 }

}
