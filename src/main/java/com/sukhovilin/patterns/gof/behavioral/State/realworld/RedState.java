package com.sukhovilin.patterns.gof.behavioral.State.realworld;

/**
 * A 'ConcreteState' class Red indicates that account is overdrawn
 */
class RedState extends State {
	private double serviceFee;

	// Constructor
	public RedState(State state) {
		this.balance = state.getBalance();
		this.account = state.getAccount();
		Initialize();
	}

	private void Initialize() {
		// Should come from a datasource
		interest = 0.0;
		lowerLimit = -100.0;
		upperLimit = 0.0;
		serviceFee = 15.00;
	}

	@Override
	public void Deposit(double amount) {
		balance += amount;
		StateChangeCheck();
	}

	@Override
	public void Withdraw(double amount) {
		amount = amount - serviceFee;
		System.out.println("No funds available for withdrawal!");
	}

	@Override
	public void PayInterest() {
		// No interest is paid
	}

	private void StateChangeCheck() {
		if (balance > upperLimit) {
			account.setState(new SilverState(this));
		}
	}
}