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

public class IfcDoorStyle extends IfcTypeProduct 
{
 // The property attributes
 String operationType;
 String constructionType;
 String parameterTakesPrecedence;
 String sizeable;


 // Getters and setters of properties

 public String getOperationType() {
   return operationType;
 }
 public void setOperationType(String value){
   this.operationType=value;

 }

 public String getConstructionType() {
   return constructionType;
 }
 public void setConstructionType(String value){
   this.constructionType=value;

 }

 public String getParameterTakesPrecedence() {
   return parameterTakesPrecedence;
 }
 public void setParameterTakesPrecedence(String value){
   this.parameterTakesPrecedence=value;

 }

 public String getSizeable() {
   return sizeable;
 }
 public void setSizeable(String value){
   this.sizeable=value;

 }

}
