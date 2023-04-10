package com.edison.prac04less12;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		MyProduct mp = new MyProduct();

		System.out.print("Input the number of Products:");
		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Input information of Product " + i + ":");
			System.out.print("Input ID:");
			String ID = in.nextLine();
			String cod = in.nextLine();
			System.out.print("Input name:");
			String Name = in.nextLine();
			System.out.print("Input Amount:");
			double Amount = in.nextDouble();
			System.out.print("Input Price:");
			double Price = in.nextDouble();

			Product p = new Product(ID, Name, Amount, Price);
			mp.addProduct(p);
		}

		in.nextLine();
		System.out.print("Input name for searching:");
		String NameS = in.nextLine();

		System.out.println("The list of Product by Name");
		mp.findByName(NameS);
	}

}
