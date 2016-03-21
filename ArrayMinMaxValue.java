package com.tcs.training.array;

public class ArrayMinMaxValue {

	public static void main(String args[]) {

		int array[] = new int[] { 14, 61, 55, 88, 6, 99, 31 };

		// Calling getMax() method for getting max value
		int max = getMax(array);
		System.out.println("Maximum value is" + max);

		// Calling getMin() method for getting max value
		int min = getMin(array);
		System.out.println("Minimum value is" + min);
	}

	// Method for getting the maximum value
	public static int getMax(int[] inputArray) {
		int maxvalue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxvalue) {
				maxvalue = inputArray[i];
			}
		}
		return maxvalue;
	}

	// Method for getting the minimum value
	public static int getMin(int[] inputArray) {
		int minvalue = inputArray[0];
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] < minvalue) {
				minvalue = inputArray[i];
			}
		}
		return minvalue;
	}
}
