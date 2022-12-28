package com.sukhovilin.patterns.gof.behavioral.Observer.realworld;

/**
 * The 'ConcreteObserver' class
 */
class Investor implements IInvestor {
	private String name;
	private Stock stock;

	// Constructor
	public Investor(String name) {
		this.name = name;
	}

	public void update(Stock stock) {
		System.out.println("Notified " + name + " of " + stock.getSymbol()
				+ "'s change to " + stock.getPrice());
	}

	// Gets or sets the stock
	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}