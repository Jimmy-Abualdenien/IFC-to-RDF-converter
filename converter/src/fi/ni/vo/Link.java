package fi.ni.vo;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import fi.ni.Thing;
import fi.ni.ifc2x3.IfcRoot;

/**
 * 
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0
 *          Unported License.
 *          http://creativecommons.org/licenses/by/3.0/
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

    public String toString() {
	String retval = "";
	String t1_pad = "";
	String t2_pad = "";
	if (IfcRoot.class.isInstance(t1))
	    t1_pad = "_";
	if (IfcRoot.class.isInstance(t2))
	    t2_pad = "_";
	if (t1.is_grounded)
	    t1_pad = ".";
	if (t2.is_grounded)
	    t2_pad = ".";
	
	

	// return " "+t1_pad+t1.line_number+t1_pad + "-"+property+"-" +
	// t2_pad+t2.line_number+t2_pad+" ";
	// return
	// " i"+t1.line_number+"("+t1_pad+t1.getClass().getSimpleName() +
	// ")\t"+property+"\ti" +
	// t2.line_number+"("+t2_pad+t2.getClass().getSimpleName()+") ";
	// //CCMAPTools
	retval += " i" + t1.line_number +""+ t1.getClass().getSimpleName() + "  -> i" + t2.line_number + t2.getClass().getSimpleName() + " [arrowsize=1.0, color=black, label=\"" + property + "\", labelangle=-25, \r\n" + "            labeldistance=0.3, labelfontsize=10, arrowtail=diamond\r\n"
		+ "         ];\r\n";
	return retval;
    }

    public String neatString() {
	String retval = "";
	retval += " " + t1.line_number +"."+ t1.getClass().getSimpleName() + "  -" +property+"- "+
			" " + t2.line_number +"."+ t2.getClass().getSimpleName();
	return retval;
    }

}
