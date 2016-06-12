package amazon;

public class ArrayDemo {
	
	public static void main(String args[]){
		int number[] = new int[10];  /* number is an array of 10 integers */
		int i=0;
		
		while(i<10){
			number[i] = i+100;
			// format is a function to arrange ouotput in the below given format
			System.out.format("number[%d] = %d\n", i, number[i]);
			i = i+1;
		}
	}
}
