package com.sukhovilin.patterns.gof.behavioral.Visitor.realworld;

/**
 * A 'ConcreteVisitor' class
 */
class VacationVisitor implements Visitor {
	public void visit(Element element) {
		Employee employee = (Employee) element;

		// Provide 3 extra vacation days
		String out = String.format("%s %s's new vacation days: %d", employee
				.getClass().getSimpleName(), employee.getName(), employee
				.getVacationDays());
		System.out.println(out);
	}
}