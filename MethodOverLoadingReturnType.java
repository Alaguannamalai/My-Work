package com.tcs.training.example;

//In java, method overloading is not possible by changing the return type
//of the method because there may occur ambiguity. 
//Let's see how ambiguity may occur:

/* public class MethodOverLoadingReturnType {
int sum(int a, int b){
	System.out.println(a+b);
	return b;
}
double sum(int a, int b){
	System.out.println(a+b);
	
} 
public static void main(String args[]){
	MethodOverLoadingReturnType ob = new MethodOverLoadingReturnType();
	int result = ob.sum(100, 200);
}
} */
