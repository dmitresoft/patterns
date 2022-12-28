package com.sukhovilin.patterns.gof.behavioral.State.realworld;

/**
 * The 'Context' class
 */
class Account {
	private State state;

	// Constructor
	public Account(String owner) {
		// New accounts are 'Silver' by default
		this.state = new SilverState(0.0, this);
	}

	// Properties

	public double getBalance() {
		return this.state.getBalance();
	}

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void Deposit(double amount) {
		this.state.Deposit(amount);
		System.out.println(String.format("Deposited %s --- ", amount));
		System.out.println(String.format(" Balance = %s", this.getBalance()));
		System.out.println(String.format(" Status = %s", this.getState()
				.getClass().getSimpleName()));
		System.out.println();
	}

	public void Withdraw(double amount) {
		this.state.Withdraw(amount);
		System.out.println(String.format("Withdrew %s --- ", amount));
		System.out.println(String.format(" Balance = %s", this.getBalance()));
		System.out.println(String.format(" Status = %s\n", this.getState()
				.getClass().getSimpleName()));
	}

	public void PayInterest() {
		this.state.PayInterest();
		System.out.println("Interest Paid --- ");
		System.out.println(String.format(" Balance = %s", this.getBalance()));
		System.out.println(String.format(" Status = %s\n", this.getState()
				.getClass().getSimpleName()));
	}
}