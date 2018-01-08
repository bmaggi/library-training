# How to create a new child menu

+++

* Create new element
  * Create new element type model
  * Configure element types specialization

* Add element to a new child menu
  * New child model basic concepts
  * Create a new child model

* Demo

+++
* Create a new plugin
  * Create a new folder ‘model’
  * Create a new emf Model elementtypesconfigurations
     * Chose Element Type Set Configuration as root element
![ElementTypeModelCreation](/org.eclipse.papyrus.training.library.newchild/doc/ElementTypeModelCreation.png?raw=true "Element TypeModel Creation")  

+++
* Element Type Set properties
![ElementTypeSetConfiguration](/org.eclipse.papyrus.training.library.newchild/doc/ElementTypeSetConfiguration.png?raw=true "ElementTypeSet Configuration")  

* Description: Display description (user friendly)
* Identifier: Unique identifier (runtime information)
* Metamodel Ns URI: For stereotype based element type reference UML
* Name: Display Name (user friendly) 

+++
* Create a Specialization Type Configuration
![SpecializationTypeCreation](/org.eclipse.papyrus.training.library.newchild/doc/SpecializationTypeCreation.png?raw=true "SpecializationType Creation")  

   * Will specialize an already existing element type configuration

+++
* Set the Properties for this new element type

![SpecializationTypeConfiguration](/org.eclipse.papyrus.training.library.newchild/doc/SpecializationTypeConfiguration.png?raw=true "SpecializationTypeConfiguration")  

* Description: Unformal description
* Hint : key used to chose the visual representation
* Identifier : Unique identifier (used as reference)
* Kind : Type of element type
* Name: Unformal name
* Specialized Types : References to the parents specializations
(example: for stereotype use the metaclass extension identifier)
+++
# Stereotype application and values

* Apply Stereotype Advice Configuration
  * Target: Specialization Type Configuration Periodical Weekly
* Stereotype To Apply
  * Required Profile (Name): extlibrary
  * Stereotype Qualified Name: extlibrary::Periodical
  * Update Name: true
* Feature To Set
  * Feature Name: issuesPerYear
* Constant Value
* Literal Integer
  * Value:52 

![StereotypeAppliciationConfiguration](/org.eclipse.papyrus.training.library.newchild/doc/StereotypeAppliciationConfiguration.png)  

+++
# New child menu

* Basic concepts
  * Folder 
  * Separator
  * Creation Menu
  * Creation RelationShip Menu
* Create a new EMF model (a new CreationMenuModel)
  * Create a new folder called Library in it (main entry in menu)
![MenuEntryConfiguration](/org.eclipse.papyrus.training.library.newchild/doc/MenuEntryConfiguration.png) 

* Icon, Label: Image, Text that will be displayed in the menu
* Visible: if the element is visible in the menu 


+++
![MenuEntryConfiguration](/org.eclipse.papyrus.training.library.newchild/doc/MenuEntryConfiguration.png)  


* Display all Roles, Role: display/specify role
  * As an example, an activity for a state can represent 3 roles: (do Activity, onEntry Activity, onExit Activity)
* Element Type Id Ref: Uniqueid of the elementtype that will be created
* Icon, Label: Image, Text that will be displayed in the menu
* Visible: if the element is visible in the menu 
+++

* Add a CompoundFilter filter to hide the menu in pure UML model
* Use the ProfileApplied from umlfilters
** profileQualifiedName="extlibrary" 
** profileURI="pathmap://EXTLIBRARY_PROFILE/extlibrary.profile.uml#_LkNCUEomEeSz_ot9x6ZZgw"

+++
# Extension Point : org.eclipse.papyrus.infra.newchild

* Add menuCreationModel

![MenuDefinition](/org.eclipse.papyrus.training.library.newchild/doc/MenuDefinition.png)  

* Model: path to the new child model (*.creationmenumodel)

+++

* Eclipse Runtime
![MenuNewChildExample](/org.eclipse.papyrus.training.library.newchild/doc/MenuNewChildExample.png?raw=true "Menu NewChild Example")  

+++

* Windows>Preferences>Papyrus>New Child
![NewChildPreferences](/org.eclipse.papyrus.training.library.newchild/doc/NewChildPreferences.png?raw=true "NewChild Preferences")  
