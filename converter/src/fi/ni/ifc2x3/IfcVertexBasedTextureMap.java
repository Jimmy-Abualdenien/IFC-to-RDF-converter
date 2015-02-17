package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcList;
import fi.ni.Thing;

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

public class IfcVertexBasedTextureMap extends Thing 
{
 // The property attributes
 List<IfcTextureVertex> textureVertices = new IfcList<IfcTextureVertex>();
 List<IfcCartesianPoint> texturePoints = new IfcList<IfcCartesianPoint>();


 // Getters and setters of properties

 public List<IfcTextureVertex> getTextureVertices() {
   return textureVertices;

 }
 public void setTextureVertices(IfcTextureVertex value){
   this.textureVertices.add(value);

 }

 public List<IfcCartesianPoint> getTexturePoints() {
   return texturePoints;

 }
 public void setTexturePoints(IfcCartesianPoint value){
   this.texturePoints.add(value);

 }

}
