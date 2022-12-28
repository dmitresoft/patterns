package com.sukhovilin.patterns.gof.behavioral.Observer.realworld;

import java.util.LinkedList;
import java.util.List;

/**
 * The 'Subject' abstract class
 */
abstract class Stock {

	private String symbol;
	private double price;
	private List<IInvestor> investors = new LinkedList<IInvestor>();

	// Constructor
	public Stock(String symbol, double price) {
		this.symbol = symbol;
		this.price = price;
	}

	public void attach(IInvestor investor) {
		investors.add(investor);
	}

	public void Detach(IInvestor investor) {
		investors.remove(investor);
	}

	public void change() {
		for (IInvestor investor : investors) {
			investor.update(this);
		}
		System.out.println();
	}

	// Gets or sets the price
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (this.price != price) {
			this.price = price;
			change();
		}
	}

	// Gets the symbol
	public String getSymbol() {
		return symbol;
	}

}