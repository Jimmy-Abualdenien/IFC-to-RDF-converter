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

public class IfcSite extends IfcSpatialStructureElement 
{
 // The property attributes
 String refLatitude;
 String refLongitude;
 Double refElevation;
 String landTitleNumber;
 IfcPostalAddress   siteAddress;


 // Getters and setters of properties

 public String getRefLatitude() {
   return refLatitude;
 }
 public void setRefLatitude(String value){
   this.refLatitude=value;

 }

 public String getRefLongitude() {
   return refLongitude;
 }
 public void setRefLongitude(String value){
   this.refLongitude=value;

 }

 public Double getRefElevation() {
   return refElevation;
 }
 public void setRefElevation(String txt){
   Double value = i.toDouble(txt);
   this.refElevation=value;

 }

 public String getLandTitleNumber() {
   return landTitleNumber;
 }
 public void setLandTitleNumber(String value){
   this.landTitleNumber=value;

 }

 public IfcPostalAddress getSiteAddress() {
   return siteAddress;

 }
 public void setSiteAddress(IfcPostalAddress value){
   this.siteAddress=value;

 }

}
