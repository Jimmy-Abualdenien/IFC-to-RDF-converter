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

public class IfcDraughtingCallout extends IfcGeometricRepresentationItem 
{
	// The property attributes
	private List<IfcDraughtingCalloutElement> Contents = new ArrayList<IfcDraughtingCalloutElement>();
	// The inverse attributes
	private List<IfcDraughtingCalloutRelationship> IsRelatedFromCallout= new ArrayList<IfcDraughtingCalloutRelationship>();
	private List<IfcDraughtingCalloutRelationship> IsRelatedToCallout= new ArrayList<IfcDraughtingCalloutRelationship>();


	// Getters and setters of properties
	public List<IfcDraughtingCalloutElement> getContents() {
		return Contents;
	}

	public void setContents(IfcDraughtingCalloutElement value){
		this.Contents.add(value);
	}

	// Getters and setters of inverse values

	public List<IfcDraughtingCalloutRelationship> getIsRelatedFromCallout() {
		return IsRelatedFromCallout;
	}

	public void setIsRelatedFromCallout(IfcDraughtingCalloutRelationship value){
		this.IsRelatedFromCallout.add(value);
	}

	public List<IfcDraughtingCalloutRelationship> getIsRelatedToCallout() {
		return IsRelatedToCallout;
	}

	public void setIsRelatedToCallout(IfcDraughtingCalloutRelationship value){
		this.IsRelatedToCallout.add(value);
	}

}
