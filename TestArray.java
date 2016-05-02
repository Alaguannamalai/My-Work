package amazon;

//example of java array, where we are going to declare, instantiate, 
// initialize and traverse an array.

public class TestArray {
	public static void main(String dogs[]){
		int arr[] = new int[8]; //declaration and instantiation of Array
		
		arr[0] = 0;		//initialization
		arr[1] = 9;
		arr[2] = 0;
		arr[3] = 7;
		arr[4] = 1;
		arr[5] = 9;
		arr[6] = 9;
		arr[7] = 2;
		
	//printing Array
		int x = 0;
		for(int i=0; i<arr.length; i++,x++)
		{
			if(x == 2 || x == 4)
				System.out.print(" ");
			System.out.print(arr[i]);
		}
	}
}
