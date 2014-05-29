DFNModeler-2014
===============

Repository for model driven software development homework in 2014. In this project, an Eclipse plug-in is created that supports data-flow network modelling via the Eclipse EMF Framework as well as, the validation of the created model by using the EMF IncQuery project's pattern-based validation features.
The model is also visualized. Based on the model graphML diagrams are generated, and the environment also has a Zest-based graphical view as well. 

The tool also supports code generation. Based on the modeled data flow network, the source code of a system of independent java applications is generated. The tool uses JMS and MQTT messaging techniques to provide information flow between the individual applications. 

The repository contains an example data flow network that represents a greenhouse. It also includes a JavaFX based UI that can be used to monitor the state of the running example.
