#How to create a profile with Papyrus

---

* Create a profile with Papyrus
    * Create a new Papyrus Model
    * Create a Stereotype with the Palette

* Register your model in Papyrus UI as
    * A profile
    * A library 

* Discover our example profile : Library

---
# Create a new Profile in Papyrus

* New Project Papyrus
 Chose Architecture context: Profile  
![DiagramLanguage3](/org.eclipse.papyrus.training.library.profile/doc/DiagramLanguage.jpg?raw=true "Select Diagram Language")   
![DiagramLanguage4](doc/DiagramLanguage.jpg)   
![DiagramLanguage]

---

* Add a Profile Diagram   
![ProfileDiagram](doc/ProfileDiagram.jpg?raw=true "Add a Profile Diagram") 

---

# Create a Stereotype with the Palette

* Import a <<Metaclass>> Class
* Create a <<Stereotype>> Book 
![FirstStereotype]
 
---

# Extension Point : org.eclipse.papyrus.uml.extensionpoints.UMLProfile  
* Name: Name of the profile
* Path: Path to the UML profile model
* Qualifiednames: used to specify a subset of sub profile to apply
* Iconpath, description, provider: icon that will be displayed in popup and other ui elements
 
---

// display runtime  
 ![ApplyProfile1]
 ![ApplyProfile2]
 
---

# Extension Point : org.eclipse.papyrus.uml.extensionpoints.UMLLibrary  
* Name: Name of the library
* Path: Path to the UML model
* Iconpath, description, provider: icon that will be displayed in popup and other ui elements
  
---

// display runtime  
 ![ImportLibrary1]
 ![ImportLibrary2]
 
---

Behold the library profile ![LibraryProfileDiagram]  

[LibraryProfileDiagram]: /org.eclipse.papyrus.training.library.profile/doc/LibraryProfile.jpg?raw=true "Library Profile Diagram"
[ApplyProfile1]: /org.eclipse.papyrus.training.library.profile/doc/ApplyProfile1.jpg?raw=true "Apply a Profile Step1"
[ApplyProfile2]: /org.eclipse.papyrus.training.library.profile/doc/ApplyProfile2.jpg?raw=true "Apply a Profile Step2"
[ImportLibrary1]: /org.eclipse.papyrus.training.library.profile/doc/ImportLibrary1.jpg?raw=true "Import Library Step1"
[ImportLibrary2]: /org.eclipse.papyrus.training.library.profile/doc/ImportLibrary2.jpg?raw=true "Import Library Step2"
[FirstStereotype]: doc/FirstStereotype.jpg?raw=true "Create First Stereotype"
[RegisterLibrary]: /org.eclipse.papyrus.training.library.profile/doc/RegisterLibrary.jpg?raw=true "Register a Library"
[RegisterProfile]: /org.eclipse.papyrus.training.library.profile/doc/RegisterProfile.jpg?raw=true "Register a Profile"
[ProfileDiagram]: /org.eclipse.papyrus.training.library.profile/doc/ProfileDiagram.jpg?raw=true "Add a Profile Diagram"
[DiagramLanguage]: /org.eclipse.papyrus.training.library.profile/doc/DiagramLanguage.jpg?raw=true "Select Diagram Language"

