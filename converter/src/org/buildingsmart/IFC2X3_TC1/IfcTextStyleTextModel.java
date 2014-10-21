package org.buildingsmart.IFC2X3_TC1;
import org.buildingsmart.*;
import java.util.*;

/*
 * IFC Java class
/ *
 * The GNU Affero General Public License
 * 
 * Copyright (c) 2014 Jyrki Oraskari (original)
 * Copyright (c) 2014 Pieter Pauwels (modifications - pipauwel.pauwels@ugent.be / pipauwel@gmail.com)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

public class IfcTextStyleTextModel extends Thing implements IfcTextStyleSelect
{
	// The property attributes
	private IfcSizeSelect TextIndent;
	private IfcTextAlignment TextAlign;
	private IfcTextDecoration TextDecoration;
	private IfcSizeSelect LetterSpacing;
	private IfcSizeSelect WordSpacing;
	private IfcTextTransformation TextTransform;
	private IfcSizeSelect LineHeight;


	// Getters and setters of properties
	public IfcSizeSelect getTextIndent() {
		return TextIndent;
	}

	public void setTextIndent(IfcSizeSelect value){
		this.TextIndent=value;
	}

	public IfcTextAlignment getTextAlign() {
		return TextAlign;
	}

	public void setTextAlign(IfcTextAlignment value){
		this.TextAlign=value;
	}

	public IfcTextDecoration getTextDecoration() {
		return TextDecoration;
	}

	public void setTextDecoration(IfcTextDecoration value){
		this.TextDecoration=value;
	}

	public IfcSizeSelect getLetterSpacing() {
		return LetterSpacing;
	}

	public void setLetterSpacing(IfcSizeSelect value){
		this.LetterSpacing=value;
	}

	public IfcSizeSelect getWordSpacing() {
		return WordSpacing;
	}

	public void setWordSpacing(IfcSizeSelect value){
		this.WordSpacing=value;
	}

	public IfcTextTransformation getTextTransform() {
		return TextTransform;
	}

	public void setTextTransform(IfcTextTransformation value){
		this.TextTransform=value;
	}

	public IfcSizeSelect getLineHeight() {
		return LineHeight;
	}

	public void setLineHeight(IfcSizeSelect value){
		this.LineHeight=value;
	}

}
