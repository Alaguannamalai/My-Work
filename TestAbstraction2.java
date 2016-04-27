package amazon;

//An abstract class can have data member, abstract method, method body,
// constructor and even main() method

abstract class Car{
	Car(){
		System.out.println("This is constructor of this class Bike ;)");
	}
	int gear = 5;
	abstract void run();
	void speed(){
		System.out.println("Runs at a high speed of 140 kmph");
	}
}

class Skoda extends Car{
	void run(){
		System.out.println("Running desire");
	}
}
public class TestAbstraction2 {
public static void main(String arga[]){	
	Car ob = new Skoda();
	ob.run();
	ob.speed();
	System.out.println(ob.gear);
}
}
