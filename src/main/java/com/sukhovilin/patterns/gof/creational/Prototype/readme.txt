definition
	Specify the kind of objects to create using a prototypical instance, and create new objects by copying this prototype. 

participants

    The classes and/or objects participating in this pattern are:

    * Prototype  (ColorPrototype)
          o declares an interface for cloning itself
    * ConcretePrototype  (Color)
          o implements an operation for cloning itself
    * Client  (ColorManager)
          o creates a new object by asking a prototype to clone itself