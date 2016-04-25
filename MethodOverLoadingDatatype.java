package com.tcs.training.example;

public class MethodOverLoadingDatatype {
	void sum(int a, int b){
		System.out.println(a+b);
	}
	void sum(double a, double b){
		System.out.println(a+b);
	}
	public static void main(String args[]){
		MethodOverLoadingDatatype ob = new MethodOverLoadingDatatype();
		ob.sum(972, 901);
		ob.sum(614.4, 611.4);
	}

}
