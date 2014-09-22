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

public class ValuePair {
  private final String name;
  private final Object value;
  private int listIndex=Integer.MIN_VALUE;
  
public ValuePair(String name, Object value) {
    super();
    this.name = name;
    this.value = value;
}


public ValuePair(String name, Object value, int listIndex) {
    super();
    this.name = name;
    this.value = value;
    this.listIndex = listIndex;
}



public String getName() {
    return name;
}
public Object getValue() {
    return value;
}
public int getListIndex() {
    return listIndex;
}
public void setListIndex(int listIndex) {
    this.listIndex = listIndex;
}


  
  


}
