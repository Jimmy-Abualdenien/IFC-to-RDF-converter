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

public class IfcMapConversion extends IfcCoordinateOperation 
{
	// The property attributes
	private IfcLengthMeasure Eastings;
	private IfcLengthMeasure Northings;
	private IfcLengthMeasure OrthogonalHeight;
	private IfcReal XAxisAbscissa;
	private IfcReal XAxisOrdinate;
	private IfcReal Scale_of_IfcMapConversion;


	// Getters and setters of properties
	public IfcLengthMeasure getEastings() {
		return Eastings;
	}

	public void setEastings(IfcLengthMeasure value){
		this.Eastings=value;
	}

	public IfcLengthMeasure getNorthings() {
		return Northings;
	}

	public void setNorthings(IfcLengthMeasure value){
		this.Northings=value;
	}

	public IfcLengthMeasure getOrthogonalHeight() {
		return OrthogonalHeight;
	}

	public void setOrthogonalHeight(IfcLengthMeasure value){
		this.OrthogonalHeight=value;
	}

	public IfcReal getXAxisAbscissa() {
		return XAxisAbscissa;
	}

	public void setXAxisAbscissa(IfcReal value){
		this.XAxisAbscissa=value;
	}

	public IfcReal getXAxisOrdinate() {
		return XAxisOrdinate;
	}

	public void setXAxisOrdinate(IfcReal value){
		this.XAxisOrdinate=value;
	}

	public IfcReal getScale_of_IfcMapConversion() {
		return Scale_of_IfcMapConversion;
	}

	public void setScale_of_IfcMapConversion(IfcReal value){
		this.Scale_of_IfcMapConversion=value;
	}

}
