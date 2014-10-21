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

public class IfcRelSequence extends IfcRelConnects 
{
	// The property attributes
	private IfcProcess RelatingProcess_of_IfcRelSequence;
	private IfcProcess RelatedProcess;
	private IfcTimeMeasure TimeLag;
	private IfcSequenceEnum SequenceType;


	// Getters and setters of properties
	public IfcProcess getRelatingProcess_of_IfcRelSequence() {
		return RelatingProcess_of_IfcRelSequence;
	}

	public void setRelatingProcess_of_IfcRelSequence(IfcProcess value){
		this.RelatingProcess_of_IfcRelSequence=value;
	}

	public IfcProcess getRelatedProcess() {
		return RelatedProcess;
	}

	public void setRelatedProcess(IfcProcess value){
		this.RelatedProcess=value;
	}

	public IfcTimeMeasure getTimeLag() {
		return TimeLag;
	}

	public void setTimeLag(IfcTimeMeasure value){
		this.TimeLag=value;
	}

	public IfcSequenceEnum getSequenceType() {
		return SequenceType;
	}

	public void setSequenceType(IfcSequenceEnum value){
		this.SequenceType=value;
	}

}
