package com.tcs.training.array;

public class AdditionOf2Matrices {
	public static void main(String args[]) {
		// creating two matrices
		int[][] a = { { 2, 4, 5 }, { 3, 2, 4 } };
		int[] b[] = { { 3, 1, 0 }, { 3, 0, 5 } };

		// creating another matrix to store this two above
		int[][] c = new int[2][3];

		// adding and printing addition of two matrices
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println(); // new line
		}
	}
}
