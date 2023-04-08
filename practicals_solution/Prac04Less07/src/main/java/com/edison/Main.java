package com.edison;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("888666888");
        System.out.println("The number of account is: " + account.getAccountNumber());
    }
}