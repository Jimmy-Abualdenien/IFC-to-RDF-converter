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

public class IfcPile extends IfcBuildingElement 
{
	// The property attributes
	private IfcPileTypeEnum PredefinedType_of_IfcPile;
	private IfcPileConstructionEnum ConstructionType_of_IfcPile;


	// Getters and setters of properties
	public IfcPileTypeEnum getPredefinedType_of_IfcPile() {
		return PredefinedType_of_IfcPile;
	}

	public void setPredefinedType_of_IfcPile(IfcPileTypeEnum value){
		this.PredefinedType_of_IfcPile=value;
	}

	public IfcPileConstructionEnum getConstructionType_of_IfcPile() {
		return ConstructionType_of_IfcPile;
	}

	public void setConstructionType_of_IfcPile(IfcPileConstructionEnum value){
		this.ConstructionType_of_IfcPile=value;
	}

}
