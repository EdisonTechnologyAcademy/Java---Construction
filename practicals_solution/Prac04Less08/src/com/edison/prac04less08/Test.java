package com.edison.prac04less08;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter type: ");
		String type = sc.nextLine();
		System.out.print("Enter bankName: ");
		String bankName = sc.nextLine();
		System.out.print("Enter accountNumber: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter balance: ");
		float balance = sc.nextFloat();
		System.out.print("Enter interestRate: ");
		float interestRate = sc.nextFloat();

		SavingAccount s = new SavingAccount(id, type, bankName, accountNumber, balance, interestRate);
		System.out.println(s.toString());
		sc.close();
	}

}
