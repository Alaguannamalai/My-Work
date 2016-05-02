package amazon;

//We can declare, instantiate and initialize the java array together:

public class TestArray1 {
	public static void main(String args[]) {
		int a[] = { 0, 5, 0, 3, 2, 0, 1, 4 }; // declaration, instantiation and
												// initialization

		// printing array
		int x = 0;
		for (int i = 0; i < a.length; i++, x++) {
			if (x == 2 || x == 4)
				System.out.print(" ");
			System.out.print(a[i]);
		}
	}
}
