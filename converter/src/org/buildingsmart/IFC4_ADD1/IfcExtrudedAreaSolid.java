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

public class IfcExtrudedAreaSolid extends IfcSweptAreaSolid 
{
	// The property attributes
	private IfcDirection ExtrudedDirection_of_IfcExtrudedAreaSolid;
	private IfcPositiveLengthMeasure Depth_of_IfcExtrudedAreaSolid;


	// Getters and setters of properties
	public IfcDirection getExtrudedDirection_of_IfcExtrudedAreaSolid() {
		return ExtrudedDirection_of_IfcExtrudedAreaSolid;
	}

	public void setExtrudedDirection_of_IfcExtrudedAreaSolid(IfcDirection value){
		this.ExtrudedDirection_of_IfcExtrudedAreaSolid=value;
	}

	public IfcPositiveLengthMeasure getDepth_of_IfcExtrudedAreaSolid() {
		return Depth_of_IfcExtrudedAreaSolid;
	}

	public void setDepth_of_IfcExtrudedAreaSolid(IfcPositiveLengthMeasure value){
		this.Depth_of_IfcExtrudedAreaSolid=value;
	}

}
