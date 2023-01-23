definition
	Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it. 

participants

    The classes and/or objects participating in this pattern are:

    * Strategy  (SortStrategy)
          o declares an interface common to all supported algorithms. Context uses this interface to call the algorithm defined by a ConcreteStrategy
    * ConcreteStrategy  (QuickSort, ShellSort, MergeSort)
          o implements the algorithm using the Strategy interface
    * Context  (SortedList)
          o is configured with a ConcreteStrategy object
          o maintains a reference to a Strategy object
          o may define an interface that lets Strategy access its data.

Паттерн Стратегия (Strategy) представляет шаблон проектирования, который определяет набор алгоритмов,
инкапсулирует каждый из них и обеспечивает их взаимозаменяемость.
В зависимости от ситуации мы можем легко заменить один используемый алгоритм другим.
При этом замена алгоритма происходит независимо от объекта, который использует данный алгоритм.