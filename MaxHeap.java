package Heap;

public class MaxHeap {
	static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void addToHeap(int arr[], int ele, int x)
	{
		arr[x] = ele;
		
		while(x != 0 && ((x-1)/2 >= 0 || (x-2)/2 >= 0))
		{
			if(x % 2 == 1)
			{
				if(arr[x] > arr[(x-1)/2])
				{
					swap(arr,x,(x-1)/2);
					
					x = (x-1)/2;
				}
				else
					return;
			}
			else
			{
				if(arr[x] > arr[(x-2)/2])
				{
					swap(arr,x, (x-2)/2);
					
					x = (x-2)/2;
				}
				else
					return;
			}
		}
	}
	
	static int max(int a, int b)
	{
		return (a>b)?a:b;
	}
	
	static void heapSort(int arr[], int size)
	{
		swap(arr, 0, size-1);
		int i = 0;
		
		while((2*i+1 <= size-2)&&(2*i+2 <= size-2))
		{
			if(arr[i] < max(arr[2*i+1], arr[2*i+2]))
			{
				if(arr[2*i+1] > arr[2*i+2])
				{
					swap(arr, i, 2*i+1);
					
					i = 2*i+1;
				}
				else
				{
					swap(arr, i, 2*i+2);
					
					i = 2*i+2;
				}
			}
			else
				break;
		}
	}
	
	static void printHeap(int arr[], int size)
	{
		for(int i = 0; i <= size; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

	public static void main(String[] args) {
		int arr[] = {12,4,11,10,7,41,5,9,45};
		int size = arr.length;
		
		for(int i = 0; i < size; i++)
		{
			addToHeap(arr,arr[i],i);
			printHeap(arr,i);
		}
		
		for(int i = 0; i < size; i++)
		{
			heapSort(arr, size-i);
			printHeap(arr, size-1);
		}
		
	}

}
