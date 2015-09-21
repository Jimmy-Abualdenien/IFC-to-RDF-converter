package org.bimserver.serializers.ifctordf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Set;

import org.bimserver.emf.Schema;
import org.bimserver.models.store.ObjectDefinition;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.PluginException;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.renderengine.RenderEngineException;
import org.bimserver.plugins.schema.SchemaPlugin;
import org.bimserver.plugins.serializers.AbstractSerializerPlugin;
import org.bimserver.plugins.serializers.Serializer;
import org.buildingsmart.ExpressReader;
import org.buildingsmart.IfcConvertor;
import org.buildingsmart.IfcReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class IfcToRdfPlugin extends AbstractSerializerPlugin {

	private static final Logger LOGGER = LoggerFactory.getLogger(IfcToRdfPlugin.class);
	private boolean initialized;
	private File schemaFile;
	private static String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	private static final String DEFAULT_PATH = "http://linkedbuildingdata.net/ifc/instances"+timeLog+"#";
	private OntModel om;
	private ExpressReader er;
	private OntModel listModel;
	private OntModel expressModel;
		
	@Override
	public void init(PluginManager pluginManager) throws PluginException {
		SchemaPlugin schemaPlugin = pluginManager.getFirstSchemaPlugin("ifc2x3tc1", true);
		schemaFile = schemaPlugin.getExpressSchemaFile();
		if (schemaFile == null) {
			throw new RenderEngineException("No schema file");
		}
		
		try {
			om = loadModel(pluginManager, "/data/org/buildingsmart/resources/IFC2X3_TC1.ttl", "TTL");
			expressModel = loadModel(pluginManager, "/data/org/buildingsmart/resources/express.ttl", "TTL");
			listModel = loadModel(pluginManager, "/data/org/buildingsmart/resources/list.rdf", "RDF/XML");
			

			InputStream inexp = pluginManager.getPluginContext(this).getResourceAsInputStream("/data/org/buildingsmart/resources/IFC2X3_TC1.exp");
			if (inexp == null) {
				throw new PluginException("/data/org/buildingsmart/resources/IFC2X3_TC1.exp" + " not found");
			}

			er = new ExpressReader(inexp);
			er.readAndBuildVersion2015();

			initialized = true;
		} catch (FileNotFoundException e) {
			LOGGER.error("", e);
		} catch (IOException e) {
			LOGGER.error("", e);
		}
	}

	private OntModel loadModel(PluginManager pluginManager, String expPath, String type) throws IOException {
		OntModel expressModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
		InputStream inputStream = pluginManager.getPluginContext(this).getResourceAsInputStream(expPath);
		if (inputStream == null) {
			throw new FileNotFoundException(expPath);
		}
		try {
			expressModel.read(inputStream, null, type);
		} finally {
			inputStream.close();
		}
		return expressModel;
	}

	@Override
	public String getDescription() {
		return "Ifc to RDF";
	}

	@Override
	public String getDefaultName() {
		return "RDF";
	}

	@Override
	public String getVersion() {
		return "1.0";
	}

	@Override
	public ObjectDefinition getSettingsDefinition() {
		return super.getSettingsDefinition();
	}

	@Override
	public boolean isInitialized() {
		return initialized;
	}

	@Override
	public Serializer createSerializer(PluginConfiguration plugin) {
		return new IfcToRdfSerializer(om, expressModel, listModel, er);
	}

	@Override
	public boolean needsGeometry() {
		return false;
	}

	@Override
	public Set<Schema> getSupportedSchemas() {
		return Schema.IFC2X3TC1.toSet();
	}

	@Override
	public String getDefaultExtension() {
		return "rdf";
	}

	@Override
	public String getDefaultContentType() {
		return "application/rdf+xml";
	}
}