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

public class IfcStructuralLoadTemperature extends IfcStructuralLoadStatic 
{
	// The property attributes
	private IfcThermodynamicTemperatureMeasure DeltaT_Constant;
	private IfcThermodynamicTemperatureMeasure DeltaT_Y;
	private IfcThermodynamicTemperatureMeasure DeltaT_Z;


	// Getters and setters of properties
	public IfcThermodynamicTemperatureMeasure getDeltaT_Constant() {
		return DeltaT_Constant;
	}

	public void setDeltaT_Constant(IfcThermodynamicTemperatureMeasure value){
		this.DeltaT_Constant=value;
	}

	public IfcThermodynamicTemperatureMeasure getDeltaT_Y() {
		return DeltaT_Y;
	}

	public void setDeltaT_Y(IfcThermodynamicTemperatureMeasure value){
		this.DeltaT_Y=value;
	}

	public IfcThermodynamicTemperatureMeasure getDeltaT_Z() {
		return DeltaT_Z;
	}

	public void setDeltaT_Z(IfcThermodynamicTemperatureMeasure value){
		this.DeltaT_Z=value;
	}

}
