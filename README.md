## Overview
This project provides you with an EXPRESS-to-OWL and IFC-to-RDF conversion service. The converter can be accessed in a number of ways: using a commandline tool (written in Java), using a RESTful Web interface, or using a Graphical User Interface (GUI).

Author: Pieter Pauwels
Contributors: Jyrki Oraskari, Ruben De Laat, Walter Terkaj

## EXPRESS-to-OWL conversion
The code allows to convert the EXPRESS schemas of IFC into OWL ontologies. The following ontologies are supported:

* IFC4_ADD1.exp (http://www.buildingsmart-tech.org/specifications/ifc-releases/ifc4-add1-release)
* IFC4.exp (http://www.buildingsmart-tech.org/specifications/ifc-releases/ifc4-release)
* IFC2X3_TC1.exp (http://www.buildingsmart-tech.org/specifications/ifc-releases/ifc2x3-tc1-release)
* IFC2X3_Final.exp (http://www.buildingsmart-tech.org/specifications/ifc-releases/ifc2x3-release)

### Using the command line interface
1. Clone or download the project
2. Locate the executable JAR: EXPRESS-to-OWL.jar
3. Open a command-line interface and execute the following command:
```
java -jar EXPRESS-to-OWL.jar expressSchemaname pathToOutputFile
```

Note: `expressSchemaname` should be `IFC4_ADD1`, `IFC4`, `IFC2X3_TC1`, or `IFC2X3_Final`

```
Example: java -jar EXPRESS-to-OWL.jar IFC2X3_TC1 C:/outputfile.owl
```

### Using the GUI

## IFC-to-RDF conversion
### Using the command line interface



### Using a RESTful Web Interface


### Using the GUI

## More information
For more information, please contact pipauwel@gmail.com or pipauwel.pauwels@ugent.be, or file an issue in the repository.