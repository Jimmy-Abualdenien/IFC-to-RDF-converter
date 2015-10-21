package org.bimserver.serializers.ifctordf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
import java.util.Set;

import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import org.bimserver.emf.Schema;
import org.bimserver.models.store.ObjectDefinition;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.PluginContext;
import org.bimserver.plugins.PluginException;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.renderengine.RenderEngineException;
import org.bimserver.plugins.schema.SchemaPlugin;
import org.bimserver.plugins.serializers.AbstractSerializerPlugin;
import org.bimserver.plugins.serializers.Serializer;
import org.buildingsmart.ExpressReader;
import org.buildingsmart.vo.EntityVO;
import org.buildingsmart.vo.TypeVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IfcToRdfPlugin extends AbstractSerializerPlugin {

	private static final Logger LOGGER = LoggerFactory.getLogger(IfcToRdfPlugin.class);
	private boolean initialized;
	private Path schemaFile;
	private static String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	private static final String DEFAULT_PATH = "http://linkedbuildingdata.net/ifc/instances"+timeLog+"#";
	private OntModel om;
	private ExpressReader er;
	private OntModel listModel;
	private OntModel expressModel;
	private PluginContext pluginContext;
	private Map<String, EntityVO> ent;
	private Map<String, TypeVO> typ;
		
	@Override
	public void init(PluginManager pluginManager) throws PluginException {
		SchemaPlugin schemaPlugin = pluginManager.getFirstSchemaPlugin("ifc2x3tc1", true);
		schemaFile = schemaPlugin.getExpressSchemaFile();
		if (schemaFile == null) {
			throw new RenderEngineException("No schema file");
		}
		
		try {
			om = loadModel(pluginManager, "data/IFC2X3_TC1.ttl", "TTL");
			expressModel = loadModel(pluginManager, "data/express.ttl", "TTL");
			listModel = loadModel(pluginManager, "data/list.rdf", "RDF/XML");
			
			String exp = "IFC2X3_TC1";
			
			readSerializedResources("data/ent" + exp + ".ser", "data/typ" + exp + ".ser");
			
			initialized = true;
		} catch (FileNotFoundException e) {
			LOGGER.error("", e);
		} catch (IOException e) {
			LOGGER.error("", e);
		} catch (ClassNotFoundException e) {
			LOGGER.error("", e);
		}
	}

	@SuppressWarnings("unchecked")
	private void readSerializedResources(String entityFile, String typeFile) throws IOException, ClassNotFoundException {
		Path path = pluginContext.getRootPath().resolve(entityFile);
		InputStream inputStream = Files.newInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(inputStream);
		try {
			ent = (Map<String,EntityVO>) ois.readObject();
		} finally {
			ois.close();
		}

		path = pluginContext.getRootPath().resolve(typeFile);
		inputStream = Files.newInputStream(path);
		ois = new ObjectInputStream(inputStream);
		try {
			typ = (Map<String,TypeVO>) ois.readObject();
		} finally {
			ois.close();
		}
	}

	private OntModel loadModel(PluginManager pluginManager, String expPath, String type) throws IOException {
		OntModel expressModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
		PluginContext pluginContext = pluginManager.getPluginContext(this);
		Path path = pluginContext.getRootPath().resolve(expPath);
		InputStream inputStream = Files.newInputStream(path);
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
		return new IfcToRdfSerializer(om, expressModel, listModel, ent, typ);
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