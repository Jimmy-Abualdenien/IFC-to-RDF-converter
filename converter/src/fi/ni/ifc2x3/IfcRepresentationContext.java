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

public class IfcRepresentationContext extends Thing 
{
 // The property attributes
 String contextIdentifier;
 String contextType;
 // The inverse attributes

 InverseLinksList<IfcRepresentation> representationsInContext= new InverseLinksList<IfcRepresentation>();


 // Getters and setters of properties

 public String getContextIdentifier() {
   return contextIdentifier;
 }
 public void setContextIdentifier(String value){
   this.contextIdentifier=value;

 }

 public String getContextType() {
   return contextType;
 }
 public void setContextType(String value){
   this.contextType=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcRepresentation> getRepresentationsInContext() {
   return representationsInContext;

 }
 public void setRepresentationsInContext(IfcRepresentation value){
   this.representationsInContext.add(value);

 }

}
