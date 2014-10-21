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

public class IfcClassification extends Thing 
{
	// The property attributes
	private IfcLabel Source;
	private IfcLabel Edition;
	private IfcCalendarDate EditionDate;
	private IfcLabel Name_of_IfcClassification;
 // The inverse attributes

	private List<IfcClassificationItem> Contains= new ArrayList<IfcClassificationItem>();


	// Getters and setters of properties
	public IfcLabel getSource() {
		return Source;
	}

	public void setSource(IfcLabel value){
		this.Source=value;
	}

	public IfcLabel getEdition() {
		return Edition;
	}

	public void setEdition(IfcLabel value){
		this.Edition=value;
	}

	public IfcCalendarDate getEditionDate() {
		return EditionDate;
	}

	public void setEditionDate(IfcCalendarDate value){
		this.EditionDate=value;
	}

	public IfcLabel getName_of_IfcClassification() {
		return Name_of_IfcClassification;
	}

	public void setName_of_IfcClassification(IfcLabel value){
		this.Name_of_IfcClassification=value;
	}

	// Getters and setters of inverse values

	public List<IfcClassificationItem> getContains() {
		return Contains;
	}

	public void setContains(IfcClassificationItem value){
		this.Contains.add(value);
	}

}
