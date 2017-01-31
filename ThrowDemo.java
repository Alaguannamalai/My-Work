package exceptionHandling;

//using throw
class Sample1 {
	static void demo() {
		try {
			System.out.println("Inside demo()");
			throw new NullPointerException("Exception data");
		} catch (NullPointerException ne) {
			System.out.println(ne);
		}
	}
}

public class ThrowDemo {
	public static void main(String args[]) {
		Sample1.demo();
	}

}
