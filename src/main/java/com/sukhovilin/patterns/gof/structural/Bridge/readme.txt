definition
	Decouple an abstraction from its implementation so that the two can vary 
	independently. 

participants

    The classes and/or objects participating in this pattern are:

    * Abstraction   (BusinessObject)
          o defines the abstraction's interface.
          o maintains a reference to an object of type Implementor. 
    * RefinedAbstraction   (CustomersBusinessObject)
          o extends the interface defined by Abstraction. 
    * Implementor   (DataObject)
          o defines the interface for implementation classes. This interface doesn't have to correspond exactly to Abstraction's interface; in fact the two interfaces can be quite different. Typically the Implementation interface provides only primitive operations, and Abstraction defines higher-level operations based on these primitives. 
    * ConcreteImplementor   (CustomersDataObject)
          o implements the Implementor interface and defines its concrete implementation

Мост (Bridge) - структурный шаблон проектирования, который позволяет отделить абстракцию от реализации таким образом,
чтобы и абстракцию, и реализацию можно было изменять независимо друг от друга.
Даже если мы отделим абстракцию от конкретных реализаций, то у нас все равно все наследуемые классы будут жестко привязаны к интерфейсу,
определяемому в базовом абстрактном классе. Для преодоления жестких связей и служит паттерн Мост.