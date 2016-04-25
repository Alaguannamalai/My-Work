package com.tcs.training.example;

public class SuperKeyword {
	int superstar = 130;
}

class SubClass extends SuperKeyword {
	int superstar = 150;

	void display() {
		System.out.println(super.superstar); //will print the value of immediate parent calss SuperKeyword
	}
	
public static void main(String args[]){
	SubClass s1 = new SubClass();
	s1.display();
	//Run with the correct package name above, as applicable
	
}
}
