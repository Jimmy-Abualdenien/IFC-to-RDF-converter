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

public class IfcPresentationLayerWithStyle extends IfcPresentationLayerAssignment 
{
	// The property attributes
	private Boolean LayerOn;
	private Boolean LayerFrozen;
	private Boolean LayerBlocked;
	private List<IfcPresentationStyleSelect> LayerStyles = new ArrayList<IfcPresentationStyleSelect>();


	// Getters and setters of properties
	public Boolean getLayerOn() {
		return LayerOn;
	}

	public void setLayerOn(Boolean value){
		this.LayerOn=value;
	}

	public Boolean getLayerFrozen() {
		return LayerFrozen;
	}

	public void setLayerFrozen(Boolean value){
		this.LayerFrozen=value;
	}

	public Boolean getLayerBlocked() {
		return LayerBlocked;
	}

	public void setLayerBlocked(Boolean value){
		this.LayerBlocked=value;
	}

	public List<IfcPresentationStyleSelect> getLayerStyles() {
		return LayerStyles;
	}

	public void setLayerStyles(IfcPresentationStyleSelect value){
		this.LayerStyles.add(value);
	}

}
