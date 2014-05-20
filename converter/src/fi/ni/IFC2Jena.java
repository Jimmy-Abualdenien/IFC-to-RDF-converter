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
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0 Unported License.
 * http://creativecommons.org/licenses/by/3.0/
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
