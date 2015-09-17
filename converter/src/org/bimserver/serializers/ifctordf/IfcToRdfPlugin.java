package org.bimserver.serializers.ifctordf;

import java.io.File;
<<<<<<< HEAD
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
=======
>>>>>>> cfbde0d7deda287d81177ad9d10737b5b3a1a78a
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

<<<<<<< HEAD
import org.buildingsmart.ExpressReader;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

=======
>>>>>>> cfbde0d7deda287d81177ad9d10737b5b3a1a78a
public class IfcToRdfPlugin extends AbstractSerializerPlugin {

	private boolean initialized;
	private File schemaFile;
<<<<<<< HEAD
	private static String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
	private static final String DEFAULT_PATH = "http://linkedbuildingdata.net/ifc/instances"+timeLog+"#";
	private OntModel om;
	private ExpressReader er;
	
=======

>>>>>>> cfbde0d7deda287d81177ad9d10737b5b3a1a78a
	@Override
	public void init(PluginManager pluginManager) throws PluginException {
		SchemaPlugin schemaPlugin = pluginManager.getFirstSchemaPlugin("ifc2x3tc1", true);
		schemaFile = schemaPlugin.getExpressSchemaFile();
		if (schemaFile == null) {
			throw new RenderEngineException("No schema file");
		}
<<<<<<< HEAD
		
		om = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
		try {
			String ttlPath = "/org/buildingsmart/resources/IFC2X3_TC1.ttl";
			InputStream in = pluginManager.getPluginContext(this).getResourceAsInputStream(ttlPath);
			if (in == null) {
				throw new PluginException(ttlPath + " not found");
			}
			
			String expPath = "/org/buildingsmart/resources/IFC2X3_TC1.exp";
			InputStream inexp = pluginManager.getPluginContext(this).getResourceAsInputStream(expPath);
			if (inexp == null) {
				throw new PluginException(expPath + " not found");
			}
			
			om.read(in,null,"TTL");
			
			String ontURI = "http://www.buildingsmart-tech.org/ifcOWL";
			String ontNS = ontURI + "#";			
			Model im = ModelFactory.createDefaultModel();
			im.setNsPrefix("ifcowl", ontNS);
			im.setNsPrefix("inst", DEFAULT_PATH);			
			
			er = new ExpressReader(inexp);
			er.readAndBuildVersion2015();

			initialized = true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
=======
		initialized = true;
>>>>>>> cfbde0d7deda287d81177ad9d10737b5b3a1a78a
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
<<<<<<< HEAD
		return new IfcToRdfSerializer(om, er);
=======
		return new IfcToRdfSerializer(schemaFile);
>>>>>>> cfbde0d7deda287d81177ad9d10737b5b3a1a78a
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