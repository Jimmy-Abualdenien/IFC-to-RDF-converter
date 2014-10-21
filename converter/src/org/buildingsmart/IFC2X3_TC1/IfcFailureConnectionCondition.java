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

public class IfcFailureConnectionCondition extends IfcStructuralConnectionCondition 
{
	// The property attributes
	private IfcForceMeasure TensionFailureX;
	private IfcForceMeasure TensionFailureY;
	private IfcForceMeasure TensionFailureZ;
	private IfcForceMeasure CompressionFailureX;
	private IfcForceMeasure CompressionFailureY;
	private IfcForceMeasure CompressionFailureZ;


	// Getters and setters of properties
	public IfcForceMeasure getTensionFailureX() {
		return TensionFailureX;
	}

	public void setTensionFailureX(IfcForceMeasure value){
		this.TensionFailureX=value;
	}

	public IfcForceMeasure getTensionFailureY() {
		return TensionFailureY;
	}

	public void setTensionFailureY(IfcForceMeasure value){
		this.TensionFailureY=value;
	}

	public IfcForceMeasure getTensionFailureZ() {
		return TensionFailureZ;
	}

	public void setTensionFailureZ(IfcForceMeasure value){
		this.TensionFailureZ=value;
	}

	public IfcForceMeasure getCompressionFailureX() {
		return CompressionFailureX;
	}

	public void setCompressionFailureX(IfcForceMeasure value){
		this.CompressionFailureX=value;
	}

	public IfcForceMeasure getCompressionFailureY() {
		return CompressionFailureY;
	}

	public void setCompressionFailureY(IfcForceMeasure value){
		this.CompressionFailureY=value;
	}

	public IfcForceMeasure getCompressionFailureZ() {
		return CompressionFailureZ;
	}

	public void setCompressionFailureZ(IfcForceMeasure value){
		this.CompressionFailureZ=value;
	}

}
