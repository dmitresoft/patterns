package com.sukhovilin.patterns.gof.behavioral.Mediator.structural;

/**
 * MainApp startup class for Structural Mediator Design Pattern.
 * 
 * @author Dmitry Sukhovilin
 */
class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		ConcreteMediator m = new ConcreteMediator();
		
		ConcreteColleague1 c1 = new ConcreteColleague1(m);
		ConcreteColleague2 c2 = new ConcreteColleague2(m);
		
		m.setColleague1(c1);
		m.setColleague2(c2);
		
		c1.send("How are you?");
		c2.send("Fine, thanks");
	}
}