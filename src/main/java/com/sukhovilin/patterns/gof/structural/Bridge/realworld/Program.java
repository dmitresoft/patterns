package com.sukhovilin.patterns.gof.structural.Bridge.realworld;


class Program {
	public static void main(String[] args) {
		// Create RefinedAbstraction
		Customers customers = new Customers("Chicago");

		// Set ConcreteImplementor
		customers.setData(new CustomersData());

		// Exercise the bridge
		customers.Show();
		customers.Next();
		customers.Show();
		customers.Next();
		customers.Show();
		customers.Add("Henry Velasquez");
		customers.ShowAll();
	}
}