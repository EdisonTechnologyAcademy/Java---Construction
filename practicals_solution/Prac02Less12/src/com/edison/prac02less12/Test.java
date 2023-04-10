package com.edison.prac02less12;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String st1 = in.nextLine();

		I_PString ps = new My_PString(st1);

		System.out.println("The number of digits:" + ps.CountDigits(st1));
		System.out.println("The number of word:" + ps.CountWords(st1));

		System.out.println("Enter a searched word:");
		String st2 = in.nextLine();

		System.out.println(ps.SearchWord(st2));
	}

}
