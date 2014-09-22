package fi.ni.ifc2x3;
import fi.ni.ifc2x3.interfaces.*;
import fi.ni.*;
import java.util.*;

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

public class IfcDocumentInformationRelationship extends Thing 
{
 // The property attributes
 IfcDocumentInformation   relatingDocument;
 List<IfcDocumentInformation> relatedDocuments = new IfcSet<IfcDocumentInformation>();
 String relationshipType;


 // Getters and setters of properties

 public IfcDocumentInformation getRelatingDocument() {
   return relatingDocument;

 }
 public void setRelatingDocument(IfcDocumentInformation value){
   this.relatingDocument=value;

 }

 public List<IfcDocumentInformation> getRelatedDocuments() {
   return relatedDocuments;

 }
 public void setRelatedDocuments(IfcDocumentInformation value){
   this.relatedDocuments.add(value);

 }

 public String getRelationshipType() {
   return relationshipType;
 }
 public void setRelationshipType(String value){
   this.relationshipType=value;

 }

}
