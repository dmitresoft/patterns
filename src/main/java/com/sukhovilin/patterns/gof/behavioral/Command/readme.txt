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

Паттерн "Команда" (Command) позволяет инкапсулировать запрос на выполнение определенного действия в виде отдельного объекта.
Этот объект запроса на действие и называется командой. При этом объекты, инициирующие запросы на выполнение действия,
отделяются от объектов, которые выполняют это действие.

Команды могут использовать параметры, которые передают ассоциированную с командой информацию.
Кроме того, команды могут ставиться в очередь и также могут быть отменены.