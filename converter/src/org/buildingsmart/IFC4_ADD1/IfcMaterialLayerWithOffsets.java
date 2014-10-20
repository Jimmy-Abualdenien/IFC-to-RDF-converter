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

public class IfcMaterialLayerWithOffsets extends IfcMaterialLayer 
{
	// The property attributes
	private IfcLayerSetDirectionEnum OffsetDirection;
	private IfcLengthMeasure OffsetValues_of_IfcMaterialLayerWithOffsets;


	// Getters and setters of properties
	public IfcLayerSetDirectionEnum getOffsetDirection() {
		return OffsetDirection;
	}

	public void setOffsetDirection(IfcLayerSetDirectionEnum value){
		this.OffsetDirection=value;
	}

	public IfcLengthMeasure getOffsetValues_of_IfcMaterialLayerWithOffsets() {
		return OffsetValues_of_IfcMaterialLayerWithOffsets;
	}

	public void setOffsetValues_of_IfcMaterialLayerWithOffsets(IfcLengthMeasure value){
		this.OffsetValues_of_IfcMaterialLayerWithOffsets=value;
	}

}
