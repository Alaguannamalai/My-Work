package amazon;

//abstract class needs to be extended and its method implemented. 
// It cannot be instantiated.

public abstract class Bike {
	abstract void run();
}

class Honda extends Bike {
	void run() {
		System.out.println("Running safely...");
	}

	public static void main(String argg[]) {
		Bike ob = new Honda();
		ob.run();
	}
}
