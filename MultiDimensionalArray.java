package com.tcs.training.array;

public class MultiDimensionalArray {

	public static void main(String args[]) {

		// declaring and initializing 2D Array
		int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };

		// printing 2D Array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " "); // to print in row by column,
													// use print not println
			}
			System.out.println();
		}
	}
}
