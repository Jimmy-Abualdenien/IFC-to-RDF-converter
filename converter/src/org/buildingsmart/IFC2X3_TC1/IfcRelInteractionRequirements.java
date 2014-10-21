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

public class IfcRelInteractionRequirements extends IfcRelConnects 
{
	// The property attributes
	private IfcCountMeasure DailyInteraction;
	private IfcNormalisedRatioMeasure ImportanceRating;
	private IfcSpatialStructureElement LocationOfInteraction;
	private IfcSpaceProgram RelatedSpaceProgram;
	private IfcSpaceProgram RelatingSpaceProgram;


	// Getters and setters of properties
	public IfcCountMeasure getDailyInteraction() {
		return DailyInteraction;
	}

	public void setDailyInteraction(IfcCountMeasure value){
		this.DailyInteraction=value;
	}

	public IfcNormalisedRatioMeasure getImportanceRating() {
		return ImportanceRating;
	}

	public void setImportanceRating(IfcNormalisedRatioMeasure value){
		this.ImportanceRating=value;
	}

	public IfcSpatialStructureElement getLocationOfInteraction() {
		return LocationOfInteraction;
	}

	public void setLocationOfInteraction(IfcSpatialStructureElement value){
		this.LocationOfInteraction=value;
	}

	public IfcSpaceProgram getRelatedSpaceProgram() {
		return RelatedSpaceProgram;
	}

	public void setRelatedSpaceProgram(IfcSpaceProgram value){
		this.RelatedSpaceProgram=value;
	}

	public IfcSpaceProgram getRelatingSpaceProgram() {
		return RelatingSpaceProgram;
	}

	public void setRelatingSpaceProgram(IfcSpaceProgram value){
		this.RelatingSpaceProgram=value;
	}

}
