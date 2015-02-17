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

public class IfcAnnotationFillAreaOccurrence extends IfcAnnotationOccurrence 
{
 // The property attributes
 IfcPoint   fillStyleTarget;
 String globalOrLocal;


 // Getters and setters of properties

 public IfcPoint getFillStyleTarget() {
   return fillStyleTarget;

 }
 public void setFillStyleTarget(IfcPoint value){
   this.fillStyleTarget=value;

 }

 public String getGlobalOrLocal() {
   return globalOrLocal;
 }
 public void setGlobalOrLocal(String value){
   this.globalOrLocal=value;

 }

}
