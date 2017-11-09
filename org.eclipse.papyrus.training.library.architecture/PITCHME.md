## How to Create papyrus Architecture

* Basic concepts
  * Viewpoint
  * Stakeholder
  * Diagram
  * Table

* 1 extension point
  * org.eclipse.papyrus.infra.architecture.models


* Demo, provided example
  * Plugin : org.eclipse.papyrus.training.library.architecture
  * Example of in library.architecture

+++
* The architecture metamodel in Papyrus is implemented as a realization and an extension to the ISO 42010 standard for architecture of systems. Hence many concepts present in the metamodel are derived from those presented in the ISO 42010 standard. 
* However, the standard has been extended with Papyrus-specific concepts and properties.

+++

* ''domain'' is the root of the architecture model. It can contains a collection of ''concerns'', ''stakeholders'', as well as ''contexts''.
* ''concern'' (from ISO 42010) represents a matter of interest to stakeholder.
* ''stakeholder'' (from ISO 42010) represents in Papyrus an archetype of users. It references a set of its ''concerns''.
* “description language'' (from ISO 42010) represents in Papyrus a modeling language (e.g., UML, SysML). 
* “framework'' (from ISO 42010) represents in Papyrus a modeling framework (e.g., DoDAF). 
* “viewpoint'' (from ISO 42010) in Papyrus references set of ''representation kinds'', which can be ''diagrams'' or ''tables''.
* ''diagram'' is for example the ''UML Class Diagram''.
* ''table'' is another kind of view in Papyrus that enables the presentation of models in a tabular format.

+++
## Extension POINT : org.eclipse.papyrus.infra.architecture.models

* Add an architecture
  * path: path to the architecture model

![ArchitectureFile](/org.eclipse.papyrus.training.library.architecture/doc/ArchitectureFile.png)  
![ArchitectureConfiguration](/org.eclipse.papyrus.training.library.architecture/doc/ArchitectureConfiguration.png)  
+++
* Architecture Description Language
  * Name
  * Description
  * a unique Id (e.g., org.eclipse.uml2.UML)
  * an Extension Prefix if desired (e.g., profile), 
  * an Icon using a platform URI (e.g., platform:/plugin/project/icons/xxx.png), 
  * a Metamodel as a reference to an EPackage (load the Ecore model first), one or more Profiles as references to EPackages (load the Ecore models first), 
  * one or more Element Types as references to ElementTypeSetConfigurations (load the *.elementtypesetconfiguration models first), 
  * a creation command using a fully qualified of a Java class implementing the IModelCreationCommand interface
  * an optional conversion command using a fully qualified of a Java class implementing the IModelConversionCommand interface.


+++
![DiagramKindTree](/org.eclipse.papyrus.training.library.architecture/doc/DiagramKindTree.png)  
![DiagramKindConfiguration](/org.eclipse.papyrus.training.library.architecture/doc/DiagramKindConfiguration.png)  

+++


* Papyrus Diagram properties view, specify for it: 
  * A Name (required) that is the user-visible name of the diagram. It will appear in the creation menus and property panel. 
  * An Icon (required), as an URI of the form platform:/plugin/.... 
  * An Implementation ID (required) which selects the physical (hard-coded) UML diagram in Papyrus that will be used as a base.
  * An optional Parent that specifies a parent viewpoint-defined diagram to inherit from. Essentially, the inheriting diagram will defer to its parent’s rules when its own are not sufficient to take a decision. 
  * An optional Custom Style as an URI of the form platform:/plugin/.... It must point to a CSS file that will then be automatically applied to the diagram. 
  * An optional Palettes as la list of URI of the form platform:/plugin/.... It must point a palette definition. 
  * Other attributes are inherited from the ISO 42010 implementation and are currently not used in Papyrus.


+++
## Eclipse runtime


![WizardExample](/org.eclipse.papyrus.training.library.architecture/doc/WizardExample.png)  
![MenuNewDiagram](/org.eclipse.papyrus.training.library.architecture/doc/MenuNewDiagram.png)  
+++
## Architecture switch

* Model Explorer > Right click > 

![SwitchMenu](/org.eclipse.papyrus.training.library.architecture/doc/SwitchMenu.png)  
![SwitchPopup](/org.eclipse.papyrus.training.library.architecture/doc/SwitchPopup.png)  
+++
## Active viewpoint

![ActiveViewpoint](/org.eclipse.papyrus.training.library.architecture/doc/ActiveViewpoint.png)  









