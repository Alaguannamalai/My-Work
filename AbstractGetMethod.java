package com.tcs.training.example;

abstract class Bank{
	abstract int getRateOfInterest();
}

class SBI extends Bank{
	int getRateOfInterest(){
		return 15;
	}
}

class ICICI extends Bank{
	int getRateOfInterest(){
		return 13;
	}
}

public class AbstractGetMethod {
public static void main(String args[]){
	Bank ob = new SBI();
	Bank obc = new ICICI();
	int interest = ob.getRateOfInterest();
	int interest1 = obc.getRateOfInterest();
	System.out.println("The Rate of interest in SBI is: " +interest+ "%");
	System.out.println("The Rate of interest in ICICI is: " +interest1+ "%");
	}
}
