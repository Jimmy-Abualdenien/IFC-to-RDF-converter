package org.bimserver.serializers.ifctordf;

<<<<<<< HEAD
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
=======
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
>>>>>>> cfbde0d7deda287d81177ad9d10737b5b3a1a78a

import org.bimserver.plugins.serializers.EmfSerializer;
import org.bimserver.plugins.serializers.ProgressReporter;
import org.bimserver.plugins.serializers.Serializer;
import org.bimserver.plugins.serializers.SerializerException;
import org.bimserver.plugins.serializers.SerializerPlugin;
import org.bimserver.plugins.serializers.StagingProgressReporter;
<<<<<<< HEAD
import org.buildingsmart.ExpressReader;
import org.buildingsmart.IfcConvertor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Charsets;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.InfModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.reasoner.ReasonerRegistry;
import com.hp.hpl.jena.reasoner.ValidityReport;
import com.hp.hpl.jena.reasoner.ValidityReport.Report;

public class IfcToRdfSerializer extends EmfSerializer {
	private static final Logger LOGGER = LoggerFactory.getLogger(IfcToRdfSerializer.class);

	private OntModel ontModel;
	private ExpressReader expressReader;
=======

import fi.ni.ExpressReader;
import fi.ni.IFC_ClassModel;

public class IfcToRdfSerializer extends EmfSerializer {

	private File expressFile;
>>>>>>> cfbde0d7deda287d81177ad9d10737b5b3a1a78a

	@Override
	public void reset() {
	}

<<<<<<< HEAD
	public IfcToRdfSerializer(OntModel ontModel, ExpressReader expressReader) {
		this.ontModel = ontModel;
		this.expressReader = expressReader;
	}

	@Override
	protected boolean write(OutputStream outputStream, ProgressReporter progressReporter) throws SerializerException {
		// Quite inefficient, first write the model to IFC (byte buffer), then
		// call the IfcToRdf code
=======
	public IfcToRdfSerializer(File expressFile) {
		this.expressFile = expressFile;
	}
	
	@Override
	protected boolean write(OutputStream outputStream, ProgressReporter progressReporter) throws SerializerException {
		// Quite inefficient, first write the model to IFC (byte buffer), then call the IfcToRdf code
>>>>>>> cfbde0d7deda287d81177ad9d10737b5b3a1a78a

		SerializerPlugin serializerPlugin = getPluginManager().getSerializerPlugin("org.bimserver.ifc.step.serializer.Ifc2x3tc1StepSerializerPlugin", true);
		Serializer serializer = serializerPlugin.createSerializer(null);
		serializer.init(getModel(), null, getPluginManager(), null, getPackageMetaData(), true);
		ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();
		StagingProgressReporter halvingProgressReporter = new StagingProgressReporter(progressReporter, 2);
		serializer.writeToOutputStream(outputStream2, halvingProgressReporter);
		halvingProgressReporter.incStage();
		InputStream inputStream = new ByteArrayInputStream(outputStream2.toByteArray());
<<<<<<< HEAD

		long t0 = System.currentTimeMillis();

		IfcConvertor conv = new IfcConvertor(ontModel, expressReader, inputStream, "http://linkedbuildingdata.net/ifc/instances"
				+ new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()) + "#");
		Model model = conv.parseModel();

		InfModel infModel = ModelFactory.createInfModel(ReasonerRegistry.getRDFSReasoner(), ontModel, model);
		ValidityReport validity = infModel.validate();
		if (!validity.isValid()) {
			StringBuilder stringBuilder = new StringBuilder("generated RDF model contains conflicts. No RDF nor TTL file produced.");
			for (Iterator<Report> i = validity.getReports(); i.hasNext();) {
				stringBuilder.append(" - " + i.next() + "\n");
			}
			throw new SerializerException(stringBuilder.toString());
		}

		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charsets.UTF_8);
		BufferedWriter out = new BufferedWriter(outputStreamWriter);
		model.write(out, "TTL");

		//you might want to opt to output to RDF/XML as well here, depending on your outputStream var
		//String output_file_rdf = outputStream.substring(0, output_file.length() - 4) + ".rdf";
//		OutputStreamWriter char_output = new OutputStreamWriter(
//				new FileOutputStream(output_file_rdf),
//				Charset.forName("UTF-8").newEncoder());
//		BufferedWriter out = new BufferedWriter(char_output);
//		model.write(out, "RDF/XML");

		long t1 = System.currentTimeMillis();
		LOGGER.info("done in " + ((t1 - t0) / 1000.0) + " seconds.");
=======
		String fileName = "test.ifc";
		ExpressReader er = new ExpressReader(expressFile.getAbsolutePath());
		IFC_ClassModel model = new IFC_ClassModel(fileName, inputStream, er.getEntities(), er.getTypes(), "model name");
		try {
			model.listRDF(outputStream, "ifc", null, halvingProgressReporter);
		} catch (IOException e) {
			throw new SerializerException(e);
		} catch (SQLException e) {
			throw new SerializerException(e);
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				throw new SerializerException(e);
			}
		}
>>>>>>> cfbde0d7deda287d81177ad9d10737b5b3a1a78a
		return false;
	}
}