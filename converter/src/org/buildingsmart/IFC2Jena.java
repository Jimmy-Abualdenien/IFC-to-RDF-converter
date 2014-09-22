package org.buildingsmart;

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
The GNU Affero General Public License

Copyright (c) 2014 Jyrki Oraskari

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
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
		ExpressReader er = new ExpressReader("IFC2X3_TC1","c:\\jo\\IFC2X3_Final.exp");
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
