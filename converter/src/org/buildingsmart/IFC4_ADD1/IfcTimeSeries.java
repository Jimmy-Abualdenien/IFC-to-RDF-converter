package org.buildingsmart.IFC4_ADD1;
import org.buildingsmart.IFC4_ADD1.interfaces.*;
import org.buildingsmart.*;
import java.util.*;

/*
 * IFC Java class
The MIT License (MIT)

 * @author Jyrki Oraskari
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

public class IfcTimeSeries extends Thing implements IfcObjectReferenceSelect, IfcResourceObjectSelect, IfcMetricValueSelect
{
 // The property attributes
 String name;
 String description;
 String startTime;
 String endTime;
 String timeSeriesDataType;
 String dataOrigin;
 String userDefinedDataOrigin;
IfcUnit unit;
 // The inverse attributes

 InverseLinksList<IfcExternalReferenceRelationship> hasExternalReference= new InverseLinksList<IfcExternalReferenceRelationship>();


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

 public String getStartTime() {
   return startTime;
 }
 public void setStartTime(String value){
   this.startTime=value;

 }

 public String getEndTime() {
   return endTime;
 }
 public void setEndTime(String value){
   this.endTime=value;

 }

 public String getTimeSeriesDataType() {
   return timeSeriesDataType;
 }
 public void setTimeSeriesDataType(String value){
   this.timeSeriesDataType=value;

 }

 public String getDataOrigin() {
   return dataOrigin;
 }
 public void setDataOrigin(String value){
   this.dataOrigin=value;

 }

 public String getUserDefinedDataOrigin() {
   return userDefinedDataOrigin;
 }
 public void setUserDefinedDataOrigin(String value){
   this.userDefinedDataOrigin=value;

 }

 public IfcUnit getUnit() {
   return unit;
 }
 public void setUnit(IfcUnit value){
   this.unit=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcExternalReferenceRelationship> getHasExternalReference() {
   return hasExternalReference;

 }
 public void setHasExternalReference(IfcExternalReferenceRelationship value){
   this.hasExternalReference.add(value);

 }

}
