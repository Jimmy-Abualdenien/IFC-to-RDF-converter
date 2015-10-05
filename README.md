# Overview
This project provides you with an EXPRESS-to-OWL and IFC-to-RDF conversion service. The converter can be accessed in a number of ways: using a commandline tool (written in Java), using a RESTful Web interface, or using a Graphical User Interface (GUI). <b>We strongly recommend to use the GUI (see https://github.com/pipauwel/IFC-to-RDF-converter#using-the-gui).</b>

Authors: Pieter Pauwels, Jyrki Oraskari

Contributors: Ruben De Laat, Walter Terkaj

# Using the GUI
Through the GUI, you are able to run both the EXPRESS-to-OWL conversion process and the IFC-to-RDF conversion process. The following schemas are supported:

* IFC4_ADD1.exp (http://www.buildingsmart-tech.org/specifications/ifc-releases/ifc4-add1-release)
* IFC4.exp (http://www.buildingsmart-tech.org/specifications/ifc-releases/ifc4-release)
* IFC2X3_TC1.exp (http://www.buildingsmart-tech.org/specifications/ifc-releases/ifc2x3-tc1-release)
* IFC2X3_Final.exp (http://www.buildingsmart-tech.org/specifications/ifc-releases/ifc2x3-release)

What to do:

1. Clone or download this GitHub project
2. Locate the executable JAR: JARS/IFC-to-RDF_GUI.jar (https://github.com/pipauwel/IFC-to-RDF-converter/blob/master/JARS/EXPRESS-to-OWL.jar)
3. Execute the IFC-to-RDF_GUI.jar directly by double-clicking
4. Follow instructions in the interface

If you prefer a command-line interface (or you want to batch convert IFC files), please follow below instructions.

# Using the command line interface
## EXPRESS-to-OWL conversion
1. Clone or download this GitHub project
2. Locate the executable JAR: JARS/EXPRESS-to-OWL.jar
3. Open a command-line interface and execute the following command:
```
java -jar EXPRESS-to-OWL.jar expressSchemaname pathToOutputFile
```

Note: `expressSchemaname` should be `IFC4_ADD1`, `IFC4`, `IFC2X3_TC1`, or `IFC2X3_Final`

```
Example: java -jar EXPRESS-to-OWL.jar IFC2X3_TC1 C:/path/to/outputfile
```

## IFC-to-RDF conversion
###Single file conversion
1. Clone or download this GitHub project
2. Locate the executable JAR: JARS/IFC-to-RDF_NOGUI.jar
3. Open a command-line interface and execute the following command:
```
java -jar IFC-to-RDF_NOGUI.jar pathToIfcFile.ifc pathToOutputFile.ttl
```

Note: The IFC file needs to follow the `IFC4_ADD1`, `IFC4`, `IFC2X3_TC1`, or `IFC2X3_Final` schema. Earlier schemas, or entirely other schemas are not supported in this project.

```
Example: java -jar IFC-to-RDF_NOGUI.jar C:/path/to/inputfile.ifc C:/path/to/outputfile.ttl
```

###Single file conversion including generation of log file
1. Clone or download this GitHub project
2. Locate the executable JAR: JARS/IFC-to-RDF_NOGUI.jar
3. Open a command-line interface and execute the following command:
```
java -jar IFC-to-RDF_NOGUI.jar LOG pathToIfcFile.ifc pathToOutputFile.ttl
```

Note: The IFC file needs to follow the `IFC4_ADD1`, `IFC4`, `IFC2X3_TC1`, or `IFC2X3_Final` schema. Earlier schemas, or entirely other schemas are not supported in this project.

```
Example: java -jar IFC-to-RDF_NOGUI.jar LOG C:/path/to/inputfile.ifc C:/path/to/outputfile.ttl
```

###Batch file conversion
1. Clone or download this GitHub project
2. Locate the executable JAR: JARS/IFC-to-RDF_NOGUI.jar
3. Open a command-line interface and execute the following command:
```
java -jar IFC-to-RDF_NOGUI.jar DIR pathToInputFolder
```

Note: The IFC file needs to follow the `IFC4_ADD1`, `IFC4`, `IFC2X3_TC1`, or `IFC2X3_Final` schema. Earlier schemas, or entirely other schemas are not supported in this project.
Note: All IFC files that are found in the input folder, including its subfolders, will be converted to .TTL and .OWL files. <b>Please be aware of the number of files that you provide to the machine.</b>

```
Example: java -jar IFC-to-RDF_NOGUI.jar DIR C:/path/to/inputfolder/
```

###Batch file conversion including generation of log file
1. Clone or download this GitHub project
2. Locate the executable JAR: JARS/IFC-to-RDF_NOGUI.jar
3. Open a command-line interface and execute the following command:
```
java -jar IFC-to-RDF_NOGUI.jar LOG DIR pathToInputFolder
```

Note: The IFC file needs to follow the `IFC4_ADD1`, `IFC4`, `IFC2X3_TC1`, or `IFC2X3_Final` schema. Earlier schemas, or entirely other schemas are not supported in this project.
Note: All IFC files that are found in the input folder, including its subfolders, will be converted to .TTL and .OWL files. For each file, a separate LOG-file will be generated as well, listing the conversion results. <b>Please be aware of the number of files that you provide to the machine.</b>

```
Example: java -jar IFC-to-RDF_NOGUI.jar LOG DIR C:/path/to/inputfolder/
```

# More information
For more information, please contact pipauwel@gmail.com or pipauwel.pauwels@ugent.be, or file an issue in the repository.