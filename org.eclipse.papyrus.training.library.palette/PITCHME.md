# Custom Palette in Papyrus 


* Same pattern as the new child tutorial
  * “Diagramatic/Graphical” element type
  * Double specializations : semantic and umldi
  * Palette model that reference element types

* Palette framework
  * Basic concepts
  * New Editor will be available in Eclipse-Oxygen
    * https://bugs.eclipse.org/bugs/show_bug.cgi?id=482669

 * Demo

+++
## Create a “Diagramatic/Graphical” elementTYpe 

* Create an elementtype emf model
  * Register it with the extension point: org.eclipse.papyrus.infra.types.core.elementTypeSetConfiguration
* The model should contains the 2 following specializations


![DiSpecializations](/org.eclipse.papyrus.training.library.wizard/doc/DiSpecializations.png)  

+++

![DiSpecializationConfiguration](/org.eclipse.papyrus.training.library.wizard/doc/DiSpecializationConfiguration.png)  

* 2 properties are especially important
  * Hint: indication for graphical representation
	(use the same Hint as the umldi specialization)

  * Specialized Types ID: Parent specializations
    * Semantic: org.eclipse.training.library.profile.extlibrary.Periodical.Monthly
    * Diagramatic: org.eclipse.papyrus.umldi.Class_Shape
    
* Same for Classe_Shape_CN (representation inside a Package

+++

![PaletteConfiguration](/org.eclipse.papyrus.training.library.wizard/doc/PaletteConfiguration.png)  
* Basic concepts
  * Drawer:  Directory representation that can be hide/expand
  * Stack: Stack representation that keeps the latest used element at the top 
  * Separator: Graphical separator
  * Tool: Element entry in the palette
    * Icon : icon used by the entry
    * Element Descriptor: Reference to element type

 * Reference both diagrammatic elements in Palette Model
(the first one that can/will be created)


+++
## Eclipse Runtime

* The Palette has one element Monthly Periodical 

![PaletteExample](/org.eclipse.papyrus.training.library.wizard/doc/PaletteExample.png)  




    
