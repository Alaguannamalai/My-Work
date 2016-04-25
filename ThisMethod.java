package com.tcs.training.example;

public class ThisMethod {
void contact(){
	System.out.println("This is my no. 9987899792");
}

void mobileNo(){
	this.contact();
}

void phoneNo(){
	mobileNo();
}
 
public static void main(String args[]){
	ThisMethod e1 = new ThisMethod();
	e1.mobileNo();
}
}
