org.eclipse.papyrus.training.library.navigation
=======================================

## How To code:
 - contribute to the following extension point *org.eclipse.papyrus.infra.services.navigation.navigationContributor* in [plugin.xml](plugin.xml)
 - add the reference to the contributor *org.eclipse.papyrus.training.library.navigation.SameCategoryNavigationContributor* 
    (the class that will implements the navigation)

## How To test:
 - Navigation is available either in diagram or model explorer
 - create 2 books in the same category
 - Right Click on a Book > Navigate
=> You should have 1 entry "This book **** is in the same category" 

## References:
 - Papyrus Neon statement of work: https://wiki.eclipse.org/Papyrus/Neon_Work_Description/Improvements/Navigation
 
