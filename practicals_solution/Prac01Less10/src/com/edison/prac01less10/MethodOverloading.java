package com.edison.prac01less10;

public class MethodOverloading {

	public static void main(String[] args) {
		ChangeNoOfArg changeNoOfArg = new ChangeNoOfArg();
		int avg = changeNoOfArg.average(10, 20);
		System.out.println("averageof 10 and 20 :: " + avg);
		avg = changeNoOfArg.average(10, 20, 30);
		System.out.println("averageof 10, 20 and 30 :: " + avg);
		avg = changeNoOfArg.average(10, 20, 30, 40);
		System.out.println("averageof 10, 20, 30 and 40 :: " + avg);
	}
}
