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

public class IfcSurfaceReinforcementArea extends IfcStructuralLoadOrResult 
{
	// The property attributes
	private List<IfcLengthMeasure> SurfaceReinforcement1 = new ArrayList<IfcLengthMeasure>();
	private List<IfcLengthMeasure> SurfaceReinforcement2 = new ArrayList<IfcLengthMeasure>();
	private IfcRatioMeasure ShearReinforcement;


	// Getters and setters of properties
	public List<IfcLengthMeasure> getSurfaceReinforcement1() {
		return SurfaceReinforcement1;
	}

	public void setSurfaceReinforcement1(IfcLengthMeasure value){
		this.SurfaceReinforcement1.add(value);
	}

	public List<IfcLengthMeasure> getSurfaceReinforcement2() {
		return SurfaceReinforcement2;
	}

	public void setSurfaceReinforcement2(IfcLengthMeasure value){
		this.SurfaceReinforcement2.add(value);
	}

	public IfcRatioMeasure getShearReinforcement() {
		return ShearReinforcement;
	}

	public void setShearReinforcement(IfcRatioMeasure value){
		this.ShearReinforcement=value;
	}

}
