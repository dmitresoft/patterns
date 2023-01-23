definition
	Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later. 

participants

    The classes and/or objects participating in this pattern are:

    * Memento  (Memento)
          o stores internal state of the Originator object. The memento may store as much or as little of the originator's internal state as necessary at its originator's discretion.
          o protect against access by objects of other than the originator. Mementos have effectively two interfaces. Caretaker sees a narrow interface to the Memento -- it can only pass the memento to the other objects. Originator, in contrast, sees a wide interface, one that lets it access all the data necessary to restore itself to its previous state. Ideally, only the originator that produces the memento would be permitted to access the memento's internal state.
    * Originator  (SalesProspect)
          o creates a memento containing a snapshot of its current internal state.
          o uses the memento to restore its internal state
    * Caretaker  (Caretaker)
          o is responsible for the memento's safekeeping
          o never operates on or examines the contents of a memento.

Паттерн Хранитель (Memento) позволяет выносить внутреннее состояние объекта за его пределы для последующего возможного
восстановления объекта без нарушения принципа инкапсуляции.

Когда использовать Memento?
- Когда нужно сохранить состояние объекта для возможного последующего восстановления
- Когда сохранение состояния должно проходить без нарушения принципа инкапсуляции