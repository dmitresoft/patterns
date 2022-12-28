package com.sukhovilin.patterns.gof.behavioral.State.realworld;

/**
 * The 'State' abstract class
 */
abstract class State {
	protected Account account;
	protected double balance;
	protected double interest;
	protected double lowerLimit;
	protected double upperLimit;

	// Properties
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract void Deposit(double amount);

	public abstract void Withdraw(double amount);

	public abstract void PayInterest();
}