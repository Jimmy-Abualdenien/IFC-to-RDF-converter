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

public class IfcBoundaryNodeCondition extends IfcBoundaryCondition 
{
	// The property attributes
	private IfcTranslationalStiffnessSelect TranslationalStiffnessX;
	private IfcTranslationalStiffnessSelect TranslationalStiffnessY;
	private IfcTranslationalStiffnessSelect TranslationalStiffnessZ;
	private IfcRotationalStiffnessSelect RotationalStiffnessX;
	private IfcRotationalStiffnessSelect RotationalStiffnessY;
	private IfcRotationalStiffnessSelect RotationalStiffnessZ;


	// Getters and setters of properties
	public IfcTranslationalStiffnessSelect getTranslationalStiffnessX() {
		return TranslationalStiffnessX;
	}

	public void setTranslationalStiffnessX(IfcTranslationalStiffnessSelect value){
		this.TranslationalStiffnessX=value;
	}

	public IfcTranslationalStiffnessSelect getTranslationalStiffnessY() {
		return TranslationalStiffnessY;
	}

	public void setTranslationalStiffnessY(IfcTranslationalStiffnessSelect value){
		this.TranslationalStiffnessY=value;
	}

	public IfcTranslationalStiffnessSelect getTranslationalStiffnessZ() {
		return TranslationalStiffnessZ;
	}

	public void setTranslationalStiffnessZ(IfcTranslationalStiffnessSelect value){
		this.TranslationalStiffnessZ=value;
	}

	public IfcRotationalStiffnessSelect getRotationalStiffnessX() {
		return RotationalStiffnessX;
	}

	public void setRotationalStiffnessX(IfcRotationalStiffnessSelect value){
		this.RotationalStiffnessX=value;
	}

	public IfcRotationalStiffnessSelect getRotationalStiffnessY() {
		return RotationalStiffnessY;
	}

	public void setRotationalStiffnessY(IfcRotationalStiffnessSelect value){
		this.RotationalStiffnessY=value;
	}

	public IfcRotationalStiffnessSelect getRotationalStiffnessZ() {
		return RotationalStiffnessZ;
	}

	public void setRotationalStiffnessZ(IfcRotationalStiffnessSelect value){
		this.RotationalStiffnessZ=value;
	}

}
