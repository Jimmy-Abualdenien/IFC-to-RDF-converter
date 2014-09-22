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

public class IfcFillAreaStyleTiles extends IfcGeometricRepresentationItem implements IfcFillStyleSelect
{
 // The property attributes
 IfcOneDirectionRepeatFactor   tilingPattern;
 List<IfcFillAreaStyleTileShapeSelect> tiles = new IfcSet<IfcFillAreaStyleTileShapeSelect>();
 Double tilingScale;


 // Getters and setters of properties

 public IfcOneDirectionRepeatFactor getTilingPattern() {
   return tilingPattern;

 }
 public void setTilingPattern(IfcOneDirectionRepeatFactor value){
   this.tilingPattern=value;

 }

 public List<IfcFillAreaStyleTileShapeSelect> getTiles() {
   return tiles;
 }
 public void setTiles(IfcFillAreaStyleTileShapeSelect value){
   this.tiles.add(value);

 }

 public Double getTilingScale() {
   return tilingScale;
 }
 public void setTilingScale(String txt){
   Double value = i.toDouble(txt);
   this.tilingScale=value;

 }

}
