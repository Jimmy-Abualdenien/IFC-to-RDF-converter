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

public class IfcMaterialProfile extends IfcMaterialDefinition 
{
 // The property attributes
 String name;
 String description;
 IfcMaterial   material;
 IfcProfileDef   profile;
 Double priority;
 String category;
 // The inverse attributes

 InverseLinksList<IfcMaterialProfileSet> toMaterialProfileSet= new InverseLinksList<IfcMaterialProfileSet>();


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

 public IfcMaterial getMaterial() {
   return material;

 }
 public void setMaterial(IfcMaterial value){
   this.material=value;

 }

 public IfcProfileDef getProfile() {
   return profile;

 }
 public void setProfile(IfcProfileDef value){
   this.profile=value;

 }

 public Double getPriority() {
   return priority;
 }
 public void setPriority(String txt){
   Double value = i.toDouble(txt);
   this.priority=value;

 }

 public String getCategory() {
   return category;
 }
 public void setCategory(String value){
   this.category=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcMaterialProfileSet> getToMaterialProfileSet() {
   return toMaterialProfileSet;

 }
 public void setToMaterialProfileSet(IfcMaterialProfileSet value){
   this.toMaterialProfileSet.add(value);

 }

}
