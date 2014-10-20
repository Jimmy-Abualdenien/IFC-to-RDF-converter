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

public class IfcRelAssociatesConstraint extends IfcRelAssociates 
{
	// The property attributes
	private IfcLabel Intent;
	private IfcConstraint RelatingConstraint_of_IfcRelAssociatesConstraint;


	// Getters and setters of properties
	public IfcLabel getIntent() {
		return Intent;
	}

	public void setIntent(IfcLabel value){
		this.Intent=value;
	}

	public IfcConstraint getRelatingConstraint_of_IfcRelAssociatesConstraint() {
		return RelatingConstraint_of_IfcRelAssociatesConstraint;
	}

	public void setRelatingConstraint_of_IfcRelAssociatesConstraint(IfcConstraint value){
		this.RelatingConstraint_of_IfcRelAssociatesConstraint=value;
	}

}
