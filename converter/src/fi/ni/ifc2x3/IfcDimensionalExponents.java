package fi.ni.ifc2x3;
import fi.ni.Thing;

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

public class IfcDimensionalExponents extends Thing 
{
 // The property attributes
 Long lengthExponent;
 Long massExponent;
 Long timeExponent;
 Long electricCurrentExponent;
 Long thermodynamicTemperatureExponent;
 Long amountOfSubstanceExponent;
 Long luminousIntensityExponent;


 // Getters and setters of properties

 public Long getLengthExponent() {
   return lengthExponent;
 }
 public void setLengthExponent(String txt){
   Long value = i.toLong(txt);
   this.lengthExponent=value;

 }

 public Long getMassExponent() {
   return massExponent;
 }
 public void setMassExponent(String txt){
   Long value = i.toLong(txt);
   this.massExponent=value;

 }

 public Long getTimeExponent() {
   return timeExponent;
 }
 public void setTimeExponent(String txt){
   Long value = i.toLong(txt);
   this.timeExponent=value;

 }

 public Long getElectricCurrentExponent() {
   return electricCurrentExponent;
 }
 public void setElectricCurrentExponent(String txt){
   Long value = i.toLong(txt);
   this.electricCurrentExponent=value;

 }

 public Long getThermodynamicTemperatureExponent() {
   return thermodynamicTemperatureExponent;
 }
 public void setThermodynamicTemperatureExponent(String txt){
   Long value = i.toLong(txt);
   this.thermodynamicTemperatureExponent=value;

 }

 public Long getAmountOfSubstanceExponent() {
   return amountOfSubstanceExponent;
 }
 public void setAmountOfSubstanceExponent(String txt){
   Long value = i.toLong(txt);
   this.amountOfSubstanceExponent=value;

 }

 public Long getLuminousIntensityExponent() {
   return luminousIntensityExponent;
 }
 public void setLuminousIntensityExponent(String txt){
   Long value = i.toLong(txt);
   this.luminousIntensityExponent=value;

 }

}
