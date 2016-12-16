org.eclipse.papyrus.training.library.validation
=======================================

##This plugin show how to contribute a validation rule

1. Define a Java Constraint checking that a library has a minimum of books 
2. Define an Ocl Constraint checking that a book has more than 0 pages

##How To test
1. Launch your eclipse-runtime
2. Open Window > Preferences
3. Select Model Validation > Constraints
4. Verify that there is a category named "Library Example Validation Category"
  a. Verify that there is a rule named "minimum.books"
  b. Verify that there is a rule named "minimum.pages"
5. Create the following model
  Library
    Book  
6. Right Click on model in the Model Explorer View> Validation > Validate model
7. Verify that you have the warning messages in the model Validation view

    
