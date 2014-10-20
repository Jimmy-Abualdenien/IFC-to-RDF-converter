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

public class IfcSurfaceTexture extends IfcPresentationItem 
{
	// The property attributes
	private IfcBoolean RepeatS;
	private IfcBoolean RepeatT;
	private IfcIdentifier Mode_of_IfcSurfaceTexture;
	private IfcCartesianTransformationOperator2D TextureTransform;
	private List<IfcIdentifier> Parameter_of_IfcSurfaceTexture = new ArrayList<IfcIdentifier>();
 // The inverse attributes

	private List<IfcTextureCoordinate> IsMappedBy= new ArrayList<IfcTextureCoordinate>();
	private List<IfcSurfaceStyleWithTextures> UsedInStyles= new ArrayList<IfcSurfaceStyleWithTextures>();


	// Getters and setters of properties
	public IfcBoolean getRepeatS() {
		return RepeatS;
	}

	public void setRepeatS(IfcBoolean value){
		this.RepeatS=value;
	}

	public IfcBoolean getRepeatT() {
		return RepeatT;
	}

	public void setRepeatT(IfcBoolean value){
		this.RepeatT=value;
	}

	public IfcIdentifier getMode_of_IfcSurfaceTexture() {
		return Mode_of_IfcSurfaceTexture;
	}

	public void setMode_of_IfcSurfaceTexture(IfcIdentifier value){
		this.Mode_of_IfcSurfaceTexture=value;
	}

	public IfcCartesianTransformationOperator2D getTextureTransform() {
		return TextureTransform;
	}

	public void setTextureTransform(IfcCartesianTransformationOperator2D value){
		this.TextureTransform=value;
	}

	public List<IfcIdentifier> getParameter_of_IfcSurfaceTexture() {
		return Parameter_of_IfcSurfaceTexture;
	}

	public void setParameter_of_IfcSurfaceTexture(IfcIdentifier value){
		this.Parameter_of_IfcSurfaceTexture.add(value);
	}

	// Getters and setters of inverse values

	public List<IfcTextureCoordinate> getIsMappedBy() {
		return IsMappedBy;
	}

	public void setIsMappedBy(IfcTextureCoordinate value){
		this.IsMappedBy.add(value);
	}

	public List<IfcSurfaceStyleWithTextures> getUsedInStyles() {
		return UsedInStyles;
	}

	public void setUsedInStyles(IfcSurfaceStyleWithTextures value){
		this.UsedInStyles.add(value);
	}

}
