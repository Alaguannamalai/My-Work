package exceptionHandling;

//User defined exception
//to throw whenever my balance is below Rs.1000
public class MyException extends Exception {
	// store account information
	private static int accno[] = { 101, 102, 103, 104, 105 };
	private static String name[] = { "Anna", "Elav", "Thina", "Vishnu" };
	private static double bal[] = { 10000.00, 8000.00, 1350.00, 500.00, 4500.00 };

	// default constructor
	MyException() {

	}

	// parameterized constructor
	MyException(String str) {
		super(str);
	}

	// Write main()
	public static void main(String args[]) {
		try {
			// display the heading of the table
			System.out.println("Acc.No" + "\t" + "Customer" + "\t" + "Balance");

			// display actual account information
			for (int i = 0; i < 5; i++) {
				System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);

				// display own exception if balance <1000
				if (bal[i] < 1000) {
					MyException me = new MyException(
							"Balance amount is less than Minimum Bal");
					throw me;
				}
			}
		} catch (MyException me) {
			me.printStackTrace();
		}
	}
}
