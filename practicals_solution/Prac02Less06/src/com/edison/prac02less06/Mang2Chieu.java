package com.edison.prac02less06;

import java.util.Scanner;

public class Mang2Chieu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int row, col, i, j;
		System.out.print("Enter Row size: ");
		row = scan.nextInt();
		System.out.print("Enter column Size: ");
		col = scan.nextInt();

		int[][] arr = new int[row][col];

		System.out.print("\nEnter " + (row * col) + " Elements: ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++)
				arr[i][j] = scan.nextInt();
		}

		System.out.println("\nArray's Elements with its indexes: ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++)
				System.out.print("arr[" + i + "][" + j + "] = " + arr[i][j] + "\t");
			System.out.print("\n");
		}

		int max = arr[2][0];
		for (j = 1; j < col; j++)
			if (max < arr[2][j])
				max = arr[2][j];
		System.out.println("\nThe largest element of 2 row: " + max);

	}

}
