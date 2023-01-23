definition
	Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

participants

    The classes and/or objects participating in this pattern are:

    * Component   (LibraryItem)
          o defines the interface for objects that can have responsibilities added to them dynamically. 
    * ConcreteComponent   (Book, Video)
          o defines an object to which additional responsibilities can be attached. 
    * Decorator   (Decorator)
          o maintains a reference to a Component object and defines an interface that conforms to Component's interface. 
    * ConcreteDecorator   (Borrowable)
          o adds responsibilities to the component.

Декоратор (Decorator) представляет структурный шаблон проектирования, который позволяет динамически подключать к объекту дополнительную функциональность.

Для определения нового функционала в классах нередко используется наследование.
Декораторы же предоставляет наследованию более гибкую альтернативу, поскольку позволяют динамически в процессе выполнения определять новые возможности у объектов.