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

public class IfcStructuralLoadSingleForce extends IfcStructuralLoadStatic 
{
	// The property attributes
	private IfcForceMeasure ForceX;
	private IfcForceMeasure ForceY;
	private IfcForceMeasure ForceZ;
	private IfcTorqueMeasure MomentX;
	private IfcTorqueMeasure MomentY;
	private IfcTorqueMeasure MomentZ;


	// Getters and setters of properties
	public IfcForceMeasure getForceX() {
		return ForceX;
	}

	public void setForceX(IfcForceMeasure value){
		this.ForceX=value;
	}

	public IfcForceMeasure getForceY() {
		return ForceY;
	}

	public void setForceY(IfcForceMeasure value){
		this.ForceY=value;
	}

	public IfcForceMeasure getForceZ() {
		return ForceZ;
	}

	public void setForceZ(IfcForceMeasure value){
		this.ForceZ=value;
	}

	public IfcTorqueMeasure getMomentX() {
		return MomentX;
	}

	public void setMomentX(IfcTorqueMeasure value){
		this.MomentX=value;
	}

	public IfcTorqueMeasure getMomentY() {
		return MomentY;
	}

	public void setMomentY(IfcTorqueMeasure value){
		this.MomentY=value;
	}

	public IfcTorqueMeasure getMomentZ() {
		return MomentZ;
	}

	public void setMomentZ(IfcTorqueMeasure value){
		this.MomentZ=value;
	}

}
