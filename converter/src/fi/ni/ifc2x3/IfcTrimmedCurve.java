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

public class IfcTrimmedCurve extends IfcBoundedCurve 
{
 // The property attributes
 IfcCurve   basisCurve;
 List<IfcTrimmingSelect> trim1 = new IfcSet<IfcTrimmingSelect>();
 List<IfcTrimmingSelect> trim2 = new IfcSet<IfcTrimmingSelect>();
 String senseAgreement;
 String masterRepresentation;


 // Getters and setters of properties

 public IfcCurve getBasisCurve() {
   return basisCurve;

 }
 public void setBasisCurve(IfcCurve value){
   this.basisCurve=value;

 }

 public List<IfcTrimmingSelect> getTrim1() {
   return trim1;
 }
 public void setTrim1(IfcTrimmingSelect value){
   this.trim1.add(value);

 }

 public List<IfcTrimmingSelect> getTrim2() {
   return trim2;
 }
 public void setTrim2(IfcTrimmingSelect value){
   this.trim2.add(value);

 }

 public String getSenseAgreement() {
   return senseAgreement;
 }
 public void setSenseAgreement(String value){
   this.senseAgreement=value;

 }

 public String getMasterRepresentation() {
   return masterRepresentation;
 }
 public void setMasterRepresentation(String value){
   this.masterRepresentation=value;

 }

}
