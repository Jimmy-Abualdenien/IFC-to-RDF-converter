package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcList;

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

public class IfcPostalAddress extends IfcAddress 
{
 // The property attributes
 String internalLocation;
 List<String> addressLines = new IfcList<String>();
 String postalBox;
 String town;
 String region;
 String postalCode;
 String country;


 // Getters and setters of properties

 public String getInternalLocation() {
   return internalLocation;
 }
 public void setInternalLocation(String value){
   this.internalLocation=value;

 }

 public List<String> getAddressLines() {
   return addressLines;
 }
 public void setAddressLines(String value){
   this.addressLines.add(value);

 }

 public String getPostalBox() {
   return postalBox;
 }
 public void setPostalBox(String value){
   this.postalBox=value;

 }

 public String getTown() {
   return town;
 }
 public void setTown(String value){
   this.town=value;

 }

 public String getRegion() {
   return region;
 }
 public void setRegion(String value){
   this.region=value;

 }

 public String getPostalCode() {
   return postalCode;
 }
 public void setPostalCode(String value){
   this.postalCode=value;

 }

 public String getCountry() {
   return country;
 }
 public void setCountry(String value){
   this.country=value;

 }

}
