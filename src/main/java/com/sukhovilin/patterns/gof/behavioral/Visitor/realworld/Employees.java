package com.sukhovilin.patterns.gof.behavioral.Visitor.realworld;

import java.util.LinkedList;
import java.util.List;

/**
 * The 'ObjectStructure' class
 */
class Employees {
	private List<Employee> employees = new LinkedList<Employee>();

	public void attach(Employee employee) {
		employees.add(employee);
	}

	public void detach(Employee employee) {
		employees.remove(employee);
	}

	public void accept(Visitor visitor) {
		for (Employee e : employees) {
			e.accept(visitor);
		}
		System.out.println();
	}
}