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

public class IfcOpticalMaterialProperties extends IfcMaterialProperties 
{
 // The property attributes
 Double visibleTransmittance;
 Double solarTransmittance;
 Double thermalIrTransmittance;
 Double thermalIrEmissivityBack;
 Double thermalIrEmissivityFront;
 Double visibleReflectanceBack;
 Double visibleReflectanceFront;
 Double solarReflectanceFront;
 Double solarReflectanceBack;


 // Getters and setters of properties

 public Double getVisibleTransmittance() {
   return visibleTransmittance;
 }
 public void setVisibleTransmittance(String txt){
   Double value = i.toDouble(txt);
   this.visibleTransmittance=value;

 }

 public Double getSolarTransmittance() {
   return solarTransmittance;
 }
 public void setSolarTransmittance(String txt){
   Double value = i.toDouble(txt);
   this.solarTransmittance=value;

 }

 public Double getThermalIrTransmittance() {
   return thermalIrTransmittance;
 }
 public void setThermalIrTransmittance(String txt){
   Double value = i.toDouble(txt);
   this.thermalIrTransmittance=value;

 }

 public Double getThermalIrEmissivityBack() {
   return thermalIrEmissivityBack;
 }
 public void setThermalIrEmissivityBack(String txt){
   Double value = i.toDouble(txt);
   this.thermalIrEmissivityBack=value;

 }

 public Double getThermalIrEmissivityFront() {
   return thermalIrEmissivityFront;
 }
 public void setThermalIrEmissivityFront(String txt){
   Double value = i.toDouble(txt);
   this.thermalIrEmissivityFront=value;

 }

 public Double getVisibleReflectanceBack() {
   return visibleReflectanceBack;
 }
 public void setVisibleReflectanceBack(String txt){
   Double value = i.toDouble(txt);
   this.visibleReflectanceBack=value;

 }

 public Double getVisibleReflectanceFront() {
   return visibleReflectanceFront;
 }
 public void setVisibleReflectanceFront(String txt){
   Double value = i.toDouble(txt);
   this.visibleReflectanceFront=value;

 }

 public Double getSolarReflectanceFront() {
   return solarReflectanceFront;
 }
 public void setSolarReflectanceFront(String txt){
   Double value = i.toDouble(txt);
   this.solarReflectanceFront=value;

 }

 public Double getSolarReflectanceBack() {
   return solarReflectanceBack;
 }
 public void setSolarReflectanceBack(String txt){
   Double value = i.toDouble(txt);
   this.solarReflectanceBack=value;

 }

}
