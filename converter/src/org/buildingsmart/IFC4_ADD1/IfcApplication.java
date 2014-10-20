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

public class IfcApplication extends Thing 
{
	// The property attributes
	private IfcOrganization ApplicationDeveloper;
	private IfcLabel Version_of_IfcApplication;
	private IfcLabel ApplicationFullName;
	private IfcIdentifier ApplicationIdentifier;


	// Getters and setters of properties
	public IfcOrganization getApplicationDeveloper() {
		return ApplicationDeveloper;
	}

	public void setApplicationDeveloper(IfcOrganization value){
		this.ApplicationDeveloper=value;
	}

	public IfcLabel getVersion_of_IfcApplication() {
		return Version_of_IfcApplication;
	}

	public void setVersion_of_IfcApplication(IfcLabel value){
		this.Version_of_IfcApplication=value;
	}

	public IfcLabel getApplicationFullName() {
		return ApplicationFullName;
	}

	public void setApplicationFullName(IfcLabel value){
		this.ApplicationFullName=value;
	}

	public IfcIdentifier getApplicationIdentifier() {
		return ApplicationIdentifier;
	}

	public void setApplicationIdentifier(IfcIdentifier value){
		this.ApplicationIdentifier=value;
	}

}
