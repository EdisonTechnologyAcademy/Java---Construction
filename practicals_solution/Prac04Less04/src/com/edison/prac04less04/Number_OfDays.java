package com.edison.prac04less04;

import java.util.Scanner;

public class Number_OfDays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mon = 0;
		int days;
		System.out.printf("Enter the Month Number : ");
		mon = input.nextInt();
		switch(mon)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.print("Number of Days 31..");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.print("Number of Days 30..");
				break;
			case 2:
				System.out.print("Number of Days 28 or 29..");
				break;
			default:
				System.out.printf("Invalid...Please Enter the 1 to 12...");
				break;
		}	

	}

}
