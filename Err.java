package exceptionHandling;

public class Err {
	public static void main(String args[]) {
		try {
			// open the files
			System.out.println("open files");

			// do some processing
			int n = 2;
			System.out.println("n = " + n);
			int a = 45 / n;
			System.out.println("a = " + a);
			int b[] = { 10, 20, 30 };
			b[2] = 100;
		}
		catch (ArithmeticException ae) {
			// display the exception details
			System.out.println(ae);
			// display any message to the user
			System.out.println("Please pass data while running this Pgm");
		} catch (ArrayIndexOutOfBoundsException aie) {
			// display the exception details
			aie.printStackTrace();
			// display a message to user
			System.out.println("Please set the array index within the range");

		}

		finally {
			// close the files
			System.out.println("Close files");
		}
	}
}
