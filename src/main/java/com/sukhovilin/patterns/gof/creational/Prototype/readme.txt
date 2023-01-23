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

Паттерн Прототип (Prototype) позволяет создавать объекты на основе уже ранее созданных объектов-прототипов.
То есть по сути данный паттерн предлагает технику клонирования объектов.

Когда использовать Прототип?

- Когда конкретный тип создаваемого объекта должен определяться динамически во время выполнения
- Когда нежелательно создание отдельной иерархии классов фабрик для создания объектов-продуктов из параллельной иерархии классов
  (как это делается, например, при использовании паттерна Абстрактная фабрика)
- Когда клонирование объекта является более предпочтительным вариантом нежели его создание и инициализация с помощью конструктора.
  Особенно когда известно, что объект может принимать небольшое ограниченное число возможных состояний.