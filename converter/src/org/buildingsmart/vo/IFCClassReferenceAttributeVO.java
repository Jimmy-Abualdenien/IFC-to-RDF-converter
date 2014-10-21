package org.buildingsmart.vo;

/*
The GNU Affero General Public License

Copyright (c) 2014 Jyrki Oraskari

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

public class IFCClassReferenceAttributeVO {
   AttributeVO avo;
   IFCVO value;
   
public IFCClassReferenceAttributeVO(AttributeVO avo, IFCVO value) {
	super();
	this.avo = avo;
	this.value = value;
}
public AttributeVO getAvo() {
	return avo;
}
public void setAvo(AttributeVO avo) {
	this.avo = avo;
}
public IFCVO getValue() {
	return value;
}
public void setValue(IFCVO value) {
	this.value = value;
}
   
  
 }
