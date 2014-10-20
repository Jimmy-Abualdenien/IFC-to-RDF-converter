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

public class IfcTypeProcess extends IfcTypeObject implements IfcProcessSelect
{
	// The property attributes
	private IfcIdentifier Identification_of_IfcTypeProcess;
	private IfcText LongDescription_of_IfcTypeProcess;
	private IfcLabel ProcessType;
 // The inverse attributes

	private List<IfcRelAssignsToProcess> OperatesOn= new ArrayList<IfcRelAssignsToProcess>();


	// Getters and setters of properties
	public IfcIdentifier getIdentification_of_IfcTypeProcess() {
		return Identification_of_IfcTypeProcess;
	}

	public void setIdentification_of_IfcTypeProcess(IfcIdentifier value){
		this.Identification_of_IfcTypeProcess=value;
	}

	public IfcText getLongDescription_of_IfcTypeProcess() {
		return LongDescription_of_IfcTypeProcess;
	}

	public void setLongDescription_of_IfcTypeProcess(IfcText value){
		this.LongDescription_of_IfcTypeProcess=value;
	}

	public IfcLabel getProcessType() {
		return ProcessType;
	}

	public void setProcessType(IfcLabel value){
		this.ProcessType=value;
	}

	// Getters and setters of inverse values

	public List<IfcRelAssignsToProcess> getOperatesOn() {
		return OperatesOn;
	}

	public void setOperatesOn(IfcRelAssignsToProcess value){
		this.OperatesOn.add(value);
	}

}
