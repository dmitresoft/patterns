package com.sukhovilin.patterns.gof.behavioral.State.realworld;

/**
 * A 'ConcreteState' class Silver indicates a non-interest bearing state
 */
class SilverState extends State {
	// Overloaded constructors
	public SilverState(State state) {
		this(state.getBalance(), state.getAccount());
	}

	public SilverState(double balance, Account account) {
		this.balance = balance;
		this.account = account;
		Initialize();
	}

	private void Initialize() {
		// Should come from a datasource
		interest = 0.0;
		lowerLimit = 0.0;
		upperLimit = 1000.0;
	}

	@Override
	public void Deposit(double amount) {
		balance += amount;
		StateChangeCheck();
	}

	@Override
	public void Withdraw(double amount) {
		balance -= amount;
		StateChangeCheck();
	}

	@Override
	public void PayInterest() {
		balance += interest * balance;
		StateChangeCheck();
	}

	private void StateChangeCheck() {
		if (balance < lowerLimit) {
			account.setState(new RedState(this));
		} else if (balance > upperLimit) {
			account.setState(new GoldState(this));
		}
	}
}