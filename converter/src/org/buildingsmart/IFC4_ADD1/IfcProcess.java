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

public class IfcProcess extends IfcObject implements IfcProcessSelect
{
	// The property attributes
	private IfcIdentifier Identification_of_IfcProcess;
	private IfcText LongDescription_of_IfcProcess;
 // The inverse attributes

	private List<IfcRelSequence> IsPredecessorTo= new ArrayList<IfcRelSequence>();
	private List<IfcRelSequence> IsSuccessorFrom= new ArrayList<IfcRelSequence>();
	private List<IfcRelAssignsToProcess> OperatesOn= new ArrayList<IfcRelAssignsToProcess>();


	// Getters and setters of properties
	public IfcIdentifier getIdentification_of_IfcProcess() {
		return Identification_of_IfcProcess;
	}

	public void setIdentification_of_IfcProcess(IfcIdentifier value){
		this.Identification_of_IfcProcess=value;
	}

	public IfcText getLongDescription_of_IfcProcess() {
		return LongDescription_of_IfcProcess;
	}

	public void setLongDescription_of_IfcProcess(IfcText value){
		this.LongDescription_of_IfcProcess=value;
	}

	// Getters and setters of inverse values

	public List<IfcRelSequence> getIsPredecessorTo() {
		return IsPredecessorTo;
	}

	public void setIsPredecessorTo(IfcRelSequence value){
		this.IsPredecessorTo.add(value);
	}

	public List<IfcRelSequence> getIsSuccessorFrom() {
		return IsSuccessorFrom;
	}

	public void setIsSuccessorFrom(IfcRelSequence value){
		this.IsSuccessorFrom.add(value);
	}

	public List<IfcRelAssignsToProcess> getOperatesOn() {
		return OperatesOn;
	}

	public void setOperatesOn(IfcRelAssignsToProcess value){
		this.OperatesOn.add(value);
	}

}
