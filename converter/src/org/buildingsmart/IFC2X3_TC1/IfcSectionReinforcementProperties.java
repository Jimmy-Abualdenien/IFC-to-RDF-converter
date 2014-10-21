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

public class IfcSectionReinforcementProperties extends Thing 
{
	// The property attributes
	private IfcLengthMeasure LongitudinalStartPosition;
	private IfcLengthMeasure LongitudinalEndPosition;
	private IfcLengthMeasure TransversePosition;
	private IfcReinforcingBarRoleEnum ReinforcementRole;
	private IfcSectionProperties SectionDefinition;
	private List<IfcReinforcementBarProperties> CrossSectionReinforcementDefinitions = new ArrayList<IfcReinforcementBarProperties>();


	// Getters and setters of properties
	public IfcLengthMeasure getLongitudinalStartPosition() {
		return LongitudinalStartPosition;
	}

	public void setLongitudinalStartPosition(IfcLengthMeasure value){
		this.LongitudinalStartPosition=value;
	}

	public IfcLengthMeasure getLongitudinalEndPosition() {
		return LongitudinalEndPosition;
	}

	public void setLongitudinalEndPosition(IfcLengthMeasure value){
		this.LongitudinalEndPosition=value;
	}

	public IfcLengthMeasure getTransversePosition() {
		return TransversePosition;
	}

	public void setTransversePosition(IfcLengthMeasure value){
		this.TransversePosition=value;
	}

	public IfcReinforcingBarRoleEnum getReinforcementRole() {
		return ReinforcementRole;
	}

	public void setReinforcementRole(IfcReinforcingBarRoleEnum value){
		this.ReinforcementRole=value;
	}

	public IfcSectionProperties getSectionDefinition() {
		return SectionDefinition;
	}

	public void setSectionDefinition(IfcSectionProperties value){
		this.SectionDefinition=value;
	}

	public List<IfcReinforcementBarProperties> getCrossSectionReinforcementDefinitions() {
		return CrossSectionReinforcementDefinitions;
	}

	public void setCrossSectionReinforcementDefinitions(IfcReinforcementBarProperties value){
		this.CrossSectionReinforcementDefinitions.add(value);
	}

}
