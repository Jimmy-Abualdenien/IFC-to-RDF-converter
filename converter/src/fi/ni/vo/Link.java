package fi.ni.vo;

import java.util.HashSet;
import java.util.Set;

import fi.ni.Thing;


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

public class Link {
    public static Set<Thing> printed = new HashSet<Thing>();

    public boolean used = false;
    public Thing t1;
    public Thing t2;
    public String property;
    private int listIndex=Integer.MIN_VALUE;   // if this is  part of a list, the index it has
    

    public Link(Thing t1, Thing t2, String property) {
	super();
	this.t1 = t1;
	this.t2 = t2;
	this.property = property;
    }

    public Link(Triple t) {
	super();
	this.t1 = t.s;
	if(!t.literal)
	   this.t2 = (Thing)t.o;
	else
	    this.t2 = null;
	this.property = t.p;
    }
    
    public int getListIndex() {
	    return listIndex;
	}
	public void setListIndex(int listIndex) {
	    this.listIndex = listIndex;
	}

    public Thing getTheOtherEnd(Thing t) {
	if (t == t1)
	    return t2;
	else
	    return t1;
    }

    public boolean isTheWay(Thing t) {
	if (t == t1)
	    return true;
	else
	    return false;
    }

    public String neatString() {
	String retval = "";
	retval += " " + t1.line_number +"."+ t1.getClass().getSimpleName() + "  -" +property+"- "+
			" " + t2.line_number +"."+ t2.getClass().getSimpleName();
	return retval;
    }

}
