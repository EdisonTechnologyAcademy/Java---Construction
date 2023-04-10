package com.edison.prac04less08;

public class BankAccount extends Asset{

	private String bankName;
	private int accountNumber;  
	 private float balance;
	public String getBankName() {
		return bankName;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public BankAccount(int id, String type, String bankName, int accountNumber, float balance) {
		super(id, type);
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

}
