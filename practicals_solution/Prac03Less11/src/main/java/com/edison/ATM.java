package com.edison;

public class ATM {
    public void withdrawMoney(Account account, double amount) {
        account.withdraw(amount);
    }
}
