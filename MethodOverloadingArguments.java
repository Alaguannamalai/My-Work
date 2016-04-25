package com.tcs.training.example;

public class MethodOverloadingArguments {
void sum(int a, int b){
	System.out.println(a+b);
}
void sum(int a, int b, int c){
	System.out.println(a+b+c);
}
public static void main(String args[]){
	MethodOverloadingArguments ob = new MethodOverloadingArguments();
	ob.sum(901, 912);
	ob.sum(901, 902, 946);
}
}
