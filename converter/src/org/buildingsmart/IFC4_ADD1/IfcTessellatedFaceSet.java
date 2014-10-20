package org.buildingsmart.IFC4_ADD1;
import org.buildingsmart.*;
import java.util.*;

/*
 * IFC Java class
/ *
 * The GNU Affero General Public License
 * 
 * Copyright (c) 2014 Jyrki Oraskari (original)
 * Copyright (c) 2014 Pieter Pauwels (modifications - pipauwel.pauwels@ugent.be / pipauwel@gmail.com)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

public class IfcTessellatedFaceSet extends IfcTessellatedItem 
{
	// The property attributes
	private IfcCartesianPointList3D Coordinates_of_IfcTessellatedFaceSet;
	private List<List<IfcParameterValue>> Normals = new ArrayList<List<IfcParameterValue>>();
	private IfcBoolean Closed;
 // The inverse attributes

	private List<IfcIndexedColourMap> HasColours= new ArrayList<IfcIndexedColourMap>();
	private List<IfcIndexedTextureMap> HasTextures= new ArrayList<IfcIndexedTextureMap>();


	// Getters and setters of properties
	public IfcCartesianPointList3D getCoordinates_of_IfcTessellatedFaceSet() {
		return Coordinates_of_IfcTessellatedFaceSet;
	}

	public void setCoordinates_of_IfcTessellatedFaceSet(IfcCartesianPointList3D value){
		this.Coordinates_of_IfcTessellatedFaceSet=value;
	}

	public List<List<IfcParameterValue>> getNormals() {
		return Normals;
	}

	public void setNormals(List<IfcParameterValue> value){
		this.Normals.add(value);
	}

	public IfcBoolean getClosed() {
		return Closed;
	}

	public void setClosed(IfcBoolean value){
		this.Closed=value;
	}

	// Getters and setters of inverse values

	public List<IfcIndexedColourMap> getHasColours() {
		return HasColours;
	}

	public void setHasColours(IfcIndexedColourMap value){
		this.HasColours.add(value);
	}

	public List<IfcIndexedTextureMap> getHasTextures() {
		return HasTextures;
	}

	public void setHasTextures(IfcIndexedTextureMap value){
		this.HasTextures.add(value);
	}

}
