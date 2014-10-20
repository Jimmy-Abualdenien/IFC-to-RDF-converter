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

public class IfcPresentationLayerWithStyle extends IfcPresentationLayerAssignment 
{
	// The property attributes
	private IfcLogical LayerOn;
	private IfcLogical LayerFrozen;
	private IfcLogical LayerBlocked;
	private List<IfcPresentationStyle> LayerStyles = new ArrayList<IfcPresentationStyle>();


	// Getters and setters of properties
	public IfcLogical getLayerOn() {
		return LayerOn;
	}

	public void setLayerOn(IfcLogical value){
		this.LayerOn=value;
	}

	public IfcLogical getLayerFrozen() {
		return LayerFrozen;
	}

	public void setLayerFrozen(IfcLogical value){
		this.LayerFrozen=value;
	}

	public IfcLogical getLayerBlocked() {
		return LayerBlocked;
	}

	public void setLayerBlocked(IfcLogical value){
		this.LayerBlocked=value;
	}

	public List<IfcPresentationStyle> getLayerStyles() {
		return LayerStyles;
	}

	public void setLayerStyles(IfcPresentationStyle value){
		this.LayerStyles.add(value);
	}

}
