package com.sukhovilin.patterns.gof.structural.Facade.realworld;

/**
 * The 'Facade' class
 */
class Mortgage {
	private Bank _bank = new Bank();
	private Loan _loan = new Loan();
	private Credit _credit = new Credit();

	public boolean IsEligible(Customer cust, int amount) {
		System.out.println(String.format("%s applies for %s loan\n", cust.getName(), amount));
		boolean eligible = true;
		// Check creditworthyness of applicant
		if (!_bank.HasSufficientSavings(cust, amount)) {
			eligible = false;
		} else if (!_loan.hasNoBadLoans(cust)) {
			eligible = false;
		} else if (!_credit.hasGoodCredit(cust)) {
			eligible = false;
		}
		return eligible;
	}
}