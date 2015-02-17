package fi.ni.vo;

import java.util.LinkedList;
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

public class EntityVO {
	private String name;	
	private List<AttributeVO> attributes=new LinkedList<AttributeVO>();
	private List<InverseVO> inverses=new LinkedList<InverseVO>();
	private List<String> interfaces=new LinkedList<String>();

	private List<AttributeVO> derived_attribute_list=new LinkedList<AttributeVO>();
	private List<InverseVO> derived_inverse_list=new LinkedList<InverseVO>();
	
	public List<InverseVO> getDerived_inverse_list() {
		return derived_inverse_list;
	}
	public void setDerived_inverse_list(List<InverseVO> derived_inverse_list) {
		this.derived_inverse_list = derived_inverse_list;
	}
	
	public List<InverseVO> getInverses() {
		return inverses;
	}
	public void setInverses(List<InverseVO> inverses) {
		this.inverses = inverses;
	}
	public List<AttributeVO> getDerived_attribute_list() {
		return derived_attribute_list;
	}
	public void setDerived_attribute_list(List<AttributeVO> derived_list) {
		this.derived_attribute_list = derived_list;
	}
	String superclass;
	
	public EntityVO(String name) {
		super();
		this.name = name;
	}
	public EntityVO() {
	    // TODO Auto-generated constructor stub
	}
	public List<AttributeVO> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<AttributeVO> attributes) {
		this.attributes = attributes;
	}
	public String getSuperclass() {
		return superclass;
	}
	public void setSuperclass(String superclass) {
		this.superclass = superclass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getInterfaces() {
	    return interfaces;
	}
	public void setInterfaces(List<String> interfaces) {
	    this.interfaces = interfaces;
	}
	@Override
	public String toString() {
	    return "EntityVO [name=" + name + ", attributes=" + attributes + ", inverses=" + inverses + ", interfaces=" + interfaces + ", derived_attribute_list=" + derived_attribute_list
		    + ", derived_inverse_list=" + derived_inverse_list + ", superclass=" + superclass + "]";
	}
	
	
	
}
