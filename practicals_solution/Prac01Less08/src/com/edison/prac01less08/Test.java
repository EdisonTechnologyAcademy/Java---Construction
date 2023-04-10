package com.edison.prac01less08;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter code: ");
		String code = sc.nextLine();
		System.out.print("Enter price: ");
		double price = sc.nextDouble();
		System.out.print("Enter year: ");
		int year = sc.nextInt();

		VNProduct b = new VNProduct(name, code, price, year);
		System.out.println(b.toString());
	}

}
