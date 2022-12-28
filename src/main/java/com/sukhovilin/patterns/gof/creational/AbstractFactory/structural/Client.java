package com.sukhovilin.patterns.gof.creational.AbstractFactory.structural;

/**
 * The 'Client' class. Interaction environment for the products.
 */
class Client {

	private AbstractProductA abstractProductA;
	private AbstractProductB abstractProductB;

	// Constructor
	public Client(AbstractFactory factory) {
		abstractProductB = factory.CreateProductB();
		abstractProductA = factory.CreateProductA();
	}

	public void Run() {
		abstractProductB.Interact(abstractProductA);
	}
}
