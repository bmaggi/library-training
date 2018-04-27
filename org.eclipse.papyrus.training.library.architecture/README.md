org.eclipse.papyrus.training.library.architecture
=======================================
## Basic Concepts

The architecture metamodel in Papyrus is implemented as a realization and an extension to the [ISO 42010][ISO_42010] standard for architecture of systems. Hence many concepts present in the metamodel are derived from those presented in the [ISO 42010][ISO_42010] standard. However, the standard has been extended with Papyrus-specific concepts and properties.
* A ''domain'' is the root of the architecture model. It can contains a collection of ''concerns'', ''stakeholders'', as well as ''contexts'' (which can be ''description languages'' and/or ''frameworks'').
* A ''concern'' (from [ISO 42010][ISO_42010]) represents in Papyrus a matter of interest to some stakeholder.
* A ''stakeholder'' (from [ISO 42010][ISO_42010]) represents in Papyrus an archetype of users. It references a set of its ''concerns''.
* A ''description language'' (from [ISO 42010][ISO_42010]) represents in Papyrus a modeling language (e.g., UML, SysML). It has a unique ''id' that corresponds to that of an ''IClientContext'' from GMF. It references a ''metamodel'', a set of ''profiles'', a set of ''element type set configurations'', a ''creation command'' (creates a model of this language), a ''conversion command'' (converts a model to this language), and and ''icon''. It also has an optional ''extension prefix'' for its models. It can also contain a set of ''representation kinds'' (which can be either ''diagrams'' or ''tables'') and a set of ''viewpoints''.
* A ''framework'' (from [ISO 42010][ISO_42010]) represents in Papyrus a modeling framework (e.g., DoDAF). It has a unique ''id' that corresponds to that of an ''IClientContext'' from GMF. It references a set of ''element type set configurations'', a ''creation command'' (creates a model of this framework), a ''conversion command'' (converts a model to this framework), and an ''icon''. It also has an optional ''extension prefix'' for its models. It can also contain a set of ''viewpoints''.
* A ''viewpoint'' (from [ISO 42010][ISO_42010]) in Papyrus references set of ''representation kinds'', which can be ''diagrams'' or ''tables''.
* A ''diagram'' in this context does not represent a single instance (for example the diagram named X in model Y), but the specification (or prototype) of future diagrams of this kind. For example the ''UML Class Diagram''.
* A ''table'' is another kind of view in Papyrus that enables the presentation of models in a tabular format.

## Extension point: org.eclipse.papyrus.infra.architecture.models
 model: path to the architecture model


[ISO_42010]: https://en.wikipedia.org/wiki/ISO/IEC_42010
