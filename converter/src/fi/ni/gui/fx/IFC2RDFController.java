/*
 * The GNU Affero General Public License
 * 
 * Copyright (c) 2015 Jyrki Oraskari (Jyrki.Oraskari@aalto.fi / jyrki.oraskari@aalto.fi)
 * Copyright (c) 2015 Pieter Pauwels (pipauwel.pauwels@ugent.be / pipauwel@gmail.com)
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

/*
 * To compile this, Java 8 is needed. jfxrt.jar is included, so, the the plugin should not be mandatory
 * but installing the http://www.eclipse.org/efxclipse/index.html and http://gluonhq.com/open-source/scene-builder/
 * make coding easier. 
 * 
 */

package fi.ni.gui.fx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

import org.buildingsmart.ExpressReader;
import org.buildingsmart.IfcReader;
import org.buildingsmart.OWLWriter;

import fi.ni.rdf.Namespace;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.Tooltip;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class IFC2RDFController implements Initializable, FxInterface {
	private static ExpressReader er;
	private static String ontologyNamespace;

	@FXML
	MenuBar myMenuBar;

	@FXML
	Rectangle handleLDAC_OnArea;
	@FXML
	MenuItem openLDAC2015Version;
	@FXML
	private Button openLDAC2015VersionButton;
	@FXML
	MenuItem saveIfcOWLMenuItem;
	@FXML
	private Button saveIfcOWLButton;
	@FXML
	private TextArea handleOnTxt;
	
	@FXML
	Rectangle conversionArea;
	@FXML
	private Button selectIFCFileButton;
	@FXML
	private Button selectTargetButton;
	@FXML
	private Button convert2RDFButton;
	@FXML
	private MenuItem convert2RDFMenuItem;
	@FXML
	private Label labelIFCFile;
	@FXML
	private Label labelTargetFile;
	@FXML
	private TextArea conversionTxt;


	@FXML
	private void handleButtonAction(ActionEvent event) {
		System.out.println("You clicked me!");
		labelIFCFile.setText("FileName");
	}

	FileChooser fc;

	@FXML
	private void closeApplicationAction() {
		// get a handle to the stage
		Stage stage = (Stage) myMenuBar.getScene().getWindow();
		stage.close();
	}

	@FXML
	private void aboutAction() {
		// get a handle to the stage
		Stage stage = (Stage) myMenuBar.getScene().getWindow();
		new About(stage).show();
	}

	final Tooltip openLDAC2015VersionButton_tooltip = new Tooltip();
	final Tooltip saveIfcOWLButton_tooltip = new Tooltip();

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		openLDAC2015VersionButton_tooltip.setText("Open EXP schema and convert to in-memory JENA OWL ontology, using the conversion procedure agreed upon at LDAC2015");
		saveIfcOWLButton_tooltip.setText("Save ifcOWL ontology in file system (TTL, RDF/XML, N-3, ...)");
		
		openLDAC2015VersionButton.setTooltip(openLDAC2015VersionButton_tooltip);
		saveIfcOWLButton.setTooltip(saveIfcOWLButton_tooltip);
		
		// Accepts dropping
		EventHandler<DragEvent> ad_ontology=new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                Dragboard db = event.getDragboard();
                if (db.hasFiles()) {
                    event.acceptTransferModes(TransferMode.COPY);
                } else {
                    event.consume();
                }
            }
        };
		
		 // Dropping over surface
		EventHandler<DragEvent> dh_ontology=new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (db.hasFiles()) {
                    success = true;
                    for (File file:db.getFiles()) {
                        openLDAC2015Version(file); 
                    }
                }
                event.setDropCompleted(success);
                event.consume();
            }
        };
        
        handleOnTxt.setOnDragDetected(new EventHandler<MouseEvent>()
        {

            @Override
            public void handle(MouseEvent me) 
            {
                Dragboard db = handleOnTxt.startDragAndDrop(TransferMode.ANY);
                if (db.hasFiles()) {
                 
                    for (File file:db.getFiles()) {
                        System.out.println("+ "+file.getAbsolutePath()); 
                    }
                }
                me.consume();
            }

         });
        
        handleOnTxt.setOnDragDone(new EventHandler<DragEvent>() 
        {
            @Override 
            public void handle(DragEvent me) 
            {
               me.consume();
             }
        });
        
        handleOnTxt.setOnDragOver(ad_ontology);
		handleOnTxt.setOnDragDropped(dh_ontology);
		handleLDAC_OnArea.setOnDragOver(ad_ontology);
		handleLDAC_OnArea.setOnDragDropped(dh_ontology);
		openLDAC2015VersionButton.setOnDragOver(ad_ontology);
		openLDAC2015VersionButton.setOnDragDropped(dh_ontology);
		saveIfcOWLButton.setOnDragOver(ad_ontology);
		saveIfcOWLButton.setOnDragDropped(dh_ontology);

		// Accepts dropping
		EventHandler<DragEvent> ad_conversion=new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                Dragboard db = event.getDragboard();
                if (db.hasFiles()) {
                    event.acceptTransferModes(TransferMode.COPY);
                } else {
                    event.consume();
                }
            }
        };
		
		 // Dropping over surface
		EventHandler<DragEvent> dh_conversion=new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (db.hasFiles()) {
                    success = true;
                    for (File file:db.getFiles()) {
                    	labelIFCFile.setText(file.getName());
                		ifcFileName=file.getAbsolutePath();
                		if(ifcFileName!=null && rdfTargetName!=null)
                		{
                			convert2RDFButton.setDisable(false);
                			convert2RDFMenuItem.setDisable(false);
                		}
                    }
                }
                event.setDropCompleted(success);
                event.consume();
            }
        };
        
        conversionArea.setOnDragOver(ad_conversion);
        conversionArea.setOnDragDropped(dh_conversion);
        selectIFCFileButton.setOnDragOver(ad_conversion);
        selectIFCFileButton.setOnDragDropped(dh_conversion);
        selectTargetButton.setOnDragOver(ad_conversion);
        selectTargetButton.setOnDragDropped(dh_conversion);
        convert2RDFButton.setOnDragOver(ad_conversion);
        convert2RDFButton.setOnDragDropped(dh_conversion);
        labelIFCFile.setOnDragOver(ad_conversion);
        labelIFCFile.setOnDragDropped(dh_conversion);
        labelTargetFile.setOnDragOver(ad_conversion);
        labelTargetFile.setOnDragDropped(dh_conversion);
        conversionTxt.setOnDragOver(ad_conversion);
        conversionTxt.setOnDragDropped(dh_conversion);
	}

	@FXML
	private void openLDAC2015Version() {
		Stage stage = (Stage) myMenuBar.getScene().getWindow();
		File file = null;

		if(fc==null)
        {
		 fc = new FileChooser();
		 fc.setInitialDirectory(new File("."));
        }
		FileChooser.ExtensionFilter ef1;
		ef1 = new FileChooser.ExtensionFilter("EXPRESS documents (*.exp)", "*.exp");
		FileChooser.ExtensionFilter ef2;
		ef2 = new FileChooser.ExtensionFilter("All Files", "*.*");
		fc.getExtensionFilters().clear();
		fc.getExtensionFilters().addAll(ef1, ef2);

		if (file == null)
			file = fc.showOpenDialog(stage);
		if (file == null)
			return;
		fc.setInitialDirectory(file.getParentFile());
		openLDAC2015Version(file); 

	}

	private void openLDAC2015Version(File file) 
	{
		try {
			String fp = file.getAbsolutePath();
			if (fp.endsWith(".exp")) {
				InputStream instr;
				instr = new FileInputStream(fp);
				er = new ExpressReader(instr);
				ontologyNamespace = file.getName().substring(0, file.getName().indexOf("."));
				Namespace.IFC = "http://www.buildingsmart-tech.org/ifcOWL/" + ontologyNamespace;
				er.readAndBuildVersion2015();
				if(handleOnTxt==null)
				{
					System.out.println("txt field null ");
					return;
				}
				handleOnTxt.insertText(0,"Successfully loaded the "+file.getName()+" EXPRESS file in memory\n");
				saveIfcOWLButton.setDisable(false);
				saveIfcOWLMenuItem.setDisable(false);
			} else {
				handleOnTxt.insertText(0, "Please select a valid .exp file\n");				
				return;
			}
		} catch (FileNotFoundException e1) {
			handleOnTxt.insertText(0, "Please select a valid .exp file\n");
			e1.printStackTrace();
		}
	}
	
	@FXML
	private void saveIfcOWL() {
		
		Stage stage = (Stage) myMenuBar.getScene().getWindow();
		File file = null;

		if(fc==null)
        {
		 fc = new FileChooser();
		 fc.setInitialDirectory(new File("."));
        }
		FileChooser.ExtensionFilter ef1;
		ef1 = new FileChooser.ExtensionFilter("Turtle and RDF/XML (*.ttl)", "*.ttl","*.rdf");
		fc.getExtensionFilters().clear();
		fc.getExtensionFilters().addAll(ef1);

		if (file == null)
			file = fc.showSaveDialog(stage);
		if (file == null)
			return;
		fc.setInitialDirectory(file.getParentFile());
			String fp = file.getAbsolutePath();

			if (fp.endsWith(".ttl") || fp.endsWith(".rdf")) {
				String fileName = file.getName().substring(0, file.getName().indexOf("."));
				String filePathNoExt = file.getParent() + "\\" + fileName;
				OWLWriter ow = new OWLWriter(ontologyNamespace, er.getEntities(), er.getTypes(), er.getSiblings(),
						er.getEnumIndividuals(), er.getProperties());
				ow.outputOWLVersion2015(filePathNoExt);
				System.out.println("Ended converting the EXPRESS schema into corresponding OWL file");

				er.CleanModelAndRewrite(filePathNoExt);
				handleOnTxt.insertText(0,"Successfully written to RDF and TTL at location : " +file.getPath()+"\n");
			} else {
				handleOnTxt.insertText(0,"Please supply a Turtle or RDF/XML fileName, which ends with .ttl or .rdf");
			}
		
	}

	private String ifcFileName=null; 
	private String rdfTargetName=null;
	
	@FXML
	private void selectIFCFile() {
		Stage stage = (Stage) myMenuBar.getScene().getWindow();
		File file = null;

		if(fc==null)
        {
		 fc = new FileChooser();
		 fc.setInitialDirectory(new File("."));
        }
		FileChooser.ExtensionFilter ef1;
		ef1 = new FileChooser.ExtensionFilter("IFC documents (*.ifc)", "*.ifc");
		FileChooser.ExtensionFilter ef2;
		ef2 = new FileChooser.ExtensionFilter("All Files", "*.*");
		fc.getExtensionFilters().clear();
		fc.getExtensionFilters().addAll(ef1, ef2);

		if (file == null)
			file = fc.showOpenDialog(stage);
		if (file == null)
			return;
		fc.setInitialDirectory(file.getParentFile());
		labelIFCFile.setText(file.getName());
		ifcFileName=file.getAbsolutePath();
		if(ifcFileName!=null && rdfTargetName!=null)
		{
			convert2RDFButton.setDisable(false);
			convert2RDFMenuItem.setDisable(false);
		}
	}

	@FXML
	private void selectTargetFile() {
		Stage stage = (Stage) myMenuBar.getScene().getWindow();
		File file = null;
        if(fc==null)
        {
		 fc = new FileChooser();
		 fc.setInitialDirectory(new File("."));
        }
		FileChooser.ExtensionFilter ef1;
		ef1 = new FileChooser.ExtensionFilter("Turtle and RDF/XML (*.ttl)", "*.ttl","*.rdf");
		fc.getExtensionFilters().clear();
		fc.getExtensionFilters().addAll(ef1);

		if (file == null)
			file = fc.showSaveDialog(stage);
		if (file == null)
			return;
		fc.setInitialDirectory(file.getParentFile());
		labelTargetFile.setText(file.getName());
		rdfTargetName=file.getAbsolutePath();
		if(ifcFileName!=null && rdfTargetName!=null)
		{
			convert2RDFButton.setDisable(false);
			convert2RDFMenuItem.setDisable(false);
		}

	}

	@FXML
	private void convertIFCToRDF() {
		IfcReader r = new IfcReader();
		conversionTxt.setText("");
		try {
			r.convert(ifcFileName, rdfTargetName, r.DEFAULT_PATH,this);			
		} catch (IOException e) {			
			conversionTxt.insertText(0, e.getMessage());			
		}
		
	}

	@Override
	public void handle_notification(String txt) {
		conversionTxt.insertText(0, txt+"\n");		
	}
}
