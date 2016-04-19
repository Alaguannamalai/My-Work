package amazon;

import java.util.*;

public class MinimiseArray {
	
	static void printArray(int arr[], int size)
	{
		for(int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	static void minimizeArray(int arr[], int size)
	{
		int temp[] = new int[size];
		for(int i = 0; i < size; i++)
			temp[i] = arr[i];
		
		Arrays.sort(temp);
		
		HashMap<Integer ,Integer> mp = new HashMap<Integer ,Integer >();
		
		for(int i = 0; i < size; i++)
			mp.put(temp[i],i);
		
		for(int i = 0; i < size; i++)
			arr[i] = mp.get(arr[i]);
	}

	public static void main(String[] args) {
		int arr[] = {50, 0, 10, 30, 25};
		int size = arr.length;
		printArray(arr, size);
		minimizeArray(arr, size);
		printArray(arr, size);
	}

}
