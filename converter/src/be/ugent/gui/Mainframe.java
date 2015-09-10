package be.ugent.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.buildingsmart.ExpressReader;
import org.buildingsmart.OWLWriter;

import fi.ni.rdf.Namespace;

public class Mainframe extends JFrame {

	private static final long serialVersionUID = -6138513005738223369L;
	private static JFrame f;
	private static ExpressReader er;
	private static String ontologyNamespace;
	
	public static void main(String[] args) {
		f = new Mainframe();
	}
	
	public Mainframe() {		
		// basic settings
		setTitle("Simple EXPRESS/IFC to OWL/RDF Convertor");
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		getContentPane().setLayout(new BorderLayout());	
		
		JMenuBar menuBar = setupMenuBar();		
		this.add(menuBar, BorderLayout.NORTH);

		// main pane
		//JPanel TreesPanel = setupTreesPanel();
		//ifcTree.buildIFCOntologyTree();
		
		//setupContentPanel("MVD Content");
		
//		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
//	    splitPane.setRightComponent(contentPanel);
//	    splitPane.setLeftComponent(TreesPanel);
//	    splitPane.setResizeWeight(0.5);
//	    getContentPane().add(splitPane, BorderLayout.CENTER);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
	

	private JMenuBar setupMenuBar() {
		// Where the GUI is created:
		JMenu menu;
		JMenuItem menuItem;

		// Create the menu bar.
		JMenuBar menuBar = new JMenuBar();

		// Build the first menu.
		menu = new JMenu("EXPRESS to OWL");
		menu.setMnemonic(KeyEvent.VK_F);
		menu.getAccessibleContext().setAccessibleDescription(
				"Convert EXPRESS schemas to OWL ontologies");

		// a group of JMenuItems
		menuItem = new JMenuItem("Open as LDAC2015...", KeyEvent.VK_O);
		menuItem.getAccessibleContext().setAccessibleDescription(
				"Open EXP schema and convert to in-memory JENA OWL ontology, using the conversion procedure agreed upon at LDAC2015");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				openLDAC2015Version();
			}
		});
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Open as AUTCON2015...");
		menuItem.setEnabled(false);
		menuItem.getAccessibleContext().setAccessibleDescription(
				"Open EXP schema and convert to in-memory JENA OWL ontology, using the conversion procedure explained in AUTCON article 2015");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//OpenIFCFileInMemory();
			}
		});
		menu.add(menuItem);

		menu.addSeparator();
		
		//SAVE
		menuItem = new JMenuItem("Save ifcOWL...", KeyEvent.VK_S);
		menuItem.getAccessibleContext().setAccessibleDescription(
				"Save ifcOWL ontology in file system (TTL, RDF/XML, N-3, ...)");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				saveIfcOWL();
			}
		});
		menu.add(menuItem);		
		
		menu.addSeparator();			

		menuItem = new JMenuItem("Generate expressOWL for IFC2X3_TC1.exp");
		menuItem.getAccessibleContext().setAccessibleDescription(
				"Generate local .ttl file with OWL classes for EXPRESS elements in IFC2X3_TC1.exp");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				InputStream instr = ExpressReader.class.getResourceAsStream("resources/IFC2X3_TC1.exp");
				er = new ExpressReader(instr);
				String IFCOntologyNamespace = "IFC2X3_TC1";									
				er.readAndBuildVersion2015();
				
				OWLWriter ow = new OWLWriter(IFCOntologyNamespace, er.getEntities(),
						er.getTypes(), er.getSiblings(), er.getEnumIndividuals(), er.getProperties());
				ow.outputExpressOWLVersion2015("out/IFC2X3_TC1_express");
				
				JOptionPane.showMessageDialog(null,
						"Successfully generated in-memory EXPRESS OWL file");
			}
		});
		menu.add(menuItem);	
		
		menuItem = new JMenuItem("Generate expressOWL for IFC2X3_Final.exp");
		menuItem.getAccessibleContext().setAccessibleDescription(
				"Generate local .ttl file with OWL classes for EXPRESS elements in IFC2X3_Final.exp");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				InputStream instr = ExpressReader.class.getResourceAsStream("resources/IFC2X3_Final.exp");
				er = new ExpressReader(instr);
				String IFCOntologyNamespace = "IFC2X3_Final";									
				er.readAndBuildVersion2015();
				
				OWLWriter ow = new OWLWriter(IFCOntologyNamespace, er.getEntities(),
						er.getTypes(), er.getSiblings(), er.getEnumIndividuals(), er.getProperties());
				ow.outputExpressOWLVersion2015("out/IFC2X3_Final_express");
				
				JOptionPane.showMessageDialog(null,
						"Successfully generated in-memory EXPRESS OWL file");
			}
		});
		menu.add(menuItem);	
		
		menuItem = new JMenuItem("Generate expressOWL for IFC4.exp");
		menuItem.getAccessibleContext().setAccessibleDescription(
				"Generate local .ttl file with OWL classes for EXPRESS elements in IFC4.exp");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				InputStream instr = ExpressReader.class.getResourceAsStream("resources/IFC4.exp");
				er = new ExpressReader(instr);
				String IFCOntologyNamespace = "IFC4";									
				er.readAndBuildVersion2015();
				
				OWLWriter ow = new OWLWriter(IFCOntologyNamespace, er.getEntities(),
						er.getTypes(), er.getSiblings(), er.getEnumIndividuals(), er.getProperties());
				ow.outputExpressOWLVersion2015("out/IFC4_express");
				
				JOptionPane.showMessageDialog(null,
						"Successfully generated in-memory EXPRESS OWL file");
			}
		});
		menu.add(menuItem);	
		
		menuItem = new JMenuItem("Generate expressOWL for IFC4_ADD1.exp");
		menuItem.getAccessibleContext().setAccessibleDescription(
				"Generate local .ttl file with OWL classes for EXPRESS elements in IFC4_ADD1.exp");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {					
				InputStream instr = ExpressReader.class.getResourceAsStream("resources/IFC4_ADD1.exp");
				er = new ExpressReader(instr);
				String IFCOntologyNamespace = "IFC4_ADD1";									
				er.readAndBuildVersion2015();
				
				OWLWriter ow = new OWLWriter(IFCOntologyNamespace, er.getEntities(),
						er.getTypes(), er.getSiblings(), er.getEnumIndividuals(), er.getProperties());
				ow.outputExpressOWLVersion2015("out/IFC4_ADD1_express");
				
				JOptionPane.showMessageDialog(null,
						"Successfully generated in-memory EXPRESS OWL file");
			}
		});
		menu.add(menuItem);	

		menuItem = new JMenuItem("Save expressOWL...", KeyEvent.VK_S);
		menuItem.setEnabled(false);
		menuItem.getAccessibleContext().setAccessibleDescription(
				"Save expressOWL ontology in file system (TTL, RDF/XML, N-3, ...)");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//JOptionPane.showMessageDialog(null,
				//		"You selected: Save Full IFC as RDF graph...");
			}
		});
		menu.add(menuItem);

		menuBar.add(menu);
		return menuBar;
	}
	
	private void openLDAC2015Version(){
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("C:\\Users\\generic\\Documents\\GitHub\\IFC-to-RDF-converter\\converter\\src\\org\\buildingsmart\\resources\\"));

		int returnVal = chooser.showOpenDialog(f);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			try {
				File file = chooser.getSelectedFile();
				String fp = file.getAbsolutePath();
				if(fp.endsWith(".exp")){
					InputStream instr;
						instr = new FileInputStream(fp);
					er = new ExpressReader(instr);
					ontologyNamespace = file.getName().substring(0, file.getName().indexOf("."));
					Namespace.IFC = "http://www.buildingsmart-tech.org/ifcOWL/" + ontologyNamespace;										
					er.readAndBuildVersion2015();
					
					JOptionPane.showMessageDialog(null,
							"Successfully loaded the EXPRESS file in memory");
				}
				else{
					JOptionPane.showMessageDialog(null,
							"Please select a valid .exp file");
					return;
				}
			} catch (FileNotFoundException e1) {
				JOptionPane.showMessageDialog(null,
						"Please select a valid .exp file");
				e1.printStackTrace();
			}
		} else {
			System.out.println("Warning: Open command cancelled by user");
		}		
	}

	private void saveIfcOWL(){
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Turtle and RDF/XML", "ttl", "rdf");
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("C:\\Users\\generic\\Desktop\\"));
		chooser.setFileFilter(filter);

		int returnVal = chooser.showSaveDialog(f);
		if (returnVal == JFileChooser.APPROVE_OPTION) {			
			File file = chooser.getSelectedFile();
			String fp = file.getAbsolutePath();
			
			if(fp.endsWith(".ttl") || fp.endsWith(".rdf")){
				String fileName = file.getName().substring(0, file.getName().indexOf("."));
				String filePathNoExt = file.getParent() + "\\" + fileName;
				OWLWriter ow = new OWLWriter(ontologyNamespace, er.getEntities(),
						er.getTypes(), er.getSiblings(), er.getEnumIndividuals(), er.getProperties());
				ow.outputOWLVersion2015(filePathNoExt);
				System.out.println("Ended converting the EXPRESS schema into corresponding OWL file");
				
				er.CleanModelAndRewrite(filePathNoExt);

				JOptionPane.showMessageDialog(null,
						"Successfully written to RDF and TTL at location : " + file.getPath());
			}
			else{
				JOptionPane.showMessageDialog(null,
						"Please supply a Turtle or RDF/XML fileName, which ends with .ttl or .rdf");
			}			
		} else {
			System.out.println("Warning: Save command cancelled by user");
		}
	}
	
}
