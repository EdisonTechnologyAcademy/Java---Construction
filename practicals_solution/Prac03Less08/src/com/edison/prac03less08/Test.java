package com.edison.prac03less08;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the information of employee: \n");
		System.out.print("Enter ID: ");
		String ide = sc.nextLine();
		System.out.print("Enter name: ");
		String namee = sc.nextLine();
		System.out.print("Enter year: ");
		int yeare = sc.nextInt();
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		Employee e = new Employee(ide, namee, yeare, salary);
		System.out.println(e.toString());

		System.out.print("Enter the information of student: \n");
		sc.nextLine();
		System.out.print("Enter ID: ");
		String ids = sc.nextLine();
		System.out.print("Enter name: ");
		String names = sc.nextLine();
		System.out.print("Enter year: ");
		int years = sc.nextInt();
		System.out.print("Enter mark: ");
		double mark = sc.nextDouble();

		Student s = new Student(ids, names, years, mark);
		System.out.println(s.toString());
		sc.close();
	}

}
