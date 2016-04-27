package amazon;

//method must have same name as in the parent class
// method must have same parameter as in the parent class.
//  must be IS-A relationship (inheritance).


public class Bank {
	int getRateOfInterest(){
		return 0;
	}
}

class SBI extends Bank{
	int getRateOfInterest(){
		return 15;
	}
}

class AXIS extends Bank{
	int getRateOfInterest(){
		return 12;
	}
}

class ICICI extends Bank{
	int getRateOfInterest(){
		return 13;
	}
}

class OverRide{
	public static void main(String args[]){
	SBI  s = new SBI();
	AXIS a = new AXIS();
	ICICI i = new ICICI();
	System.out.println("Rate of interest in SBI is " +s.getRateOfInterest());
	System.out.println("Rate of interest in AXIS is " +a.getRateOfInterest());
	System.out.println("Rate of interest in ICICI is " +i.getRateOfInterest());
	}
}
