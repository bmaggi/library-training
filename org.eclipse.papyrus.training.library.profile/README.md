

Behold the library profile ![Libraryergt jpg][LibraryProfileDiagram]  

//TODO

Create a profile with Papyrus


 New Project Papyrus
 Chose Diagram Language: Profile 
 Add a Profile Diagram

 Create a Stereotype with the Palette

 
 Import a <<Metaclass>> Class
Create a <<Stereotype>> Book 


Extension Point : org.eclipse.papyrus.uml.extensionpoints.UMLProfile
Name: Name of the profile
Path: Path to the UML profile model
Qualifiednames: used to specify a subset of sub profile to apply
Iconpath, description, provider: icon that will be displayed in popup and other ui elements

// display runtime

Extension Point : org.eclipse.papyrus.uml.extensionpoints.UMLLibrary

Name: Name of the library
Path: Path to the UML model
Iconpath, description, provider: icon that will be displayed in popup and other ui elements

// display runtime


[LibraryProfileDiagram]: /org.eclipse.papyrus.training.library.profile/doc/LibraryProfile.jpg?raw=true "Library Profile Diagram"
