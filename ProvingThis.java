package com.tcs.training.example;

public class ProvingThis {
void m(){
	System.out.println(this);
}

public static void main(String args[]){
	ProvingThis ob = new ProvingThis();
	System.out.println(ob);
	ob.m();
}
}
