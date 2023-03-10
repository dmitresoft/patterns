definition
	Define an object that encapsulates how a set of objects interact.
	Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.

participants

    The classes and/or objects participating in this pattern are:

    * Mediator  (IChatroom)
          o defines an interface for communicating with Colleague objects
    * ConcreteMediator  (Chatroom)
          o implements cooperative behavior by coordinating Colleague objects
          o knows and maintains its colleagues
    * Colleague classes  (Participant)
          o each Colleague class knows its Mediator object
          o each colleague communicates with its mediator whenever it would have otherwise communicated with another colleague

Паттерн Посредник (Mediator) представляет такой шаблон проектирования, который обеспечивает взаимодействие множества объектов
без необходимости ссылаться друг на друга. Тем самым достигается слабосвязанность взаимодействующих объектов.

Когда используется паттерн Посредник?
- Когда имеется множество взаимосвязаных объектов, связи между которыми сложны и запутаны.
- Когда необходимо повторно использовать объект,
  однако повторное использование затруднено в силу сильных связей с другими объектами.

