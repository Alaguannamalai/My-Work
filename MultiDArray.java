package amazon;

//example to declare, instantiate, initialize and print the 2Dimensional array.

public class MultiDArray {
	public static void main(String argu[]) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Printing 2D Array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
}
