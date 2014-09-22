

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

package org.buildingsmart.vo;

public class InverseVO {
  private String name;
  private String ifc_class;
  private String property;
  private boolean set=false;

  boolean unique=false;
  boolean one_valued=false;
  
  

public InverseVO(String name, String ifc_class, String property, boolean set, boolean one_valued) {
    super();
    this.name = name;
    this.ifc_class = ifc_class;
    this.property = property;
    this.set = set;
    this.one_valued = one_valued;
}




public boolean isSet() {
    return set;
}


public void setSet(boolean set) {
    this.set = set;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getIfc_class() {
	return ifc_class;
}
public void setIfc_class(String ifc_class) {
	this.ifc_class = ifc_class;
}
public String getProperty() {
	return property;
}
public void setProperty(String property) {
	this.property = property;
}


public boolean isUnique() {
    return unique;
}



public void setUnique(boolean unique) {
    this.unique = unique;
}





public boolean isOne_valued() {
    return one_valued;
}



public void setOne_valued(boolean one_valued) {
    this.one_valued = one_valued;
}



@Override
public String toString() {
    return "InverseVO [name=" + name + ", ifc_class=" + ifc_class + ", property=" + property + ", set=" + set + "]";
}
 


}
