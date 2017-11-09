### Customize Properties in Papyrus
* Generate a Properties View Configuration
* Include the properties configuration into a Plugin
* Manually customize the Properties
* Demo

+++
### Generating a properties view From A Profile

* Select File > New > Other… > Papyrus >Papyrus Add-ons > Properties view configuration
* On the first Wizard Page, select « Create from UML Profile »
* On the next Page, press Browse Workspace and select your profile
  * The target should be populated automatically. If you want to change the target location, be sure to keep the *.ctx file extension

![PropertyGenerationWizard](/org.eclipse.papyrus.training.library.properties/doc/PropertyGenerationWizard.png) 

+++
* The generation strategy can be useful if you have dependencies to other profiles or libraries
  * Don’t generate depandencies: do not generate properties view for extended profiles/libraries
  * Generate dependencies in the same file: generate all properties view configurations for the selected profiles/libraries in the same *.ctx file
  * Generate dependencies in different files: generate all properties view configurations for the selected profiles/libraries in their own *.ctx file

In this example, we don’t have any dependency, so we use the default option.
 
When pressing Next, the Wizard will analyze the profile to retrieve all Stereotypes and Properties. This may take a few seconds

![PropertyGenerationOption](/org.eclipse.papyrus.training.library.properties/doc/PropertyGenerationOption.png) 
+++
### “SMART and simple” configuration view
* On the following page, you can select the properties you wish to display for each Stereotype
* The « Display single » column is the list of properties which should be displayed when a single element of a compatible type is selected (e.g. a single AudioVisualItem)
* The « Display multiple » column is the list of properties to be displayed when selecting a set of elements of a compatible type (e.g. 3 Writers)
* The selection is preconfigured with default choices: in multi-selection, String and Reference properites are discarded
* Click on the buttons to change the visibility of the properties
* When you are satisfied, press Finish

![PropertyConfigurationView](/org.eclipse.papyrus.training.library.properties/doc/PropertyConfigurationView.png) 

+++
### Deploying a Properties view in a Plug-in
* Create an Eclipse Plug-in Project (File > New > … > Plug-in development/Plug-in Project)
  * In the Manifest, add a Dependency to org.eclipse.papyrus.views.properties
  * Copy the *.ctx file and the ui/ folder into your plug-in (e.g. in a properties/ folder)
* Finally, open the “build” tab, and check all the files/folders required at runtime in the “Binary Build” column
  * In the “Extensions” tab of the Manifest editor, add org.eclipse.papyrus.infra.properties.context
  * In the “contextModel” property, press “Browse…” and select your *.ctx file

![PropertyExtensionPoint](/org.eclipse.papyrus.training.library.properties/doc/PropertyExtensionPoint.png) 

+++

A new folder is created in your project. The main file is a *.ctx file, which is a Model of the properties view configuration. It can be opened with the Properties View Editor

Note: you can switch to the « Properties View Customization » perspective, which offers a Preview and a Properties page

+++

To test your properties page immediately, right click on the *.ctx file and select « Deploy properties view configuration ». The configuration will be locally and temporarily deployed (Until you restart Eclipse or select « Disable properties view configuration »)


+++

![PropertiesEditors](/org.eclipse.papyrus.training.library.properties/doc/PropertiesEditors.png) 

+++

* Tab: Corresponds to a Tab in the Properties view.
  * Tabs have an ID, a Label and a Priority (Order)
  * The tabs order can also be defined using the “After Tab” property (Instead of using the numeric Priority)
  * Optionally, Tabs can have an Image and can be Indented
* View: Corresponds to the list of sections to be displayed for a specific selection
  * A View has a Constraint and a Multiplicity
  * If the Constraint and Multiplicity match the current selection, the View is displayed
  * A View is composed of Sections (Typically one)
* Section: A section is associated to a Tab, and contains some Widgets (Editors), structured in Composites

![PropertyViewExample](/org.eclipse.papyrus.training.library.properties/doc/PropertyViewExample.png) 

+++

* Sections with a Constraint are called “Dynamic Sections”. 
  * They are displayed when the constraint is matched; hidden otherwise
  * The constraint is reevaluated when a Property of the selected element is changed (“Dynamically”)


+++

* Composite: Structuring Widget. It corresponds to a SWT Composite
  * A Composite has a Layout and contains some Widgets
* Layout: Defines and parameterizes the Layout of a Composite
  * Number of Columns
* Property Editor: Associates a Model Property with a Graphical Editor
  * The Property can be from a Stereotype, UML Metaclass…
  * Papyrus provides a collection of Widgets for each type of property (Single- or multi-valued)

![PropertyContextConcept](/org.eclipse.papyrus.training.library.properties/doc/PropertyContextConcept.png) 

+++
## What can be easily changed?
### The most common customizations can be achieved from this editor without any line of code, including:
* Change the Tab’s Label, Image
* Add new Tabs
* Move a Section from one tab to another
* Show/Hide properties
* Reorder properties
* Assign a different Editor (Widget) to a Property
* Change the displayed Label of a Property

+++
## What can be changed? (with more work :) )

### More complex operations can require Java code:
* Implement or extend a specific Property Editor (Widget)
* Create and Edit derived/virtual properties (Not present in the Profile)
* Implement specific Constraints (To display Properties Pages on a very specific condition)
* Edit non-EMF elements (Eclipse Preferences, Java Properties files…)

