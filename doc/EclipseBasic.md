## Basic Eclipse Tutorial

* How to create an eclipse plugin
* How to register an Extension point
* How to create an emf model
* How to launch an Eclipse Runtime
* How to import an Eclipse Plugin Project

+++
## Creation of An Eclipse plugin 

* Right Click in the Project Explorer View
* New>Project…

![NewEclipseProject](/doc/NewEclipseProject.png) 
+++
## Select plugin

* Open Plug-in Development
* Chose Plug-in

![NewEclipsePlugin](/doc/NewEclipsePlugin.png) 
+++
## New Plugin configuration
* Write the plugin name : org.eclipse.papyrus.example

![PluginConfiguration](/doc/PluginConfiguration.png) 
+++
## Workspace

![NewPluginResult](/doc/NewPluginResult.png) 

+++
## How To use embedded model/resources
* Create a resources folder
* Add it to build.properties

![EmbedResources](/doc/EmbedResources.png) 
+++
## Create an EMF MODEL (knowing the extension)
* Right Click in the Project Explorer View
* New>Other…
  * Select Example EMF model Creation Wizards

![NewEmfModel](/doc/NewEmfModel.png) 
+++
## Register an Extension Point
* Open MANIFEST.MF file
  * Select Extensions tab

![RegisterExtensionPoint](/doc/RegisterExtensionPoint.png) 

+++
## Use the filter to find the required extension point

![ExtensionPointFilter](/doc/ExtensionPointFilter.png) 

+++
## Create a runtime configuration
* Click on the White/Green arrow > Run Configuration
* Eclipse Application > Right click > New

![RuntimeConfiguration](/doc/RuntimeConfiguration.png) 

+++
* File > Import….
* General >Existing Project into workspace
* Select the repository  with the plugins training

![ImportTrainingPlugins](/doc/ImportTrainingPlugins.png) 

+++
## Start of the training workshop

![TrainingWorkspace](/doc/TrainingWorkspace.png) 