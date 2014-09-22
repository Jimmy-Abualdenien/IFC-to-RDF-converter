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

import java.util.HashSet;
import java.util.Set;

import org.buildingsmart.Thing;

public class Triple {
    static Set<Thing> printed = new HashSet<Thing>();

    boolean used = false;
    public Thing  s;
    public Object o;
    public String p;
    
    public boolean literal=false;
    
    public Triple(Link l) {
	this.s = l.t1;
	this.p = l.property;
	this.o = l.t2;
    }

    public Triple(Thing subject, String property,Object object) {
	this.s = subject;
	this.p = property;
	this.o = object;
	literal=true;
    }


}
