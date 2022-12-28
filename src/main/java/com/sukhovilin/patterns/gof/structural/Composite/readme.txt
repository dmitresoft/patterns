definition
	Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

participants

    The classes and/or objects participating in this pattern are:

    * Component   (DrawingElement)
          o declares the interface for objects in the composition.
          o implements default behavior for the interface common to all classes, as appropriate.
          o declares an interface for accessing and managing its child components.
          o (optional) defines an interface for accessing a component's parent in the recursive structure, and implements it if that's appropriate. 
    * Leaf   (PrimitiveElement)
          o represents leaf objects in the composition. A leaf has no children.
          o defines behavior for primitive objects in the composition. 
    * Composite   (CompositeElement)
          o defines behavior for components having children.
          o stores child components.
          o implements child-related operations in the Component interface. 
    * Client  (CompositeApp)
          o manipulates objects in the composition through the Component interface. 