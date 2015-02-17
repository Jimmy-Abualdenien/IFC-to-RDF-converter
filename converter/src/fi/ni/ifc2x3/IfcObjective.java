package fi.ni.ifc2x3;

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

public class IfcObjective extends IfcConstraint 
{
 // The property attributes
 IfcMetric   benchmarkValues;
 IfcMetric   resultValues;
 String objectiveQualifier;
 String userDefinedQualifier;


 // Getters and setters of properties

 public IfcMetric getBenchmarkValues() {
   return benchmarkValues;

 }
 public void setBenchmarkValues(IfcMetric value){
   this.benchmarkValues=value;

 }

 public IfcMetric getResultValues() {
   return resultValues;

 }
 public void setResultValues(IfcMetric value){
   this.resultValues=value;

 }

 public String getObjectiveQualifier() {
   return objectiveQualifier;
 }
 public void setObjectiveQualifier(String value){
   this.objectiveQualifier=value;

 }

 public String getUserDefinedQualifier() {
   return userDefinedQualifier;
 }
 public void setUserDefinedQualifier(String value){
   this.userDefinedQualifier=value;

 }

}
