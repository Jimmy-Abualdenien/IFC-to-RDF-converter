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

public class IfcTendon extends IfcReinforcingElement 
{
 // The property attributes
 String predefinedType;
 Double nominalDiameter;
 Double crossSectionArea;
 Double tensionForce;
 Double preStress;
 Double frictionCoefficient;
 Double anchorageSlip;
 Double minCurvatureRadius;


 // Getters and setters of properties

 public String getPredefinedType() {
   return predefinedType;
 }
 public void setPredefinedType(String value){
   this.predefinedType=value;

 }

 public Double getNominalDiameter() {
   return nominalDiameter;
 }
 public void setNominalDiameter(String txt){
   Double value = i.toDouble(txt);
   this.nominalDiameter=value;

 }

 public Double getCrossSectionArea() {
   return crossSectionArea;
 }
 public void setCrossSectionArea(String txt){
   Double value = i.toDouble(txt);
   this.crossSectionArea=value;

 }

 public Double getTensionForce() {
   return tensionForce;
 }
 public void setTensionForce(String txt){
   Double value = i.toDouble(txt);
   this.tensionForce=value;

 }

 public Double getPreStress() {
   return preStress;
 }
 public void setPreStress(String txt){
   Double value = i.toDouble(txt);
   this.preStress=value;

 }

 public Double getFrictionCoefficient() {
   return frictionCoefficient;
 }
 public void setFrictionCoefficient(String txt){
   Double value = i.toDouble(txt);
   this.frictionCoefficient=value;

 }

 public Double getAnchorageSlip() {
   return anchorageSlip;
 }
 public void setAnchorageSlip(String txt){
   Double value = i.toDouble(txt);
   this.anchorageSlip=value;

 }

 public Double getMinCurvatureRadius() {
   return minCurvatureRadius;
 }
 public void setMinCurvatureRadius(String txt){
   Double value = i.toDouble(txt);
   this.minCurvatureRadius=value;

 }

}
