definition
	Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets 
				subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

participants

    The classes and/or objects participating in this pattern are:

    * AbstractClass  (DataObject)
          o defines abstract primitive operations that concrete subclasses define to implement steps of an algorithm
          o implements a template method defining the skeleton of an algorithm. The template method calls primitive 
          		operations as well as operations defined in AbstractClass or those of other objects.
    * ConcreteClass  (CustomerDataObject)
          o implements the primitive operations ot carry out subclass-specific steps of the algorithm