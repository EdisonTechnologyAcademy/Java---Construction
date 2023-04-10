package com.edison.prac03less12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int m = 100;
		Student lst[] = new Student[m];
		ArrayList<Student> al = new ArrayList<Student>();
		System.out.print("Input the number of students:");
		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Input information of student " + i + ":");
			System.out.print("Input code:");
			String code = in.nextLine();
			String cod = in.nextLine();
			System.out.print("Input name:");
			String name = in.nextLine();
			System.out.print("Input mark 1:");
			double mk1 = in.nextDouble();
			System.out.print("Input mark 2:");
			double mk2 = in.nextDouble();
			System.out.print("Input mark 3:");
			double mk3 = in.nextDouble();
			Student st = new Student(code, name, mk1, mk2, mk3);
			lst[i] = st;
			al.add(st);
		}

		// Arrays.sort(lst);
		Collections.sort(al);

		System.out.println("The list of students after sorting by GPA");
		// for(int i=0;i<n;i++) lst[i].printS();
		for (int i = 0; i < al.size(); i++)
			al.get(i).printS();

	}
}
