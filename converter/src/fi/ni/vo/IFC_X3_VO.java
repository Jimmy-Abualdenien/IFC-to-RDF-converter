package fi.ni.vo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*
 * JavaBean value object class used at IFC_MODEL
 * 
 * @author Jyrki Oraskari

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

public class IFC_X3_VO {
        public Long line_num ;	
	public String name=null;
	public LinkedList<Object> list =new LinkedList<Object>();
	
	public Map<String,LinkedList<IFC_X3_VO>> inverse_pointer_sets =new HashMap<String,LinkedList<IFC_X3_VO>>();
	int maxlevel=0;
	
	boolean touched=false;
	
	public boolean is_touched() {
		if(!touched)
		{
			touched=true;
			return false;
		}
		return true;
	}
	public void reset_touched() {
		touched=false;
	}
	String gid=null;
	
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public Long getLine_num() {
		return line_num;
	}
	public void setLine_num(Long line_num) {
		this.line_num = line_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LinkedList<Object> getList() {
		return list;
	}
	public void setList(LinkedList<Object> list) {
		this.list = list;
	}
	public int getMaxlevel() {
		return maxlevel;
	}
	public void setMaxlevel(int maxlevel) {
		this.maxlevel = maxlevel;
	}
	@Override
	public String toString() {
	    return "IFC_X3_VO [line_num=" + line_num + ", name=" + name + ", list=" + list + ", inverse_pointer_sets=" + inverse_pointer_sets + ", maxlevel=" + maxlevel + ", touched=" + touched
		    + ", gid=" + gid + "]";
	}
	
	
}
