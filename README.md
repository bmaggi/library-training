org.eclipse.papyrus.training.library 
=======================================

# Status

License [![License](https://img.shields.io/badge/license-EPL-blue.svg)](https://www.eclipse.org/legal/epl-v10.html)

Codeship [ ![Codeship Status for bmaggi/library-training](https://codeship.com/projects/93c25b50-55af-0134-4ca0-1e6b697efd61/status?branch=master)](https://codeship.com/projects/172132)

Travis [![Build Status](https://travis-ci.org/bmaggi/library-training.svg?branch=master)](https://travis-ci.org/bmaggi/library-training)

Sonarqube:  
[![Quality Gate](https://sonarqube.com/api/badges/gate?key=org.eclipse.papyrus.training:org.eclipse.papyrus.training)](https://sonarqube.com/dashboard/index/org.eclipse.papyrus.training:org.eclipse.papyrus.training)  
[![Technical debt ratio](https://sonarqube.com/api/badges/measure?key=org.eclipse.papyrus.training:org.eclipse.papyrus.training&metric=sqale_debt_ratio)](https://sonarqube.com/dashboard/index/org.eclipse.papyrus.training:org.eclipse.papyrus.training)  

:warning: 
The official version of the training material is available in [Papyrus repository](https://git.eclipse.org/c/papyrus/org.eclipse.papyrus.git/tree/examples/library?h=streams/3.0-maintenance)
 - Built against Eclipse Oxygen (This example is only tested against Eclipse Oxygen release train)
 - This is material used for training and example, it shouldn't be taken as an architectural reference:
	- profile plugin shouldn't have any dependencies to Papyrus
	- tests should be done using one fragment for each plugin
	- elementtype should be hosted in an independent plugin
	- ui element should probably be grouped in the same plugin
	- css files are duplicated to demonstrate local css capabilities

0. How to create a ![Libraryergt Gif][LibraryLogo] DSML 
1. How to create a [profile](/org.eclipse.papyrus.training.library.profile/README.md) 
2. How to create a [new child menu](/org.eclipse.papyrus.training.library.newchild/README.md)
3. How to create [properties](/org.eclipse.papyrus.training.library.properties/README.md)
4. How to create a [css theme] (/org.eclipse.papyrus.training.library.css/README.md)
5. How to contribute to new model [wizard](/org.eclipse.papyrus.training.library.wizard/README.md)
6. How to create a [palette] (/org.eclipse.papyrus.training.library.palette/README.md)
7. How to create an [architecture] (/org.eclipse.papyrus.training.library.architecture/README.md)
8. How to create a [validation rule](/org.eclipse.papyrus.training.library.validation/README.md) 
9. How to create a [hyperlink strategy](/org.eclipse.papyrus.training.library.hyperlink/README.md) 
10. How to create a [navigation strategy](/org.eclipse.papyrus.training.library.navigation/README.md) 
 
# Pitch (Work in progress)
[![GitPitch](https://gitpitch.com/assets/badge.svg)](https://gitpitch.com/bmaggi/library-training)


[LibraryLogo]: /org.eclipse.papyrus.training.library.profile/icons/library.gif?raw=true "Library training logo"
