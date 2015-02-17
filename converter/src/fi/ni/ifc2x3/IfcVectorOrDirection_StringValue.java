package fi.ni.ifc2x3;
import fi.ni.ifc2x3.interfaces.IfcVectorOrDirection;

/*
 * IFC Java class for String valued unknown interface type
 * @author Jyrki Oraskari
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

public class IfcVectorOrDirection_StringValue implements IfcVectorOrDirection
{
String value;
public String geValue() {
return value;
}
public void setValue(String value){
this.value=value;
}
}
