package com.sukhovilin.patterns.gof.behavioral.State.realworld;

/**
 * A 'ConcreteState' class Gold indicates an interest bearing state
 */
class GoldState extends State {
	// Overloaded constructors
	public GoldState(State state) {
		this(state.getBalance(), state.getAccount());
	}

	public GoldState(double balance, Account account) {
		this.balance = balance;
		this.account = account;
		Initialize();
	}

	private void Initialize() {
		// Should come from a database
		interest = 0.05;
		lowerLimit = 1000.0;
		upperLimit = 10000000.0;
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
		if (balance < 0.0) {
			account.setState(new RedState(this));
		} else if (balance < lowerLimit) {
			account.setState(new SilverState(this));
		}
	}
}