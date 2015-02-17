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

public class IfcTelecomAddress extends IfcAddress 
{
 // The property attributes
 List<String> telephoneNumbers = new IfcList<String>();
 List<String> facsimileNumbers = new IfcList<String>();
 String pagerNumber;
 List<String> electronicMailAddresses = new IfcList<String>();
 String wWWHomePageURL;


 // Getters and setters of properties

 public List<String> getTelephoneNumbers() {
   return telephoneNumbers;
 }
 public void setTelephoneNumbers(String value){
   this.telephoneNumbers.add(value);

 }

 public List<String> getFacsimileNumbers() {
   return facsimileNumbers;
 }
 public void setFacsimileNumbers(String value){
   this.facsimileNumbers.add(value);

 }

 public String getPagerNumber() {
   return pagerNumber;
 }
 public void setPagerNumber(String value){
   this.pagerNumber=value;

 }

 public List<String> getElectronicMailAddresses() {
   return electronicMailAddresses;
 }
 public void setElectronicMailAddresses(String value){
   this.electronicMailAddresses.add(value);

 }

 public String getWWWHomePageURL() {
   return wWWHomePageURL;
 }
 public void setWWWHomePageURL(String value){
   this.wWWHomePageURL=value;

 }

}
