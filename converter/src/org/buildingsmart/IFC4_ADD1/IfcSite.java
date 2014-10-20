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

public class IfcSite extends IfcSpatialStructureElement 
{
	// The property attributes
	private IfcCompoundPlaneAngleMeasure RefLatitude;
	private IfcCompoundPlaneAngleMeasure RefLongitude;
	private IfcLengthMeasure RefElevation;
	private IfcLabel LandTitleNumber;
	private IfcPostalAddress SiteAddress;


	// Getters and setters of properties
	public IfcCompoundPlaneAngleMeasure getRefLatitude() {
		return RefLatitude;
	}

	public void setRefLatitude(IfcCompoundPlaneAngleMeasure value){
		this.RefLatitude=value;
	}

	public IfcCompoundPlaneAngleMeasure getRefLongitude() {
		return RefLongitude;
	}

	public void setRefLongitude(IfcCompoundPlaneAngleMeasure value){
		this.RefLongitude=value;
	}

	public IfcLengthMeasure getRefElevation() {
		return RefElevation;
	}

	public void setRefElevation(IfcLengthMeasure value){
		this.RefElevation=value;
	}

	public IfcLabel getLandTitleNumber() {
		return LandTitleNumber;
	}

	public void setLandTitleNumber(IfcLabel value){
		this.LandTitleNumber=value;
	}

	public IfcPostalAddress getSiteAddress() {
		return SiteAddress;
	}

	public void setSiteAddress(IfcPostalAddress value){
		this.SiteAddress=value;
	}

}
