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

public class IfcGeometricRepresentationSubContext extends IfcGeometricRepresentationContext 
{
 // The property attributes
 IfcGeometricRepresentationContext   parentContext;
 Double targetScale;
 String targetView;
 String userDefinedTargetView;


 // Getters and setters of properties

 public IfcGeometricRepresentationContext getParentContext() {
   return parentContext;

 }
 public void setParentContext(IfcGeometricRepresentationContext value){
   this.parentContext=value;

 }

 public Double getTargetScale() {
   return targetScale;
 }
 public void setTargetScale(String txt){
   Double value = i.toDouble(txt);
   this.targetScale=value;

 }

 public String getTargetView() {
   return targetView;
 }
 public void setTargetView(String value){
   this.targetView=value;

 }

 public String getUserDefinedTargetView() {
   return userDefinedTargetView;
 }
 public void setUserDefinedTargetView(String value){
   this.userDefinedTargetView=value;

 }

}
