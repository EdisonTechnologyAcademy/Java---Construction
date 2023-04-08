package com.edison;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);

        ATM atm = new ATM();
        atm.withdrawMoney(account, 500);
    }
}