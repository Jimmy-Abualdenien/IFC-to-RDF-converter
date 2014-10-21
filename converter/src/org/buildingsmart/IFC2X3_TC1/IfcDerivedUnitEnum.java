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

public class IfcDerivedUnitEnum extends Thing
{
	public enum IfcDerivedUnitEnum_value{ANGULARVELOCITYUNIT, COMPOUNDPLANEANGLEUNIT, DYNAMICVISCOSITYUNIT, HEATFLUXDENSITYUNIT, INTEGERCOUNTRATEUNIT, ISOTHERMALMOISTURECAPACITYUNIT, KINEMATICVISCOSITYUNIT, LINEARVELOCITYUNIT, MASSDENSITYUNIT, MASSFLOWRATEUNIT, MOISTUREDIFFUSIVITYUNIT, MOLECULARWEIGHTUNIT, SPECIFICHEATCAPACITYUNIT, THERMALADMITTANCEUNIT, THERMALCONDUCTANCEUNIT, THERMALRESISTANCEUNIT, THERMALTRANSMITTANCEUNIT, VAPORPERMEABILITYUNIT, VOLUMETRICFLOWRATEUNIT, ROTATIONALFREQUENCYUNIT, TORQUEUNIT, MOMENTOFINERTIAUNIT, LINEARMOMENTUNIT, LINEARFORCEUNIT, PLANARFORCEUNIT, MODULUSOFELASTICITYUNIT, SHEARMODULUSUNIT, LINEARSTIFFNESSUNIT, ROTATIONALSTIFFNESSUNIT, MODULUSOFSUBGRADEREACTIONUNIT, ACCELERATIONUNIT, CURVATUREUNIT, HEATINGVALUEUNIT, IONCONCENTRATIONUNIT, LUMINOUSINTENSITYDISTRIBUTIONUNIT, MASSPERLENGTHUNIT, MODULUSOFLINEARSUBGRADEREACTIONUNIT, MODULUSOFROTATIONALSUBGRADEREACTIONUNIT, PHUNIT, ROTATIONALMASSUNIT, SECTIONAREAINTEGRALUNIT, SECTIONMODULUSUNIT, SOUNDPOWERUNIT, SOUNDPRESSUREUNIT, TEMPERATUREGRADIENTUNIT, THERMALEXPANSIONCOEFFICIENTUNIT, WARPINGCONSTANTUNIT, WARPINGMOMENTUNIT, USERDEFINED};
	private IfcDerivedUnitEnum_value value;

	public IfcDerivedUnitEnum_value getIfcDerivedUnitEnum() {
		return value;
	}

	public void setIfcDerivedUnitEnum(IfcDerivedUnitEnum_value value){
		this.value=value;
	}

}
