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

public class IfcSpaceProgram extends IfcControl 
{
	// The property attributes
	private IfcIdentifier SpaceProgramIdentifier;
	private IfcAreaMeasure MaxRequiredArea;
	private IfcAreaMeasure MinRequiredArea;
	private IfcSpatialStructureElement RequestedLocation;
	private IfcAreaMeasure StandardRequiredArea;
	// The inverse attributes
	private List<IfcRelInteractionRequirements> HasInteractionReqsFrom= new ArrayList<IfcRelInteractionRequirements>();
	private List<IfcRelInteractionRequirements> HasInteractionReqsTo= new ArrayList<IfcRelInteractionRequirements>();


	// Getters and setters of properties
	public IfcIdentifier getSpaceProgramIdentifier() {
		return SpaceProgramIdentifier;
	}

	public void setSpaceProgramIdentifier(IfcIdentifier value){
		this.SpaceProgramIdentifier=value;
	}

	public IfcAreaMeasure getMaxRequiredArea() {
		return MaxRequiredArea;
	}

	public void setMaxRequiredArea(IfcAreaMeasure value){
		this.MaxRequiredArea=value;
	}

	public IfcAreaMeasure getMinRequiredArea() {
		return MinRequiredArea;
	}

	public void setMinRequiredArea(IfcAreaMeasure value){
		this.MinRequiredArea=value;
	}

	public IfcSpatialStructureElement getRequestedLocation() {
		return RequestedLocation;
	}

	public void setRequestedLocation(IfcSpatialStructureElement value){
		this.RequestedLocation=value;
	}

	public IfcAreaMeasure getStandardRequiredArea() {
		return StandardRequiredArea;
	}

	public void setStandardRequiredArea(IfcAreaMeasure value){
		this.StandardRequiredArea=value;
	}

	// Getters and setters of inverse values

	public List<IfcRelInteractionRequirements> getHasInteractionReqsFrom() {
		return HasInteractionReqsFrom;
	}

	public void setHasInteractionReqsFrom(IfcRelInteractionRequirements value){
		this.HasInteractionReqsFrom.add(value);
	}

	public List<IfcRelInteractionRequirements> getHasInteractionReqsTo() {
		return HasInteractionReqsTo;
	}

	public void setHasInteractionReqsTo(IfcRelInteractionRequirements value){
		this.HasInteractionReqsTo.add(value);
	}

}
