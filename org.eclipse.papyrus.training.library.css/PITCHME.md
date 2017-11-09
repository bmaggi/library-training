# Customize Diagrams with Stylesheets

* Css stylesheets in Papyrus
* Applying a Stylesheet to a Papyrus Model
* Simple customizations: using the Stylesheet tooling
* Advanced customizations: with the CSS syntax
* Deploying a (set of) Stylesheet(s) as a Theme plug-in
* Demo

+++
# Css stylesheets in Papyrus

The Papyrus Diagrams support the standard CSS (Cascading Style Sheets) syntax for customizing graphical appearance of nodes and edges. 

The stylesheets can be defined either in separate files located next to the models/diagrams or embedded directly inside the model. They can also be deployed via an Eclipse Plug-in.


+++
# Applying a Stylesheet to a Papyrus Model

First, you need to create a CSS file: any file with the *.css extension will do

The styles can be manipulated from the « Style » tab of the properties view, when selecting a Diagram Element.

Select the Diagram’s Canvas, go to Style > Diagram Style Sheets > Click « Add elements ». In the dialog, click on « Create new elements », and select Stylesheet Reference


+++
# Applying a Stylesheet to a Papyrus Model

Click « Browse Workspace », select the CSS File you created earlier, then press OK:


![StylePropertyView](/org.eclipse.papyrus.training.library.css/doc/StylePropertyView.png) 

The Stylesheet is now associated to your current diagram, and you can start editing it


+++
# Simple customizations: using the Papyrus tooling

Papyrus provides a dialog to create a Style rule from a selected element. The idea is to apply manually some graphical properties to an element (From the Appearance properties view), then automatically export it as a CSS rule.
![InitModel](/org.eclipse.papyrus.training.library.css/doc/InitModel.png) 
![ManuallyCustomizedModel](/org.eclipse.papyrus.training.library.css/doc/ManuallyCustomizedModel.png) 

+++

# Simple customizations: using the Papyrus tooling
* Right  click on the element, select Format > Create a new Style

![StyleCondition](/org.eclipse.papyrus.training.library.css/doc/StyleCondition.png) 
![StyleProperties](/org.eclipse.papyrus.training.library.css/doc/StyleProperties.png) 

* The dialog shows 3 tabs:
  * « Conditions » specifies the matching rule (By default, « All elements of the same type », i.e. « All Classes » in this example
  * « Properties » is the list of graphical properties you want to include in the current style (i.e. export the color, the font, the gradient…)
  * Stylesheet is the CSS Stylesheet in which you want to include the newly create style

+++
# Simple customizations: using the Papyrus tooling

Once you have defined the Style condition and graphical properties, select the stylesheet in which the style should be created, then press OK. The style will be applied to all matching elements.

![NewStyleWizard](/org.eclipse.papyrus.training.library.css/doc/NewStyleWizard.png)  

![StyleMatchingElements](/org.eclipse.papyrus.training.library.css/doc/StyleMatchingElements.png)  

+++
# Advanced customization: using the CSS Syntax

The style wizard is useful for creating quickly styles without any knowledge of the CSS Language, 
but it can be quickly limited when it comes to expressing more complex conditions.
Let’s see what the CSS Syntax looks like:

+++
* Class style
```
Class {
    fontName: "Segoe UI"
    fillColor: #A6C198;
    transparency: 0;
    gradient: #FFFFFF vertical;
    lineColor: #000000;
}
```
// css style

The CSS is a list of rules, composed of a Condition and a set of Properties. 
The Condition can be as simple as a type of element (« UML Metaclass ») or a more complex combination of Types, 
Semantic properties, and hierarchy.

+++
* Diagram style
```
ClassDiagram Package Class[isAbstract=true] {
  bold: true;
}
```

For example, this rule will apply to Classes in a ClassDiagram, contained (graphically) inside a Package
