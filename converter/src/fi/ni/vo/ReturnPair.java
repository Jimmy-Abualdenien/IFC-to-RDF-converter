
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

package fi.ni.vo;

import fi.ni.Thing;

public class ReturnPair {
    Thing  t;
    public double difference;
    
    public ReturnPair(Thing t, double difference) {
	super();
	this.t = t;
	this.difference = difference;
    }
    public Thing getT() {
        return t;
    }

    public void setT(Thing t) {
        this.t = t;
    }
    public double getDifference() {
        return difference;
    }
    public void setDifference(double difference) {
        this.difference = difference;
    }
    
    @Override
    public String toString() {
	return "ReturnPair [t=" + t + ", difference=" + difference + "]";
    }
    

}
