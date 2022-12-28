package com.sukhovilin.patterns.gof.behavioral.Visitor.realworld;

/**
 * A 'ConcreteVisitor' class
 */
class IncomeVisitor implements Visitor {
	public void visit(Element element) {
		Employee employee = (Employee) element;
		// Provide 10% pay raise
		employee.setIncome(employee.getIncome() * 1.10);
		String s = String.format("%s %s's new income: %f", employee.getClass().getSimpleName(), employee.getName(),
				employee.getIncome());
		System.out.println(s);
	}
}