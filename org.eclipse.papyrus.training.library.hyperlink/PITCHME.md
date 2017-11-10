### Create an hyperlink

+++
### Register the extension

```
<extension point="org.eclipse.papyrus.infra.hyperlink.hyperlinkContributor">
 <contributor
   id="org.eclipse.papyrus.training.library.hyperlink.contributor.book2borrower"
   contributor="org.eclipse.papyrus.training.library.hyperlink.BookToBorrowerHyperlinkContributor"
   label="Go to borrower"
   description="Got to borrower">
 </contributor>
</extension>
```
@[1]:(Hyperlink contribution extension point)
@[3]:(Unique id) 
@[4]:(Provide a Java class to define the hyperlink "implements HyperlinkContributor")
@[5,6]:(Description for UI)

+++

```
public interface HyperlinkContributor {
	public List<HyperLinkObject> getHyperlinks(Object fromElement);
}
```
@[2]:(code here your hyperlink strategy)

+++
### What's an "HyperLinkObject" ? 
* Abstract class representing an Hyperlink
* Use the following implementations
```
HyperLinkDocument
HyperLinkWeb
HyperLinkSpecificObject
```
@[1]:(wrap a file reference)
@[2]:(wrap a web hyperlink)
@[3]:(wrap an EObject)


+++
Create a diagram with a borrower and a book Link the borrower to the book with a borrowing link Double click on the book
=> the hyperlink should redirect you on the borrower
