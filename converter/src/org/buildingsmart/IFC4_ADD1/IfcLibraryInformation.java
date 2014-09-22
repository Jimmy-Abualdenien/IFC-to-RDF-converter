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

public class IfcLibraryInformation extends IfcExternalInformation implements IfcLibrarySelect
{
 // The property attributes
 String name;
 String version;
IfcActorSelect publisher;
 String versionDate;
 String location;
 String description;
 // The inverse attributes

 InverseLinksList<IfcRelAssociatesLibrary> libraryInfoForObjects= new InverseLinksList<IfcRelAssociatesLibrary>();
 InverseLinksList<IfcLibraryReference> hasLibraryReferences= new InverseLinksList<IfcLibraryReference>();


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public String getVersion() {
   return version;
 }
 public void setVersion(String value){
   this.version=value;

 }

 public IfcActorSelect getPublisher() {
   return publisher;
 }
 public void setPublisher(IfcActorSelect value){
   this.publisher=value;

 }

 public String getVersionDate() {
   return versionDate;
 }
 public void setVersionDate(String value){
   this.versionDate=value;

 }

 public String getLocation() {
   return location;
 }
 public void setLocation(String value){
   this.location=value;

 }

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRelAssociatesLibrary> getLibraryInfoForObjects() {
   return libraryInfoForObjects;

 }
 public void setLibraryInfoForObjects(IfcRelAssociatesLibrary value){
   this.libraryInfoForObjects.add(value);

 }

 public InverseLinksList<IfcLibraryReference> getHasLibraryReferences() {
   return hasLibraryReferences;

 }
 public void setHasLibraryReferences(IfcLibraryReference value){
   this.hasLibraryReferences.add(value);

 }

}
