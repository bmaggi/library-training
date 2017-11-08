# How to customize New Model Papyrus wizard

PITCHME.md

Once your architecture defined, 

* Papyrus wizard extension
    * Template Example
    * Transformation Example
---

## Extension Point : org.eclipse.papyrus.uml.diagram.wizards.templates/transformation 
  - id*: unique identifier of the transformation
  - name*: text displayed in the wizard
  - language*: key that link the template to an existing architecture (should be the same identifier as the one used in the architecture plugin)
  - Transformation* Java class that should implements **org.eclipse.papyrus.uml.diagram.wizards.transformation.IGenerator**
  

---
Implementation in Library training
![TransformationDefinition](/org.eclipse.papyrus.training.library.wizard/doc/TransformationDefinition.png?raw=true "Transformation Definition")  

---
Ui at runtime
![TransformationExample](/org.eclipse.papyrus.training.library.wizard/doc/TransformationExample.png?raw=true "Transformation Example")  

---
## Extension Point : org.eclipse.papyrus.uml.diagram.wizards.templates/template 
  - id*: unique identifier of the template
  - name*: text displayed in the wizard
  - language*: key that link the template to an existing architecture (should be the same identifier as the one used in the architecture plugin)
  - file,notation_file,di_file: paths to the Papyrus model that should be used as base for the template
---
Implementation in Library training
![TemplateDefinition](/org.eclipse.papyrus.training.library.wizard/doc/TemplateDefinition.png?raw=true "Template Definition")  

---
Ui at runtime
![TemplateExample](/org.eclipse.papyrus.training.library.wizard/doc/TemplateExample.png?raw=true "Template Example")  
