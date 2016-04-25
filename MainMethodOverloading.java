package com.tcs.training.example;

public class MainMethodOverloading {
	public static void main(int a){
		System.out.println(a);
	}
	
	public static void main(String args[]){
		System.out.println("main() method is invoked");
		main(108);
	}

}
