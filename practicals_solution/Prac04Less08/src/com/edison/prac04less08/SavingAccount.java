package com.edison.prac04less08;

public class SavingAccount extends BankAccount{

	private float interestRate;

	public SavingAccount(int id, String type, String bankName, int accountNumber, float balance, float interestRate) {
		super(id, type, bankName, accountNumber, balance);
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return  getId() + "\t"  + getType()+ "\t" + getBankName()
				+ "\t" + getAccountNumber() + "\t"  + getBalance() + "\t" + interestRate;
	} 
	

}
