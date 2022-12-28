definition
	Provide a unified interface to a set of interfaces in a subsystem. Façade defines a higher-level interface that makes the subsystem easier to use. 
	
participants

    The classes and/or objects participating in this pattern are:

    * Facade   (MortgageApplication)
          o knows which subsystem classes are responsible for a request.
          o delegates client requests to appropriate subsystem objects. 
    * Subsystem classes   (Bank, Credit, Loan)
          o implement subsystem functionality.
          o handle work assigned by the Facade object.
          o have no knowledge of the facade and keep no reference to it. 