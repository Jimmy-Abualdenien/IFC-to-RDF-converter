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

public class IfcClassification extends IfcExternalInformation implements IfcClassificationReferenceSelect, IfcClassificationSelect
{
 // The property attributes
 String source;
 String edition;
 String editionDate;
 String name;
 String description;
 String location;
 List<String> referenceTokens = new IfcList<String>();
 // The inverse attributes

 InverseLinksList<IfcRelAssociatesClassification> classificationForObjects= new InverseLinksList<IfcRelAssociatesClassification>();
 InverseLinksList<IfcClassificationReference> hasReferences= new InverseLinksList<IfcClassificationReference>();


 // Getters and setters of properties

 public String getSource() {
   return source;
 }
 public void setSource(String value){
   this.source=value;

 }

 public String getEdition() {
   return edition;
 }
 public void setEdition(String value){
   this.edition=value;

 }

 public String getEditionDate() {
   return editionDate;
 }
 public void setEditionDate(String value){
   this.editionDate=value;

 }

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

 public String getLocation() {
   return location;
 }
 public void setLocation(String value){
   this.location=value;

 }

 public List<String> getReferenceTokens() {
   return referenceTokens;
 }
 public void setReferenceTokens(String value){
   this.referenceTokens.add(value);

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelAssociatesClassification> getClassificationForObjects() {
   return classificationForObjects;

 }
 public void setClassificationForObjects(IfcRelAssociatesClassification value){
   this.classificationForObjects.add(value);

 }

 public InverseLinksList<IfcClassificationReference> getHasReferences() {
   return hasReferences;

 }
 public void setHasReferences(IfcClassificationReference value){
   this.hasReferences.add(value);

 }

}
