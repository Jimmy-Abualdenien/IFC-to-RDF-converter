package fi.ni.vo;


import java.util.ArrayList;
import java.util.List;


/*
The GNU Affero General Public License

Copyright (C) 2014  Jyrki Oraskari

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

public class PropertyVO {
   String name;
   List<String> ifcClasses = new ArrayList<String>();
   public boolean isList=false;
   public boolean isEntity=false;
   String rawtype;
   public boolean isEnumeration=false;
   List<String> enumeration_list = null;
   



public PropertyVO(String name, boolean isList, boolean isEntity, String rawtype, boolean isEnumeration, List<String> enumeration_list) {
    super();
    this.name = name;
    this.isList = isList;
    this.isEntity = isEntity;
    this.rawtype = rawtype;
    this.isEnumeration = isEnumeration;
    this.enumeration_list = enumeration_list;
}

public PropertyVO(String name, boolean isList, boolean isEntity, String rawtype) {
    super();
    this.name = name;
    this.isList = isList;
    this.isEntity = isEntity;
    this.rawtype = rawtype;
}

public boolean containsIfcClass(Object o) {
    return ifcClasses.contains(o);
}

public boolean addIfcClass(String e) {
    return ifcClasses.add(e);
}

public List<String> getIfcClasses() {
    return ifcClasses;
}

public String getIfcClassesAsString() {
    StringBuffer sb=new StringBuffer();
    for(int n=0;n<ifcClasses.size();n++)
    {
	if(n>0)
	    sb.append(' ');
	sb.append("ifc:"+ifcClasses.get(n));
    }
    return sb.toString();
}

public boolean isList() {
    return isList;
}
public void setList(boolean isList) {
    this.isList = isList;
}
public String getRawtype() {
    return rawtype;
}
public void setRawtype(String rawtype) {
    this.rawtype = rawtype;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public boolean isEntity() {
    return isEntity;
}

public void setEntity(boolean isEntity) {
    this.isEntity = isEntity;
}

public void setIfcClasses(List<String> ifcClasses) {
    this.ifcClasses = ifcClasses;
}

public boolean isEnumeration() {
    return isEnumeration;
}

public void setEnumeration(boolean isEnumeration) {
    this.isEnumeration = isEnumeration;
}

public List<String> getEnumeration_list() {
    return enumeration_list;
}

public void setEnumeration_list(List<String> enumeration_list) {
    this.enumeration_list = enumeration_list;
}


public String getEnumerationsAsString() {
    StringBuffer sb=new StringBuffer();
    for(int n=0;n<enumeration_list.size();n++)
    {
	if(n>0)
	    sb.append(' ');
	sb.append("ifc:"+enumeration_list.get(n));
    }
    return sb.toString();
}
   
}
