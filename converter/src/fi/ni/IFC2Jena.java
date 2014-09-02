package fi.ni;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;

/*
The MIT License (MIT)

Copyright (c) 2014 Jyrki Oraskari

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

public class IFC2Jena {

	OntModel model;

	/*
	 *  This method converts an IFC file into a Jena model
	 *  RDFS is used, but OWL is also possible
	 */
	
	public OntModel readIFC(String filename,String path) throws IOException {

		ByteArrayOutputStream strout = new ByteArrayOutputStream();
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(strout));
		ExpressReader er = new ExpressReader("c:\\jo\\IFC2X3_Final.exp");
		er.outputRDFS(log);
		IFC_ClassModel m1 = new IFC_ClassModel(filename,
				er.getEntities(), er.getTypes(), "r1");
		m1.listRDF(log, path);

		InputStream is = new ByteArrayInputStream(strout.toString().getBytes());

		OntModel model = ModelFactory
				.createOntologyModel(OntModelSpec.RDFS_MEM_TRANS_INF);
		model.read(is, null, "N3");
		return model;

	}

}
