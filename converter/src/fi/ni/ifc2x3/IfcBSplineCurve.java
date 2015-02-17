package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcList;

/*
 * IFC Java class
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

public class IfcBSplineCurve extends IfcBoundedCurve 
{
 // The property attributes
 Long degree;
 List<IfcCartesianPoint> controlPointsList = new IfcList<IfcCartesianPoint>();
 String curveForm;
 String closedCurve;
 String selfIntersect;


 // Getters and setters of properties

 public Long getDegree() {
   return degree;
 }
 public void setDegree(String txt){
   Long value = i.toLong(txt);
   this.degree=value;

 }

 public List<IfcCartesianPoint> getControlPointsList() {
   return controlPointsList;

 }
 public void setControlPointsList(IfcCartesianPoint value){
   this.controlPointsList.add(value);

 }

 public String getCurveForm() {
   return curveForm;
 }
 public void setCurveForm(String value){
   this.curveForm=value;

 }

 public String getClosedCurve() {
   return closedCurve;
 }
 public void setClosedCurve(String value){
   this.closedCurve=value;

 }

 public String getSelfIntersect() {
   return selfIntersect;
 }
 public void setSelfIntersect(String value){
   this.selfIntersect=value;

 }

}
