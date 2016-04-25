package com.tcs.training.example;

public class Inheritance {
float appa = 20000;
}

class Anna extends Inheritance{
	int son = 30000;

public static void main (String args[]){
	Anna ob = new Anna();
	System.out.println("Appa's salary is:" +ob.appa);
	System.out.println("son's salary is:" +ob.son);
	}
}