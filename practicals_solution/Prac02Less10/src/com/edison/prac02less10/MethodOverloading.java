package com.edison.prac02less10;

public class MethodOverloading {

	public static void main(String[] args) {
		ChangeDataTypeOfArg changeDataTypeOfArg = new ChangeDataTypeOfArg();
		double avg = changeDataTypeOfArg.average(15, 25, 30);
		System.out.println("Avarage of 15, 25 and 30 :: " + avg);
		avg = changeDataTypeOfArg.average(15.0, 25.0, 30.0);
		System.out.println("Avarage of 15, 25 and 30 :: " + avg);
		avg = changeDataTypeOfArg.average(15, 25, 30);
		System.out.println("Avarage of 15, 25 and 30 :: " + avg);

	}

}
