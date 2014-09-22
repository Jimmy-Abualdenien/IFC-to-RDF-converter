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

public class IfcElectricalBaseProperties extends IfcEnergyProperties 
{
 // The property attributes
 String electricCurrentType;
 Double inputVoltage;
 Double inputFrequency;
 Double fullLoadCurrent;
 Double minimumCircuitCurrent;
 Double maximumPowerInput;
 Double ratedPowerInput;
 Long inputPhase;


 // Getters and setters of properties

 public String getElectricCurrentType() {
   return electricCurrentType;
 }
 public void setElectricCurrentType(String value){
   this.electricCurrentType=value;

 }

 public Double getInputVoltage() {
   return inputVoltage;
 }
 public void setInputVoltage(String txt){
   Double value = i.toDouble(txt);
   this.inputVoltage=value;

 }

 public Double getInputFrequency() {
   return inputFrequency;
 }
 public void setInputFrequency(String txt){
   Double value = i.toDouble(txt);
   this.inputFrequency=value;

 }

 public Double getFullLoadCurrent() {
   return fullLoadCurrent;
 }
 public void setFullLoadCurrent(String txt){
   Double value = i.toDouble(txt);
   this.fullLoadCurrent=value;

 }

 public Double getMinimumCircuitCurrent() {
   return minimumCircuitCurrent;
 }
 public void setMinimumCircuitCurrent(String txt){
   Double value = i.toDouble(txt);
   this.minimumCircuitCurrent=value;

 }

 public Double getMaximumPowerInput() {
   return maximumPowerInput;
 }
 public void setMaximumPowerInput(String txt){
   Double value = i.toDouble(txt);
   this.maximumPowerInput=value;

 }

 public Double getRatedPowerInput() {
   return ratedPowerInput;
 }
 public void setRatedPowerInput(String txt){
   Double value = i.toDouble(txt);
   this.ratedPowerInput=value;

 }

 public Long getInputPhase() {
   return inputPhase;
 }
 public void setInputPhase(String txt){
   Long value = i.toLong(txt);
   this.inputPhase=value;

 }

}
