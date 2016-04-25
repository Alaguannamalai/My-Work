package com.tcs.training.example;

final class FinalClass {
// The final class cannot be extended into other class
}

class ClassNew /* extends FinalClass */{
	void run(){
		System.out.println("The final class cannot be Extended to other class");
	}
public static void main(String args[]){
	ClassNew ob = new ClassNew();
	ob.run();
}
}
