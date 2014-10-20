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

public class IfcMaterialProfileSetUsage extends IfcMaterialUsageDefinition 
{
	// The property attributes
	private IfcMaterialProfileSet ForProfileSet;
	private IfcCardinalPointReference CardinalPoint;
	private IfcPositiveLengthMeasure ReferenceExtent_of_IfcMaterialProfileSetUsage;


	// Getters and setters of properties
	public IfcMaterialProfileSet getForProfileSet() {
		return ForProfileSet;
	}

	public void setForProfileSet(IfcMaterialProfileSet value){
		this.ForProfileSet=value;
	}

	public IfcCardinalPointReference getCardinalPoint() {
		return CardinalPoint;
	}

	public void setCardinalPoint(IfcCardinalPointReference value){
		this.CardinalPoint=value;
	}

	public IfcPositiveLengthMeasure getReferenceExtent_of_IfcMaterialProfileSetUsage() {
		return ReferenceExtent_of_IfcMaterialProfileSetUsage;
	}

	public void setReferenceExtent_of_IfcMaterialProfileSetUsage(IfcPositiveLengthMeasure value){
		this.ReferenceExtent_of_IfcMaterialProfileSetUsage=value;
	}

}
