org.eclipse.papyrus.training.library.wizard
=======================================
This plugin show how to enhance the Papyrus new Project/Model Wizard

## Extension Point: org.eclipse.papyrus.uml.diagram.wizards.templates/transformation 
  - id*: unique identifier of the transformation
  - name*: text displayed in the wizard
  - language*: key that link the template to an existing architecture (should be the same identifier as the one used in the architecture plugin)
  - Transformation* Java class that should implements **org.eclipse.papyrus.uml.diagram.wizards.transformation.IGenerator**
  
## Extension Point: org.eclipse.papyrus.uml.diagram.wizards.templates/template 
  - id*: unique identifier of the template
  - name*: text displayed in the wizard
  - language*: key that link the template to an existing architecture (should be the same identifier as the one used in the architecture plugin)
  - file,notation_file,di_file: paths to the Papyrus model that should be used as base for the template
