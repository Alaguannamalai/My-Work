package com.tcs.training.example;

//In Java multiple inheritance is done by Interface
interface printing{
	void print();
}

interface showing{
	void show();
}

public class MultipleInheritance implements printing, showing {
	public void print(){
		System.out.println("Print the Interface");
	}
	
	public void show(){
		System.out.println("Show the Interface");
	}

	public static void main(String args[]){
		MultipleInheritance o1 = new MultipleInheritance();
		o1.print();
		o1.show();
	}
}
