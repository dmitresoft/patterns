definition
	Avoid coupling the sender of a request to its receiver by giving more than one object a
	chance to handle the request. Chain the receiving objects and pass the request along
	the chain until an object handles it. 

participants

    The classes and/or objects participating in this pattern are:

    * Handler   (Approver)
          o defines an interface for handling the requests
          o (optional) implements the successor link
    * ConcreteHandler   (Director, VicePresident, President)
          o handles requests it is responsible for
          o can access its successor
          o if the ConcreteHandler can handle the request, it does so; otherwise it forwards the request to its successor
    * Client   (ChainApp)
          o initiates the request to a ConcreteHandler object on the chain

Цепочка Обязанностей (Chain of responsibility) - поведенческий шаблон проектирования, который позволяет избежать жесткой привязки отправителя запроса к получателю.
Все возможные обработчики запроса образуют цепочку, а сам запрос перемещается по этой цепочке.
Каждый объект в этой цепочке при получении запроса выбирает, либо закончить обработку запроса, либо передать запрос на обработку следующему по цепочке объекту.