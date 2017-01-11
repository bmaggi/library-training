org.eclipse.papyrus.training.library.hyperlink
=======================================

#This plugin show how to contribute a hyperlink rule

This example will provide an hyperlink contribution that will allow to *jump* from a book to its borrower
(Hyperlink allows to redirect the user when double clicking on an element in a diagram)

## How to code:
 - create the plug-in 
 - contribute to the following extension point *org.eclipse.papyrus.infra.hyperlink.hyperlinkContributor* in [plugin.xml](plugin.xml)
 - add the reference to the contributor *org.eclipse.papyrus.training.library.hyperlink.BookToBorrowerHyperlinkContributor* 
    (the class that will implements the hyperlink)
 - create the class *org.eclipse.papyrus.training.library.hyperlink.BookToBorrowerHyperlinkContributor* that should implments *org.eclipse.papyrus.infra.hyperlink.service.HyperlinkContributor* 
 - the *meaningful* code is in ```List<HyperLinkObject> getHyperlinks(Object object)```  method
 - there are 4 implementations of HyperLinkObject that should be used to wrap the target element:
   HyperLinkDocument: wrap a file reference
   HyperLinkWeb: wrap a web hyperlink
   HyperLinkEditor: wrap a specific diagram/table (:warning: needs to be confirmed)
   HyperLinkSpecificObject: wrap an EObject
 - use the last one for refering the borrower  (and copy/paste the code from [BookToBorrowerHyperlinkContributor] (src/org/eclipse/papyrus/training/library/hyperlink/BookToBorrowerHyperlinkContributor.java))
 
## How to test
 Create a diagram with a borrower and a book
 Link the borrower to the book with a borrowing link 
 Double click on the book
 => the hyperlink should redirect you on the borower
