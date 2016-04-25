package com.tcs.training.example;

abstract class AbstractClass {
abstract void run();
}

class Normal extends AbstractClass {
	void run(){
		System.out.println("Running Safely..");
	}
	public static void main(String args[]){
		AbstractClass ob = new Normal();
		ob.run();
	}
}