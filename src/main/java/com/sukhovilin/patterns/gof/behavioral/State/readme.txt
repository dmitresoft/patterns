definition
	Allow an object to alter its behavior when its internal state changes. The object will appear to change its class. 

participants

    The classes and/or objects participating in this pattern are:

    * Context  (Account)
          o defines the interface of interest to clients
          o maintains an instance of a ConcreteState subclass that defines the current state.
    * State  (State)
          o defines an interface for encapsulating the behavior associated with a particular state of the Context.
    * Concrete State  (RedState, SilverState, GoldState)
          o each subclass implements a behavior associated with a state of Context

Состояние (State) - шаблон проектирования, который позволяет объекту изменять свое поведение в зависимости от внутреннего состояния.