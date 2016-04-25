package com.tcs.training.example;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, m, flag=0;
		int n=71;  // number to be checked for prime
		m=n/2;
		for(i=2; i<=m; i++){
			if(n%i==0){
				System.out.println("Number is not prime");
				flag=1;
				break;
			}
		}
if(flag==0)
	System.out.println("Number is prime");
	
	}

}
