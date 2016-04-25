package com.tcs.training.example;

public class ThisArgumentMethod {
void m(ThisArgumentMethod a){
	System.out.println("Method is invoked");
}

void n(){
	m(this);
}
public static void main (String args[]){
	ThisArgumentMethod ob = new ThisArgumentMethod();
	ob.n();
}
}
