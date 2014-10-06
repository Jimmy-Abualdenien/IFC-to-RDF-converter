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

import java.util.LinkedList;
import java.util.List;

public class TypeVO {
	private String name;
	private String primarytype;
	private List<String> select_entities = new LinkedList<String>();
	private List<String> enum_entities = new LinkedList<String>();
	private int[] listCardinalities = new int[2];

	public TypeVO(String name) {
		super();
		this.name = name;
		this.primarytype = name;
	}

	public TypeVO(String name, String primarytype) {
		super();
		this.name = name;
		this.primarytype = primarytype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSelect_entities() {
		return select_entities;
	}

	public void setSelect_entities(List<String> select_entities) {
		this.select_entities = select_entities;
	}

	public String getPrimarytype() {
		return primarytype;
	}

	public void setPrimarytype(String primarytype) {
		this.primarytype = primarytype;
	}

	public List<String> getEnum_entities() {
		return enum_entities;
	}

	public void setEnum_entities(List<String> enum_entities) {
		this.enum_entities = enum_entities;
	}

	public int[] getListCardinalities() {
		return listCardinalities;
	}

	public void setListCardinalities(int[] listCardinalities) {
		this.listCardinalities = listCardinalities;
	}

	@Override
	public String toString() {
	    return "TypeVO [name=" + name + ", primarytype=" + primarytype + ", select_entities=" + select_entities + ", enum_entities=" + enum_entities + "]";
	}
}