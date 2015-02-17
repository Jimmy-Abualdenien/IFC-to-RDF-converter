package fi.ni.vo;


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

public class InOutLinks implements Comparable<InOutLinks>
{
	int in;
	int out;
	public InOutLinks(int in, int out) {
	    super();
	    this.in = in;
	    this.out = out;
	}
		
	private String f(int n)
	{
	    return String.format("%06d", n);
	}
	public String toString() {
	    return f(out)+","+f(in);
	}
	
    public boolean equals(Object obj) {
        InOutLinks i=(InOutLinks)obj;
        if((i.in==this.in)&&(i.out==this.out))
    	    return true;
        else
    	     return false;
    }
    
	public int compareTo(InOutLinks o) {
        return -o.toString().compareTo(this.toString());
	}
	
	public int distance(InOutLinks o)
	{
	    return Math.abs(o.in-this.in) + Math.abs(o.out - this.out);
	}
}
