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

public class IfcTextLiteral extends IfcGeometricRepresentationItem 
{
	// The property attributes
	private IfcPresentableText Literal;
	private IfcAxis2Placement Placement_of_IfcTextLiteral;
	private IfcTextPath Path;


	// Getters and setters of properties
	public IfcPresentableText getLiteral() {
		return Literal;
	}

	public void setLiteral(IfcPresentableText value){
		this.Literal=value;
	}

	public IfcAxis2Placement getPlacement_of_IfcTextLiteral() {
		return Placement_of_IfcTextLiteral;
	}

	public void setPlacement_of_IfcTextLiteral(IfcAxis2Placement value){
		this.Placement_of_IfcTextLiteral=value;
	}

	public IfcTextPath getPath() {
		return Path;
	}

	public void setPath(IfcTextPath value){
		this.Path=value;
	}

}
