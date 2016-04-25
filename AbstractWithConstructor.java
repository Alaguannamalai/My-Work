package com.tcs.training.example;

abstract class Bike{
	Bike(){
		System.out.println("Bike Constructor is being created");
	}
	abstract void gear();
	void run(){
		System.out.println("method Body is being created");
	}
}

class Honda extends Bike{
	void gear(){
		System.out.println("Honda has 6 Gears");
	}
}

public class AbstractWithConstructor {
public static void main(String args[]){
	Bike ob = new Honda();
	ob.run();
	ob.gear();
	}
}
