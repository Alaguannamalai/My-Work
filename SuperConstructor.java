package com.tcs.training.example;

public class SuperConstructor {
	SuperConstructor(){
		System.out.println("This is the constructor's statement");
	}
}

class AnotherClass extends SuperConstructor{
	AnotherClass(){
		super();
		System.out.println("This statement is of SubClass");
	}
	
	public static void main(String args[]){
		AnotherClass ob = new AnotherClass();
	}
}
