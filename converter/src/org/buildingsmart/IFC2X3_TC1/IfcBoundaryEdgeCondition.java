package org.buildingsmart.IFC2X3_TC1;
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
	private IfcModulusOfLinearSubgradeReactionMeasure LinearStiffnessByLengthX;
	private IfcModulusOfLinearSubgradeReactionMeasure LinearStiffnessByLengthY;
	private IfcModulusOfLinearSubgradeReactionMeasure LinearStiffnessByLengthZ;
	private IfcModulusOfRotationalSubgradeReactionMeasure RotationalStiffnessByLengthX;
	private IfcModulusOfRotationalSubgradeReactionMeasure RotationalStiffnessByLengthY;
	private IfcModulusOfRotationalSubgradeReactionMeasure RotationalStiffnessByLengthZ;


	// Getters and setters of properties
	public IfcModulusOfLinearSubgradeReactionMeasure getLinearStiffnessByLengthX() {
		return LinearStiffnessByLengthX;
	}

	public void setLinearStiffnessByLengthX(IfcModulusOfLinearSubgradeReactionMeasure value){
		this.LinearStiffnessByLengthX=value;
	}

	public IfcModulusOfLinearSubgradeReactionMeasure getLinearStiffnessByLengthY() {
		return LinearStiffnessByLengthY;
	}

	public void setLinearStiffnessByLengthY(IfcModulusOfLinearSubgradeReactionMeasure value){
		this.LinearStiffnessByLengthY=value;
	}

	public IfcModulusOfLinearSubgradeReactionMeasure getLinearStiffnessByLengthZ() {
		return LinearStiffnessByLengthZ;
	}

	public void setLinearStiffnessByLengthZ(IfcModulusOfLinearSubgradeReactionMeasure value){
		this.LinearStiffnessByLengthZ=value;
	}

	public IfcModulusOfRotationalSubgradeReactionMeasure getRotationalStiffnessByLengthX() {
		return RotationalStiffnessByLengthX;
	}

	public void setRotationalStiffnessByLengthX(IfcModulusOfRotationalSubgradeReactionMeasure value){
		this.RotationalStiffnessByLengthX=value;
	}

	public IfcModulusOfRotationalSubgradeReactionMeasure getRotationalStiffnessByLengthY() {
		return RotationalStiffnessByLengthY;
	}

	public void setRotationalStiffnessByLengthY(IfcModulusOfRotationalSubgradeReactionMeasure value){
		this.RotationalStiffnessByLengthY=value;
	}

	public IfcModulusOfRotationalSubgradeReactionMeasure getRotationalStiffnessByLengthZ() {
		return RotationalStiffnessByLengthZ;
	}

	public void setRotationalStiffnessByLengthZ(IfcModulusOfRotationalSubgradeReactionMeasure value){
		this.RotationalStiffnessByLengthZ=value;
	}

}
