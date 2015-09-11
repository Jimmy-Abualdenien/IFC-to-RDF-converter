/*
 * The GNU Affero General Public License
 * 
 * Copyright (c) 2015 Jyrki Oraskari (Jyrki.Oraskari@aalto.fi / rkiorri@gmail.com)
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
 * to compile this, install http://www.eclipse.org/efxclipse/index.html
 * 
 */

package fi.ni.gui.fx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

import org.buildingsmart.ExpressReader;
import org.buildingsmart.OWLWriter;

import fi.ni.rdf.Namespace;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class IFC2RDFController implements Initializable {
	@FXML
	MenuBar myMenuBar;
	private static ExpressReader er;
	private static String ontologyNamespace;

	@FXML
	private Label labelIFCFile;

	@FXML
	private Label labelOutputDirectory;

	@FXML
	private void handleButtonAction(ActionEvent event) {
		System.out.println("You clicked me!");
		labelIFCFile.setText("FileName");
	}

	FileChooser fc;

	@FXML
	private void handleOpenFileAction(ActionEvent event) {
		Stage stage = (Stage) myMenuBar.getScene().getWindow();
		File file = null;

		fc = new FileChooser();
		fc.setInitialDirectory(new File("."));
		FileChooser.ExtensionFilter ef1;
		ef1 = new FileChooser.ExtensionFilter("EXPRESS documents (*.exp)", "*.exp");
		FileChooser.ExtensionFilter ef2;
		ef2 = new FileChooser.ExtensionFilter("All Files", "*.*");
		fc.getExtensionFilters().addAll(ef1, ef2);

		if (file == null)
			file = fc.showOpenDialog(stage);
		if (file == null)
			return;
		fc.setInitialDirectory(file.getParentFile());
	}

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

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}

	@FXML
	private void openLDAC2015Version() {
		Stage stage = (Stage) myMenuBar.getScene().getWindow();
		File file = null;

		fc = new FileChooser();
		fc.setInitialDirectory(new File("."));
		FileChooser.ExtensionFilter ef1;
		ef1 = new FileChooser.ExtensionFilter("EXPRESS documents (*.exp)", "*.exp");
		FileChooser.ExtensionFilter ef2;
		ef2 = new FileChooser.ExtensionFilter("All Files", "*.*");
		fc.getExtensionFilters().addAll(ef1, ef2);

		if (file == null)
			file = fc.showOpenDialog(stage);
		if (file == null)
			return;

		try {
			String fp = file.getAbsolutePath();
			if (fp.endsWith(".exp")) {
				InputStream instr;
				instr = new FileInputStream(fp);
				er = new ExpressReader(instr);
				ontologyNamespace = file.getName().substring(0, file.getName().indexOf("."));
				Namespace.IFC = "http://www.buildingsmart-tech.org/ifcOWL/" + ontologyNamespace;
				er.readAndBuildVersion2015();

				// JOptionPane.showMessageDialog(null,
				// "Successfully loaded the EXPRESS file in memory");
			} else {
				// JOptionPane.showMessageDialog(null,
				// "Please select a valid .exp file");
				return;
			}
		} catch (FileNotFoundException e1) {
			// JOptionPane.showMessageDialog(null,
			// "Please select a valid .exp file");
			e1.printStackTrace();
		}

	}

	@FXML
	private void saveIfcOWL() {
		
		Stage stage = (Stage) myMenuBar.getScene().getWindow();
		File file = null;

		fc = new FileChooser();
		fc.setInitialDirectory(new File("."));
		FileChooser.ExtensionFilter ef1;
		ef1 = new FileChooser.ExtensionFilter("Turtle and RDF/XML (*.ttl)", "*.ttl","*.rdf");
		fc.getExtensionFilters().addAll(ef1);

		if (file == null)
			file = fc.showOpenDialog(stage);
		if (file == null)
			return;

			String fp = file.getAbsolutePath();

			if (fp.endsWith(".ttl") || fp.endsWith(".rdf")) {
				String fileName = file.getName().substring(0, file.getName().indexOf("."));
				String filePathNoExt = file.getParent() + "\\" + fileName;
				OWLWriter ow = new OWLWriter(ontologyNamespace, er.getEntities(), er.getTypes(), er.getSiblings(),
						er.getEnumIndividuals(), er.getProperties());
				ow.outputOWLVersion2015(filePathNoExt);
				System.out.println("Ended converting the EXPRESS schema into corresponding OWL file");

				er.CleanModelAndRewrite(filePathNoExt);

				// JOptionPane.showMessageDialog(null,
				// "Successfully written to RDF and TTL at location : " +
				// file.getPath());
			} else {
				// JOptionPane.showMessageDialog(null,
				// "Please supply a Turtle or RDF/XML fileName, which ends with
				// .ttl or .rdf");
			}
		
	}

}
