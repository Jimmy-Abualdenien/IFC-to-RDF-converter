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

public class IfcBoundaryEdgeCondition extends IfcBoundaryCondition 
{
	// The property attributes
	private IfcModulusOfTranslationalSubgradeReactionSelect TranslationalStiffnessByLengthX;
	private IfcModulusOfTranslationalSubgradeReactionSelect TranslationalStiffnessByLengthY;
	private IfcModulusOfTranslationalSubgradeReactionSelect TranslationalStiffnessByLengthZ;
	private IfcModulusOfRotationalSubgradeReactionSelect RotationalStiffnessByLengthX;
	private IfcModulusOfRotationalSubgradeReactionSelect RotationalStiffnessByLengthY;
	private IfcModulusOfRotationalSubgradeReactionSelect RotationalStiffnessByLengthZ;


	// Getters and setters of properties
	public IfcModulusOfTranslationalSubgradeReactionSelect getTranslationalStiffnessByLengthX() {
		return TranslationalStiffnessByLengthX;
	}

	public void setTranslationalStiffnessByLengthX(IfcModulusOfTranslationalSubgradeReactionSelect value){
		this.TranslationalStiffnessByLengthX=value;
	}

	public IfcModulusOfTranslationalSubgradeReactionSelect getTranslationalStiffnessByLengthY() {
		return TranslationalStiffnessByLengthY;
	}

	public void setTranslationalStiffnessByLengthY(IfcModulusOfTranslationalSubgradeReactionSelect value){
		this.TranslationalStiffnessByLengthY=value;
	}

	public IfcModulusOfTranslationalSubgradeReactionSelect getTranslationalStiffnessByLengthZ() {
		return TranslationalStiffnessByLengthZ;
	}

	public void setTranslationalStiffnessByLengthZ(IfcModulusOfTranslationalSubgradeReactionSelect value){
		this.TranslationalStiffnessByLengthZ=value;
	}

	public IfcModulusOfRotationalSubgradeReactionSelect getRotationalStiffnessByLengthX() {
		return RotationalStiffnessByLengthX;
	}

	public void setRotationalStiffnessByLengthX(IfcModulusOfRotationalSubgradeReactionSelect value){
		this.RotationalStiffnessByLengthX=value;
	}

	public IfcModulusOfRotationalSubgradeReactionSelect getRotationalStiffnessByLengthY() {
		return RotationalStiffnessByLengthY;
	}

	public void setRotationalStiffnessByLengthY(IfcModulusOfRotationalSubgradeReactionSelect value){
		this.RotationalStiffnessByLengthY=value;
	}

	public IfcModulusOfRotationalSubgradeReactionSelect getRotationalStiffnessByLengthZ() {
		return RotationalStiffnessByLengthZ;
	}

	public void setRotationalStiffnessByLengthZ(IfcModulusOfRotationalSubgradeReactionSelect value){
		this.RotationalStiffnessByLengthZ=value;
	}

}
