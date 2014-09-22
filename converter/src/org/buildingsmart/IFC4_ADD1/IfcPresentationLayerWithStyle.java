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

public class IfcPresentationLayerWithStyle extends IfcPresentationLayerAssignment 
{
 // The property attributes
 String layerOn;
 String layerFrozen;
 String layerBlocked;
 List<IfcPresentationStyle> layerStyles = new IfcSet<IfcPresentationStyle>();


 // Getters and setters of properties

 public String getLayerOn() {
   return layerOn;
 }
 public void setLayerOn(String value){
   this.layerOn=value;

 }

 public String getLayerFrozen() {
   return layerFrozen;
 }
 public void setLayerFrozen(String value){
   this.layerFrozen=value;

 }

 public String getLayerBlocked() {
   return layerBlocked;
 }
 public void setLayerBlocked(String value){
   this.layerBlocked=value;

 }

 public List<IfcPresentationStyle> getLayerStyles() {
   return layerStyles;

 }
 public void setLayerStyles(IfcPresentationStyle value){
   this.layerStyles.add(value);

 }

}
