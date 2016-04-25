package com.tcs.training.example;

interface printable{
	void print();
}
public class Interface implements printable {
public void print(){
	System.out.println("Hello Interface");
}

public static void main(String args[]){
	Interface ob = new Interface();
	ob.print();
}
}
