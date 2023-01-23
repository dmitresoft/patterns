definition
	Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces
	
participants

    The classes and/or objects participating in this pattern are:

    * Target   (ChemicalCompound)
          o defines the domain-specific interface that Client uses.
    * Adapter   (Compound)
          o adapts the interface Adaptee to the Target interface.
    * Adaptee   (ChemicalDatabank)
          o defines an existing interface that needs adapting. 
    * Client   (AdapterApp)
          o collaborates with objects conforming to the Target interface.

Паттерн Адаптер (Adapter) предназначен для преобразования интерфейса одного класса в интерфейс другого.
Благодаря реализации данного паттерна мы можем использовать вместе классы с несовместимыми интерфейсами.