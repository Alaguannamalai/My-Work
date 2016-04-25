package com.tcs.training.example;

import java.util.Scanner;

public class Addition {

public static void main(String args[]){
	int a,b,c;
	System.out.println("Enter the two numbers for Addition");
	Scanner in = new Scanner(System.in);
	 a=in.nextInt();
	 b=in.nextInt();
	 c=a+b;
	 System.out.println("The sum of 2 no.'s is C = " +c);

}
}
