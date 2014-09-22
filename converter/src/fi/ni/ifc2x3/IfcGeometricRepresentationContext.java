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

public class IfcGeometricRepresentationContext extends IfcRepresentationContext 
{
 // The property attributes
 Long coordinateSpaceDimension;
 Double precision;
IfcAxis2Placement worldCoordinateSystem;
 IfcDirection   trueNorth;
 // The inverse attributes

 InverseLinksList<IfcGeometricRepresentationSubContext> hasSubContexts= new InverseLinksList<IfcGeometricRepresentationSubContext>();


 // Getters and setters of properties

 public Long getCoordinateSpaceDimension() {
   return coordinateSpaceDimension;
 }
 public void setCoordinateSpaceDimension(String txt){
   Long value = i.toLong(txt);
   this.coordinateSpaceDimension=value;

 }

 public Double getPrecision() {
   return precision;
 }
 public void setPrecision(String txt){
   Double value = i.toDouble(txt);
   this.precision=value;

 }

 public IfcAxis2Placement getWorldCoordinateSystem() {
   return worldCoordinateSystem;
 }
 public void setWorldCoordinateSystem(IfcAxis2Placement value){
   this.worldCoordinateSystem=value;

 }

 public IfcDirection getTrueNorth() {
   return trueNorth;

 }
 public void setTrueNorth(IfcDirection value){
   this.trueNorth=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcGeometricRepresentationSubContext> getHasSubContexts() {
   return hasSubContexts;

 }
 public void setHasSubContexts(IfcGeometricRepresentationSubContext value){
   this.hasSubContexts.add(value);

 }

}
