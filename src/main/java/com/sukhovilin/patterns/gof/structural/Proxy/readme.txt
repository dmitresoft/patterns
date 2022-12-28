definition
	Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations. 
	
participants

    The classes and/or objects participating in this pattern are:

    * Command  (Command)
          o declares an interface for executing an operation
    * ConcreteCommand  (CalculatorCommand)
          o defines a binding between a Receiver object and an action
          o implements Execute by invoking the corresponding operation(s) on Receiver
    * Client  (CommandApp)
          o creates a ConcreteCommand object and sets its receiver
    * Invoker  (User)
          o asks the command to carry out the request
    * Receiver  (Calculator)
          o knows how to perform the operations associated with carrying out the request.