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

public class IfcPhysicalComplexQuantity extends IfcPhysicalQuantity 
{
	// The property attributes
	private List<IfcPhysicalQuantity> HasQuantities = new ArrayList<IfcPhysicalQuantity>();
	private IfcLabel Discrimination;
	private IfcLabel Quality;
	private IfcLabel Usage;


	// Getters and setters of properties
	public List<IfcPhysicalQuantity> getHasQuantities() {
		return HasQuantities;
	}

	public void setHasQuantities(IfcPhysicalQuantity value){
		this.HasQuantities.add(value);
	}

	public IfcLabel getDiscrimination() {
		return Discrimination;
	}

	public void setDiscrimination(IfcLabel value){
		this.Discrimination=value;
	}

	public IfcLabel getQuality() {
		return Quality;
	}

	public void setQuality(IfcLabel value){
		this.Quality=value;
	}

	public IfcLabel getUsage() {
		return Usage;
	}

	public void setUsage(IfcLabel value){
		this.Usage=value;
	}

}
