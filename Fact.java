package com.tcs.training.example;

public class Fact {
	public static void main (String args[]){
		int i, fac=1;
		int n=5;
		for(i=1;i<=n;i++){
			fac= fac*i;
		}
		System.out.println("Factorial of " +n + "is: " +fac);
	}

}
