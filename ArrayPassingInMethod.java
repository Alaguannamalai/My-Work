package com.tcs.training.array;

//We can pass the java array to method so that we can reuse the same logic on any array.
//Let's see the simple example to get minimum number of an array using method.

public class ArrayPassingInMethod {
static void min(int arr[]){
	int min = arr[0];
	
	for(int i=0; i<arr.length; i++)
		if (min> arr[i])
			min = arr[i];
	
	System.out.println(min);
}

public static void main(String args[]){
	int a[] = {23, 56, 13, 98, 45};
	min(a);
}
}
